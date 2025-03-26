package edu.canisius.csc213.project1;
import java.util.List;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
* UniqueHands class to analyze how long it takes to see every possible hand
* for different deck sizes and hand sizes.
*/
public class UniqueHands {
   public static void main(String[] args) throws IOException{
       int[] deckSizes = {24, 28}; // Deck sizes to test
       int[] handSizes = {6, 7}; // Hand sizes to test
       int trials = 5; // Number of trials per deck-hand combination

       String filePath = "unique_hands_result.csv";

       System.out.println("🃏 Deck Simulation: How long to see every possible hand?");
       System.out.println("------------------------------------------------------");
      
       for (int i = 0; i < deckSizes.length; ++i) {
           for (int j = 0; j < handSizes.length; ++j) {
               for (int k = 0; k < trials; ++k) {
                   long start = System.nanoTime();
                   //calculateTotalUniqueHands(24, 6);
                   long delta = System.nanoTime() - start;
				   double seconds = (double) delta/1000.00;
                   int attempts = countAttemptsToSeeAllHands(deckSizes[i], handSizes[j]);
                   System.out.println("Deck Size: " + deckSizes[i] + " | Hand Size: " + handSizes [j] + " | Trial: " + k + " | Attempts: " + attempts + " | Time: " + seconds + " sec");
                   try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write("Deck Size,Hand Size,Trial,Attempts,Time (sec)");
                    writer.newLine();
                    String line = deckSizes[i] + "," + handSizes[j] + "," + k + "," + attempts + "," + seconds;
                    writer.write(line);
                   }
               }
           }
       }
      
      
       // TODO: Implement nested loops
       // Outer loop: Iterates through deck sizes (24, 28)
       // Inner loop: Iterates through hand sizes (6, 7)
       // Inside inner loop: Run 5 trials, track time and attempts, and compute averages.  Which is probably another loop!




   }
   private static long combinations(int n, int k) {
       if (k < 0 || k > n) {
          return 0;
      }
      if (k == 0 || k == n) {
          return 1;
      }
      if (k > n / 2) {
          k = n - k;
      }
      long result = 1;
      for (int i = 1; i <= k; ++i) {
          result = result * (n - i + 1) / i;
      }
      return result;
  }
  private static String handToString(int[] hand) {
   java.util.Arrays.sort(hand);
   StringBuilder sb = new StringBuilder();
   for (int card : hand) {
       sb.append(card).append(",");
   }
   return sb.toString();
}


private static String newHandToString(Card[] hand) {
   StringBuilder sb = new StringBuilder();
   for (Card c : hand) {
       sb.append(c.toString()).append(",");
   }
   return sb.toString();
}






private static Card[] newDealHand(int deckSize, int handSize) {
   Deck deck = new Deck(deckSize);
   deck.shuffle();
   Card[] hand = new Card[handSize];
   for (int i = 0; i < handSize; i++) {
       hand[i] = deck.draw();
   }


   //sort hand
   Arrays.sort(hand, new Comparator<Card>() {
       @Override
       public int compare(Card c1, Card c2) {
           return (c1.toString().compareTo(c2.toString()));
       }
   });


   return hand;
}
   // TODO: Implement countAttemptsToSeeAllHands()
   public static int countAttemptsToSeeAllHands(int deckSize, int handSize) {
      
       long totalUniqueHands = combinations(deckSize, handSize);
       Set<String> seenHands = new HashSet<>();
       Random random = new Random();
       long attempts = 0;


       while (seenHands.size() < totalUniqueHands) {


           Card[] hand = newDealHand(deckSize, handSize);
          
           String handString = newHandToString(hand);


           if (!seenHands.contains(handString)) {
               seenHands.add(handString);
           }






           attempts++;
           if (attempts%100000 == 0) {
               int needed = ((int) totalUniqueHands - (int) seenHands.size());
               System.out.printf("Progress: %.3f%% coverage after %d attempts (UniqueHands: %d / %d | Needed: %d)\n", ((double) seenHands.size() / (double) totalUniqueHands) * 100, attempts, seenHands.size(), (int) totalUniqueHands, needed);
           }
           if (seenHands.size() == totalUniqueHands) {
               System.out.println("100.00% coverage reached after " + attempts + " attempts (UniqueHands: " + totalUniqueHands + " / " + totalUniqueHands + " | Needed: 0)");
           }
       }
       return (int) attempts;
   }
  
   // TODO: Implement calculateTotalUniqueHands()
   public static int calculateTotalUniqueHands(int deckSize, int numCards) {
       long total = deckSize;
       for (int i = deckSize - 1; i > deckSize - numCards; --i) {
           total = total * i;
       }


       long totalHands = numCards;
       for (int i = numCards - 1; i > 0; --i) {
           totalHands = totalHands * i;
       }




       return (int) (total / totalHands);
   }
}
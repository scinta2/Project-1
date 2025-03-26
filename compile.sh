#!/bin/bash

# Define variables
SRC_DIR="src/main/java"
OUT_DIR="out"
JAR_FILE="uniquehands.jar"
MAIN_CLASS="edu.canisius.csc213.project1.UniqueHands"

# Clean previous build
echo "🧹 Cleaning previous build..."
rm -r ./$OUT_DIR/*
# TODO You figure this out

mkdir -p $OUT_DIR

# Compile Java files
echo "🚀 Compiling Java files..."
javac -d $OUT_DIR -cp "./lib/*" $(find $SRC_DIR -name "*.java")
# TODO You figure this out

# Package into a JAR
echo "📦 Creating JAR file..."
jar cfe $OUT_DIR/$JAR_FILE $MAIN_CLASS -C $OUT_DIR .
#  TODO You figure this out


# Done!
echo "✅ Build complete! Run it with: java -jar $JAR_FILE"
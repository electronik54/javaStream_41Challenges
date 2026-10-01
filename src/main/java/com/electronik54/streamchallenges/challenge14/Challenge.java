package com.electronik54.streamchallenges.challenge14;

import java.util.Map;

/**
 * Challenge 14: Word Frequency in a Sentence
 *
 * Problem:
 * Count how often every word of a sentence appears, print the counters in alphabetical
 * order, and report the word that appears most often.
 *
 * Hint:
 * - Pattern.compile("\\s+").splitAsStream(sentence) splits the sentence lazily, without
 *   building an array of words first
 * - Collectors.groupingBy(word -> word, TreeMap::new, Collectors.counting()) counts the words
 *   into a map that is sorted by word
 * - map(String::toLowerCase) before the collector keeps "The" and "the" in the same bucket
 *
 * Expected Output:
 * Sentence: the quick brown fox jumps over the lazy dog the fox
 * Distinct words: 8
 * Frequencies: {brown=1, dog=1, fox=2, jumps=1, lazy=1, over=1, quick=1, the=3}
 * Top word: the (3 times)
 *
 * TODO:
 * 1. Build the input sentence of the problem statement
 * 2. Split it into words and count them into a sorted map
 * 3. Print the counters and the word with the highest count
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 14: Word Frequency in a Sentence ===");

        // TODO 1: the input of the problem statement
        String sentence = "the quick brown fox jumps over the lazy dog the fox";
        System.out.println("Sentence: " + sentence);

        // TODO 2: count the words, sorted by word for a stable output
        // Map<String, Long> frequencies = Pattern.compile("\\s+").splitAsStream(sentence)...

        // TODO 3: print the number of distinct words, the counters and the top word
        // System.out.println("Distinct words: " + frequencies.size());
        // System.out.println("Frequencies: " + frequencies);
        // Map.Entry<String, Long> topWord = frequencies.entrySet().stream()...
        // System.out.println("Top word: " + ...);
    }
}

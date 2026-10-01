package com.electronik54.streamchallenges.challenge33;

import java.util.Map;

/**
 * Challenge 33: Top N Most Frequent Words
 *
 * Problem:
 * A word frequency map is given. Print the N most frequent words, and break ties
 * alphabetically so that the result never depends on the map implementation.
 *
 * Hint:
 * - a Map is not a stream source, entrySet().stream() is the way in
 * - Map.Entry.<String, Long>comparingByValue().reversed() sorts by the counter, highest first
 * - thenComparing(Map.Entry.comparingByKey()) decides the ties by word
 * - limit(n) keeps only the first n entries after the sort
 * - for a single small n, a PriorityQueue of size n over the entries costs O(m log n) instead
 *   of the O(m log m) of a full sort
 *
 * Expected Output:
 * Sentence: the quick brown fox jumps over the lazy dog the fox
 * Frequencies: 8 distinct words
 * Top 2: [the=3, fox=2]
 *
 * TODO:
 * 1. Build the sentence of the problem statement and its frequency map
 * 2. Sort the entries by count descending and by word ascending
 * 3. Print the first two entries
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 33: Top N Most Frequent Words ===");

        // the inputs and the frequency map are already part of this challenge
        String sentence = "the quick brown fox jumps over the lazy dog the fox";
        Map<String, Long> frequencies = java.util.regex.Pattern.compile("\\s+")
                .splitAsStream(sentence)
                .collect(java.util.stream.Collectors.groupingBy(word -> word,
                        java.util.stream.Collectors.counting()));

        System.out.println("Sentence: " + sentence);
        System.out.println("Frequencies: " + frequencies.size() + " distinct words");

        // TODO 1: sort the entries by counter descending, then by word

        // TODO 2: keep the first two entries and print them
        // List<Map.Entry<String, Long>> topTwo = frequencies.entrySet().stream()...;
        // System.out.println("Top 2: " + topTwo);
    }
}

package com.electronik54.streamchallenges.challenge18;

import java.util.List;

/**
 * Challenge 18: Longest and Shortest Word
 *
 * Problem:
 * Given a list of words, find the longest one and the shortest one and print them with the
 * number of characters they hold.
 *
 * Hint:
 * - max(Comparator) and min(Comparator) return an Optional, because the list may be empty
 * - Comparator.comparingInt(String::length) compares two words by their length
 * - when two words are equally long, the first one that max() or min() meets wins, so add
 *   thenComparing(Comparator.naturalOrder()) if the choice must be predictable
 *
 * Expected Output:
 * Words: [java, stream, api, lambda, collector, io]
 * Longest: collector (9 characters)
 * Shortest: io (2 characters)
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Find the longest and the shortest word with a comparator on the length
 * 3. Print both words with their length
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 18: Longest and Shortest Word ===");

        // TODO 1: the input of the problem statement
        List<String> words = List.of("java", "stream", "api", "lambda", "collector", "io");
        System.out.println("Words: " + words);

        // TODO 2: compare the words by their length
        // Optional<String> longest = words.stream()...;
        // Optional<String> shortest = words.stream()...;

        // TODO 3: print the two words with their length
        // System.out.println("Longest: " + longest.orElseThrow() + " (" + ... + " characters)");
        // System.out.println("Shortest: " + ...);
    }
}

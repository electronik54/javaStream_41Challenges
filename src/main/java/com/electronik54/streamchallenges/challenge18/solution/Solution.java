package com.electronik54.streamchallenges.challenge18.solution;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
 * Solution 18: Longest and Shortest Word - how it works
 *
 * Comparator.comparingInt(String::length) turns "compare two words" into "compare the number
 * of characters they hold", so max() and min() can pick the winner in a single pass. Sorting
 * the whole list to read the first and the last element would do the same job with more work.
 *
 * Both calls return an Optional, because an empty list has no longest word. orElseThrow()
 * makes that case fail loudly instead of returning a silent null.
 *
 * Ties are broken by encounter order: max() keeps the first of several equally long words.
 * Chaining thenComparing(Comparator.naturalOrder()) would decide that tie by the words
 * themselves, which is what a predictable result needs.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 18: Longest and Shortest Word ===");

        List<String> words = List.of("java", "stream", "api", "lambda", "collector", "io");
        System.out.println("Words: " + words);

        Optional<String> longest = words.stream().max(Comparator.comparingInt(String::length));
        Optional<String> shortest = words.stream().min(Comparator.comparingInt(String::length));

        System.out.println("Longest: " + longest.orElseThrow() + " (" + longest.orElseThrow().length() + " characters)");
        System.out.println("Shortest: " + shortest.orElseThrow() + " (" + shortest.orElseThrow().length() + " characters)");
    }
}

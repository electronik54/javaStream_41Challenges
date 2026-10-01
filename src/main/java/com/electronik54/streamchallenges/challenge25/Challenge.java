package com.electronik54.streamchallenges.challenge25;

import java.util.List;

/**
 * Challenge 25: Group Words by Length
 *
 * Problem:
 * Group a list of words by the number of characters they hold, and find the length that has
 * the most words.
 *
 * Hint:
 * - Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()) groups the words
 *   and keeps the lengths in ascending order
 * - the same grouping with Collectors.counting() gives the size of every group
 * - max(Map.Entry.comparingByValue()) then finds the length with the most words
 *
 * Expected Output:
 * Words: [a, bb, cc, ddd, ee, f, ggg]
 * By length: {1=[a, f], 2=[bb, cc, ee], 3=[ddd, ggg]}
 * Most common length: 2 -> [bb, cc, ee]
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Group the words by their length
 * 3. Count the words per length and print the group that holds the most words
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 25: Group Words by Length ===");

        // TODO 1: the input of the problem statement
        List<String> words = List.of("a", "bb", "cc", "ddd", "ee", "f", "ggg");
        System.out.println("Words: " + words);

        // TODO 2: group the words by length, with the lengths sorted
        // Map<Integer, List<String>> byLength = words.stream()...;

        // TODO 3: count the words per length and print the largest group
        // System.out.println("By length: " + byLength);
        // System.out.println("Most common length: " + length + " -> " + byLength.get(length));
    }
}

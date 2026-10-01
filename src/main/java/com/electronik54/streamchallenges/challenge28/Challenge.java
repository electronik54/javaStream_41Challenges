package com.electronik54.streamchallenges.challenge28;

import java.util.List;

/**
 * Challenge 28: Most and Least Frequent Element
 *
 * Problem:
 * Count the votes of a list, then report the value that was voted most often and the value
 * that was voted least often.
 *
 * Hint:
 * - Collectors.groupingBy(vote -> vote, TreeMap::new, Collectors.counting()) counts every value
 * - max(Map.Entry.comparingByValue()) and min(...) find the two extremes of the counts
 * - the tie breaker is the encounter order of the map, so a TreeMap makes the result
 *   predictable: of two equally frequent values the alphabetically first one wins
 * - chaining thenComparing(Map.Entry.comparingByKey()) states that rule explicitly
 *
 * Expected Output:
 * Votes: [red, blue, red, green, blue, red, blue, red]
 * Counts: {blue=3, green=1, red=4}
 * Most frequent: red (4)
 * Least frequent: green (1)
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Count the votes into a map that is sorted by value
 * 3. Print the counts, the most frequent and the least frequent entry
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 28: Most and Least Frequent Element ===");

        // TODO 1: the input of the problem statement
        List<String> votes = List.of("red", "blue", "red", "green", "blue", "red", "blue", "red");
        System.out.println("Votes: " + votes);

        // TODO 2: count how often every value was voted
        // Map<String, Long> counts = votes.stream()...;

        // TODO 3: find the highest and the lowest counter and print them
        // System.out.println("Counts: " + counts);
        // System.out.println("Most frequent: " + ...);
        // System.out.println("Least frequent: " + ...);
    }
}

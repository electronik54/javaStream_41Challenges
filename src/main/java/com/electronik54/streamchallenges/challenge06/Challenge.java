package com.electronik54.streamchallenges.challenge06;

import java.util.List;

/**
 * Challenge 06: Sort Numbers Ascending and Descending
 *
 * Problem:
 * Given a list of numbers, print the values sorted from small to large, then from large to
 * small, and finally only the three largest values.
 *
 * Hint:
 * - sorted() uses the natural order of the elements, so ints come out ascending
 * - sorted(Comparator.reverseOrder()) reverses that order
 * - limit(n) keeps the first n elements of the stream, so it gives the top n after a sort
 *
 * Expected Output:
 * Numbers: [35, 12, 90, 7, 58, 12, 41]
 * Ascending: [7, 12, 12, 35, 41, 58, 90]
 * Descending: [90, 58, 41, 35, 12, 12, 7]
 * Top 3 largest: [90, 58, 41]
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Sort it ascending, then descending
 * 3. Take the three largest values from the descending stream
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 06: Sort Numbers Ascending and Descending ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(35, 12, 90, 7, 58, 12, 41);
        System.out.println("Numbers: " + numbers);

        // TODO 2: sort the values ascending and descending
        // List<Integer> ascending = numbers.stream()...;
        // List<Integer> descending = numbers.stream()...;

        // TODO 3: keep only the three largest values of the descending stream
        // List<Integer> topThree = ...;
        // System.out.println("Ascending: " + ascending);
        // System.out.println("Descending: " + descending);
        // System.out.println("Top 3 largest: " + topThree);
    }
}

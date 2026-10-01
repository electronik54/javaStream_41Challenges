package com.electronik54.streamchallenges.challenge20;

import java.util.List;

/**
 * Challenge 20: Numbers Above and Below the Average
 *
 * Problem:
 * Compute the average of a list of numbers, then collect the values that are above it and
 * the values that are below it.
 *
 * Hint:
 * - mapToInt(Integer::intValue).average() returns an OptionalDouble, because an empty stream
 *   has no average
 * - a stream can only be consumed once, so the average has to be computed before the filters
 * - the list itself can be streamed again, so both filters work on the same input
 *
 * Expected Output:
 * Numbers: [10, 25, 40, 55, 70, 85]
 * Average: 47.5
 * Above average: [55, 70, 85]
 * Below average: [10, 25, 40]
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Compute the average of the values
 * 3. Filter the values above and below that average and print all three results
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 20: Numbers Above and Below the Average ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(10, 25, 40, 55, 70, 85);
        System.out.println("Numbers: " + numbers);

        // TODO 2: average the values before any filter runs
        // double average = numbers.stream()...;

        // TODO 3: split the values around the average and print them
        // List<Integer> above = numbers.stream()...;
        // List<Integer> below = numbers.stream()...;
        // System.out.println("Average: " + average);
        // System.out.println("Above average: " + above);
        // System.out.println("Below average: " + below);
    }
}

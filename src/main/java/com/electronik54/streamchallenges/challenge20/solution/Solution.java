package com.electronik54.streamchallenges.challenge20.solution;

import java.util.List;

/*
 * Solution 20: Numbers Above and Below the Average - how it works
 *
 * A stream cannot be reused once a terminal operation has run on it, so the average is taken
 * first and the two filters then start from the list again. Trying to filter first and asking
 * the same stream for the average afterwards would throw IllegalStateException.
 *
 * average() returns an OptionalDouble, which keeps the empty-list case honest: orElseThrow()
 * fails loudly instead of dividing by zero and returning NaN.
 *
 * The average itself is a double, which is why the values are compared as value > average
 * without casting anything - the int is widened for the comparison.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 20: Numbers Above and Below the Average ===");

        List<Integer> numbers = List.of(10, 25, 40, 55, 70, 85);
        System.out.println("Numbers: " + numbers);

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElseThrow();

        List<Integer> above = numbers.stream().filter(value -> value > average).toList();
        List<Integer> below = numbers.stream().filter(value -> value < average).toList();

        System.out.println("Average: " + average);
        System.out.println("Above average: " + above);
        System.out.println("Below average: " + below);
    }
}

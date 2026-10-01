package com.electronik54.streamchallenges.challenge12;

import java.util.List;

/**
 * Challenge 12: Find Duplicate Elements
 *
 * Problem:
 * Given a list that repeats some values, list every value that occurs more than once -
 * each duplicate only once - and report how many such values the list has.
 *
 * Hint:
 * - Collectors.groupingBy(value -> value, Collectors.counting()) builds a frequency map
 * - a value is a duplicate when its count is greater than 1
 * - sort the result before printing, because groupingBy returns a HashMap with no key order
 *
 * Expected Output:
 * Numbers: [1, 2, 3, 2, 4, 5, 1, 6, 5, 5]
 * Duplicates (distinct): [1, 2, 5]
 * Duplicate count: 3
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Build the frequency map and keep the values whose count is above 1
 * 3. Print the duplicates in ascending order and their number
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 12: Find Duplicate Elements ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 6, 5, 5);
        System.out.println("Numbers: " + numbers);

        // TODO 2: count how often every value occurs and keep the ones counted twice or more
        // Map<Integer, Long> frequencies = numbers.stream()...;
        // List<Integer> duplicates = frequencies.entrySet().stream()...;

        // TODO 3: print the duplicates and their number
        // System.out.println("Duplicates (distinct): " + duplicates);
        // System.out.println("Duplicate count: " + duplicates.size());
    }
}

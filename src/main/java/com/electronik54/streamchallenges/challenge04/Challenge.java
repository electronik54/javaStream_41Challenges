package com.electronik54.streamchallenges.challenge04;

import java.util.List;

/**
 * Challenge 04: Maximum and Minimum Value
 *
 * Problem:
 * Given a list of numbers, find the largest and the smallest value. The same code must
 * also survive an empty list instead of throwing an exception.
 *
 * Hint:
 * - mapToInt(Integer::intValue) gives an IntStream, so no Integer objects have to be compared
 * - max() and min() return an OptionalInt, because an empty stream has no maximum
 * - unwrap the Optional with orElseThrow(), or check isPresent() before calling getAsInt()
 *
 * Expected Output:
 * Numbers: [42, 7, 99, 13, 58]
 * Max: 99
 * Min: 7
 * Max of empty list: OptionalInt.empty
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Find the maximum and the minimum with the stream API
 * 3. Show that an empty list produces an empty OptionalInt instead of an exception
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 04: Maximum and Minimum Value ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(42, 7, 99, 13, 58);
        System.out.println("Numbers: " + numbers);

        // TODO 2: find the largest and the smallest value
        // OptionalInt max = numbers.stream()...
        // OptionalInt min = numbers.stream()...
        // System.out.println("Max: " + max.orElseThrow());
        // System.out.println("Min: " + min.orElseThrow());

        // TODO 3: run the same maximum on an empty list and print the OptionalInt itself
        // System.out.println("Max of empty list: " + ...);
    }
}

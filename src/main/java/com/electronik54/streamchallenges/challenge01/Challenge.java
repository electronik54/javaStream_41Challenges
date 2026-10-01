package com.electronik54.streamchallenges.challenge01;

import java.util.Arrays;
import java.util.List;

/**
 * Challenge 01: Separate Even and Odd Numbers
 *
 * Problem:
 * Split a list of integers into even and odd numbers with the Stream API.
 * The result is a {@code Map<Boolean, List<Integer>>} where the key true holds
 * the even numbers and the key false holds the odd numbers. Both keys must
 * always be present - an empty list when a group has no members - the encounter
 * order must be kept inside every group, null elements must be skipped and a
 * null input list must behave like an empty list.
 *
 * Hint:
 * - Collectors.partitioningBy(predicate, downstream) always returns exactly two keys
 * - filter(Objects::nonNull) before the predicate - a null must never reach value % 2
 * - use value % 2 == 0; value % 2 == 1 is wrong for negative numbers (-7 % 2 is -1)
 * - Collectors.toUnmodifiableList() plus Collections.unmodifiableMap(...) keep the result read-only
 *
 * Expected Output:
 * Input: [11, 2, -4, 33, 4, 55, 6, 7, 88, 9, -10]
 * true  -> [2, -4, 4, 6, 88, -10]
 * false -> [11, 33, 55, 7, 9]
 * Input with nulls: [11, null, 2, 33, null, 4, 6]
 * true  -> [2, 4, 6]
 * false -> [11, 33]
 * Empty input: true -> [] false -> []
 *
 * TODO:
 * 1. Implement partitionEvenOdd(List<Integer>) with Collectors.partitioningBy
 * 2. Skip null elements and treat a null list as an empty list
 * 3. Return an unmodifiable map whose lists are unmodifiable
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 01: Separate Even and Odd Numbers ===");

        // TODO 1: the inputs of the problem statement - a plain list and one with null entries
        List<Integer> numbers = List.of(11, 2, -4, 33, 4, 55, 6, 7, 88, 9, -10);
        List<Integer> withNulls = Arrays.asList(11, null, 2, 33, null, 4, 6);
        System.out.println("Input: " + numbers);
        System.out.println("Input with nulls: " + withNulls);

        // TODO 2: partition every input into even (true) and odd (false) numbers with
        //         Collectors.partitioningBy. Both keys must always be present, null elements
        //         must be skipped and a null list must behave like an empty list.
        //         (add the imports java.util.Map and java.util.stream.Collectors when you
        //         uncomment the code below)
        // Map<Boolean, List<Integer>> partition = numbers.stream()
        //         .collect(Collectors.partitioningBy(value -> value % 2 == 0));

        // TODO 3: print the two groups - expected output:
        //         true  -> [2, -4, 4, 6, 88, -10]
        //         false -> [11, 33, 55, 7, 9]
        // System.out.println("true  -> " + partition.get(Boolean.TRUE));
        // System.out.println("false -> " + partition.get(Boolean.FALSE));

        // TODO 4: run the same steps for withNulls, for an empty list and for a null list.
    }
}

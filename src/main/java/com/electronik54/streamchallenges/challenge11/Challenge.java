package com.electronik54.streamchallenges.challenge11;

import java.util.List;

/**
 * Challenge 11: Second Highest and Second Lowest
 *
 * Problem:
 * Find the second highest and the second lowest value of a list that repeats some numbers.
 * A repeated value must not be counted twice.
 *
 * Hint:
 * - distinct() first, otherwise the "second" highest can hand back the highest value again
 * - sorted(Comparator.reverseOrder()).skip(1).findFirst() reaches the second highest
 * - orElseThrow() unwraps the Optional and throws when the list has fewer than two values
 *
 * Expected Output:
 * Numbers: [45, 12, 78, 45, 90, 23, 78]
 * Distinct descending: [90, 78, 45, 23, 12]
 * Second highest: 78
 * Second lowest: 23
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Build the distinct values in descending order
 * 3. Read the second highest and the second lowest value
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 11: Second Highest and Second Lowest ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(45, 12, 78, 45, 90, 23, 78);
        System.out.println("Numbers: " + numbers);

        // TODO 2: distinct values in descending order
        // List<Integer> distinctDescending = numbers.stream()...;
        // System.out.println("Distinct descending: " + distinctDescending);

        // TODO 3: skip the first element to reach the second highest, and sort ascending for the second lowest
        // int secondHighest = ...;
        // int secondLowest = ...;
        // System.out.println("Second highest: " + secondHighest);
        // System.out.println("Second lowest: " + secondLowest);
    }
}

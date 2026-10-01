package com.electronik54.streamchallenges.challenge27;

import java.util.List;

/**
 * Challenge 27: K-th Largest Distinct Number
 *
 * Problem:
 * Find the third largest distinct value of a list that repeats some numbers. The repeating
 * values must not count twice.
 *
 * Hint:
 * - distinct() first, otherwise a repeated value can occupy two of the k places
 * - sorted(Comparator.reverseOrder()) then skip(k - 1) lands exactly on the k-th largest
 * - orElseThrow() reports the problem when the list has fewer than k distinct values
 * - one full sort is fine for a small list, but for a large list and a small k a bounded heap
 *   of size k (PriorityQueue) is the cheaper answer: O(n log k) instead of O(n log n)
 *
 * Expected Output:
 * Numbers: [9, 3, 7, 9, 5, 8, 1, 7]
 * K: 3
 * Distinct descending: [9, 8, 7, 5, 3, 1]
 * 3rd largest: 7
 *
 * TODO:
 * 1. Build the input list and the value of k
 * 2. Build the distinct values in descending order
 * 3. Print the k-th largest value
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 27: K-th Largest Distinct Number ===");

        // TODO 1: the inputs of the problem statement
        List<Integer> numbers = List.of(9, 3, 7, 9, 5, 8, 1, 7);
        int k = 3;
        System.out.println("Numbers: " + numbers);
        System.out.println("K: " + k);

        // TODO 2: distinct values, sorted from large to small
        // List<Integer> distinctDescending = numbers.stream()...;
        // System.out.println("Distinct descending: " + distinctDescending);

        // TODO 3: skip the first k - 1 values to land on the k-th largest
        // System.out.println("3rd largest: " + ...);
    }
}

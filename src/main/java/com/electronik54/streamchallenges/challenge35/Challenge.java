package com.electronik54.streamchallenges.challenge35;

import java.util.List;

/**
 * Challenge 35: Pairs Whose Sum Equals a Target
 *
 * Problem:
 * List every pair of numbers from a list that adds up to a target value. A pair is only
 * reported once, so (7, 3) must not appear next to (3, 7).
 *
 * Hint:
 * - IntStream.range(0, size) gives the positions, so the pairs are built from indices
 * - flatMap turns every position i into a stream of pairs and joins them into one stream
 * - the inner range starts at i + 1, which is exactly what keeps (a, b) and (b, a) from both
 *   being reported
 * - this nested version is O(n^2); a HashSet of the values already seen finds the same pairs
 *   in a single O(n) pass, at the cost of not reporting them in index order
 *
 * Expected Output:
 * Numbers: [2, 7, 4, 1, 9, 3]
 * Target: 10
 * Pairs: [[7, 3], [1, 9]]
 * Pair count: 2
 *
 * TODO:
 * 1. Build the input list and the target of the problem statement
 * 2. Build all pairs of indices i < j whose values add up to the target
 * 3. Print the pairs and their number
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 35: Pairs Whose Sum Equals a Target ===");

        // TODO 1: the inputs of the problem statement
        List<Integer> numbers = List.of(2, 7, 4, 1, 9, 3);
        int target = 10;
        System.out.println("Numbers: " + numbers);
        System.out.println("Target: " + target);

        // TODO 2: stream the positions and flatten the inner matches into one stream of pairs
        // List<List<Integer>> pairs = IntStream.range(0, numbers.size())...;

        // TODO 3: print the pairs and their number
        // System.out.println("Pairs: " + pairs);
        // System.out.println("Pair count: " + pairs.size());
    }
}

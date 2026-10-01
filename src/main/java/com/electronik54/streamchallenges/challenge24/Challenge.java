package com.electronik54.streamchallenges.challenge24;

import java.util.List;

/**
 * Challenge 24: Partition by a Threshold and Count With teeing
 *
 * Problem:
 * Split a list of numbers into the values of 10 and above and the values below 10. Then count
 * both sides again with a single collector that runs both counts in one pass.
 *
 * Hint:
 * - Collectors.partitioningBy(condition) always returns exactly the keys true and false
 * - Collectors.filtering(condition, downstream) filters inside a collector, without a stream
 * - Collectors.teeing(first, second, merger) feeds every element to both collectors and merges
 *   the two results at the end - two answers from one pass
 * - a local record is a convenient carrier for the two merged numbers
 *
 * Expected Output:
 * Numbers: [5, 12, 7, 20, 15, 8, 30, 4]
 * High (>= 10): [12, 20, 15, 30]
 * Low (< 10): [5, 7, 8, 4]
 * High count: 4
 * Low count: 4
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Partition the values with partitioningBy and print both groups
 * 3. Count both groups with teeing and print the two counters
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 24: Partition by a Threshold and Count With teeing ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(5, 12, 7, 20, 15, 8, 30, 4);
        System.out.println("Numbers: " + numbers);

        // TODO 2: partition the values and print the group above the threshold first
        // Map<Boolean, List<Integer>> partition = numbers.stream()...;
        // System.out.println("High (>= 10): " + partition.get(Boolean.TRUE));
        // System.out.println("Low (< 10): " + partition.get(Boolean.FALSE));

        // TODO 3: count both sides in one pass with teeing
        // record Counts(long high, long low) { }
        // Counts counts = numbers.stream().collect(Collectors.teeing(...));
        // System.out.println("High count: " + counts.high());
        // System.out.println("Low count: " + counts.low());
    }
}

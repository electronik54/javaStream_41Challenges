package com.electronik54.streamchallenges.challenge03;

import java.util.List;

/**
 * Challenge 03: Sum, Average and Count
 *
 * Problem:
 * Given a list of numbers, report how many values it holds, their sum and their average.
 * All three values must come out of a single pass over the data.
 *
 * Hint:
 * - mapToInt(Integer::intValue) turns the Stream of objects into an IntStream, without boxing
 * - summaryStatistics() collects count, sum, min, max and average in one object in one pass
 * - getAverage() returns a double, so 155 / 5 is printed as 31.0 and not as 31
 *
 * Expected Output:
 * Numbers: [10, 20, 30, 40, 55]
 * Count: 5
 * Sum: 155
 * Average: 31.0
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Fill a summary statistics object from a single stream
 * 3. Print count, sum and average
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 03: Sum, Average and Count ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(10, 20, 30, 40, 55);
        System.out.println("Numbers: " + numbers);

        // TODO 2: collect count, sum and average during one pass
        // IntSummaryStatistics stats = numbers.stream()...summaryStatistics();

        // TODO 3: print the three values in the order of the expected output
        // System.out.println("Count: " + stats.getCount());
        // System.out.println("Sum: " + stats.getSum());
        // System.out.println("Average: " + stats.getAverage());
    }
}

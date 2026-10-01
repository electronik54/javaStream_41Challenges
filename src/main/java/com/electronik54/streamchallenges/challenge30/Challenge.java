package com.electronik54.streamchallenges.challenge30;

import java.util.List;

/**
 * Challenge 30: Running Total
 *
 * Problem:
 * Turn a list of numbers into its running total: every position holds the sum of all values
 * up to that point. Print the running total and its last value.
 *
 * Hint:
 * - the naive version sums numbers.subList(0, i + 1) for every index, which costs O(n^2)
 * - Arrays.parallelPrefix(array, Integer::sum) replaces every element by itself plus all
 *   elements before it - one linear pass, and it can run in parallel for large arrays
 * - Arrays.stream(intArray).boxed() turns the result back into a List<Integer>
 *
 * Expected Output:
 * Numbers: [3, 5, 2, 7, 4]
 * Running total: [3, 8, 10, 17, 21]
 * Total after last step: 21
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Copy the values into an int array and run the prefix sum over it
 * 3. Print the running total and its last value
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 30: Running Total ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(3, 5, 2, 7, 4);
        System.out.println("Numbers: " + numbers);

        // TODO 2: prefix sum over the array copy of the values
        // int[] values = numbers.stream()...toArray();
        // Arrays.parallelPrefix(values, Integer::sum);

        // TODO 3: print the running total and the final value
        // System.out.println("Running total: " + ...);
        // System.out.println("Total after last step: " + ...);
    }
}

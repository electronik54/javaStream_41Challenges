package com.electronik54.streamchallenges.challenge39;

import java.util.List;

/**
 * Challenge 39: Sliding Window Sums
 *
 * Problem:
 * For a list of numbers and a window size k, print the sum of every window of k consecutive
 * values, and report the largest of those sums.
 *
 * Hint:
 * - IntStream.rangeClosed(0, size - k) lists exactly the valid start positions of a window
 * - subList(start, start + k) is a view on the list, not a copy, so slicing is cheap
 * - mapToInt(Integer::intValue).sum() adds the values of one window
 * - boxed() turns the IntStream of sums into a Stream<Integer> that toList() can collect
 * - this version costs O(n * k); a real sliding window keeps a running sum and only adds the
 *   entering value and subtracts the leaving one, which brings it down to O(n)
 *
 * Expected Output:
 * Numbers: [1, 2, 3, 4, 5, 6]
 * Window size: 3
 * Window sums: [6, 9, 12, 15]
 * Maximum window sum: 15
 *
 * TODO:
 * 1. Build the input list and the window size
 * 2. Sum every window of k consecutive values
 * 3. Print the window sums and the largest of them
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 39: Sliding Window Sums ===");

        // TODO 1: the inputs of the problem statement
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int windowSize = 3;
        System.out.println("Numbers: " + numbers);
        System.out.println("Window size: " + windowSize);

        // TODO 2: sum every window of three consecutive values
        // List<Integer> windowSums = IntStream.rangeClosed(0, numbers.size() - windowSize)...;

        // TODO 3: print the window sums and the largest one
        // System.out.println("Window sums: " + windowSums);
        // System.out.println("Maximum window sum: " + ...);
    }
}

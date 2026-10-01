package com.electronik54.streamchallenges.challenge16;

import java.util.List;

/**
 * Challenge 16: Flatten Nested Lists
 *
 * Problem:
 * Given a list of lists of numbers, turn it into one flat list, print it sorted from large
 * to small, and sum all of its values.
 *
 * Hint:
 * - flatMap(function) replaces every element by a stream and joins all those streams into one
 * - List::stream is the function that turns each inner list into a stream
 * - after flatMap the pipeline holds plain numbers, so sorted(), sum() and count() work as usual
 *
 * Expected Output:
 * Nested: [[1, 2], [3], [4, 5, 6]]
 * Flattened: [1, 2, 3, 4, 5, 6]
 * Flattened descending: [6, 5, 4, 3, 2, 1]
 * Total sum: 21
 *
 * TODO:
 * 1. Build the nested input of the problem statement
 * 2. Flatten it into one stream of numbers
 * 3. Print the flat list, its descending order and the sum
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 16: Flatten Nested Lists ===");

        // TODO 1: the nested input of the problem statement
        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3), List.of(4, 5, 6));
        System.out.println("Nested: " + nested);

        // TODO 2: flatten the inner lists into a single stream
        // List<Integer> flattened = nested.stream()...;

        // TODO 3: print the flat list, a descending view of it and the sum of all values
        // System.out.println("Flattened: " + flattened);
        // System.out.println("Flattened descending: " + ...);
        // System.out.println("Total sum: " + ...);
    }
}

package com.electronik54.streamchallenges.challenge19;

import java.util.List;

/**
 * Challenge 19: Sum and Product With reduce
 *
 * Problem:
 * Add up all numbers of a list and multiply them, both with reduce(). Then produce the same
 * sum through an IntStream and compare the two results.
 *
 * Hint:
 * - reduce(identity, accumulator) starts from the identity value and combines the elements
 *   two at a time
 * - the identity has to be neutral: 0 for a sum, 1 for a product
 * - reduce(accumulator) without an identity returns an Optional, because an empty stream has
 *   nothing to combine
 * - mapToInt(Integer::intValue).sum() adds primitives and skips the boxing of every step
 *
 * Expected Output:
 * Numbers: [2, 3, 4, 5]
 * Sum with reduce: 14
 * Product with reduce: 120
 * Sum with IntStream: 14
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Compute the sum and the product with reduce()
 * 3. Compute the sum again with an IntStream and print all three numbers
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 19: Sum and Product With reduce ===");

        // TODO 1: the input of the problem statement
        List<Integer> numbers = List.of(2, 3, 4, 5);
        System.out.println("Numbers: " + numbers);

        // TODO 2: combine the values with reduce, once with the identity 0 and once with 1
        // int sum = numbers.stream()...;
        // int product = numbers.stream()...;

        // TODO 3: sum the same values through an IntStream and print the three results
        // System.out.println("Sum with reduce: " + sum);
        // System.out.println("Product with reduce: " + product);
        // System.out.println("Sum with IntStream: " + ...);
    }
}

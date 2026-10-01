package com.electronik54.streamchallenges.challenge19.solution;

import java.util.List;

/*
 * Solution 19: Sum and Product With reduce - how it works
 *
 * reduce(identity, accumulator) folds the stream into one value: the accumulator receives the
 * result so far and the next element, so [2, 3, 4, 5] becomes ((0 + 2) + 3) + 4 ... The
 * identity must be neutral, which is why the product starts at 1 - starting it at 0 would
 * erase every multiplication.
 *
 * Without an identity, reduce(accumulator) returns an Optional, because an empty stream has no
 * value to return. sum() and count() on an IntStream are the specialised, boxing-free versions
 * of the same fold and are what production code uses for numbers.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 19: Sum and Product With reduce ===");

        List<Integer> numbers = List.of(2, 3, 4, 5);
        System.out.println("Numbers: " + numbers);

        int sum = numbers.stream().reduce(0, Integer::sum);
        int product = numbers.stream().reduce(1, (left, right) -> left * right);

        System.out.println("Sum with reduce: " + sum);
        System.out.println("Product with reduce: " + product);
        System.out.println("Sum with IntStream: " + numbers.stream().mapToInt(Integer::intValue).sum());
    }
}

package com.electronik54.streamchallenges.challenge30.solution;

import java.util.Arrays;
import java.util.List;

/*
 * Solution 30: Running Total - how it works
 *
 * A running total needs every intermediate result, not just the final sum, so reduce() is the
 * wrong tool - it keeps one value. The straightforward loop is easy, but the array route is
 * both shorter and faster: parallelPrefix walks the array once and turns every element into
 * itself plus everything before it, which is O(n) and splits across cores for large arrays.
 *
 * The int[] copy is deliberate: parallelPrefix works in place, so the input list itself stays
 * untouched. The sum of int values can overflow for very large data, which is why a real
 * accumulation over money or sizes uses long values instead.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 30: Running Total ===");

        List<Integer> numbers = List.of(3, 5, 2, 7, 4);
        System.out.println("Numbers: " + numbers);

        int[] values = numbers.stream().mapToInt(Integer::intValue).toArray();
        Arrays.parallelPrefix(values, Integer::sum);
        List<Integer> runningTotal = Arrays.stream(values).boxed().toList();

        System.out.println("Running total: " + runningTotal);
        System.out.println("Total after last step: " + runningTotal.get(runningTotal.size() - 1));
    }
}

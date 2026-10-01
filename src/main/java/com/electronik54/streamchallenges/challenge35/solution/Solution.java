package com.electronik54.streamchallenges.challenge35.solution;

import java.util.List;
import java.util.stream.IntStream;

/*
 * Solution 35: Pairs Whose Sum Equals a Target - how it works
 *
 * The outer IntStream.range streams the positions of the list. Every position opens a second
 * range that starts one step further, and flatMap then merges all those small streams into one
 * stream of pairs. Starting the inner range at i + 1 is what makes every pair unique: the
 * positions are always (smaller, larger), so (3, 7) can never follow (7, 3).
 *
 * The values are read with get(i) and get(j), which is O(1) for a List and keeps the pipeline
 * free of a cartesian product of values.
 *
 * This shape is the readable answer, but it costs O(n^2) comparisons. A HashSet that remembers
 * the values seen so far answers the same question in one pass: for every value check whether
 * target - value is already in the set, which is what a production implementation would do
 * when the list is large.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 35: Pairs Whose Sum Equals a Target ===");

        List<Integer> numbers = List.of(2, 7, 4, 1, 9, 3);
        int target = 10;
        System.out.println("Numbers: " + numbers);
        System.out.println("Target: " + target);

        List<List<Integer>> pairs = IntStream.range(0, numbers.size())
                .boxed()
                .flatMap(first -> IntStream.range(first + 1, numbers.size())
                        .filter(second -> numbers.get(first) + numbers.get(second) == target)
                        .mapToObj(second -> List.of(numbers.get(first), numbers.get(second))))
                .toList();

        System.out.println("Pairs: " + pairs);
        System.out.println("Pair count: " + pairs.size());
    }
}

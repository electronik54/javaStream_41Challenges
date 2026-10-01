package com.electronik54.streamchallenges.challenge04.solution;

import java.util.List;
import java.util.OptionalInt;

/*
 * Solution 04: Maximum and Minimum Value - how it works
 *
 * mapToInt(Integer::intValue) turns the Stream<Integer> into an IntStream, so max() and
 * min() compare primitives instead of objects. The obvious alternative,
 * max(Comparator.naturalOrder()) on the Stream<Integer>, boxes every comparison.
 *
 * Both methods return an OptionalInt instead of a plain int, because an empty stream has
 * no maximum at all. orElseThrow() unwraps the value and throws NoSuchElementException
 * only when the Optional is empty - here the list is not empty, and the empty list is
 * handled by printing the OptionalInt itself.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 04: Maximum and Minimum Value ===");

        List<Integer> numbers = List.of(42, 7, 99, 13, 58);
        System.out.println("Numbers: " + numbers);

        // largest and smallest value of the list
        OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
        System.out.println("Max: " + max.orElseThrow());
        System.out.println("Min: " + min.orElseThrow());

        // an empty list has no maximum, so the OptionalInt stays empty instead of throwing
        OptionalInt emptyMax = List.<Integer>of().stream().mapToInt(Integer::intValue).max();
        System.out.println("Max of empty list: " + emptyMax);
    }
}

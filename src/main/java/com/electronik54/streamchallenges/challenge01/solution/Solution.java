package com.electronik54.streamchallenges.challenge01.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/*
 * ============================================================================
 * Solution 01: Separate Even and Odd Numbers - how it works
 * ============================================================================
 *
 * The answer is a single stream pipeline:
 *
 *   numbers.stream()                                     -> open a stream over the numbers
 *   .filter(Objects::nonNull)                            -> drop null entries first
 *   .collect(Collectors.partitioningBy(
 *            value -> value % 2 == 0,
 *            Collectors.toUnmodifiableList()))            -> split the rest into two buckets
 *
 * Why each piece is there:
 * - partitioningBy is the collector for a yes/no question. It always returns exactly the
 *   two keys true and false, so even an empty input still produces both groups.
 * - The predicate is "value % 2 == 0". Writing "value % 2 == 1" instead would misclassify
 *   negative odd numbers, because -7 % 2 is -1 in Java.
 * - filter(Objects::nonNull) runs before the predicate, so a null value never reaches
 *   value % 2, which would fail while unboxing the Integer to int.
 * - A null input list is replaced by List.of() at the top, so a caller receives an empty
 *   partition instead of a NullPointerException.
 * - Collectors.toUnmodifiableList() makes each bucket read-only and
 *   Collections.unmodifiableMap(...) makes the outer map read-only, so no caller can
 *   change data that other components share.
 * - groupingBy could build the same result, but it creates a bucket only when a value
 *   lands in it, so the empty keys would have to be added by hand - partitioningBy does
 *   that for you.
 *
 * The pipeline makes one O(n) pass, so no sorting and no second traversal is needed.
 */
public class Solution {

    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        // a null list behaves like an empty list, so callers never get a NullPointerException
        List<Integer> source = numbers == null ? List.of() : numbers;

        // partitioningBy answers one yes/no question and always keeps both keys; nulls are filtered
        // first because unboxing them in the predicate would fail, and the downstream collector
        // makes both buckets read-only
        Map<Boolean, List<Integer>> partition = source.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.partitioningBy(value -> value % 2 == 0, Collectors.toUnmodifiableList()));

        return Collections.unmodifiableMap(partition);
    }

    public static void main(String[] args) {
        System.out.println("=== Solution 01: Separate Even and Odd Numbers ===");

        List<Integer> numbers = List.of(11, 2, -4, 33, 4, 55, 6, 7, 88, 9, -10);
        // the same kind of data with null entries, the way a real feed often delivers it
        List<Integer> withNulls = Arrays.asList(11, null, 2, 33, null, 4, 6);

        System.out.println("Input: " + numbers);
        // key true holds the even numbers, key false the odd ones
        Map<Boolean, List<Integer>> partition = partitionEvenOdd(numbers);
        System.out.println("true  -> " + partition.get(Boolean.TRUE));
        System.out.println("false -> " + partition.get(Boolean.FALSE));

        // the two null entries are skipped, so only 2, 4 and 6 stay in the even group
        System.out.println("Input with nulls: " + withNulls);
        Map<Boolean, List<Integer>> withNullPartition = partitionEvenOdd(withNulls);
        System.out.println("true  -> " + withNullPartition.get(Boolean.TRUE));
        System.out.println("false -> " + withNullPartition.get(Boolean.FALSE));

        // an empty list still yields both keys, each holding an empty list
        Map<Boolean, List<Integer>> empty = partitionEvenOdd(List.of());
        System.out.println("Empty input: true -> " + empty.get(Boolean.TRUE)
                + " false -> " + empty.get(Boolean.FALSE));
    }
}

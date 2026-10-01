package com.electronik54.streamchallenges.challenge16.solution;

import java.util.Comparator;
import java.util.List;

/*
 * Solution 16: Flatten Nested Lists - how it works
 *
 * map(List::stream) would produce a Stream<Stream<Integer>>. flatMap(List::stream) instead
 * opens every inner list and feeds all of its elements into one continuous stream, so the
 * nesting disappears without a single manual add().
 *
 * Once the values are flat, the usual operations apply: sorted() orders them and
 * mapToInt(Integer::intValue).sum() adds them up on primitives. Each of those steps reads
 * the flat stream only once, so the whole challenge is two or three cheap passes over six
 * numbers instead of a loop with temporary lists.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 16: Flatten Nested Lists ===");

        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3), List.of(4, 5, 6));
        System.out.println("Nested: " + nested);

        List<Integer> flattened = nested.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flattened: " + flattened);
        System.out.println("Flattened descending: " + flattened.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println("Total sum: " + flattened.stream().mapToInt(Integer::intValue).sum());
    }
}

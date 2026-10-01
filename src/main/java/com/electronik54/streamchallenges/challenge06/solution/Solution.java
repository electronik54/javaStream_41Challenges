package com.electronik54.streamchallenges.challenge06.solution;

import java.util.Comparator;
import java.util.List;

/*
 * Solution 06: Sort Numbers Ascending and Descending - how it works
 *
 * sorted() sorts by the natural order of the elements, which is the ascending order for
 * Integer. sorted(Comparator.reverseOrder()) hands the stream a comparator instead, so the
 * same values come out descending.
 *
 * Sorting is a stateful operation: the stream buffers all elements before the first one is
 * emitted, which is why the sorted stream cannot be infinite.
 *
 * limit(3) then keeps only the first three elements of the already sorted stream, so the
 * "top 3" result costs nothing extra.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 06: Sort Numbers Ascending and Descending ===");

        List<Integer> numbers = List.of(35, 12, 90, 7, 58, 12, 41);
        System.out.println("Numbers: " + numbers);

        List<Integer> ascending = numbers.stream().sorted().toList();
        List<Integer> descending = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> topThree = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();

        System.out.println("Ascending: " + ascending);
        System.out.println("Descending: " + descending);
        System.out.println("Top 3 largest: " + topThree);
    }
}

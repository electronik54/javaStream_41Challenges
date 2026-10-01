package com.electronik54.streamchallenges.challenge39.solution;

import java.util.List;
import java.util.stream.IntStream;

/*
 * Solution 39: Sliding Window Sums - how it works
 *
 * rangeClosed(0, size - windowSize) produces exactly the start positions that still have room
 * for a full window: with six values and a window of three, the starts are 0, 1, 2 and 3. Every
 * position then becomes one sum, and boxed() lets toList() collect those sums into a list.
 *
 * subList(start, start + windowSize) returns a view on the original list, so no sub list is
 * copied while the windows are being summed.
 *
 * The price of this readable version is that every window is added up again, which is O(n * k).
 * A sliding window keeps one running sum instead: add numbers.get(start + k - 1) and subtract
 * numbers.get(start - 1) when the window moves, which is O(n) for any k. That version needs a
 * loop or a custom collector, because each element depends on the previous window.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 39: Sliding Window Sums ===");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int windowSize = 3;
        System.out.println("Numbers: " + numbers);
        System.out.println("Window size: " + windowSize);

        List<Integer> windowSums = IntStream.rangeClosed(0, numbers.size() - windowSize)
                .map(start -> numbers.subList(start, start + windowSize).stream()
                        .mapToInt(Integer::intValue)
                        .sum())
                .boxed()
                .toList();

        System.out.println("Window sums: " + windowSums);
        System.out.println("Maximum window sum: " + windowSums.stream().mapToInt(Integer::intValue).max().orElseThrow());
    }
}

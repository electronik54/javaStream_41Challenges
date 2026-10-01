package com.electronik54.streamchallenges.challenge03.solution;

import java.util.IntSummaryStatistics;
import java.util.List;

/*
 * Solution 03: Sum, Average and Count - how it works
 *
 * mapToInt(Integer::intValue) converts the Stream<Integer> into an IntStream, so the
 * arithmetic runs on primitives instead of boxing every value.
 *
 * summaryStatistics() then walks the data once and fills a single IntSummaryStatistics
 * object with count, sum, min, max and average. The alternative - calling count(),
 * sum() and average() separately - would read the list three times and build three
 * separate pipelines, which costs more work for the same answer.
 *
 * The average is a double, which is why 155 / 5 is printed as 31.0.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 03: Sum, Average and Count ===");

        List<Integer> numbers = List.of(10, 20, 30, 40, 55);
        System.out.println("Numbers: " + numbers);

        // one pass fills count, sum, min, max and average at the same time
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }
}

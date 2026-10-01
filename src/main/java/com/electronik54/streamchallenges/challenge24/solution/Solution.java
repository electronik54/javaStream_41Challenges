package com.electronik54.streamchallenges.challenge24.solution;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Solution 24: Partition by a Threshold and Count With teeing - how it works
 *
 * partitioningBy(condition) asks one yes/no question and always returns both keys, so the
 * two groups come out of a single pass over the numbers.
 *
 * teeing(first, second, merger) is the collector for two answers from one pass. Every element
 * is offered to both downstream collectors, here filtering(condition, counting()), and the
 * merger turns the two counters into one value. Without teeing the same job needs two
 * separate stream pipelines.
 *
 * The local record Counts carries the merged numbers out of the collector, so main can still
 * print them on separate lines.
 */
public class Solution {

    record Counts(long high, long low) {
    }

    public static void main(String[] args) {
        System.out.println("=== Solution 24: Partition by a Threshold and Count With teeing ===");

        List<Integer> numbers = List.of(5, 12, 7, 20, 15, 8, 30, 4);
        System.out.println("Numbers: " + numbers);

        Map<Boolean, List<Integer>> partition = numbers.stream()
                .collect(Collectors.partitioningBy(value -> value >= 10));

        System.out.println("High (>= 10): " + partition.get(Boolean.TRUE));
        System.out.println("Low (< 10): " + partition.get(Boolean.FALSE));

        Counts counts = numbers.stream().collect(Collectors.teeing(
                Collectors.filtering(value -> value >= 10, Collectors.counting()),
                Collectors.filtering(value -> value < 10, Collectors.counting()),
                Counts::new));

        System.out.println("High count: " + counts.high());
        System.out.println("Low count: " + counts.low());
    }
}

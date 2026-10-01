package com.electronik54.streamchallenges.challenge12.solution;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Solution 12: Find Duplicate Elements - how it works
 *
 * groupingBy(value -> value, counting()) builds a frequency map in one pass: the stream is
 * only read once, no matter how many duplicates exist. The attribute has to be a boxed
 * value here, because a Map cannot use a primitive int as its key.
 *
 * A value is a duplicate exactly when its counter is above 1, so the second pass only walks
 * the map - the same size as the number of distinct values, not the size of the list.
 *
 * The result is sorted because groupingBy hands back a HashMap, whose key order is not
 * defined; without the sort the printed order could change between runs.
 *
 * The obvious alternative, filtering with numbers.indexOf(value) != numbers.lastIndexOf(value),
 * hides a nested scan per element - O(n^2) for a problem that one pass solves.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 12: Find Duplicate Elements ===");

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 6, 5, 5);
        System.out.println("Numbers: " + numbers);

        Map<Integer, Long> frequencies = numbers.stream()
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()));

        List<Integer> duplicates = frequencies.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();

        System.out.println("Duplicates (distinct): " + duplicates);
        System.out.println("Duplicate count: " + duplicates.size());
    }
}

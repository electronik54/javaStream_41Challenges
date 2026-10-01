package com.electronik54.streamchallenges.challenge15.solution;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Solution 15: Sort a Map by Key and by Value - how it works
 *
 * A Map is not a stream source, so the entries are streamed through entrySet().stream().
 * Sorting reorders those entries, and the encounter order of a stream is what the collector
 * consumes: toMap(key, value, merge, LinkedHashMap::new) therefore writes the entries into a
 * LinkedHashMap in exactly that order. With the usual two-argument toMap() the result would
 * be a HashMap, whose iteration order ignores the sort completely.
 *
 * The merge function (left, right) -> left is required by the four-argument toMap() because
 * duplicate keys have to be resolved; here the keys are unique, so it never runs.
 *
 * Map.Entry.comparingByKey() and comparingByValue() supply the comparators, and reversed()
 * turns the ascending value order into a descending one. The explicit
 * Map.Entry.<String, Integer>comparingByValue() type witness is needed before reversed(),
 * because reversed() returns a Comparator<Entry<String, Integer>> that the compiler cannot
 * infer on its own from an empty method chain.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 15: Sort a Map by Key and by Value ===");

        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("carol", 88);
        scores.put("alice", 95);
        scores.put("bob", 72);
        scores.put("dave", 81);
        System.out.println("Scores: " + scores);

        Map<String, Integer> byKey = scores.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (left, right) -> left, LinkedHashMap::new));

        Map<String, Integer> byValueAscending = scores.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (left, right) -> left, LinkedHashMap::new));

        Map<String, Integer> byValueDescending = scores.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (left, right) -> left, LinkedHashMap::new));

        System.out.println("By key: " + byKey);
        System.out.println("By value ascending: " + byValueAscending);
        System.out.println("By value descending: " + byValueDescending);
    }
}

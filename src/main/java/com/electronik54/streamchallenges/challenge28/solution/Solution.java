package com.electronik54.streamchallenges.challenge28.solution;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 28: Most and Least Frequent Element - how it works
 *
 * groupingBy(vote -> vote, TreeMap::new, counting()) counts every value in one pass and keeps
 * the keys sorted, so the printed Counts map is stable between runs.
 *
 * max() and min() on the entry set then look at the counters only. When two values are equally
 * frequent, the comparison reports equality and the first entry in encounter order wins - with
 * a TreeMap that is the alphabetically first key, which is why the tie breaker is predictable
 * here. Chaining thenComparing(Map.Entry.comparingByKey()) would state that rule in the code
 * instead of relying on the map type.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 28: Most and Least Frequent Element ===");

        List<String> votes = List.of("red", "blue", "red", "green", "blue", "red", "blue", "red");
        System.out.println("Votes: " + votes);

        Map<String, Long> counts = votes.stream()
                .collect(Collectors.groupingBy(vote -> vote, TreeMap::new, Collectors.counting()));

        Comparator<Map.Entry<String, Long>> byCount = Map.Entry.comparingByValue();
        Map.Entry<String, Long> mostFrequent = counts.entrySet().stream().max(byCount).orElseThrow();
        Map.Entry<String, Long> leastFrequent = counts.entrySet().stream().min(byCount).orElseThrow();

        System.out.println("Counts: " + counts);
        System.out.println("Most frequent: " + mostFrequent.getKey() + " (" + mostFrequent.getValue() + ")");
        System.out.println("Least frequent: " + leastFrequent.getKey() + " (" + leastFrequent.getValue() + ")");
    }
}

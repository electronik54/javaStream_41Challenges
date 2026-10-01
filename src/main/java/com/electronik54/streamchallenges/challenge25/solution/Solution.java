package com.electronik54.streamchallenges.challenge25.solution;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 25: Group Words by Length - how it works
 *
 * groupingBy(String::length, TreeMap::new, toList()) sorts every word into the bucket of its
 * length. The length is an int, which is autoboxed to Integer because a Map cannot use a
 * primitive key. TreeMap keeps those keys in ascending order, so the printed map starts at
 * the shortest words.
 *
 * The second grouping counts the words per length with counting(), and max() on the entry set
 * then points at the length with the most words. Both groupings read the four-word list once,
 * so the work stays linear in the number of words.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 25: Group Words by Length ===");

        List<String> words = List.of("a", "bb", "cc", "ddd", "ee", "f", "ggg");
        System.out.println("Words: " + words);

        Map<Integer, List<String>> byLength = words.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

        Map<Integer, Long> countByLength = words.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));

        Integer mostCommonLength = countByLength.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();

        System.out.println("By length: " + byLength);
        System.out.println("Most common length: " + mostCommonLength + " -> " + byLength.get(mostCommonLength));
    }
}

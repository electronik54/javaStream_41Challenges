package com.electronik54.streamchallenges.challenge17.solution;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Solution 17: List to Map With a Duplicate-Key Policy - how it works
 *
 * Collectors.toMap(keyMapper, valueMapper) is the short form, but it throws
 * IllegalStateException as soon as two elements share a key - which happens here, because
 * "apple" and "avocado" both start with "a". The three-argument form adds the merge function
 * that decides what to do with the collision, and that function is the policy of this
 * challenge: (first, second) -> first keeps the first word, (first, second) -> second keeps
 * the last one, and (first, second) -> first + ", " + second joins both.
 *
 * The four-argument form adds the map factory. LinkedHashMap::new keeps the encounter order
 * of the stream, so the printed map starts with a, b, c; the plain toMap() would return a
 * HashMap with an undefined key order.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 17: List to Map With a Duplicate-Key Policy ===");

        List<String> words = List.of("apple", "banana", "avocado", "blueberry", "cherry");
        System.out.println("Words: " + words);

        Map<Character, String> keepFirst = words.stream()
                .collect(Collectors.toMap(word -> word.charAt(0), word -> word,
                        (first, second) -> first, LinkedHashMap::new));

        Map<Character, String> keepLast = words.stream()
                .collect(Collectors.toMap(word -> word.charAt(0), word -> word,
                        (first, second) -> second, LinkedHashMap::new));

        Map<Character, String> joined = words.stream()
                .collect(Collectors.toMap(word -> word.charAt(0), word -> word,
                        (first, second) -> first + ", " + second, LinkedHashMap::new));

        System.out.println("Keep first: " + keepFirst);
        System.out.println("Keep last: " + keepLast);
        System.out.println("Joined: " + joined);
    }
}

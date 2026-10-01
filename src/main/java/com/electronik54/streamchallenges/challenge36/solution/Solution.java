package com.electronik54.streamchallenges.challenge36.solution;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 36: First Non-Repeating Character - how it works
 *
 * The counting pass builds a map of characters to counters. groupingBy stores the characters as
 * Character objects, so the counters can be looked up by the same kind of value that the second
 * pass produces.
 *
 * The second pass walks the text in order, keeps the characters whose counter is exactly 1 and
 * stops at the first one with findFirst(). That short-circuit saves work: in "swiss" only the
 * first two characters are inspected.
 *
 * A single pass would need a LinkedHashMap of counters plus a second scan of its first entry
 * with count 1; the two-stream version here is the clearer one and still runs in O(n).
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 36: First Non-Repeating Character ===");

        String text = "swiss";
        System.out.println("Text: " + text);

        Map<Character, Long> frequencies = text.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(character -> character, TreeMap::new, Collectors.counting()));

        Optional<Character> firstUnique = text.chars()
                .mapToObj(value -> (char) value)
                .filter(character -> frequencies.get(character) == 1L)
                .findFirst();

        System.out.println("Frequencies: " + frequencies);
        System.out.println("First non-repeating: " + firstUnique.orElse('-'));
    }
}

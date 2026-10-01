package com.electronik54.streamchallenges.challenge13.solution;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 13: Character Frequency in a String - how it works
 *
 * text.chars() gives an IntStream of the code units of the string. mapToObj(value -> (char) value)
 * turns it back into a Stream<Character> that groupingBy can work with. For text that may hold
 * characters outside the Basic Multilingual Plane, text.codePoints() is the correct source.
 *
 * groupingBy(character -> character, TreeMap::new, counting()) counts every character and puts
 * the counters into a TreeMap, so the printed map is ordered by character instead of by hash.
 *
 * The most frequent character is then the map entry with the highest counter, found with
 * max(Map.Entry.comparingByValue()).
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 13: Character Frequency in a String ===");

        String text = "banana";
        System.out.println("Text: " + text);

        Map<Character, Long> frequencies = text.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(character -> character, TreeMap::new, Collectors.counting()));

        System.out.println("Frequencies: " + frequencies);

        Map.Entry<Character, Long> mostFrequent = frequencies.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Most frequent: " + mostFrequent.getKey() + " (" + mostFrequent.getValue() + " times)");
    }
}

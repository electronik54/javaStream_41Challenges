package com.electronik54.streamchallenges.challenge14.solution;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
 * Solution 14: Word Frequency in a Sentence - how it works
 *
 * Pattern.compile("\\s+") is compiled once and then reused by splitAsStream, which streams
 * the words as they are found. The usual sentence.split("\\s+") would compile the pattern on
 * every call and build a whole array before the stream starts.
 *
 * toLowerCase() runs before the collector, so "The" and "the" land in the same bucket.
 *
 * groupingBy(word -> word, TreeMap::new, counting()) counts every word and stores the result
 * in a TreeMap, which keeps the words in alphabetical order and makes the output stable.
 *
 * The most frequent word is the entry with the largest counter, found with
 * max(Map.Entry.comparingByValue()). A real counter for text would also strip punctuation
 * and stop words, which is exactly what the split pattern and the map would change.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 14: Word Frequency in a Sentence ===");

        String sentence = "the quick brown fox jumps over the lazy dog the fox";
        System.out.println("Sentence: " + sentence);

        Map<String, Long> frequencies = Pattern.compile("\\s+")
                .splitAsStream(sentence)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, TreeMap::new, Collectors.counting()));

        System.out.println("Distinct words: " + frequencies.size());
        System.out.println("Frequencies: " + frequencies);

        Map.Entry<String, Long> topWord = frequencies.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Top word: " + topWord.getKey() + " (" + topWord.getValue() + " times)");
    }
}

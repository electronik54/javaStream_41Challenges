package com.electronik54.streamchallenges.challenge34.solution;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 34: Group Anagrams Together - how it works
 *
 * Anagrams share one thing: the same letters. Sorting the letters of a word turns that into a
 * comparable key, so "listen", "silent" and "enlist" all become "eilnst" and land in the same
 * bucket of groupingBy.
 *
 * The signature costs O(n log n) per word. When the input is known to be lowercase ASCII, the
 * same key can be built in O(n) by counting the letters into an int[26] and printing that
 * array, which is what a high-throughput service would do instead.
 *
 * TreeMap::new sorts the groups by their signature, so the printed order is stable, and the
 * groups themselves keep the encounter order of the words inside them.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 34: Group Anagrams Together ===");

        List<String> words = List.of("listen", "silent", "enlist", "hello", "world", "dlrow");
        System.out.println("Words: " + words);

        Map<String, List<String>> bySignature = words.stream()
                .collect(Collectors.groupingBy(Solution::signature, TreeMap::new, Collectors.toList()));

        System.out.println("Groups: " + bySignature.values());
        System.out.println("Group count: " + bySignature.size());
    }

    // the anagram signature of a word: its letters in alphabetical order
    private static String signature(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}

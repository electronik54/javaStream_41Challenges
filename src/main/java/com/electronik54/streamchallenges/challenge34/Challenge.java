package com.electronik54.streamchallenges.challenge34;

import java.util.List;

/**
 * Challenge 34: Group Anagrams Together
 *
 * Problem:
 * Group a list of words so that every group holds words that are anagrams of each other, and
 * report how many groups the list has.
 *
 * Hint:
 * - two words are anagrams when their letters sorted alphabetically are identical, so that
 *   sorted text is a usable map key (the "signature" of the word)
 * - Collectors.groupingBy(word -> signature, TreeMap::new, Collectors.toList()) builds the groups
 * - Arrays.sort(charArray) plus new String(charArray) turns a word into its signature
 * - counting letters into an int[26] gives the same signature in O(n) instead of O(n log n)
 *   when only lowercase letters have to be supported
 *
 * Expected Output:
 * Words: [listen, silent, enlist, hello, world, dlrow]
 * Groups: [[world, dlrow], [hello], [listen, silent, enlist]]
 * Group count: 3
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Write a helper that returns the sorted letters of a word
 * 3. Group the words by that signature and print the groups and their number
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 34: Group Anagrams Together ===");

        // TODO 1: the input of the problem statement
        List<String> words = List.of("listen", "silent", "enlist", "hello", "world", "dlrow");
        System.out.println("Words: " + words);

        // TODO 2: group by the sorted letters of every word
        // Map<String, List<String>> bySignature = words.stream()...;

        // TODO 3: print the groups and how many of them exist
        // System.out.println("Groups: " + bySignature.values());
        // System.out.println("Group count: " + bySignature.size());
    }
}

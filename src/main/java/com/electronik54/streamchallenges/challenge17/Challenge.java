package com.electronik54.streamchallenges.challenge17;

import java.util.List;

/**
 * Challenge 17: List to Map With a Duplicate-Key Policy
 *
 * Problem:
 * Turn a list of words into a map from the first letter of a word to the word itself. Three
 * words share the letter "a" and two share "b", so the map needs a rule for duplicates:
 * keep the first word, keep the last word, and join the words.
 *
 * Hint:
 * - Collectors.toMap(keyMapper, valueMapper) throws IllegalStateException on a duplicate key
 * - the three-argument form takes a merge function that decides which value wins
 * - the four-argument form takes a map factory: LinkedHashMap::new keeps the key order of the
 *   input, a HashMap would print the letters in an undefined order
 *
 * Expected Output:
 * Words: [apple, banana, avocado, blueberry, cherry]
 * Keep first: {a=apple, b=banana, c=cherry}
 * Keep last: {a=avocado, b=blueberry, c=cherry}
 * Joined: {a=apple, avocado, b=banana, blueberry, c=cherry}
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Build the three maps with toMap, using a merge function for the duplicates
 * 3. Print the three maps
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 17: List to Map With a Duplicate-Key Policy ===");

        // TODO 1: the input of the problem statement
        List<String> words = List.of("apple", "banana", "avocado", "blueberry", "cherry");
        System.out.println("Words: " + words);

        // TODO 2: key = first letter, value = the word, merge = the policy for duplicates
        // Map<Character, String> keepFirst = words.stream()...;
        // Map<Character, String> keepLast = words.stream()...;
        // Map<Character, String> joined = words.stream()...;

        // TODO 3: print the three maps
        // System.out.println("Keep first: " + keepFirst);
        // System.out.println("Keep last: " + keepLast);
        // System.out.println("Joined: " + joined);
    }
}

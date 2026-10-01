package com.electronik54.streamchallenges.challenge13;

import java.util.Map;

/**
 * Challenge 13: Character Frequency in a String
 *
 * Problem:
 * Count how often every character of a word appears, print the counters in alphabetical
 * order, and name the character that appears most often.
 *
 * Hint:
 * - text.chars() opens an IntStream over the characters, mapToObj turns it back into chars
 * - Collectors.groupingBy(classifier, mapFactory, downstream) builds a TreeMap, which keeps
 *   the characters sorted - a HashMap would print them in an undefined order
 * - Collectors.counting() counts the elements of every group
 * - max(Map.Entry.comparingByValue()) finds the entry with the highest counter
 *
 * Expected Output:
 * Text: banana
 * Frequencies: {a=3, b=1, n=2}
 * Most frequent: a (3 times)
 *
 * TODO:
 * 1. Build the input text of the problem statement
 * 2. Count the characters into a map that is sorted by character
 * 3. Print the map and the most frequent character
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 13: Character Frequency in a String ===");

        // TODO 1: the input of the problem statement
        String text = "banana";
        System.out.println("Text: " + text);

        // TODO 2: count every character into a TreeMap so the output is ordered
        // Map<Character, Long> frequencies = text.chars()...

        // TODO 3: print the counters and the character with the highest count
        // System.out.println("Frequencies: " + frequencies);
        // Map.Entry<Character, Long> mostFrequent = frequencies.entrySet().stream()...
        // System.out.println("Most frequent: " + ...);
    }
}

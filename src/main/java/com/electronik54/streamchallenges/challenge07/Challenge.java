package com.electronik54.streamchallenges.challenge07;

import java.util.List;

/**
 * Challenge 07: Upper Case, Lower Case and Lengths
 *
 * Problem:
 * Given a list of words that mix upper and lower case, produce a list with every word in
 * upper case, a list with every word in lower case, and the number of characters of the
 * upper-cased words.
 *
 * Hint:
 * - map(function) transforms every element, so it turns a Stream<String> into a Stream<String>
 * - String::toUpperCase and String::toLowerCase are method references, not calls
 * - mapToInt(String::length).sum() counts characters without building another list
 *
 * Expected Output:
 * Names: [Java, stream, API, Lambda]
 * Upper: [JAVA, STREAM, API, LAMBDA]
 * Lower: [java, stream, api, lambda]
 * Total characters: 19
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Map every word to upper case and to lower case
 * 3. Sum the characters of the upper-cased words
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 07: Upper Case, Lower Case and Lengths ===");

        // TODO 1: the input of the problem statement
        List<String> names = List.of("Java", "stream", "API", "Lambda");
        System.out.println("Names: " + names);

        // TODO 2: map every word to upper case and to lower case
        // List<String> upper = names.stream()...;
        // List<String> lower = names.stream()...;

        // TODO 3: sum the length of the upper-cased words
        // int totalCharacters = upper.stream()...sum();
        // System.out.println("Upper: " + upper);
        // System.out.println("Lower: " + lower);
        // System.out.println("Total characters: " + totalCharacters);
    }
}

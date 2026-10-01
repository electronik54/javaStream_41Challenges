package com.electronik54.streamchallenges.challenge36;

/**
 * Challenge 36: First Non-Repeating Character
 *
 * Problem:
 * Given a word, find the first character that appears exactly once in it. If every character
 * repeats, report that there is no answer.
 *
 * Hint:
 * - count the characters like in the character frequency challenge, but into a TreeMap only if
 *   the counters themselves have to be printed in order
 * - text.chars().mapToObj(value -> (char) value) turns the code units into Character objects
 * - filter(character -> counts.get(character) == 1) followed by findFirst() stops at the first
 *   unique character, so the rest of the word is not read
 * - a character that is absent from the map would throw on unboxing, which is another reason the
 *   counting pass runs first
 *
 * Expected Output:
 * Text: swiss
 * Frequencies: {i=1, s=3, w=1}
 * First non-repeating: w
 *
 * TODO:
 * 1. Build the input text of the problem statement
 * 2. Count the characters into a map
 * 3. Filter the characters whose counter is 1 and print the first of them
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 36: First Non-Repeating Character ===");

        // TODO 1: the input of the problem statement
        String text = "swiss";
        System.out.println("Text: " + text);

        // TODO 2: count every character
        // Map<Character, Long> frequencies = text.chars()...;

        // TODO 3: print the counters and the first character counted exactly once
        // System.out.println("Frequencies: " + frequencies);
        // System.out.println("First non-repeating: " + ...);
    }
}

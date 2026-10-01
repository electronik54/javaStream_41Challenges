package com.electronik54.streamchallenges.challenge10;

import java.util.List;

/**
 * Challenge 10: Join Strings
 *
 * Problem:
 * Turn a list of words into a single text: once separated by ", ", once separated by " | ",
 * once wrapped in brackets, and once in upper case.
 *
 * Hint:
 * - Collectors.joining() glues the elements together without a delimiter
 * - Collectors.joining(delimiter) puts the delimiter between two elements
 * - Collectors.joining(delimiter, prefix, suffix) adds the wrapping around the whole text
 * - map() runs before the collector, so the words can be changed on the way
 *
 * Expected Output:
 * Names: [java, stream, lambda]
 * Joined with ", ": java, stream, lambda
 * Joined with " | ": java | stream | lambda
 * Wrapped: (java | stream | lambda)
 * Upper joined: JAVA | STREAM | LAMBDA
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Join the words with a comma, with " | " and with a prefix and suffix
 * 3. Join the upper-cased words with " | "
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 10: Join Strings ===");

        // TODO 1: the input of the problem statement
        List<String> names = List.of("java", "stream", "lambda");
        System.out.println("Names: " + names);

        // TODO 2: collect the words into one text
        // System.out.println("Joined with \", \": " + names.stream()...);
        // System.out.println("Joined with \" | \": " + names.stream()...);
        // System.out.println("Wrapped: " + names.stream()...);

        // TODO 3: upper case every word before joining it
        // System.out.println("Upper joined: " + names.stream()...);
    }
}

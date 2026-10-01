package com.electronik54.streamchallenges.challenge09;

import java.util.List;

/**
 * Challenge 09: First Match in a Stream
 *
 * Problem:
 * Given a list of names, find the first name that starts with "a". Then look for the first
 * name that starts with "x" and report that nothing was found instead of crashing.
 *
 * Hint:
 * - findFirst() stops the pipeline as soon as one element passes the filter
 * - it returns an Optional, because the stream may be empty after the filter
 * - orElse("not found") supplies the fallback value for the empty Optional
 * - findAny() looks the same but is meant for parallel streams, where "first" is not defined
 *
 * Expected Output:
 * Names: [bob, carol, alex, dave, anna]
 * First starting with 'a': alex
 * First starting with 'x': not found
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Find the first name starting with "a" and unwrap the Optional
 * 3. Repeat for "x" and show the fallback text
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 09: First Match in a Stream ===");

        // TODO 1: the input of the problem statement
        List<String> names = List.of("bob", "carol", "alex", "dave", "anna");
        System.out.println("Names: " + names);

        // TODO 2: find the first name that starts with "a"
        // Optional<String> firstWithA = names.stream()...findFirst();
        // System.out.println("First starting with 'a': " + firstWithA.orElse("not found"));

        // TODO 3: do the same for "x", where no name matches
        // System.out.println("First starting with 'x': " + ...);
    }
}

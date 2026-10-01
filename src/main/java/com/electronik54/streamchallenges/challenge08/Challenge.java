package com.electronik54.streamchallenges.challenge08;

import java.util.List;

/**
 * Challenge 08: Filter Words Starting With a Letter
 *
 * Problem:
 * From a list of names, keep those that start with the letter "a". Do it once exactly as
 * written, once ignoring the case of the names, and report how many names matched.
 *
 * Hint:
 * - filter(predicate) is the only step needed, the stream keeps the elements that match
 * - startsWith("a") is case sensitive
 * - regionMatches(true, 0, "a", 0, 1) compares the first character without ignoring the case
 *   and without building a lower-cased copy for every name
 *
 * Expected Output:
 * Names: [alice, Bob, anna, Carol, Adam, alex, dave]
 * Starting with 'a': [alice, anna, alex]
 * Starting with 'a' ignoring case: [alice, anna, Adam, alex]
 * Matching count: 4
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Filter the case-sensitive matches and the case-insensitive matches
 * 3. Print both lists and the number of case-insensitive matches
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 08: Filter Words Starting With a Letter ===");

        // TODO 1: the input of the problem statement
        List<String> names = List.of("alice", "Bob", "anna", "Carol", "Adam", "alex", "dave");
        System.out.println("Names: " + names);

        // TODO 2: keep the names that start with "a", once exactly and once ignoring case
        // List<String> caseSensitive = names.stream()...;
        // List<String> ignoreCase = names.stream()...;

        // TODO 3: print both lists and the count of the case-insensitive match
        // System.out.println("Starting with 'a': " + caseSensitive);
        // System.out.println("Starting with 'a' ignoring case: " + ignoreCase);
        // System.out.println("Matching count: " + ignoreCase.size());
    }
}

package com.electronik54.streamchallenges.challenge08.solution;

import java.util.List;

/*
 * Solution 08: Filter Words Starting With a Letter - how it works
 *
 * filter(predicate) keeps the elements for which the predicate returns true, so the stream
 * shrinks to the matching names and nothing else has to be done.
 *
 * The case-sensitive pass uses startsWith("a"). The case-insensitive pass uses
 * regionMatches(true, 0, "a", 0, 1), which compares the first character of the name with the
 * first character of "a" while ignoring case - the common alternative,
 * name.toLowerCase().startsWith("a"), creates a new String for every element.
 *
 * The count comes from the size of the filtered list, which is cheaper than filtering twice.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 08: Filter Words Starting With a Letter ===");

        List<String> names = List.of("alice", "Bob", "anna", "Carol", "Adam", "alex", "dave");
        System.out.println("Names: " + names);

        List<String> caseSensitive = names.stream()
                .filter(name -> name.startsWith("a"))
                .toList();

        List<String> ignoreCase = names.stream()
                .filter(name -> name.regionMatches(true, 0, "a", 0, 1))
                .toList();

        System.out.println("Starting with 'a': " + caseSensitive);
        System.out.println("Starting with 'a' ignoring case: " + ignoreCase);
        System.out.println("Matching count: " + ignoreCase.size());
    }
}

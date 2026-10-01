package com.electronik54.streamchallenges.challenge09.solution;

import java.util.List;
import java.util.Optional;

/*
 * Solution 09: First Match in a Stream - how it works
 *
 * findFirst() is a short-circuiting terminal operation: as soon as one element passes the
 * filter, the rest of the list is not read at all. That is why it is the right tool for
 * "give me the first match" instead of filtering everything and taking the element at
 * index 0.
 *
 * The result is an Optional, because a filtered stream may be empty. orElse("not found")
 * makes the empty case visible without an if (isPresent()) around every call.
 *
 * findAny() behaves like findFirst() on a sequential stream, but on a parallel stream it
 * returns whichever element the threads finish first, so the choice between the two is a
 * decision about determinism.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 09: First Match in a Stream ===");

        List<String> names = List.of("bob", "carol", "alex", "dave", "anna");
        System.out.println("Names: " + names);

        Optional<String> firstWithA = names.stream()
                .filter(name -> name.startsWith("a"))
                .findFirst();
        System.out.println("First starting with 'a': " + firstWithA.orElse("not found"));

        Optional<String> firstWithX = names.stream()
                .filter(name -> name.startsWith("x"))
                .findFirst();
        System.out.println("First starting with 'x': " + firstWithX.orElse("not found"));
    }
}

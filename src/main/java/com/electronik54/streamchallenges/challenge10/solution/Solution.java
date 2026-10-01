package com.electronik54.streamchallenges.challenge10.solution;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Solution 10: Join Strings - how it works
 *
 * Collectors.joining() is the collector for text: the one-argument form puts a delimiter
 * between the elements, the three-argument form adds a prefix and a suffix around the whole
 * result. It appends into a single StringBuilder, which is why it stays linear even for
 * thousands of words - string concatenation inside a loop would copy the text again and again.
 *
 * map(String::toUpperCase) runs before the collector, so the transformation happens per
 * element while the collector only cares about the final text.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 10: Join Strings ===");

        List<String> names = List.of("java", "stream", "lambda");
        System.out.println("Names: " + names);

        System.out.println("Joined with \", \": " + names.stream().collect(Collectors.joining(", ")));
        System.out.println("Joined with \" | \": " + names.stream().collect(Collectors.joining(" | ")));
        System.out.println("Wrapped: " + names.stream().collect(Collectors.joining(" | ", "(", ")")));

        System.out.println("Upper joined: " + names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" | ")));
    }
}

package com.electronik54.streamchallenges.challenge07.solution;

import java.util.List;

/*
 * Solution 07: Upper Case, Lower Case and Lengths - how it works
 *
 * map() applies one function to every element, so the stream stays a Stream<String> and the
 * number of elements never changes. String::toUpperCase is a method reference - it is handed
 * over as a function and called once per element by the stream.
 *
 * The character count uses mapToInt(String::length), which turns the stream into an IntStream
 * so sum() runs on primitives and no second list has to be built.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 07: Upper Case, Lower Case and Lengths ===");

        List<String> names = List.of("Java", "stream", "API", "Lambda");
        System.out.println("Names: " + names);

        List<String> upper = names.stream().map(String::toUpperCase).toList();
        List<String> lower = names.stream().map(String::toLowerCase).toList();

        int totalCharacters = upper.stream().mapToInt(String::length).sum();

        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Total characters: " + totalCharacters);
    }
}

package com.electronik54.streamchallenges.challenge32.solution;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Solution 32: Write a Custom Collector - how it works
 *
 * Collector.of describes the four moving parts of every collector: the supplier builds the
 * mutable container, the accumulator adds one element to it, the combiner merges two
 * containers, and the finisher converts the container into the result.
 *
 * The accumulator may mutate the container because that container belongs to the running
 * computation, never to the caller - each parallel split gets its own StringBuilder from the
 * supplier. That is also the reason the combiner is required: without it the partial texts of
 * two threads could not be brought together.
 *
 * Collectors.joining does the same work with a longer delimiter decision (it only appends the
 * separator between elements) - building a collector by hand is useful when no built-in one
 * produces the shape that is needed.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 32: Write a Custom Collector ===");

        List<String> words = List.of("java", "stream", "lambda");
        System.out.println("Words: " + words);

        Collector<String, StringBuilder, String> joined = Collector.of(
                StringBuilder::new,
                (builder, word) -> builder.append(builder.length() == 0 ? "" : ", ").append(word),
                (left, right) -> new StringBuilder(left).append(", ").append(right),
                StringBuilder::toString);

        System.out.println("Custom collector: " + words.stream().collect(joined)
                + " (" + words.size() + " words)");
        System.out.println("Built-in joining: " + words.stream().collect(Collectors.joining(", ")));
    }
}

package com.electronik54.streamchallenges.challenge32;

import java.util.List;

/**
 * Challenge 32: Write a Custom Collector
 *
 * Problem:
 * Build a collector from scratch that joins a list of words into one text, then compare it
 * with the ready-made Collectors.joining(". ").
 *
 * Hint:
 * - Collector.of(supplier, accumulator, combiner, finisher) describes a collector in four parts
 * - the supplier creates the mutable container the accumulator fills (here a StringBuilder)
 * - the combiner merges two containers and is only used by parallel streams
 * - the finisher turns the container into the final result; without it the container is the result
 * - a collector may mutate the container it created itself, which is why the accumulator can
 *   append into the StringBuilder without any locking
 *
 * Expected Output:
 * Words: [java, stream, lambda]
 * Custom collector: java, stream, lambda (3 words)
 * Built-in joining: java, stream, lambda
 *
 * TODO:
 * 1. Build the input list of the problem statement
 * 2. Describe the collector with Collector.of
 * 3. Collect the words with it and with Collectors.joining(", ") and print both results
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 32: Write a Custom Collector ===");

        // TODO 1: the input of the problem statement
        List<String> words = List.of("java", "stream", "lambda");
        System.out.println("Words: " + words);

        // TODO 2: build the collector out of supplier, accumulator, combiner and finisher
        // Collector<String, StringBuilder, String> joined = Collector.of(...);

        // TODO 3: collect with the custom collector and with the built-in one
        // System.out.println("Custom collector: " + words.stream().collect(joined) + " (" + words.size() + " words)");
        // System.out.println("Built-in joining: " + words.stream().collect(Collectors.joining(", ")));
    }
}

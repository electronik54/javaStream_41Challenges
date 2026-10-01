package com.electronik54.streamchallenges.challenge37;

/**
 * Challenge 37: Parallel Streams Without Side Effects
 *
 * Problem:
 * Sum, count and average the numbers from 1 to 1,000,000 with parallel streams, and get exactly
 * the same answers a sequential stream would produce.
 *
 * Hint:
 * - reduce, collect, sum, count and average are safe on parallel streams because every thread
 *   works on its own partial result and the framework merges them
 * - a shared ArrayList that several threads add to inside forEach loses writes, and the size it
 *   reports is wrong - never mutate shared state from a parallel pipeline
 * - peek() runs on the thread that happens to handle the element, which is why it must not
 *   change anything either; use it only for read-only logging
 * - parallel work pays off only when the work per element is large enough to outweigh the
 *   splitting and merging overhead
 *
 * Expected Output:
 * Values: 1 to 1000000
 * Sum (parallel reduce): 500000500000
 * Count (parallel count): 1000000
 * Average (parallel average): 500000.5
 *
 * TODO:
 * 1. Build the parallel number stream of the problem statement
 * 2. Reduce it to a sum, count it and average it
 * 3. Print the three results
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 37: Parallel Streams Without Side Effects ===");

        // TODO 1: the input range of the problem statement
        long limit = 1_000_000L;
        System.out.println("Values: 1 to " + limit);

        // TODO 2: use the parallel-safe operations only - no shared mutable collection
        // long sum = LongStream.rangeClosed(1, limit).parallel()...;
        // long count = LongStream.rangeClosed(1, limit).parallel()...;
        // double average = LongStream.rangeClosed(1, limit).parallel()...;

        // TODO 3: print the three results
        // System.out.println("Sum (parallel reduce): " + sum);
        // System.out.println("Count (parallel count): " + count);
        // System.out.println("Average (parallel average): " + average);
    }
}

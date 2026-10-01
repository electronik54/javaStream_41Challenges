package com.electronik54.streamchallenges.challenge38;

import java.util.List;

/**
 * Challenge 38: Infinite Streams With Iterate and Generate
 *
 * Problem:
 * Build four streams by hand: the first four powers of 2, the first eight Fibonacci numbers,
 * three identical values, and the first five even numbers.
 *
 * Hint:
 * - Stream.iterate(seed, hasNext, next) is the bounded form: the second argument stops the stream
 * - Stream.iterate(seed, next) is endless, so it always needs limit() or takeWhile()
 * - Stream.generate(supplier) is endless as well - it ignores previous elements completely
 * - a terminal operation on an endless stream without a limit never returns
 * - Fibonacci needs the previous two values, so iterate can carry them in a small array or record
 *
 * Expected Output:
 * Powers of 2: [1, 2, 4, 8]
 * Fibonacci (first 8): [0, 1, 1, 2, 3, 5, 8, 13]
 * Cycle of constants: [x, x, x]
 * First 5 even numbers: [0, 2, 4, 6, 8]
 *
 * TODO:
 * 1. Build the powers of 2 with the bounded iterate form
 * 2. Build the Fibonacci numbers with the endless iterate form plus limit
 * 3. Build the constant values with generate and the even numbers with iterate plus limit
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 38: Infinite Streams With Iterate and Generate ===");

        // TODO 1: powers of 2, stopped by the second argument of iterate
        // List<Integer> powers = Stream.iterate(1, value -> value <= 8, value -> value * 2).toList();
        // System.out.println("Powers of 2: " + powers);

        // TODO 2: Fibonacci - carry the last two values and limit the endless stream
        // List<Long> fibonacci = Stream.iterate(new long[]{0, 1}, pair -> new long[]{pair[1], pair[0] + pair[1]})
        //         .limit(8)
        //         .map(pair -> pair[0])
        //         .toList();
        // System.out.println("Fibonacci (first 8): " + fibonacci);

        // TODO 3: generate three constants and iterate the first five even numbers
        // System.out.println("Cycle of constants: " + ...);
        // System.out.println("First 5 even numbers: " + ...);
    }
}

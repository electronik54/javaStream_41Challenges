package com.electronik54.streamchallenges.challenge38.solution;

import java.util.List;
import java.util.stream.Stream;

/*
 * Solution 38: Infinite Streams With Iterate and Generate - how it works
 *
 * Stream.iterate(seed, hasNext, next) is the safe form: it keeps producing values until the
 * second argument says stop, so the pipeline stays finite without any limit. When only the
 * limit is known, the two-argument iterate and generate are used with limit(n) instead.
 *
 * Fibonacci cannot be produced from the previous value alone, because every term needs the two
 * terms before it. The trick is to iterate over the pair itself: the array {a, b} becomes
 * {b, a + b}, and the first element of each pair is the next Fibonacci number.
 *
 * Every one of these streams is lazy: nothing is computed before a terminal operation such as
 * toList() is called, and an endless stream without limit() would simply never finish.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 38: Infinite Streams With Iterate and Generate ===");

        List<Integer> powers = Stream.iterate(1, value -> value <= 8, value -> value * 2).toList();
        System.out.println("Powers of 2: " + powers);

        List<Long> fibonacci = Stream.iterate(new long[]{0, 1}, pair -> new long[]{pair[1], pair[0] + pair[1]})
                .limit(8)
                .map(pair -> pair[0])
                .toList();
        System.out.println("Fibonacci (first 8): " + fibonacci);

        List<String> constants = Stream.generate(() -> "x").limit(3).toList();
        System.out.println("Cycle of constants: " + constants);

        List<Integer> firstEvens = Stream.iterate(0, value -> value + 2).limit(5).toList();
        System.out.println("First 5 even numbers: " + firstEvens);
    }
}

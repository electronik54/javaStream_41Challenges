package com.electronik54.streamchallenges.challenge37.solution;

import java.util.stream.LongStream;

/*
 * Solution 37: Parallel Streams Without Side Effects - how it works
 *
 * All three operations follow the same contract: every thread folds the elements it gets into a
 * partial result, and the framework combines those partial results at the end.
 * reduce(0L, Long::sum) adds the partial sums, count() adds the partial counts, and average()
 * keeps a partial sum together with a partial count. Nothing is shared between threads, so no
 * thread can overwrite the work of another one.
 *
 * The unsafe alternative that this challenge warns about looks harmless:
 *
 *     List<Long> collected = new ArrayList<>();
 *     LongStream.rangeClosed(1, limit).parallel().forEach(collected::add);
 *
 * ArrayList is not thread safe. Several threads write into the same backing array, entries are
 * overwritten and collected.size() comes back smaller than 1,000,000 - and the exact number
 * changes from run to run. forEachOrdered() would not repair that; only a thread-safe collector
 * or a reduce-style operation is correct.
 *
 * Parallelism is not free either: splitting the range, scheduling the tasks and merging the
 * partial results cost time, so small or I/O bound pipelines usually run faster sequentially.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 37: Parallel Streams Without Side Effects ===");

        long limit = 1_000_000L;
        System.out.println("Values: 1 to " + limit);

        long sum = LongStream.rangeClosed(1, limit).parallel().reduce(0L, Long::sum);
        long count = LongStream.rangeClosed(1, limit).parallel().count();
        double average = LongStream.rangeClosed(1, limit).parallel().average().orElseThrow();

        System.out.println("Sum (parallel reduce): " + sum);
        System.out.println("Count (parallel count): " + count);
        System.out.println("Average (parallel average): " + average);
    }
}

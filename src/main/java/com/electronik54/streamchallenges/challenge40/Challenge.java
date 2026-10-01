package com.electronik54.streamchallenges.challenge40;

import java.util.List;

/**
 * Challenge 40: Summary Statistics and teeing
 *
 * Problem:
 * Two shops report their daily sales. Print the statistics of each shop, merge them into one
 * combined summary, and confirm the total with a teeing collector.
 *
 * Hint:
 * - Collectors.summarizingInt(Integer::intValue) collects count, sum, min, max and average at once
 * - IntSummaryStatistics.combine(other) merges two summaries, which is exactly what a parallel
 *   reduction has to do with the partial results of its threads
 * - Collectors.teeing(first, second, merger) runs two collectors over one stream and merges them
 * - String.format(Locale.ROOT, "%.2f", value) keeps the output identical on machines with a comma
 *   as decimal separator
 *
 * Expected Output:
 * Morning: count=4, sum=147, min=12, max=67, average=36.75
 * Evening: count=3, sum=179, min=34, max=89, average=59.67
 * Combined: count=7, sum=326, min=12, max=89, average=46.57
 * Teeing check: count=7, sum=326
 *
 * TODO:
 * 1. Build the two sales lists of the problem statement
 * 2. Summarize each list and merge both summaries into one
 * 3. Print all three summaries and add the teeing check
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 40: Summary Statistics and teeing ===");

        // TODO 1: the inputs of the problem statement
        List<Integer> morning = List.of(12, 45, 23, 67);
        List<Integer> evening = List.of(89, 34, 56);

        // TODO 2: summarize both lists and merge the two summaries
        // IntSummaryStatistics morningStats = morning.stream()...;
        // IntSummaryStatistics combined = new IntSummaryStatistics();
        // combined.combine(morningStats);

        // TODO 3: print the summaries and run the teeing check over both lists
        // System.out.println(format("Morning", morningStats));
        // System.out.println(format("Combined", combined));
        // System.out.println(...teeing...);
    }
}

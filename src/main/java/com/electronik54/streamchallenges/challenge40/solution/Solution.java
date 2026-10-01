package com.electronik54.streamchallenges.challenge40.solution;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Solution 40: Summary Statistics and teeing - how it works
 *
 * summarizingInt is the collector form of summaryStatistics(): one pass over the sales fills
 * count, sum, min, max and average, and no intermediate list of numbers is built.
 *
 * combine(other) merges a second summary into the first one - the same addition a parallel
 * stream applies to the partial results of its threads. Doing it by hand here shows what the
 * framework does for free, and it is also the way two separate data sources are merged when
 * they are read one after the other.
 *
 * teeing(summarizingInt, counting) then answers two questions from one pass over the concatenated
 * streams, and the merger picks the numbers it wants from both partial results.
 *
 * String.format with Locale.ROOT is used for the average, because the default locale decides
 * whether 36.75 is printed with a point or with a comma - a detail that breaks log parsers.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 40: Summary Statistics and teeing ===");

        List<Integer> morning = List.of(12, 45, 23, 67);
        List<Integer> evening = List.of(89, 34, 56);

        IntSummaryStatistics morningStats = morning.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        IntSummaryStatistics eveningStats = evening.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        IntSummaryStatistics combined = new IntSummaryStatistics();
        combined.combine(morningStats);
        combined.combine(eveningStats);

        System.out.println(format("Morning", morningStats));
        System.out.println(format("Evening", eveningStats));
        System.out.println(format("Combined", combined));

        String teeingCheck = Stream.concat(morning.stream(), evening.stream())
                .collect(Collectors.teeing(
                        Collectors.summarizingInt(Integer::intValue),
                        Collectors.counting(),
                        (stats, count) -> "Teeing check: count=" + count + ", sum=" + stats.getSum()));
        System.out.println(teeingCheck);
    }

    private static String format(String label, IntSummaryStatistics stats) {
        return String.format(Locale.ROOT, "%s: count=%d, sum=%d, min=%d, max=%d, average=%.2f",
                label, stats.getCount(), stats.getSum(), stats.getMin(), stats.getMax(), stats.getAverage());
    }
}

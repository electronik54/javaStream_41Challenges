package com.electronik54.streamchallenges.challenge33.solution;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
 * Solution 33: Top N Most Frequent Words - how it works
 *
 * The ranking runs over the frequency map, not over the text: after the counting pass the map
 * holds one entry per distinct word, so sorting it is far cheaper than sorting every word of
 * the sentence.
 *
 * comparingByValue() sorts the entries by their counter and reversed() turns that into the
 * highest count first. The explicit Map.Entry.<String, Long> type witness is needed before
 * reversed(), because the compiler cannot infer the element type of an empty method chain.
 * thenComparing(comparingByKey()) makes the tie rule explicit: of two words counted equally
 * often, the alphabetically first one is listed first. limit(2) then keeps the top two.
 *
 * For a small n over a large map, a PriorityQueue of size n that keeps only the current best
 * entries needs O(m log n) work instead of the O(m log m) of sorting all entries - the same
 * trade-off as in the k-th largest challenge.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 33: Top N Most Frequent Words ===");

        String sentence = "the quick brown fox jumps over the lazy dog the fox";
        Map<String, Long> frequencies = Pattern.compile("\\s+")
                .splitAsStream(sentence)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Sentence: " + sentence);
        System.out.println("Frequencies: " + frequencies.size() + " distinct words");

        List<Map.Entry<String, Long>> topTwo = frequencies.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(2)
                .toList();

        System.out.println("Top 2: " + topTwo);
    }
}

package com.electronik54.streamchallenges.challenge05.solution;

import java.util.List;

/*
 * Solution 05: Count Matching Elements - how it works
 *
 * filter(predicate) keeps the elements that match and count() tells how many of them are
 * left, so one pass over the data answers one question. count() returns a long, which is
 * why the results are declared as long even for tiny lists.
 *
 * Counters could also be kept in variables outside the stream, but that would mutate state
 * from inside a lambda - collect() and count() already do this job in a thread-safe way.
 *
 * Collectors.counting() is the same idea for cases where the number of matches has to be
 * reported per group instead of for the whole list.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 05: Count Matching Elements ===");

        List<Integer> numbers = List.of(3, 12, 7, 20, 15, 8, 30, 4);
        System.out.println("Numbers: " + numbers);

        long evenCount = numbers.stream().filter(value -> value % 2 == 0).count();
        System.out.println("Even count: " + evenCount);

        long greaterThanTen = numbers.stream().filter(value -> value > 10).count();
        System.out.println("Greater than 10: " + greaterThanTen);

        List<String> words = List.of("java", "stream", "api", "lambda", "collector");
        System.out.println("Words: " + words);

        long startsWithA = words.stream().filter(word -> word.startsWith("a")).count();
        System.out.println("Words starting with 'a': " + startsWithA);

        long longerThanFive = words.stream().filter(word -> word.length() > 5).count();
        System.out.println("Words longer than 5: " + longerThanFive);
    }
}

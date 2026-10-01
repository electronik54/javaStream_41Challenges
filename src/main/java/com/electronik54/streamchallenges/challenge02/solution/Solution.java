package com.electronik54.streamchallenges.challenge02.solution;

import java.util.List;

/*
 * Solution 02: Remove Duplicate Elements - how it works
 *
 * distinct() keeps the first occurrence of every value and drops the later ones, so the
 * encounter order survives without any sorting. Internally it uses a HashSet, which means
 * the values must implement equals() and hashCode() correctly - Integer and String do.
 *
 * toList() returns an unmodifiable list (Java 16+), so the caller cannot change the result.
 *
 * The same pipeline works for both lists, which is why the small generic helper below is
 * enough for the whole challenge.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 02: Remove Duplicate Elements ===");

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 1, 5, 3);
        List<String> names = List.of("alice", "bob", "alice", "carol", "bob");

        List<Integer> distinctNumbers = distinct(numbers);
        List<String> distinctNames = distinct(names);

        System.out.println("Numbers original: " + numbers);
        System.out.println("Numbers distinct: " + distinctNumbers);
        System.out.println("Names original: " + names);
        System.out.println("Names distinct: " + distinctNames);
        System.out.println("Distinct count: " + distinctNumbers.size());
    }

    // the same pipeline fits both lists, because distinct() only needs equals() and hashCode()
    private static <T> List<T> distinct(List<T> values) {
        return values.stream().distinct().toList();
    }
}

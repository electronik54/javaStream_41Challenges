package com.electronik54.streamchallenges.challenge29.solution;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/*
 * Solution 29: Common and Different Elements of Two Lists - how it works
 *
 * The lists are copied into HashSets once, so every membership test inside the filters is a
 * constant-time lookup. Filtering with first.contains(value) instead would scan the first list
 * for every element of the second one, which turns a linear job into a quadratic one.
 *
 * Each question is then one filter over one list: common values are those the other set
 * contains, the differences are those it does not. The order of the input lists is kept,
 * because filter does not reorder anything.
 *
 * The union uses Stream.concat(first.stream(), second.stream()).distinct(): both lists keep
 * their values untouched, unlike retainAll() or removeAll(), which answer the same questions
 * by emptying a copy of the collection.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 29: Common and Different Elements of Two Lists ===");

        List<Integer> first = List.of(1, 2, 3, 4, 5);
        List<Integer> second = List.of(4, 5, 6, 7);
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        Set<Integer> firstValues = new HashSet<>(first);
        Set<Integer> secondValues = new HashSet<>(second);

        List<Integer> common = first.stream().filter(secondValues::contains).toList();
        List<Integer> onlyInFirst = first.stream().filter(value -> !secondValues.contains(value)).toList();
        List<Integer> onlyInSecond = second.stream().filter(value -> !firstValues.contains(value)).toList();
        List<Integer> union = Stream.concat(first.stream(), second.stream()).distinct().toList();

        System.out.println("Common: " + common);
        System.out.println("Only in first: " + onlyInFirst);
        System.out.println("Only in second: " + onlyInSecond);
        System.out.println("Union: " + union);
    }
}

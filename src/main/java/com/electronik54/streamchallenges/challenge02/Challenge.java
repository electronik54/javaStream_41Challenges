package com.electronik54.streamchallenges.challenge02;

import java.util.List;

/**
 * Challenge 02: Remove Duplicate Elements
 *
 * Problem:
 * Given a list that repeats several values, remove the duplicates but keep the position
 * of the first occurrence of every value. Do the same for a list of names and report how
 * many values survive in the number list.
 *
 * Hint:
 * - Stream.distinct() drops duplicates by equals() and hashCode(), keeping encounter order
 * - no sorting is needed, the first occurrence is the one that stays
 * - Stream.toList() gives back an unmodifiable list
 *
 * Expected Output:
 * Numbers original: [1, 2, 3, 2, 4, 1, 5, 3]
 * Numbers distinct: [1, 2, 3, 4, 5]
 * Names original: [alice, bob, alice, carol, bob]
 * Names distinct: [alice, bob, carol]
 * Distinct count: 5
 *
 * TODO:
 * 1. Remove the duplicates of the number list, keeping the order of the first occurrence
 * 2. Remove the duplicates of the name list the same way
 * 3. Print both results and the number of distinct values
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 02: Remove Duplicate Elements ===");

        // TODO 1: the inputs of the problem statement
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 1, 5, 3);
        List<String> names = List.of("alice", "bob", "alice", "carol", "bob");
        System.out.println("Numbers original: " + numbers);
        System.out.println("Names original: " + names);

        // TODO 2: remove the duplicates and keep the first occurrence order
        // List<Integer> distinctNumbers = numbers.stream()...;
        // List<String> distinctNames = names.stream()...;

        // TODO 3: print the two distinct lists and the count
        // System.out.println("Numbers distinct: " + distinctNumbers);
        // System.out.println("Names distinct: " + distinctNames);
        // System.out.println("Distinct count: " + distinctNumbers.size());
    }
}

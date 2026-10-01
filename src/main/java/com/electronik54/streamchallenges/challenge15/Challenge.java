package com.electronik54.streamchallenges.challenge15;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Challenge 15: Sort a Map by Key and by Value
 *
 * Problem:
 * Given a map of names to scores, print it sorted by name, then sorted by score from low to
 * high, then sorted by score from high to low.
 *
 * Hint:
 * - a Map has no stream of its own, entrySet().stream() is the way in
 * - sorting orders the entries, but toMap() alone returns a HashMap and loses that order:
 *   pass LinkedHashMap::new as the map factory to keep it
 * - the two-argument toMap() throws on duplicate keys, so the three-argument form with a
 *   merge function is used here
 * - Map.Entry.comparingByKey() and comparingByValue() build the comparators for you
 *
 * Expected Output:
 * Scores: {carol=88, alice=95, bob=72, dave=81}
 * By key: {alice=95, bob=72, carol=88, dave=81}
 * By value ascending: {bob=72, dave=81, carol=88, alice=95}
 * By value descending: {alice=95, carol=88, dave=81, bob=72}
 *
 * TODO:
 * 1. Build the score map of the problem statement
 * 2. Sort the entries by key and by value into new LinkedHashMaps
 * 3. Print the three sorted maps
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 15: Sort a Map by Key and by Value ===");

        // TODO 1: the input map of the problem statement
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("carol", 88);
        scores.put("alice", 95);
        scores.put("bob", 72);
        scores.put("dave", 81);
        System.out.println("Scores: " + scores);

        // TODO 2: sort the entries and collect them into a LinkedHashMap so the order survives
        // Map<String, Integer> byKey = scores.entrySet().stream()...;
        // Map<String, Integer> byValueAscending = scores.entrySet().stream()...;
        // Map<String, Integer> byValueDescending = scores.entrySet().stream()...;

        // TODO 3: print the three maps
        // System.out.println("By key: " + byKey);
        // System.out.println("By value ascending: " + byValueAscending);
        // System.out.println("By value descending: " + byValueDescending);
    }
}

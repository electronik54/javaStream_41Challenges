package com.electronik54.streamchallenges.challenge29;

import java.util.List;

/**
 * Challenge 29: Common and Different Elements of Two Lists
 *
 * Problem:
 * Given two lists of numbers, print the values they have in common, the values only the first
 * list holds, the values only the second list holds, and the union of both lists.
 *
 * Hint:
 * - List.contains scans the list, so it costs O(n); build a HashSet once and every contains()
 *   on it is O(1)
 * - with a set as lookup, one filter per question answers it in a single pass
 * - Stream.concat(first, second).distinct() builds the union without changing either input
 * - retainAll() and removeAll() would answer the same questions by mutating a copy of the list
 *
 * Expected Output:
 * First: [1, 2, 3, 4, 5]
 * Second: [4, 5, 6, 7]
 * Common: [4, 5]
 * Only in first: [1, 2, 3]
 * Only in second: [6, 7]
 * Union: [1, 2, 3, 4, 5, 6, 7]
 *
 * TODO:
 * 1. Build the two input lists of the problem statement
 * 2. Build the lookups and filter both lists
 * 3. Print the common values, the two differences and the union
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 29: Common and Different Elements of Two Lists ===");

        // TODO 1: the inputs of the problem statement
        List<Integer> first = List.of(1, 2, 3, 4, 5);
        List<Integer> second = List.of(4, 5, 6, 7);
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        // TODO 2: turn both lists into sets so the lookups are constant time
        // Set<Integer> firstValues = new HashSet<>(first);
        // Set<Integer> secondValues = new HashSet<>(second);

        // TODO 3: print the common values, the two differences and the union
        // System.out.println("Common: " + ...);
        // System.out.println("Only in first: " + ...);
        // System.out.println("Only in second: " + ...);
        // System.out.println("Union: " + ...);
    }
}

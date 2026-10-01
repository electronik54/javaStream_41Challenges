package com.electronik54.streamchallenges.challenge05;

import java.util.List;

/**
 * Challenge 05: Count Matching Elements
 *
 * Problem:
 * Count how many numbers of a list are even, how many are greater than 10, and how many
 * words of a list start with "a" or are longer than five characters.
 *
 * Hint:
 * - filter(predicate) keeps the matching elements, count() then returns how many are left
 * - count() returns a long, not an int
 * - Collectors.counting() is the same idea when the counting happens inside a group
 *
 * Expected Output:
 * Numbers: [3, 12, 7, 20, 15, 8, 30, 4]
 * Even count: 5
 * Greater than 10: 4
 * Words: [java, stream, api, lambda, collector]
 * Words starting with 'a': 1
 * Words longer than 5: 3
 *
 * TODO:
 * 1. Build the two input lists of the problem statement
 * 2. Count the matching numbers and the matching words with filter() and count()
 * 3. Print every result
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 05: Count Matching Elements ===");

        // TODO 1: the inputs of the problem statement
        List<Integer> numbers = List.of(3, 12, 7, 20, 15, 8, 30, 4);
        List<String> words = List.of("java", "stream", "api", "lambda", "collector");
        System.out.println("Numbers: " + numbers);
        System.out.println("Words: " + words);

        // TODO 2: count the matches with filter() plus count()
        // long evenCount = numbers.stream()...
        // long greaterThanTen = numbers.stream()...
        // long startsWithA = words.stream()...
        // long longerThanFive = words.stream()...

        // TODO 3: print the four counts
        // System.out.println("Even count: " + evenCount);
        // System.out.println("Greater than 10: " + greaterThanTen);
        // System.out.println("Words starting with 'a': " + startsWithA);
        // System.out.println("Words longer than 5: " + longerThanFive);
    }
}

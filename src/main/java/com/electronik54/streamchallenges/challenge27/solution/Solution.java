package com.electronik54.streamchallenges.challenge27.solution;

import java.util.Comparator;
import java.util.List;

/*
 * Solution 27: K-th Largest Distinct Number - how it works
 *
 * distinct() removes the repeated values, so [9, 9, 7, 7] becomes [9, 7] and the third place
 * really is the third distinct value. Sorting descending puts the largest value first, so
 * skip(2) drops two values and findFirst() reads the third one - the index arithmetic that
 * makes this pattern work for any k is skip(k - 1).
 *
 * orElseThrow() turns "the list has fewer than k distinct values" into a clear exception
 * instead of a silent 0.
 *
 * Sorting the whole list costs O(n log n). When the list is huge and k is small, a
 * PriorityQueue of size k that keeps only the largest values is the better answer, because it
 * costs O(n log k) and holds k values in memory instead of all of them.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 27: K-th Largest Distinct Number ===");

        List<Integer> numbers = List.of(9, 3, 7, 9, 5, 8, 1, 7);
        int k = 3;
        System.out.println("Numbers: " + numbers);
        System.out.println("K: " + k);

        List<Integer> distinctDescending = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Distinct descending: " + distinctDescending);

        int kthLargest = distinctDescending.stream().skip(k - 1).findFirst().orElseThrow();
        System.out.println("3rd largest: " + kthLargest);
    }
}

package com.electronik54.streamchallenges.challenge11.solution;

import java.util.Comparator;
import java.util.List;

/*
 * Solution 11: Second Highest and Second Lowest - how it works
 *
 * distinct() removes the repeated values first, so a list like [45, 78, 78, 90] cannot
 * report 78 twice as the highest two values.
 *
 * After the sort, skip(1) drops the highest element, so findFirst() hands back the second
 * highest. The second lowest uses the natural (ascending) order and the same skip(1), so
 * both answers come from one idea instead of two different algorithms.
 *
 * orElseThrow() unwraps the Optional and throws NoSuchElementException when the list holds
 * fewer than two distinct values - better than returning a silent 0.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 11: Second Highest and Second Lowest ===");

        List<Integer> numbers = List.of(45, 12, 78, 45, 90, 23, 78);
        System.out.println("Numbers: " + numbers);

        List<Integer> distinctDescending = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Distinct descending: " + distinctDescending);

        int secondHighest = distinctDescending.stream().skip(1).findFirst().orElseThrow();
        System.out.println("Second highest: " + secondHighest);

        int secondLowest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println("Second lowest: " + secondLowest);
    }
}

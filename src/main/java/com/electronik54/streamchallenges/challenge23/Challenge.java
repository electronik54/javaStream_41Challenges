package com.electronik54.streamchallenges.challenge23;

import java.util.List;

/**
 * Challenge 23: Sort by Two Keys
 *
 * Problem:
 * Sort the employees by salary from high to low and use the name as tie breaker. Then sort
 * them by name and use the salary as tie breaker. Print the names of both orders.
 *
 * Hint:
 * - Comparator.comparingDouble(Employee::salary).reversed() sorts by salary descending
 * - thenComparing(...) is only consulted when the first comparator reports equality
 * - combining them gives one comparator: salary desc, then name
 * - reversed() must be applied before thenComparing, otherwise it would flip both keys
 *
 * Expected Output:
 * By salary desc, then name: [carol, alice, erin, bob, dave]
 * By name, then salary desc: [alice, bob, carol, dave, erin]
 *
 * TODO:
 * 1. Build the employee list of the problem statement
 * 2. Build the two comparators and sort the names with them
 * 3. Print both orders
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 23: Sort by Two Keys ===");

        // TODO 1: the input of the problem statement, two salaries appear twice
        List<Employee> employees = List.of(
                new Employee("carol", "Engineering", 135_000),
                new Employee("alice", "Engineering", 120_000),
                new Employee("erin", "Marketing", 120_000),
                new Employee("bob", "Sales", 95_000),
                new Employee("dave", "Sales", 95_000));

        // TODO 2: salary descending, then name ascending
        // Comparator<Employee> bySalaryDescThenName = ...;
        // List<String> bySalary = ...;

        // TODO 3: name ascending, then salary descending, and print both name lists
        // System.out.println("By salary desc, then name: " + bySalary);
        // System.out.println("By name, then salary desc: " + byName);
    }
}

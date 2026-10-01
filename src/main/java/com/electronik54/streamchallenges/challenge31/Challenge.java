package com.electronik54.streamchallenges.challenge31;

import java.util.List;

/**
 * Challenge 31: Join the Names of Every Department
 *
 * Problem:
 * Print, per department, how many employees it has and their names in one line. Then join all
 * of those lines into a single text.
 *
 * Hint:
 * - Collectors.mapping(Employee::name, Collectors.joining(", ")) turns each group into one text
 * - the same grouping with Collectors.toList() still answers the size question
 * - a TreeMap keeps the departments in alphabetical order
 * - joining(" | ") on the values of the map glues the department lines together
 *
 * Expected Output:
 * Engineering (2): alice, carol
 * Marketing (1): erin
 * Sales (2): bob, dave
 * Joined all: alice, carol | erin | bob, dave
 *
 * TODO:
 * 1. Build the employee list of the problem statement
 * 2. Group the names per department once as a list and once as a joined text
 * 3. Print one line per department and the joined text of all departments
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 31: Join the Names of Every Department ===");

        // TODO 1: the input of the problem statement
        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));

        // TODO 2: names per department, as a list and as one joined text
        // Map<String, List<String>> namesByDepartment = employees.stream()...;
        // Map<String, String> joinedByDepartment = employees.stream()...;

        // TODO 3: print one line per department and then all departments in one text
        // namesByDepartment.forEach((department, names) -> ...);
        // System.out.println("Joined all: " + ...);
    }
}

package com.electronik54.streamchallenges.challenge22;

import java.util.List;

/**
 * Challenge 22: Highest Paid Employee per Department
 *
 * Problem:
 * For every department, find the employee with the highest salary and print the department
 * with the name and the salary of that employee.
 *
 * Hint:
 * - Collectors.maxBy(Comparator.comparingDouble(Employee::salary)) picks one employee per group
 * - maxBy returns an Optional per group, so collectingAndThen(..., Optional::orElseThrow) unwraps it
 * - the departments are printed in order when the map factory is TreeMap::new
 * - never compare Double objects with -; comparingDouble compares the primitives
 *
 * Expected Output:
 * Departments: 3
 * Engineering: carol (135000.0)
 * Marketing: erin (80000.0)
 * Sales: dave (95000.0)
 *
 * TODO:
 * 1. Build the employee list of the problem statement
 * 2. Group the employees by department and keep the best paid one in every group
 * 3. Print the department, the name and the salary for every winner
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 22: Highest Paid Employee per Department ===");

        // TODO 1: the input of the problem statement
        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));

        // TODO 2: group by department and keep the highest salary of every group
        // Map<String, Employee> topPaid = employees.stream()...;

        // TODO 3: print the three winners
        // System.out.println("Departments: " + topPaid.size());
        // topPaid.forEach((department, employee) -> ...);
    }
}

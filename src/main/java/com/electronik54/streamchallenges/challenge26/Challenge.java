package com.electronik54.streamchallenges.challenge26;

import java.util.List;

/**
 * Challenge 26: Average Salary per Department
 *
 * Problem:
 * Print the average salary of every department, name the department with the highest average,
 * and compare it with the average salary of the whole company.
 *
 * Hint:
 * - Collectors.averagingDouble(Employee::salary) averages the salaries of every group
 * - the average of a group with one employee is that salary
 * - max(Map.Entry.comparingByValue()) finds the department with the highest average
 * - mapToDouble(Employee::salary).average() gives the average over all employees
 *
 * Expected Output:
 * Average salary per department: {Engineering=127500.0, Marketing=80000.0, Sales=92500.0}
 * Highest average: Engineering (127500.0)
 * Overall average: 104000.0
 *
 * TODO:
 * 1. Build the employee list of the problem statement
 * 2. Average the salaries per department
 * 3. Print the highest average per department and the overall average
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 26: Average Salary per Department ===");

        // TODO 1: the input of the problem statement
        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));

        // TODO 2: average the salary per department
        // Map<String, Double> averageByDepartment = employees.stream()...;

        // TODO 3: print the map, the best paying department and the overall average
        // System.out.println("Average salary per department: " + averageByDepartment);
        // System.out.println("Highest average: " + ...);
        // System.out.println("Overall average: " + ...);
    }
}

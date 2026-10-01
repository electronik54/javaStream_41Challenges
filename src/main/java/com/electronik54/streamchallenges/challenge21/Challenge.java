package com.electronik54.streamchallenges.challenge21;

import java.util.List;

/**
 * Challenge 21: Group Employees by Department
 *
 * Problem:
 * Given a list of employees, group the names by department, count how many employees every
 * department has, and read the names of one department out of the result.
 *
 * Hint:
 * - Collectors.groupingBy(classifier, mapFactory, downstream) groups the elements, the
 *   downstream collector decides what the value of every group is
 * - Collectors.mapping(Employee::name, Collectors.toList()) keeps the names instead of the
 *   whole employee objects
 * - TreeMap::new as the map factory sorts the departments; the plain groupingBy() would return
 *   a HashMap with an undefined key order
 *
 * Expected Output:
 * Employee count: 5
 * By department: {Engineering=[alice, carol], Marketing=[erin], Sales=[bob, dave]}
 * Department sizes: {Engineering=2, Marketing=1, Sales=2}
 * Names of Engineering: [alice, carol]
 *
 * TODO:
 * 1. Build the employee list of the problem statement
 * 2. Group the employees by department, keeping the department names in order
 * 3. Print the grouping, the size of every group and the names of Engineering
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 21: Group Employees by Department ===");

        // TODO 1: the input of the problem statement
        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));
        System.out.println("Employee count: " + employees.size());

        // TODO 2: group the names by department and count the employees per department
        // Map<String, List<String>> namesByDepartment = employees.stream()...;
        // Map<String, Long> departmentSizes = employees.stream()...;

        // TODO 3: print the grouping, the sizes and one department
        // System.out.println("By department: " + namesByDepartment);
        // System.out.println("Department sizes: " + departmentSizes);
        // System.out.println("Names of Engineering: " + namesByDepartment.get("Engineering"));
    }
}

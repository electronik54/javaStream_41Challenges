package com.electronik54.streamchallenges.challenge22.solution;

import com.electronik54.streamchallenges.challenge22.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 22: Highest Paid Employee per Department - how it works
 *
 * The grouping step stays the same as in the previous challenge; what changes is the
 * downstream collector. maxBy(Comparator.comparingDouble(Employee::salary)) reduces every
 * bucket to a single employee, which is the classic "top N per group" pattern.
 *
 * maxBy hands back an Optional per bucket, because a bucket could be empty in theory, so
 * collectingAndThen(..., Optional::orElseThrow) unwraps it while the collector is still
 * running - the result is a plain Map<String, Employee>.
 *
 * comparingDouble compares the primitive double, while Comparator.comparing(Employee::salary)
 * would compare Double objects and pay for boxing on every comparison.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 22: Highest Paid Employee per Department ===");

        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));

        Map<String, Employee> topPaid = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        TreeMap::new,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::salary)),
                                Optional::orElseThrow)));

        System.out.println("Departments: " + topPaid.size());
        topPaid.forEach((department, employee) ->
                System.out.println(department + ": " + employee.name() + " (" + employee.salary() + ")"));
    }
}

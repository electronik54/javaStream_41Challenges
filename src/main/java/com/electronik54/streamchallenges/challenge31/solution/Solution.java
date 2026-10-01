package com.electronik54.streamchallenges.challenge31.solution;

import com.electronik54.streamchallenges.challenge31.Employee;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 31: Join the Names of Every Department - how it works
 *
 * Both maps come from the same grouping step, only the downstream collector differs:
 * mapping(Employee::name, toList()) keeps the names as a list for the size question, and
 * mapping(Employee::name, joining(", ")) joins them into one text. mapping() is what allows a
 * joining collector to work on a group of objects instead of a group of strings.
 *
 * The department lines are then printed from the list map and the joined map side by side, and
 * the final line joins the values of the map with joining(" | "), which is the same collector
 * applied one level up.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 31: Join the Names of Every Department ===");

        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));

        Map<String, List<String>> namesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        TreeMap::new,
                        Collectors.mapping(Employee::name, Collectors.toList())));

        Map<String, String> joinedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        TreeMap::new,
                        Collectors.mapping(Employee::name, Collectors.joining(", "))));

        namesByDepartment.forEach((department, names) ->
                System.out.println(department + " (" + names.size() + "): " + joinedByDepartment.get(department)));

        System.out.println("Joined all: " + joinedByDepartment.values().stream().collect(Collectors.joining(" | ")));
    }
}

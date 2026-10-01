package com.electronik54.streamchallenges.challenge21.solution;

import com.electronik54.streamchallenges.challenge21.Employee;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 21: Group Employees by Department - how it works
 *
 * groupingBy(classifier, mapFactory, downstream) sorts every employee into the bucket of its
 * department. The downstream collector decides what the bucket holds: toList() would keep the
 * employees themselves, mapping(Employee::name, toList()) keeps only the names, and counting()
 * keeps a number instead. That is the reason the same grouping step produces both maps here.
 *
 * TreeMap::new makes the departments come out in alphabetical order. The plain groupingBy()
 * returns a HashMap, whose key order follows the hashes and looks random in the output.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 21: Group Employees by Department ===");

        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));
        System.out.println("Employee count: " + employees.size());

        Map<String, List<String>> namesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        TreeMap::new,
                        Collectors.mapping(Employee::name, Collectors.toList())));

        Map<String, Long> departmentSizes = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        TreeMap::new,
                        Collectors.counting()));

        System.out.println("By department: " + namesByDepartment);
        System.out.println("Department sizes: " + departmentSizes);
        System.out.println("Names of Engineering: " + namesByDepartment.get("Engineering"));
    }
}

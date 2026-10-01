package com.electronik54.streamchallenges.challenge26.solution;

import com.electronik54.streamchallenges.challenge26.Employee;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Solution 26: Average Salary per Department - how it works
 *
 * averagingDouble(Employee::salary) is a downstream collector: it receives the salaries of one
 * bucket and returns their average, so no list of salaries is ever built. It also keeps the
 * sum and the count as doubles internally, which is why the result is a Double.
 *
 * The department with the highest average is the map entry with the largest value, found with
 * max(Map.Entry.comparingByValue()). The overall average is a separate question, so it is
 * taken from the whole list with mapToDouble(Employee::salary).average().
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 26: Average Salary per Department ===");

        List<Employee> employees = List.of(
                new Employee("alice", "Engineering", 120_000),
                new Employee("carol", "Engineering", 135_000),
                new Employee("bob", "Sales", 90_000),
                new Employee("dave", "Sales", 95_000),
                new Employee("erin", "Marketing", 80_000));

        Map<String, Double> averageByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        TreeMap::new,
                        Collectors.averagingDouble(Employee::salary)));

        System.out.println("Average salary per department: " + averageByDepartment);

        Map.Entry<String, Double> bestDepartment = averageByDepartment.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println("Highest average: " + bestDepartment.getKey() + " (" + bestDepartment.getValue() + ")");

        double overallAverage = employees.stream().mapToDouble(Employee::salary).average().orElseThrow();
        System.out.println("Overall average: " + overallAverage);
    }
}

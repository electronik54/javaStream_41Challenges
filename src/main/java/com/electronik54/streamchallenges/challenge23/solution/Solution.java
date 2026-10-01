package com.electronik54.streamchallenges.challenge23.solution;

import com.electronik54.streamchallenges.challenge23.Employee;

import java.util.Comparator;
import java.util.List;

/*
 * Solution 23: Sort by Two Keys - how it works
 *
 * A comparator can be built in layers. comparingDouble(Employee::salary).reversed() answers
 * the first question, and thenComparing(Employee::name) is only asked when two salaries are
 * equal. The order of the calls matters: reversed() has to be applied to the salary
 * comparator alone, because calling it at the end of the whole chain would also flip the
 * name order.
 *
 * The second order swaps the keys: comparing(Employee::name).thenComparing(comparingDouble(...)
 * .reversed()) sorts by name and only looks at the salary when two names are equal.
 *
 * Both sorts are stable: elements that the comparator calls equal keep their encounter order,
 * which is why a third key would simply be another thenComparing call.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 23: Sort by Two Keys ===");

        List<Employee> employees = List.of(
                new Employee("carol", "Engineering", 135_000),
                new Employee("alice", "Engineering", 120_000),
                new Employee("erin", "Marketing", 120_000),
                new Employee("bob", "Sales", 95_000),
                new Employee("dave", "Sales", 95_000));

        Comparator<Employee> bySalaryDescThenName = Comparator
                .comparingDouble(Employee::salary)
                .reversed()
                .thenComparing(Employee::name);

        Comparator<Employee> byNameThenSalaryDesc = Comparator
                .comparing(Employee::name)
                .thenComparing(Comparator.comparingDouble(Employee::salary).reversed());

        List<String> bySalary = employees.stream().sorted(bySalaryDescThenName).map(Employee::name).toList();
        List<String> byName = employees.stream().sorted(byNameThenSalaryDesc).map(Employee::name).toList();

        System.out.println("By salary desc, then name: " + bySalary);
        System.out.println("By name, then salary desc: " + byName);
    }
}

package revision;

import java.util.*;
import java.util.stream.Collectors;

public class Q012_SalaryStatistics {

    static class Employee {
        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }
    }

    /*
     * Problem:
     * Given a list of employees, find:
     * - Count
     * - Sum
     * - Minimum salary
     * - Maximum salary
     * - Average salary
     *
     * Use a single collector.
     */

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 70000),
                new Employee("Charlie", 60000),
                new Employee("David", 90000)
        );

        System.out.println(
                employees
                        .stream()
                        .collect(
                                Collectors
                                        .summarizingInt(Employee::getSalary)
                        )
        );

    }
}
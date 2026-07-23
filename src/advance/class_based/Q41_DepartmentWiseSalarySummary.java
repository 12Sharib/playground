package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q41_DepartmentWiseSalarySummary {

    static class Employee {
        private String name;
        private String department;
        private int salary;

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }
    }

    /*
     * Problem:
     * For each department, calculate:
     * - Total Salary
     * - Average Salary
     * - Minimum Salary
     * - Maximum Salary
     * - Employee Count
     *
     * Expected Output:
     *
     * IT=IntSummaryStatistics{...}
     * HR=IntSummaryStatistics{...}
     * Sales=IntSummaryStatistics{...}
     */

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 50000),
                new Employee("Bob", "IT", 70000),
                new Employee("Kevin", "IT", 80000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "HR", 90000),
                new Employee("Emma", "HR", 85000),
                new Employee("Eve", "Sales", 65000),
                new Employee("Frank", "Sales", 55000),
                new Employee("Grace", "Sales", 75000)
        );

        System.out.println(
                employees
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                Employee::getDepartment,
                                                Collectors.summarizingInt(Employee::getSalary)
                                        )
                        )
        );

    }
}
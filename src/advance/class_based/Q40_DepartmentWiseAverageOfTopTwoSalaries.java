package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q40_DepartmentWiseAverageOfTopTwoSalaries {

    static class Employee {
        private String name;
        private String department;
        private int salary;

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        public String toString() {
            return "name=" + name + ", department=" + department + ", salary=" + salary;
        }
    }

    /*
     * Problem:
     * Find the average salary of the top 2 highest-paid
     * employees in each department.
     *
     * Output:
     *
     * {
     *   IT=75000.0,
     *   HR=87500.0,
     *   Sales=70000.0
     * }
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

        // Your solution here
        System.out.println(
                employees
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                Employee::getDepartment,
                                                Collectors
                                                        .collectingAndThen(
                                                                Collectors.toList(),
                                                                list -> list
                                                                        .stream()
                                                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                                        .limit(2)
                                                                        .mapToInt(Employee::getSalary)
                                                                        .average()
                                                                        .orElse(0)

                                                        )

                                        )
                        )
        );

    }
}
package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q43_GroupEmployeesByDepartmentAndJoinNames {

    static class Employee {
        private String name;
        private String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }

    /*
     * Problem:
     * Group employees by department and return
     * a comma-separated string of employee names.
     *
     * Input:
     *
     * Alice   IT
     * Bob     IT
     * Charlie HR
     * David   HR
     * Eve     Sales
     *
     * Output:
     *
     * {
     *   IT="Alice, Bob",
     *   HR="Charlie, David",
     *   Sales="Eve"
     * }
     */

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "HR"),
                new Employee("Eve", "Sales")
        );

        System.out.println(
                employees
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                Employee::getDepartment,
                                                Collectors.mapping(Employee::getName, Collectors.joining(", "))
                                        )
                        )
        );

    }
}
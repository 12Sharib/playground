package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q46_DepartmentWiseEmployeeSummary {

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
    }

    /*
     * Problem:
     *
     * For each department, return:
     *
     * - Total Employees
     * - Comma Separated Employee Names
     *
     * Expected Output:
     *
     * {
     *   IT=Employees=3, Names=Alice, Bob, Kevin,
     *   HR=Employees=3, Names=Charlie, David, Emma,
     *   Sales=Employees=3, Names=Frank, Grace, Eve
     * }
     *
     * NOTE:
     * Solve this using teeing().
     */

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 50000),
                new Employee("Bob", "IT", 70000),
                new Employee("Kevin", "IT", 80000),

                new Employee("Charlie", "HR", 60000),
                new Employee("David", "HR", 90000),
                new Employee("Emma", "HR", 85000),

                new Employee("Frank", "Sales", 55000),
                new Employee("Grace", "Sales", 75000),
                new Employee("Eve", "Sales", 65000)
        );

        System.out.println(
                employees
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                Employee::getDepartment,
                                                Collectors.teeing(
                                                       Collectors.counting(),
                                                        Collectors.mapping(Employee::getName, Collectors.joining(", ")),
                                                        (x , y) -> "Employees: " + x + " Names: " + y
                                                )
                                        )
                        )
        );

    }
}
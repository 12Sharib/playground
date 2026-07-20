package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q39_DepartmentWiseTopTwoHighestPaidEmployees {

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

        @Override
        public String toString() {
            return name + " (" + salary + ")";
        }
    }

    /*
     * Problem:
     * Find the top 2 highest-paid employees in each department.
     *
     * Input:
     *
     * Alice   IT      50000
     * Bob     IT      70000
     * Kevin   IT      80000
     * Charlie HR      60000
     * David   HR      90000
     * Emma    HR      85000
     * Eve     Sales   65000
     * Frank   Sales   55000
     * Grace   Sales   75000
     *
     * Output:
     *
     * {
     *   IT=[Kevin (80000), Bob (70000)],
     *   HR=[David (90000), Emma (85000)],
     *   Sales=[Grace (75000), Eve (65000)]
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
                                                                        .toList()
                                                        )

                                        )
                        )
        );

    }
}
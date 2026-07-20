package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q38_DepartmentWiseHighestPaidEmployeeName {

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
     * Find the name of the highest-paid employee in each department.
     *
     * Input:
     *
     * Alice   IT      50000
     * Bob     IT      70000
     * Charlie HR      60000
     * David   HR      90000
     * Eve     Sales   65000
     * Frank   Sales   55000
     *
     * Output:
     *
     * {
     *   IT=Bob,
     *   HR=David,
     *   Sales=Eve
     * }
     */

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 50000),
                new Employee("Bob", "IT", 70000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "HR", 90000),
                new Employee("Eve", "Sales", 65000),
                new Employee("Frank", "Sales", 55000)
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
                                                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                                                x -> x.get().getName()
                                                        )
                                        )
                        )
        );

    }
}
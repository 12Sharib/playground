package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q45_DepartmentWiseHighestAndLowestPaidEmployee {

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
     * For each department, find:
     * - Highest Paid Employee
     * - Lowest Paid Employee
     *
     * Expected Output:
     *
     * IT -> Highest = Kevin (80000), Lowest = Alice (50000)
     * HR -> Highest = David (90000), Lowest = Charlie (60000)
     * Sales -> Highest = Grace (75000), Lowest = Frank (55000)
     *
     * NOTE:
     * Do NOT solve this by traversing each department twice.
     * Try to solve it in a single collector pipeline.
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
                                Collectors.groupingBy(
                                       Employee::getDepartment,
                                        Collectors.teeing(
                                                 Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                                Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                                                (x , y) -> "Highest " + x.orElse(null) + ", Lowest " + y.orElse(null)

                                        )
                                )
                        )
        );


        // Your solution here

    }
}
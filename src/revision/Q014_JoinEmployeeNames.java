package revision;

import java.util.*;
import java.util.stream.Collectors;

public class Q014_JoinEmployeeNames {

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
     * Given a list of employees, join all employee names into
     * a single comma-separated string.
     *
     * Input:
     * Alice, Bob, Charlie, David
     *
     * Output:
     * Alice, Bob, Charlie, David
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
                        .map(Employee::getName)
                        .collect(
                                Collectors
                                        .joining(", ")
                        )
        );
    }
}
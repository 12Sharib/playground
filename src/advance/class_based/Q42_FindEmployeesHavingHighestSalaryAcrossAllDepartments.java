package advance.class_based;

import java.util.*;
import java.util.stream.*;

public class Q42_FindEmployeesHavingHighestSalaryAcrossAllDepartments {

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
            return name + " (" + department + ", " + salary + ")";
        }
    }

    /*
     * Problem:
     * Find all employees who have the highest salary in the company.
     *
     * Note:
     * There may be multiple employees with the same highest salary.
     *
     * Input:
     *
     * Alice   IT      50000
     * Bob     IT      90000
     * Kevin   IT      80000
     * Charlie HR      60000
     * David   HR      90000
     * Emma    HR      85000
     * Eve     Sales   65000
     *
     * Output:
     *
     * [
     *   Bob (IT, 90000),
     *   David (HR, 90000)
     * ]
     */

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 50000),
                new Employee("Bob", "IT", 90000),
                new Employee("Kevin", "IT", 80000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "HR", 90000),
                new Employee("Emma", "HR", 85000),
                new Employee("Eve", "Sales", 65000)
        );

        int max = employees
                .stream()
                .mapToInt(Employee::getSalary)
                .max()
                .orElse(0);
        System.out.println(
                employees
                        .stream()
                        .filter(employee ->  employee.getSalary() == max )
                        .toList()
        );

    }
}
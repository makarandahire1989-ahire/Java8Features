package com.dumbbrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingPartitioning {

    static void main() {

        /**
         * Concepts Covered: groupingBy(), partitioningBy()
         */

        //Group Numbers by even odd

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<String, List<Integer>> mapEvenOdd = numbers.stream()
                .collect(Collectors.groupingBy(x -> x%2 ==0 ? "Even": "Odd"));
        System.out.println(mapEvenOdd);

        //Group employees by department
        List<Employee> employees = Arrays.asList(
                new Employee("Sarvesh", "SDE"),
                new Employee("Sonali", "HR"),
                new Employee("Barvesh", "SDE"),
                new Employee("Kavesh", "Finance"),
                new Employee("Moresh", "HR"),
                new Employee("Paramesh", "SDE")
        );

        Map<String, List<Employee>> employeeMap =employees.stream()
                .collect(Collectors.groupingBy(e -> e.dept));

        System.out.println(employeeMap);


        //count number of employees in each department
        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(e ->e.dept, Collectors.counting()));

        System.out.println(deptCount);

        //Partition numbers greater than 10


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,12,4,22,82);
        Map<Boolean, List<Integer>> greaterthan10map = integers.stream()
                .collect(Collectors.partitioningBy(x -> x > 10));
        System.out.println(greaterthan10map);



    }

}
class Employee {
    String name;
    String dept;
    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", dept=" + dept + "]";
    }
}

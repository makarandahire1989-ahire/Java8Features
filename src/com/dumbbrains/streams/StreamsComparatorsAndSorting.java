package com.dumbbrains.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorsAndSorting {
    static void main() {

        //Sort integers ascending

        List<Integer> integers = Arrays.asList(11, 2, 31, 4, 25, 64, 7, 85, 9,510,123);
        List<Integer> sortedInts = integers.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(sortedInts);

        //Sort integers descending
        List<Integer> descendingSortedList = integers.stream()
                .sorted((a, b) ->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(descendingSortedList);


        //Sort employees by salary
        List<EmployeeClass>  employeeClasses = Arrays.asList(
                new EmployeeClass("Sarvesh", 50000),
                new EmployeeClass("Sonali", 60000),
                new EmployeeClass("Barvesh", 45000),
                new EmployeeClass("Kavesh", 70000),
                new EmployeeClass("Moresh", 55000),
                new EmployeeClass("Paramesh", 65000)
        );

        List<EmployeeClass> sortBysalary = employeeClasses.stream()
                .sorted(Comparator.comparingDouble(emp -> emp.salary)).collect(Collectors.toList());

        System.out.println(sortBysalary);


        List<EmployeeClass> sortBySalaryAndName = employeeClasses.stream()
                .sorted(Comparator.comparingDouble((EmployeeClass emp) -> emp.salary)
                        .thenComparing(emp -> emp.name)).collect(Collectors.toList());

        System.out.println(sortBySalaryAndName);



    }
}

class EmployeeClass {
    String name;
    double salary;
    EmployeeClass(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + " " + this.salary;
    }
}

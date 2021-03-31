package com.pratcice.JavaStramApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortComparator {

    public static void main(String a[]) {

        Stream.of("bus", "car", "bicycle", "flight", "train")
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------");

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 21,8000));
        empList.add(new Employee("Nagesh Y", "Admin",23, 15000));
        empList.add(new Employee("Vasu V", "Security", 21,2500));
        empList.add(new Employee("Amar", "Entertainment", 28,12500));

        Comparator<Employee> comparator = Comparator.comparing(Employee::getSalary);

        Comparator<Employee> comparators = Comparator.comparing(Employee::getAge);
        empList.sort(comparator.reversed());
        System.out.println(empList);

    }
}

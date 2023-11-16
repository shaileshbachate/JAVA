package oop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Employee implements Comparable {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
        this.name = "";
        this.age = 18;
        this.salary = 0;
    }

    @Override
    public String toString() {
        return name + "(" + age + "," + salary + ")";
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        // LOGIC: Compare with salary, whoever has larger salary will be greater, if both have same salaries,
        // then compare the ages, whoever is younger will be greater
        return (this.salary - other.salary) == 0 ? other.age - this.age : this.salary - other.salary;
    }
}

public class ComparatorsAndComparableInJava {
    public static void main(String[] args) {
        List<Employee> people = new ArrayList<>();
        Employee p1 = new Employee("Shubham", 24, 120000);
        Employee p2 = new Employee("A", 24, 100000);
        Employee p3 = new Employee("John", 25, 100000);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);

        Collections.sort(people);
        System.out.println(people);
        System.out.println("------------------------------------------------------------");

        // // Comparators //
        Collections.sort(people, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(people);

        // We can do the same as above with lambda expressions
        Collections.sort(people, (o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println(people);
        System.out.println("------------------------------------------------------------");
    }
}

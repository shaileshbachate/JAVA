package oop;

import java.util.Objects;

public class OverridingMethodsFromObjectClass {
    private String name;
    private int age;

    public OverridingMethodsFromObjectClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public OverridingMethodsFromObjectClass() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OverridingMethodsFromObjectClass that = (OverridingMethodsFromObjectClass) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "OverridingMethodsFromObjectClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        OverridingMethodsFromObjectClass p1 = new OverridingMethodsFromObjectClass("Shailesh", 24);
        System.out.println(p1.toString()); // OverridingMethodsFromObjectClass{name='Shailesh', age=24}
        System.out.println(p1);            // OverridingMethodsFromObjectClass{name='Shailesh', age=24}

        OverridingMethodsFromObjectClass p2 = new OverridingMethodsFromObjectClass("Shubham", 24);
        OverridingMethodsFromObjectClass p3 = new OverridingMethodsFromObjectClass("Shailesh", 24);

        System.out.println(p1.hashCode()); // 171251918
        System.out.println(p2.hashCode()); // -121216377
        System.out.println(p3.hashCode()); // 171251918

        System.out.println(p1 == p2);      // false
        System.out.println(p1 == p3);      // false
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.equals(p3)); // true

        OverridingMethodsFromObjectClass p = new OverridingMethodsFromObjectClass();
        System.out.println(p);             // OverridingMethodsFromObjectClass{name='null', age=0}
        System.out.println(p.hashCode());  // 961
    }
}

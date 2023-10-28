package oop;

public class MethodOverloading {
    String name;
    int sub1;
    int sub2;

    public MethodOverloading() {
        this("", 0, 0); // this will call the below constructor with the three values
    }

    public MethodOverloading(String name, int sub1, int sub2) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public MethodOverloading(String name) {
        // this(name, 0, 0); // we can call the other constructor or just manually do the assignment as follows
        // // OR //
        this.name = name;
        this.sub1 = 0;
        this.sub2 = 0;
    }

    public void getDetails() {
        System.out.println("Details: " + this.name + " | " + this.sub1 + " | " + this.sub2 + " |");
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static int multiply(int a, int b) {
        return multiply(a, b, 1);
    }

    public static int multiply(int a, int b, int c) {
        return a*b*c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading("John Doe");
        obj.getDetails();

        MethodOverloading obj2 = new MethodOverloading("Jane Doe", 89, 91);
        obj2.getDetails();

        MethodOverloading obj3 = new MethodOverloading();
        obj3.getDetails();

        System.out.println(add(3, 5));           // 8
        System.out.println(add(3, 5, 2));      // 10

        System.out.println(multiply(3, 5));      // 15
        System.out.println(multiply(3, 5, 2)); // 30
    }
}

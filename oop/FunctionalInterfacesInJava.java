package oop;

@FunctionalInterface
interface MyFunctionalInterface {
    int calc(int a, int b);
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    String greeting(String name);
}

class ClassImplementingMyFunctionalInterface implements MyFunctionalInterface {

    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}

public class FunctionalInterfacesInJava {
    public static void main(String[] args) {
        ClassImplementingMyFunctionalInterface obj = new ClassImplementingMyFunctionalInterface();
        System.out.println(obj.calc(5, 7));

        MyFunctionalInterface obj1 = new ClassImplementingMyFunctionalInterface();
        System.out.println(obj1.calc(5, 7));
        System.out.println("------------------------------------------------------------");

        // Anonymous class definition
        MyFunctionalInterface obj2 = new MyFunctionalInterface() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        };
        System.out.println(obj2.calc(5, 7));
        System.out.println("------------------------------------------------------------");

        // Lambda Expressions
        MyFunctionalInterface obj3 = (a, b) -> a+b;
        System.out.println(obj3.calc(5, 7));

        // Here, Lambda can be replaced with method reference as well
        MyFunctionalInterface obj4 = Integer::sum;
        System.out.println(obj4.calc(5, 7));
        System.out.println("------------------------------------------------------------");

        MyFunctionalInterface2 obj5 = (name) -> {
            System.out.println("Hello, " + name);
            System.out.println("Hey, There");
            System.out.println("It's so cool");
            return name.toUpperCase();
        };
        System.out.println(obj5.greeting("Shailesh"));
        System.out.println("------------------------------------------------------------");
    }
}
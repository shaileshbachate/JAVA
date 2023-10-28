package oop;

// import java.util; // Error: Only a type can be imported. java.util resolves to a package
import java.util.Scanner; // This will import Scanner class along with its attributes and methods
import java.util.*; // This will import all the classes in java.util package along with their attributes and methods

public class Main {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.getClass());
        System.out.println(myObj.x);
        // System.out.println(myObj.y); // Exception Error: The field MyClass.y is not visible
        // myObj.myPrivateMethod(5); // Exception Error: The method myPrivateMethod(int) from the type MyClass is not visible
        System.out.println("----------------------------------------------------------------------");

        // myStaticMethod(); // Exception Error: The method myStaticMethod() is undefined for the type Main
        StaticInJava.myStaticMethod(); // this works
        StaticInJava std1 = new StaticInJava("Shailesh", 103);
        std1.getDetails();
        System.out.println("----------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        java.util.Scanner scanner2 = new java.util.Scanner(System.in); // This works too, if you don't want to write import statement, but this is not recommended
        scanner.close();
        scanner2.close();

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        System.out.println(al);
        System.out.println("----------------------------------------------------------------------");
    }
}

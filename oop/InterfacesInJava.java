package oop;

interface MyInterface {
    int myStaticAndFinalField = 35; // Fields in interface are static and final by default
    // private int age = 12; // ERROR: Modifier 'private' not allowed here
    // protected int age = 12; // ERROR: Modifier 'protected' not allowed here

    void show(); // Methods in interface are public and abstract by default

    default void myDefaultMethod() {
        System.out.println("Inside the default method in interface");
    } // Extension method should have a body

    static void myStaticMethod() {
        System.out.println("Inside the static method in interface");
    } // Static methods in interfaces should have a body

    // protected void display(); // ERROR: Modifier 'protected' not allowed here
    private void MyPrivateMethod() {
        System.out.println("Inside the private method in interface");
    } // Private methods in an interface must have a body

    private static void MyPrivateStaticMethod() {
        System.out.println("Inside the private static method in interface");
    } // Static methods in interfaces should have a body
}

public class InterfacesInJava {
    public static void main(String[] args) {

    }
}

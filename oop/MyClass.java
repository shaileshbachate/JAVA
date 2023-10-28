package oop;

public class MyClass {
    int x = 5;
    private int y = 10;

    private void myPrivateMethod(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        MyClass myObj2 = new MyClass();
        System.out.println(myObj.x + " | " + myObj.y);
        System.out.println(myObj2.x + " | " + myObj2.y);
        myObj.myPrivateMethod(5);
    }
}

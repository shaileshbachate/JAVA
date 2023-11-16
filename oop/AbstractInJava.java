package oop;

abstract class MyAbstractClass {
    public abstract void show();
    public abstract void display();
    public void eat() {
        System.out.println("I am eating");
    }
}

abstract class MyAbstractChildClass extends MyAbstractClass {
    @Override
    public void show() {
        System.out.println("I am in show");
    }
}

class MyConcreteClass extends MyAbstractChildClass {
    @Override
    public void display() {
        System.out.println("I am in display");
    }
}

public class AbstractInJava {
    public static void main(String[] args) {
        // MyAbstractClass obj = new MyAbstractClass(); // ERROR: oop.MyAbstractClass is abstract; cannot be instantiated

        MyConcreteClass obj2 = new MyConcreteClass();
        obj2.show();
        obj2.display();
        obj2.eat();

        MyAbstractClass obj3 = new MyConcreteClass();
        obj3.show();
        obj3.display();
        obj3.eat();
    }
}

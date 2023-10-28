package oop;

class ParentClass {
    void show() {
        System.out.println("In parent class");
    }
}

class ChildClass extends ParentClass {
    @Override
    void show() {
        System.out.println("In child class");
    }

    void display() {
        System.out.println("In child display");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        ParentClass p, c;
        p = new ParentClass();
        c = new ChildClass();  // Upcasting
        p.show();         // In parent class
        c.show();         // In child class

        // ChildClass c1 = c; // error: java: incompatible types: intro.ParentClass cannot be converted to intro.ChildClass
        ChildClass c1 = (ChildClass) c; // Downcasting

        // // Even if 'c' refers to an object of class 'ChildClass', we cannot call method 'display()' from c, because c
        // // is a reference of type/class 'ParentClass'. So, if we want to call the method 'display()' in 'ChildClass',
        // // we have to first downcast the reference 'c' to type/class 'ChildClass', and then call the method 'display()'
        // c.display();   // error: java: cannot find symbol: method display()
        ((ChildClass) c).display(); // In child display
        c1.show();    // In child class
        c1.display(); // In child display
        System.out.println("----------------------------------------------------------------------");

        ChildClass pc, cc;
        cc = new ChildClass();
        cc.show();        // In child class
        cc.display();     // In child display

        // pc = new ParentClass(); // error: java: incompatible types: intro.ParentClass cannot be converted to intro.ChildClass
        // pc = (ChildClass) new ParentClass(); // Exception java.lang.ClassCastException: class ParentClass cannot be cast to class ChildClass
        System.out.println("----------------------------------------------------------------------");
    }
}

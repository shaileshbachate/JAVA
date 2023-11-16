package oop;

interface MyInterfaceEx {
    void jump();
    void eat();
}

class MyClassEx {
    private String privateName = "Shubham";
    protected String name = "Shailesh";
    public void show() {
        System.out.println("In show method");
    }
    public void display() {
        System.out.println("In display method");
    }
}

abstract class MyAbstractClassEx {
    abstract void run();
}

public class AnonymousClassesInJava {
    public static void main(String[] args) {
        MyClassEx obj1 = new MyClassEx();
        obj1.show();
        obj1.display();
        System.out.println("------------------------------------------------------------");

        MyClassEx obj2 = new MyClassEx() {
            @Override
            public void show() {
                System.out.println("In anonymous class' overridden show method");
                System.out.println("Consider this as a subclass");
                System.out.println("We can use super keyword here, to access parent class' methods");
                super.show();
                System.out.println("We can access public, protected and default fields but not the private ones");
                display();
                System.out.println("name = " + name);
                // System.out.println("privateName = " + privateName); // ERROR: java: privateName has private access in oop.B // The field B.privateName is not visible
            }
        };
        obj2.show();
        obj2.display();
        System.out.println("------------------------------------------------------------");

        MyAbstractClassEx obj3 = new MyAbstractClassEx() {
            @Override
            void run() {
                System.out.println("Implementing run method from abstract class MyAbstractClassEx in anonymous class");
            }
        };
        obj3.run();
        System.out.println("------------------------------------------------------------");

        MyInterfaceEx obj = new MyInterfaceEx() {
            @Override
            public void jump() {
                System.out.println("Implementing jump method from interface MyInterfaceEx in anonymous class");
            }
            @Override
            public void eat() {
                System.out.println("Implementing eat method from interface MyInterfaceEx in anonymous class");
            }
        };
        obj.jump();
        obj.eat();
        System.out.println("------------------------------------------------------------");

        int effectivelyFinalVar = 15;
        final int finalVar = 50;
        int notFinalVar = 67;
        notFinalVar = 63;
        String name = "sh";

        new MyClassEx() {
            int VarInAnonymousClass = 55;
            public void accessingLocalVariables() {
                System.out.println("name from parent class = " + name);
                VarInAnonymousClass *= 2;
                System.out.println("VarInAnonymousClass = " + VarInAnonymousClass);
                System.out.println("effectivelyFinalVar = " + effectivelyFinalVar);
                System.out.println("finalVar = " + finalVar);
                // System.out.println("notFinalVar = " + notFinalVar); // ERROR: java: local variables referenced from an inner class must be final or effectively final // Local variable notFinalVar defined in an enclosing scope must be final or effectively final
            }
        }.accessingLocalVariables();
        System.out.println("------------------------------------------------------------");
    }
}

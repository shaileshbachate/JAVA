package oop;

class OuterClass {
    public void show() {
        System.out.println("In show method");
    }

    public class InnerClass {
        public void display() {
            System.out.println("In display method");
        }
    }

    public static class StaticInnerClass {
        public void eat() {
            System.out.println("I am eating");
        }
    }
}

public class InnerClassesInJava {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.show();

        OuterClass.InnerClass inner_obj1 = obj.new InnerClass();
        OuterClass.StaticInnerClass inner_obj2 = new OuterClass.StaticInnerClass();
        // OuterClass.StaticInnerClass inner_obj3 = OuterClass.new StaticInnerClass(); // ERROR: Outerclass cannot be resolved to a variable

        inner_obj1.display();
        inner_obj2.eat();
    }
}

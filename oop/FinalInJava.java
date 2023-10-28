package oop;

final class FinalClass {
    int x = 5;
}

// // Exception Error: The type SubClassOfFinalClass cannot subclass the final class FinalClass
// class SubClassOfFinalClass extends FinalClass { // error: cannot inherit from final FinalClass
//     int y = 10;
// }

class MyClass1 {
    final void display() {
        System.out.println("Hello from a final method");
    }
}

class MySubClass extends MyClass1 {
    // void display() { // Cannot override the final method from MyClass
    //     System.out.println("Hello from overridden final method");
    // }
}

public class FinalInJava {
    static final double PI = 3.14159;
    final int MY_CONSTANT_VAR = 10;
    final int MY_DIFFERENT_CONSTANT_VAR_FOR_EACH_OBJECT;

    public FinalInJava(int val) {
        MY_DIFFERENT_CONSTANT_VAR_FOR_EACH_OBJECT = val;
    }
    
    public static void main(String[] args) {
        final int a = 5;
        final int b;
        b = 10;
        // a = 15; // Exception Error: The final local variable a cannot be assigned. It must be blank and not using a compound assignment
        // b = 20; // Exception Error: The final local variable b may already have been assigned
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------------------------------------------------");
        
        FinalInJava fij1 = new FinalInJava(5);
        FinalInJava fij2 = new FinalInJava(6);
        System.out.println(FinalInJava.PI);       // 3.14159
        System.out.println(fij1.MY_CONSTANT_VAR); // 10
        System.out.println(fij2.MY_CONSTANT_VAR); // 10
        System.out.println(fij1.MY_DIFFERENT_CONSTANT_VAR_FOR_EACH_OBJECT); // 5
        System.out.println(fij2.MY_DIFFERENT_CONSTANT_VAR_FOR_EACH_OBJECT); // 6

        // FinalInJava.PI = 12.345; // Exception Error: The final field FinalInJava.PI cannot be assigned
        // fij1.MY_CONSTANT_VAR = 100; // Exception Error: The final field FinalInJava.MY_CONSTANT_VAR cannot be assigned
        // fij1.MY_DIFFERENT_CONSTANT_VAR_FOR_EACH_OBJECT = 50; // Exception Error: The final field FinalInJava.MY_DIFFERENT_CONSTANT_VAR_FOR_EACH_OBJECT cannot be assigned
        System.out.println("----------------------------------------------------------------------");
    }
}

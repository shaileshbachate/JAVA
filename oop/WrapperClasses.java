package oop;

public class WrapperClasses {
    public static void main(String[] args) {
        int i1 = 100;
        Integer i2 = 100;
        Integer i3 = new Integer(100); // Boxing // warning: java: Integer(int) in java.lang.Integer has been deprecated
        // Integer i4 = ((Object) i1); // java: incompatible types: java.lang.Object cannot be converted to java.lang.Integer
        Integer i4 = i1;                     // Auto-Boxing
        System.out.println(((Object) i1).getClass()); // class java.lang.Integer
        System.out.println(i2.getClass());            // class java.lang.Integer

        System.out.println(i1); // 100
        System.out.println(i2); // 100
        System.out.println(i3); // 100
        System.out.println(i4); // 100
        System.out.println("----------------------------------------------------------------------");

        System.out.println(i1 == i2); // true // This is true because i2 is auto-unboxed to a primitive int for the comparison.
        System.out.println(i1 == i3); // true // This is also true because i3 is auto-unboxed to a primitive int for the comparison.
        System.out.println(i2 == i3); // false // Here, both i2 and i3 are Integer objects. The == operator compares object
        // // references, not their values. Since i2 and i3 are different objects in memory, this returns false.
        System.out.println(i2 == i4); // true // This returns true. Both variables point to the same instance of the Integer object in memory.
        System.out.println("----------------------------------------------------------------------");

        int i5 = i2.intValue(); // Unboxing
        int i6 = i2;            // Auto-Unboxing
        System.out.println(i5); // 100
        System.out.println(i6); // 100
        System.out.println(i5 == i1 && i5 == i2 && i5 == i3 && i5 == i4 && i5 == i6); // true
        System.out.println("----------------------------------------------------------------------");

        String s = "5";
        int i7 = Integer.parseInt(s);
        System.out.println(i7); // 5
        Integer i8 = Integer.valueOf(s);
        System.out.println(i8); // 5
    }
}

package intro;

public class TypeCasting {
    public static void main(String[] args) {
        int i = 9;
        double d = i; // automatic type casting (Widening casting)
        System.out.println(i);  // 9
        System.out.println(d);  // 9.0
        double d1 = 3.56;
        int i1 = (int) d1; // manual type casting (Narrowing casting)
        System.out.println(d1); // 3.56
        System.out.println(i1); // 3
        System.out.println("----------------------------------------------------------------------");

        byte b1 = 65;
        byte b2 = 'A';
        char c1 = 65;
        char c2 = 'A';
        short s1 = 'A';
        int i5 = 'A';
        // char c3 = i5; // Exception Error: Type mismatch: cannot convert from int to char
        char c3 = (char) i5; // manual type casting (Narrowing casting)
        System.out.println("b1: " + b1); // b1: 65
        System.out.println("b2: " + b2); // b2: 65
        System.out.println("c1: " + c1); // c1: A
        System.out.println("c2: " + c2); // c2: A
        System.out.println("c3: " + c3); // c3: A
        System.out.println("s1: " + s1); // s1: 65
        System.out.println("i5: " + i5); // i5: 65

        System.out.println(b1+b2); // 130
        System.out.println(b1+c1); // 130
        System.out.println(c1+b1); // 130
        System.out.println(b1+c2); // 130
        System.out.println(c2+b1); // 130
        System.out.println(c1+c2); // 130
        System.out.println("----------------------------------------------------------------------");

        // String s1 = 'A'; // Exception Error: Type mismatch: cannot convert from char to String
        String s2 = "" + 'A'; // A
        String s3 = 'A' + ""; // A
        String s4 = 100 + ""; // 100
        String s5 = 100 + 20 + ""; // 120
        String s6 = "" + 100 + 20; // 10020
        System.out.println(s2 + " | " + s3 + " | " + s4 + " | " + s5 + " | " + s6);
        System.out.println("----------------------------------------------------------------------");

        String strNum = "200";
        // int intNum = (int) strNum; // Exception Error: Cannot cast from String to int
        int intNum = Integer.parseInt(strNum);
        // int intNum2 = Integer.parseInt(100); // Exception Error: The method parseInt(String) in the type Integer is not applicable for the arguments (int)
        // int intNum2 = Integer.parseInt(23.45); // Exception Error: The method parseInt(String) in the type Integer is not applicable for the arguments (double)
        int intNum2 = (int) 23.45;
        System.out.println(intNum);     // 200
        System.out.println(intNum2);    // 23
        System.out.println(intNum + intNum2); // 223
        System.out.println("----------------------------------------------------------------------");

        Integer IntegerNum = Integer.valueOf(strNum);
        Integer IntegerNum2 = Integer.valueOf(200); // This works
        // Integer IntegerNum3 = Integer.valueOf(100.55); // Exception Error: The method valueOf(String) in the type Integer is not applicable for the arguments (double)
        System.out.println(IntegerNum); // 200
        System.out.println(IntegerNum.getClass()); // class java.lang.Integer
        System.out.println(IntegerNum2); // 200
        System.out.println(IntegerNum2.getClass()); // class java.lang.Integer
        System.out.println("----------------------------------------------------------------------");

        // // int to String //
        int num = 100;
        String snum1 = num + "";
        String snum2 = String.valueOf(num);
        String snum3 = Integer.toString(num);
        System.out.println(snum1);
        System.out.println(snum2);
        System.out.println(snum3);
    }
}

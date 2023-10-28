package intro;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckDataTypeInJava {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(((Object)i).getClass()); // class java.lang.Integer
        System.out.println(((Object)i).getClass().getName()); // java.lang.Integer
        System.out.println(((Object)i).getClass().getSimpleName()); // Integer
        // System.out.println(i instanceof int); // Exception Error: Incompatible conditional operand types int and int
        // System.out.println(i instanceof Integer); // Exception Error: Incompatible conditional operand types int and Integer
        System.out.println((Object) i instanceof Integer); // true

        double d = 100;
        System.out.println(((Object)d).getClass()); // class java.lang.Double
        System.out.println(((Object)d).getClass().getName()); // java.lang.Double
        System.out.println(((Object)d).getClass().getSimpleName()); // Double
        System.out.println((Object) d instanceof Double); // true

        String s = "100";
        System.out.println(s.getClass()); // class java.lang.String
        System.out.println(s.getClass().getName()); // java.lang.String
        System.out.println(s.getClass().getSimpleName()); // String
        System.out.println(s instanceof String); // true

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(arr);
        System.out.println(arr.getClass()); // class java.util.ArrayList
        System.out.println(arr instanceof ArrayList); // true
    }
}

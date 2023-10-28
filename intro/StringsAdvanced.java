package intro;

public class StringsAdvanced {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = "Hello";
        String c = "Hello";
        String d = "World";
        System.out.println(b == c);     // true
        System.out.println(b.equals(c));// true
        System.out.println(b == a);     // false
        System.out.println(b.equals(a));// true
        String e = new String("Hello");
        a = a+d; // It doesn't matter if we write "World" instead of d here, after concatenation the new string will be stored in the heap memory in both cases
        b = b+d; // It doesn't matter if we write "World" instead of d here, after concatenation the new string will be stored in the heap memory in both cases
        c = c+d; // It doesn't matter if we write "World" instead of d here, after concatenation the new string will be stored in the heap memory in both cases
        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(c)); // true
        System.out.println(a==b);        // false
        System.out.println(b==c);        // false
    }
}

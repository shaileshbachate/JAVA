package intro;

public class Scope {
    public static void main(String[] args) {
        int b = 5;

        if (5>3) {
            int a = 10;
            // int b = 15; // Exception: java.lang.Error: Unresolved compilation problem: Duplicate local variable b
            System.out.println(a);
            System.out.println(b);
        }
        // System.out.println(a); // Exception: java.lang.Error: Unresolved compilation problem: a cannot be resolved to a variable
        System.out.println(b);

        {
            int c = 9;
            System.out.println(c);
        }
        // System.out.println(c); // Exception: java.lang.Error: Unresolved compilation problem: c cannot be resolved to a variable

    }

}

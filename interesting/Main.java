package interesting;

public class Main {
    // // In Java, default parameters for methods are not supported, 
    // // We can use method overloading to achieve the same functionality
    // public static void tryingMethodWithDefaultParameters(String a="Sample") { // Syntax error on tokens, delete these tokens
    public static void tryingMethodWithoutDefaultParameters(String a) {
        System.out.println(a);
    }

    public static void tryingMethodWithoutDefaultParameters() {
        System.out.println("Sample");
    }

    public static void main(String[] args) {
        tryingMethodWithoutDefaultParameters();
        tryingMethodWithoutDefaultParameters("Hey There");
        // ---------------------------------------------------------------------- //

        // int a = null; // Error: Type mismatch: cannot convert from null to int
        String b = null;
        System.out.println(b);
        // ---------------------------------------------------------------------- //
    }
}

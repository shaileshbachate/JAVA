package interesting;

public class InterestingQuestions {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static final int add(int a, int b) {
        return a+b;
    }

    static final int add(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        // // Q // Array syntax //
        int[] arr1 = new int[5];
        printArray(arr1);

        // int[] arr2 = new int[]; // error: Variable must provide either dimension expressions or an array initializer

        // int a = new int; // error: Syntax error, insert "Dimensions" to complete Expression
        System.out.println("----------------------------------------------------------------------");


        // // Q // Can we cast boolean to int and int to boolean //
        // // Ans => // NO //

        // boolean b = (boolean) 1; // error: Cannot cast from int to boolean
        // int i = (int) true; // error: Cannot cast from boolean to int

        // System.out.println(1 + true); // The operator + is undefined for the argument type(s) int, boolean

        System.out.println("We can't cast boolean to int and int to boolean. Also, we can't use + operator on/between int and boolean");
        System.out.println("----------------------------------------------------------------------");


        // // Q // We know, we can't override final methods, but can we overload final methods ? //
        // // Ans => // Yes, we can overload final methods //
        System.out.println(add(5, 3));
        System.out.println(add(5, 3, 2));
    }
}

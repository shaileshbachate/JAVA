package intro;

import utilities.ArrayUtils;

public class Arrays {
    public static void arrIntro() {
        String[] subjects = {"DSPD", "IOOM", "DBMS"};
        // we can't directly print the entire array like we do in python
        System.out.println(subjects);     // [Ljava.lang.String;@7637f22

        System.out.println(subjects[0]);  // DSPD

        System.out.println(subjects.length); // to get the length of an array, use the length property
        // System.out.println(subjects[0].length); // error: cannot find symbol // length cannot be resolved or is not a field
        System.out.println(subjects[0].length()); // to get the length of a string, use length() method


        int[] nums = {101, 102, 103};
        nums[0] = 111;
        System.out.println(nums[0]);      // 111
        System.out.println("------------------------------------------------------------");
    }

    public static void arr2dIntro() {
        // 2D arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        for (int[] arr : myNumbers) {
            System.out.print("[ ");
            for (int x : arr)
                System.out.print(x + ", ");
            System.out.println("\b\b ]");  // \b means backspace
        }
        System.out.println("------------------------------------------------------------");
    }

    public static void arrWithoutInitialization() {
        int[] arr = new int[5]; // all the elements will be 0
        ArrayUtils.printArray(arr);

        int[][] arr2d = new int[3][2];
        arr2d[2][1] = 35;
        arr2d[1][0] = 59;
        ArrayUtils.print2dArray(arr2d);
        System.out.println("------------------------------------------------------------");
    }

    public static void jaggedArrays() {
        // // Jagged Arrays //
        int[][] arr2d2 = new int[2][];
        // ArrayUtils.print2dArray(arr2d2); // Exception in thread "main" java.lang.NullPointerException
        arr2d2[0] = new int[3];
        arr2d2[1] = new int[5];
        ArrayUtils.print2dArray(arr2d2);
        System.out.println("------------------------------------------------------------");
    }

    public static void anonymousArrays() {
        // In Java, an anonymous array is an array that is declared and initialized in the same
        // line without a variable name. It’s called “anonymous” because it doesn't have a
        // reference variable to access it directly.
        System.out.println(new int[]{1, 2, 3, 4, 5}.length);

        ArrayUtils.printArray(new int[3]);
        ArrayUtils.printArray(new int[] {1, 2, 3});
        // ArrayUtils.printArray({1, 2, 3}); // ERROR: illegal start of expression // Array initializer is not allowed here
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        arrIntro();

        arr2dIntro();

        arrWithoutInitialization();

        jaggedArrays();

        anonymousArrays();
    }
}

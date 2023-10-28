package utilities;

public class ArrayUtils {
    public static void printArray(int[] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr, int showIndex) {
        if (showIndex == 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("[" + i + ":" + arr[i] + "] ");
            }
            System.out.println();
        } else {
            printArray(arr);
        }
    }

    public static void printArray(char[] arr) {
        for (char x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr, int showIndex) {
        if (showIndex == 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("[" + i + ":" + arr[i] + "] ");
            }
            System.out.println();
        } else {
            printArray(arr);
        }
    }

    public static void print2dArray(int[][] arr) {
        System.out.println("[");
        for (int[] ar: arr) {
            System.out.print(" [ ");
            for (int x: ar){
                System.out.print(x + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static void print2dArray(char[][] arr) {
        System.out.println("[");
        for (char[] ar: arr) {
            System.out.print(" [ ");
            for (char x: ar){
                System.out.print(x + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}

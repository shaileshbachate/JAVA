package utilities;

public class GenericArrayUtils<T> {
    public void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public void printArray(T[] arr, int showIndex) {
        if (showIndex == 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("[" + i + "]=" + arr[i] + " ");
            }
            System.out.println();
        } else {
            printArray(arr);
        }
    }
}

package sorting_algorithms;

import utilities.GenericArrayUtils;

public class MyInsertionSort {
    public static void insertionSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 1; i < n-1; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        GenericArrayUtils<Integer> arrutil = new GenericArrayUtils<>();

        Integer[] arr = {2, 3, 5, 1, 2, 0, 7};
        arrutil.printArray(arr);

        insertionSort(arr);
        arrutil.printArray(arr);
    }
}

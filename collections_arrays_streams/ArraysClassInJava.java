package collections_arrays_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysClassInJava {
    public static void generalMethods() {
        // sort method:
        int[] nums = {2, 4, 3, 5, 1};
        System.out.println("nums = " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("------------------------------------------------------------");

        // sort method with comparators
        Integer[] nums1 = {2, 3, 4, 5, 1};
        System.out.println("nums1 = " + Arrays.toString(nums1));
        Arrays.sort(nums1); // sorting in ascending order
        System.out.println("nums1 = " + Arrays.toString(nums1));
        Arrays.sort(nums1, (x, y) -> y-x); // sorting in descending order
        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("------------------------------------------------------------");

        // parallelSort method:
        int[] nums2 = {2, 4, 3, 5, 1};
        Arrays.parallelSort(nums2);
        System.out.println("nums2 = " + Arrays.toString(nums2));
        System.out.println("------------------------------------------------------------");

        // sort from fromIndex to toIndex
        int[] nums3 = {2, 4, 3, 5, 1};
        // Arrays.sort(int[] arr, fromIndex(included), toIndex(excluded))
        // fromIndex value should be greater than or equal to 0, toIndex value should be less than or equal to the length of array
        Arrays.sort(nums3, 2, 5);
        System.out.println("nums3 = " + Arrays.toString(nums3));
        System.out.println("------------------------------------------------------------");

        // binarySearch method:
        // Searches the specified array of ints for the specified value using the binary search algorithm.
        // The array must be sorted (as by the sort(int[]) method) prior to making this call. If it is not sorted,
        // the results are undefined. If the array contains multiple elements with the specified value,
        // there is no guarantee which one will be found.
        // Returns:
        // index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
        // The insertion point is defined as the point at which the key would be inserted into the array:
        // the index of the first element greater than the key, or a.length if all elements in the array are less
        // than the specified key. Note that this guarantees that the return value will be >= 0 if and only
        // if the key is found.
        int[] nums4 = {0, 1, 1, 2, 3, 3, 4, 7, 7};
        System.out.println("foundIndex = " + Arrays.binarySearch(nums4, 3));

        System.out.println("foundIndex = " + Arrays.binarySearch(nums4, 5, 7, 3));

        System.out.println("foundIndex = " + Arrays.binarySearch(nums4, 300));
        System.out.println("foundIndex = " + Arrays.binarySearch(nums4, -300));
        System.out.println("foundIndex = " + Arrays.binarySearch(nums4, 5));
        System.out.println("foundIndex = " + Arrays.binarySearch(nums4, 6));
        System.out.println("------------------------------------------------------------");

        // fill method
        int[] nums5 = new int[5];
        System.out.println("nums5 = " + Arrays.toString(nums5));
        Arrays.fill(nums5, 10);
        System.out.println("nums5 = " + Arrays.toString(nums5));
        System.out.println("------------------------------------------------------------");

        // equals method
        System.out.println(Arrays.equals(new int[]{2, 1, 3}, new int[]{2, 1, 3}));
        System.out.println(Arrays.equals(new int[]{2, 1, 3}, new int[]{3, 1, 2}));
        System.out.println("------------------------------------------------------------");

        // hashCode method
        System.out.println("Arrays.hashCode(new int[]{2, 1, 3}) = " + Arrays.hashCode(new int[]{2, 1, 3}));
        System.out.println("------------------------------------------------------------");

        // copyOf method
        int[] originalArray = new int[] {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(originalArray, 5);
        System.out.println("newArray = " + Arrays.toString(newArray));

        int[] newArray1 = Arrays.copyOf(originalArray, 3);
        System.out.println("newArray1 = " + Arrays.toString(newArray1));

        int[] newArray2 = Arrays.copyOf(originalArray, 10);
        System.out.println("newArray2 = " + Arrays.toString(newArray2));

        // copyOfRange method
        int[] newArray3 = Arrays.copyOfRange(originalArray, 1, 3); // [from:inclusive, to:exclusive)
        System.out.println("newArray3 = " + Arrays.toString(newArray3));
        System.out.println("------------------------------------------------------------");
    }

    public static void convertingToList() {
        List<Integer> li = Arrays.asList(2, 4, 3, 1, 5);
        System.out.println("li = " + li);
        System.out.println("li.size() = " + li.size());
        System.out.println("li.toArray().length = " + li.toArray().length);
        // li.add(10); // will give error, as 'li' list is a fixed-sized list and cannot be modified

        List<Integer> arlist = new ArrayList<>(Arrays.asList(2, 4, 3, 1, 5));
        System.out.println("arlist = " + arlist);
        System.out.println("arlist.size() = " + arlist.size());
        System.out.println("arlist.toArray().length = " + arlist.toArray().length);
        arlist.add(10); // works fine, as this is a proper array list and can be modified, as it is not a fixed sized list
        System.out.println("arlist = " + arlist);
        System.out.println("------------------------------------------------------------");

        int[] arr1 = {2, 4, 3, 1, 5};
        Integer[] arr2 = {2, 4, 3, 1, 5};
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        // List<Integer> li2 = Arrays.asList(arr1); // Type mismatch: cannot convert from List<int[]> to List<Integer>
        // System.out.println("li2 = " + li2);
        List<Integer> li3 = Arrays.asList(arr2); // This works // Also note that this will be a fixed sized list
        System.out.println("li3 = " + li3);
        System.out.println("------------------------------------------------------------");

        int[] arr3 = {2, 4, 3, 1, 5};
        System.out.println("arr3 = " + Arrays.toString(arr3));
        List<Integer> liFromArr3 = Arrays.stream(arr3)
                                         .boxed()
                                         .collect(Collectors.toList());
        System.out.println("liFromArr3 = " + liFromArr3);
        liFromArr3.add(10); // This works as this is a modifiable list
        System.out.println("liFromArr3 = " + liFromArr3);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        generalMethods();
        
        convertingToList();
    }
}

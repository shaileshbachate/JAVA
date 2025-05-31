package collections_arrays_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(11);
        arr.add(22);
        arr.add(33);
        arr.add(44);
        arr.add(55);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println("----------------------------------------------------------------------");

        // // accessing and modifying //
        System.out.println(arr.get(2));
        System.out.println(arr.set(2, 333)); // set method returns the element previously at the specified position
        System.out.println(arr.get(2));
        System.out.println("----------------------------------------------------------------------");

        // // INSERT //
        arr.add(1, 222);
        arr.add(1, 22222);
        System.out.println(arr);
        System.out.println("----------------------------------------------------------------------");

        // // REMOVE //
        arr.remove(1);
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
        System.out.println("----------------------------------------------------------------------");

        arr = new ArrayList<>(Arrays.asList(20, 30, 10));
        System.out.println(arr);

        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        
        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr, (a, b) -> b-a);
        System.out.println(arr);

        arr.sort(null);
        System.out.println(arr);

        arr.sort((a, b) -> b-a);
        System.out.println(arr);
        System.out.println("----------------------------------------------------------------------");

        List<Integer> li = arr.stream().map((x) -> x*2).collect(Collectors.toList());
        System.out.println(li);
        System.out.println(li.getClass()); // class java.util.ArrayList
        System.out.println("------------------------------------------------------------");

        // addAll method
        List<Integer> arList = new ArrayList<>();
        arList.addAll(Arrays.asList(new Integer[]{2, 3, 1}));
        arList.addAll(Arrays.asList(new Integer[]{11, 12, 13}));
        System.out.println("arList = " + arList);
    }
}

package collections_arrays_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodForLists {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("From accept method: " + integer);
            }
        };
        nums.forEach(con);
        System.out.println("------------------------------------------------------------");

        Consumer<Integer> con2 = (x) -> System.out.println("From lambda: " + x);
        nums.forEach(con2);
        System.out.println("------------------------------------------------------------");

        nums.forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
    }
}

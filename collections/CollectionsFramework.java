package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFramework {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(1);
        al.add(8);
        Collections.sort(al);
        System.out.println(al);
    }
}

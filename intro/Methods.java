package intro;

public class Methods {
    static int[] myArrReturningMethod() {
        // return { 1, 2, 3 }; // This gives error
        int[] arr = { 1, 2, 3 };
        return arr; // This works
    }

    public static void main(String[] args) {
        int[] a = myArrReturningMethod();
        System.out.println(a[0]);
    }
}

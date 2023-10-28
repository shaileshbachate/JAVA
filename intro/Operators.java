package intro;

public class Operators {
    public static void main(String[] args) {
        // // Bitwise operators //
        int a = 40, b = 47, c = 48;
        int d = 5;
        a >>= 3;
        b >>= 3;
        c >>= 3;
        int e = d >> 3;
        int f = d << 3;
        System.out.println(a);  // 5
        System.out.println(b);  // 5
        System.out.println(c);  // 6
        System.out.println(d);  // 5
        System.out.println(e);  // 0
        System.out.println(f);  // 40

        int x = 5, y = 3;
        int l = x&y;            // bitwise AND operator
        int m = x|y;            // bitwise OR operator
        int n = x^y;            // bitwise XOR (exclusive OR) operator
        System.out.println(l);  // 1
        System.out.println(m);  // 7
        System.out.println(n);  // 6

        int z = 5;
        int z1 = ~z; // Bitwise NOT
        System.out.println(z1); // -6 // You might be confused here but this is correct
        // This happens because java uses two's compliment method to represent these numbers, look it up


    }
}

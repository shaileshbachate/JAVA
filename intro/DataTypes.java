package intro;

public class DataTypes {
    public static void main(String[] args) {
        byte a = 125;
        short b = 32000;
        int c = 120;
        long d = 30;
        long e = 1234567890;
        long f = 3234567890L; // If you don't add L at the end here, then it will give error (error: integer number too large)
        System.out.println(a); // 125
        System.out.println(b); // 32000
        System.out.println(c); // 120
        System.out.println(d); // 30
        System.out.println(d); // 30
        System.out.println(e); // 1234567890
        System.out.println(f); // 3234567890

        int i = 10_00_000;
        long l = 3_234_567_890L;
        System.out.println(i); // 1000000
        System.out.println(l); // 3234567890

        int x = 2_000_000_000;
        int y = 1_000_000_000;
        System.out.println(x+y); // -1294967296
        System.out.println((long) x+y); // 3000000000

        float g = 2.35f;
        double h = 6.78d;
        System.out.println(g); // 2.35
        System.out.println(h); // 6.78

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1); // 35000.0
        System.out.println(d1); // 120000.0

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1); // true
        System.out.println(b2); // false

        char capital_a = 65;
        char myGrade = 'S';
        System.out.println(capital_a);  // A
        System.out.println(myGrade);    // S
    }
}

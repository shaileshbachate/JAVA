package intro;
// The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
public class MathInJava {
    public static void main(String[] args) {
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3.49, 5));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.min(3.12, 3.15));

        double a = Math.sqrt(64);
        int b = (int) Math.sqrt(64);
        double c = Math.sqrt(63);
        int d = (int) Math.sqrt(63);
        System.out.println(a); // 8.0
        System.out.println(b); // 8
        System.out.println(c); // 7.937253933193772
        System.out.println(d); // 7

        // java.lang.Math.abs: If the argument is not negative, the argument is returned. 
        // If the argument is negative, the negation of the argument is returned.
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(5.2));
        // Note that if the argument is equal to the value of Integer.MIN_VALUE, the most negative representable int value, the result is that same value, which is negative.
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Math.abs(Integer.MIN_VALUE+1));
        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(-5.23));

        // double java.lang.Math.random()
        // Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        System.out.println(Math.random()); // double value between [0.0, 1)
        System.out.println(Math.random()*100);
        System.out.println((int)(Math.random()*101)); // random int from 0 to 100
    }
}
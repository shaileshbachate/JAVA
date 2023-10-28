package intro;

public class Main
{
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(" World!");
        System.out.println(3); // 3
        System.out.println(3+3); // 6
        System.out.println(2*3); // 6

        System.out.println("Hello" + 15);       // Hello15
        System.out.println(15 + 15);            // 30
        System.out.println("Hello" + 15 + 15);  // Hello1515
        System.out.println(15 + "Hello" + 15);  // 15Hello15
        System.out.println(15 + 15 + "Hello");  // 30Hello

        String a = new String("hey there");
        String a2 = "hey there";
        System.out.println(a);
        System.out.println(a2);
        String b = new String();
        System.out.println(b);
        b = "new-string";
        System.out.println(b);

        // int c = new int; // Syntax error, insert "Dimensions" to complete Expression
        // int c = new int(3); // Syntax error on token "int", invalid ClassType
        int[] c = new int[3]; // all the values of the array are initialized to 0
        System.out.println("[" + c[0] + ", " + c[1] + ", " + c[2] + "]"); // [0, 0, 0]

        int d;
        // System.out.println(d); // Exception Error: The local variable d may not have been initialized
        d = 5;
        System.out.println(d); // 5
    }
}
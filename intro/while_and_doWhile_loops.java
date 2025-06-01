package intro;

public class while_and_doWhile_loops {
    public static void main(String[] args) {
        int a = 1;
        while (a < 5) {
            System.out.println("inside loop: " + a);
            a++;
        }
        System.out.println(a);
        
        // The do-while loop will always be executed at least once, even if the condition is false, 
        // because the code block is executed before the condition is tested
        do {
            System.out.println("inside loop: " + a);
            a++;
        } while (a < 5);
        System.out.println(a);

        int b = 1;
        do {
            System.out.println("b inside loop: " + b);
            b++;
        } while (b < 5);
        System.out.println(b);
    }
}

package intro;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void usingScanner() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter an integer number:");
            int a = scn.nextInt();
            System.out.println("Entered number: " + a);

            System.out.println("Enter a float number:");
            float b = scn.nextFloat();
            System.out.println("Entered float number: " + b);

            System.out.println("Enter a double number:");
            double c = scn.nextDouble();
            System.out.println("Entered double number: " + c);

            System.out.println("Enter a byte number:");
            byte d = scn.nextByte();
            System.out.println("Entered byte number: " + d);

            System.out.println("Enter a short number:");
            short e = scn.nextShort();
            System.out.println("Entered short number: " + e);

            System.out.println("Enter a boolean:");
            boolean f = scn.nextBoolean();
            System.out.println("Entered boolean value: " + f);

            // Scanner class doesn't have a 'nextChar' method to just take a character input
        } catch (InputMismatchException e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("Do not close the scanner object here, as it will close the input stream " +
                    "object(System.in) underneath. And we can't access it later in the next method. So it is better " +
                    "not to close it (or to just set 'scn' to null). The garbage collector will handle the rest");
        }
    }

    public static void usingScanner2() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        if (scn.hasNextInt()) {
            int a = scn.nextInt();
            System.out.println("a = " + a);
        } else {
            System.out.println("Not a valid number");
        }

        System.out.println("Enter a string value:");
        if (scn.hasNext()) {
            String b = scn.next();
            System.out.println("b = " + b);
        }
    }

    public static void usingScannerToTakeStringInput() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter first name:");
            String a = scn.next();
            System.out.println("Enter last name:");
            String b = scn.next();
            System.out.println("Name: " + a + " " + b);

            scn.nextLine();  // This will consume the newline left-over

            System.out.println("Enter a line");
            String c = scn.nextLine();
            System.out.println("Line: " + c);
        } catch (InputMismatchException e) {
            System.out.println("Exception occured 2: " + e);
        } finally {
            System.out.println("Do not close the scanner object here, As we still want to use the " +
                    "input stream(System.in) later in the 'usingBufferedReader' method");
        }
    }

    public static void usingBufferedReader() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter a character: ");
        int a = br.read();
        // // read method //
        // // Reads a single character.
        // // Overrides: read in class Reader
        // // Returns: The character read, as an integer in the range 0 to 65535 (0x00-0xffff), or -1 if the end of the stream has been reached
        // // Throws: IOException – If an I/O error occurs

        System.out.println("a: " + a);

        br.close();
    }

    public static void main(String[] args) {
        usingScanner();

        usingScanner2();

        usingScannerToTakeStringInput();

        try {
            usingBufferedReader();
        } catch (IOException e) {
            System.out.println("IO exception occured: " + e);
        }
    }
}

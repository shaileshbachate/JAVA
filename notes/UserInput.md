## Q. What is wrong here?

```java
System.out.println("Enter first name:");
String a = scn.next();
System.out.println("Enter last name:");
String b = scn.next();
System.out.println("Name: " + a + " " + b);

System.out.println("Enter a line");
String c = scn.nextLine();
System.out.println("Line: " + c);
```

### Solution:
The issue here is related to how the `Scanner` class handles input, particularly the difference between `next()` and `nextLine()`.

The `next()` function will read the input until the delimiter, which is a whitespace by default. After reading the input, it will not read the newline character at the end of the line¹²³.

On the other hand, `nextLine()` reads input until the end of the line (i.e., the newline character)¹²³. 

In your code, after the last name is read using `next()`, the newline character is still in the buffer. So when `nextLine()` is called, it reads the newline character that's left over, and assumes that's the end of its input¹²³.

Here's how you can fix it:

```java
System.out.println("Enter first name:");
String a = scn.next();
System.out.println("Enter last name:");
String b = scn.next();
System.out.println("Name: " + a + " " + b);

scn.nextLine();  // This will consume the newline left-over

System.out.println("Enter a line");
String c = scn.nextLine();
System.out.println("Line: " + c);
```

In this code, `scn.nextLine();` after the last name input will consume the leftover newline character, allowing the next `nextLine()` to work as expected¹²³.

Source: Conversation with Bing, 13/11/2023
(1) Using charAt in System.out.println displays integer?. https://stackoverflow.com/questions/13735550/using-charat-in-system-out-println-displays-integer.
(2) Printing first and last name from first name, last name to last name .... https://stackoverflow.com/questions/58532944/printing-first-and-last-name-from-first-name-last-name-to-last-name-first-name.
(3) Chapter 4: String Handling | Solutions for APC ... - KnowledgeBoat. https://www.knowledgeboat.com/learn/understanding-computer-applications-bluej-icse-class-10/solutions/3eRPV/string-handling.


## Q. Why is my second function not working as expected whenever I get an error in my function 1. I have already enclosed it in a try catch block, still I am facing problems here. What might be the problem

```java
package intro;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void usingScanner() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter an integer number:");
            int a = scn.nextInt();
            System.out.println("Entered number: " + a);
        } catch (InputMismatchException e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("Closing scanner resource");
            scn.close();
        }
    }

    public static void usingScannerToTakeStringInput() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter first name:");
            String a = scn.next();
            System.out.println("Name: " + a);
        } catch (InputMismatchException e) {
            System.out.println("Exception occured 2: " + e);
        } finally {
            System.out.println("Closing Scanner resource 2");
            scn.close();
        }
    }

    public static void main(String[] args) {
        usingScanner();

        usingScannerToTakeStringInput();
    }
}
```

The issue arises from the fact that all these `Scanner` objects are reading from the same input stream, which is `System.in`¹²³⁵.

When an exception occurs in the `usingScanner()` method, the `finally` block is executed and the `Scanner` object is closed¹²³⁵. This doesn't just close the `Scanner` object, but also the underlying input stream, which is `System.in`¹²³⁵. Once an input stream is closed, it cannot be reopened¹²³⁵.

Then, when the `usingScannerToTakeStringInput()` method is called, it tries to create a new `Scanner` object that reads from `System.in`, which is now closed¹²³⁵. This is why the second function is not working as expected¹²³⁵.

To fix this issue, you can avoid closing the `Scanner` object in the `finally` block¹²³⁵. Here's how you can do it:

```java
public class UserInput {
    public static void usingScanner() {
        Scanner scn = new Scanner(System.in);
        // rest of your code
        // Do not close the Scanner object here
    }

    public static void usingScannerToTakeStringInput() {
        Scanner scn = new Scanner(System.in);
        // rest of your code
        // Do not close the Scanner object here
    }

    public static void main(String[] args) {
        usingScanner();
        usingScannerToTakeStringInput();
    }
}
```

In this code, the `Scanner` objects are not closed in the methods¹²³⁵. So, closing the `Scanner` object in one method won't affect the other methods¹²³⁵. I hope this helps! If you have any more questions, feel free to ask.

Source: Conversation with Bing, 14/11/2023
(1) java - Using a scanner-method for multiple set methods within class .... https://stackoverflow.com/questions/27903603/using-a-scanner-method-for-multiple-set-methods-within-class.
(2) java.util.scanner - Multiple Scanner Inputs (Java) - Stack Overflow. https://stackoverflow.com/questions/46235040/multiple-scanner-inputs-java.
(3) java - How to use Scanner in both main and method - Stack Overflow. https://stackoverflow.com/questions/50206675/how-to-use-scanner-in-both-main-and-method.
(4) java - Use Scanner for many different methods - Stack Overflow. https://stackoverflow.com/questions/44954894/use-scanner-for-many-different-methods.
(5) Little Known Facts About Scanner Class in JAVA & Why They Matter .... https://datatrained.com/post/scanner-class-in-java/.


## Q. But, I have heard, not closing scanner objects is a bad practice, right?, wouldn't this cause any problems? And why is input stream being closed when I am closing scanner object?

You're correct that it's generally a good practice to close resources like `Scanner` objects when you're done using them³⁵⁹. This is because resources are finite, and leaving them open unnecessarily can cause performance issues³. Closing a `Scanner` also ensures that any data in the input stream is flushed and saved properly³.

However, in the case of `System.in`, it's a bit different. `System.in` is a standard input stream provided by the JVM, and it's typically not a good idea to close it¹⁶⁸. This is because once an input stream is closed, it cannot be reopened¹². If you close `System.in` by closing a `Scanner` object that's reading from `System.in`, you won't be able to read from `System.in` again in your program¹².

When you call the `close()` method on a `Scanner` object, it closes the underlying input stream¹²⁴. This is why the input stream is being closed when you close the `Scanner` object¹²⁴.

So, while it's generally a good practice to close resources when you're done using them, there are exceptions. In the case of `System.in`, it's usually best not to close it¹⁶⁸. Instead, you can set your `Scanner` variable to `null`, and let the garbage collector remove it from the heap⁶. This way, you can avoid potential issues with closing `System.in`¹⁶⁸.

I hope this helps! If you have any more questions, feel free to ask.

Source: Conversation with Bing, 14/11/2023
(1) Mastering the Art of Closing a Scanner in Java: Code ... - kl1p.com. https://kl1p.com/mastering-the-art-of-closing-a-scanner-in-java-code-examples-included/.
(2) Why is Scanner.close () useful in Java? - Stack Overflow. https://stackoverflow.com/questions/43060776/why-is-scanner-close-useful-in-java.
(3) How to close scanner in java? - CherCherTech. https://chercher.tech/java-questions/close-scanner-java-questions.
(4) java - How to close a scanner without closing the underlying System.in .... https://stackoverflow.com/questions/25506240/how-to-close-a-scanner-without-closing-the-underlying-system-in.
(5) java - Scanner is never closed - Stack Overflow. https://stackoverflow.com/questions/15613626/scanner-is-never-closed.
(6) Don't close a Scanner that's tied to System.in - Coderanch. https://coderanch.com/wiki/678613/Don-close-Scanner-tied-System.
(7) java - How do I close my scanner? - Stack Overflow. https://stackoverflow.com/questions/32569616/how-do-i-close-my-scanner.
(8) java - How to close a scanner object when input is taken in a loop .... https://stackoverflow.com/questions/51040850/how-to-close-a-scanner-object-when-input-is-taken-in-a-loop.
(9) java.util.scanner - Is it safe not to close a Java Scanner, provided I .... https://stackoverflow.com/questions/5919143/is-it-safe-not-to-close-a-java-scanner-provided-i-close-the-underlying-readable.
(10) java - What if I do not close the Scanner? - Stack Overflow. https://stackoverflow.com/questions/25790294/what-if-i-do-not-close-the-scanner.


Setting a `Scanner` object to `null` in Java doesn't actually release any system resources¹. The proper way to release resources associated with a `Scanner` object is to call its `close()` method¹. This ensures that any resources used by the `Scanner` object are released and can be used again¹.

However, in the case of `System.in`, it's typically not a good idea to close it¹². This is because once an input stream is closed, it cannot be reopened¹². If you close `System.in` by closing a `Scanner` object that's reading from `System.in`, you won't be able to read from `System.in` again in your program¹².

So, while it's generally a good practice to close resources when you're done using them, there are exceptions. In the case of `System.in`, it's usually best not to close it¹². Instead, you can set your `Scanner` variable to `null`, and let the garbage collector remove it from the heap¹. This way, you can avoid potential issues with closing `System.in`¹².

Here's how you can modify your code:

```java
public class UserInput {
    public static void usingScanner() {
        Scanner scn = new Scanner(System.in);
        // rest of your code
        scn = null;  // Set the Scanner object to null
    }

    public static void usingScannerToTakeStringInput() {
        Scanner scn = new Scanner(System.in);
        // rest of your code
        scn = null;  // Set the Scanner object to null
    }

    public static void main(String[] args) {
        usingScanner();
        usingScannerToTakeStringInput();
    }
}
```

In this code, the `Scanner` objects are set to `null` in the methods¹. So, the garbage collector can remove them from the heap when it runs¹. I hope this helps! If you have any more questions, feel free to ask.

Source: Conversation with Bing, 14/11/2023
(1) java - Setting a scanner object to null - Stack Overflow. https://stackoverflow.com/questions/19671278/setting-a-scanner-object-to-null.
(2) java - How do I fix my scanner input that is null? - Stack Overflow. https://stackoverflow.com/questions/16082143/how-do-i-fix-my-scanner-input-that-is-null.
(3) Scanner (Java Platform SE 8 ) - Oracle. https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html.
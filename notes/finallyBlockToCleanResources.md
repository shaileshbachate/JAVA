## Q. Example use try catch finally block to close resources

Sure, here's an example of using a `try-catch-finally` block to manage a resource, such as a `BufferedReader` for reading from a file. The resource is closed in the `finally` block to ensure it gets closed whether an exception occurs or not.

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader: " + e.getMessage());
            }
        }
    }
}
```

In this code:
- The `try` block attempts to open a file and read from it line by line.
- If an `IOException` occurs during this process (for example, if the file does not exist), the `catch` block catches the exception and prints an error message.
- The `finally` block executes whether an exception was thrown or not. It attempts to close the `BufferedReader`. If an exception occurs while closing the reader (which is also an `IOException`), this exception is caught and an error message is printed.

This ensures that the `BufferedReader` is always properly closed, even if an exception occurs while reading from the file. This is important because failing to close resources like files or database connections can lead to resource leaks in your program.


## Q. Why are we declaring BufferedReader reader outside the try block

The `BufferedReader` instance is declared outside the `try` block because we want to ensure that it's accessible in the `finally` block. If it was declared inside the `try` block, its scope would be limited to that block and it wouldn't be accessible in the `finally` block.

The `finally` block is where we typically place cleanup code, such as closing resources. In this case, we want to make sure the `BufferedReader` is closed to free up system resources. If an exception occurs while reading from the file, the `catch` block will handle it, and then execution will proceed to the `finally` block where the `BufferedReader` will be closed.

Here's the relevant part of the code:

```java
BufferedReader reader = null;
try {
    reader = new BufferedReader(new FileReader("file.txt"));
    // ...
} catch (IOException e) {
    // Handle exception
} finally {
    try {
        if (reader != null) {
            reader.close();
        }
    } catch (IOException e) {
        // Handle exception
    }
}
```

In this code, whether an exception occurs or not, the `finally` block will always be executed and the `BufferedReader` will be closed, preventing any potential resource leaks.


## Q. If finally block can't even access the variables in try block scope, Then what is the use of finally block, we can write the code inside the finally block just below the ending of try-catch, and it would work same, right?

The `finally` block in Java has a special role in exception handling. It is designed to execute important cleanup code, such as closing resources, whether an exception is thrown or not. 

While it's true that you could write cleanup code after a `try-catch` block, there are some key differences that make the `finally` block more reliable:

1. **Exception in Catch Block**: If an exception is thrown inside the `catch` block, the rest of the `catch` block is skipped and control is transferred to the next enclosing `try-catch`. Any cleanup code after the `try-catch` would not be executed. However, a `finally` block would still be executed.

2. **Control Transfer Statements**: If a control transfer statement like `return`, `continue`, or `break` is encountered in the `try` or `catch` block, any code after the `try-catch` would not be executed. However, a `finally` block would still be executed before the control transfer.

3. **System.exit()**: If the JVM exits while the `try` or `catch` code is being executed (for example, because of a call to `System.exit()`), then the `finally` block will not execute. Similarly, any cleanup code after the `try-catch` would not be executed.

So, while it might seem like you could just place cleanup code after a `try-catch`, using a `finally` block ensures that this important code is executed in almost all circumstances.
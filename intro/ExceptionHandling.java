package intro;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void doubleTheNumber(int x) throws MyCustomException {
        if (x == 0) {
            throw new MyCustomException("x should not be 0 in doubleTheNumber method");
        }
        System.out.println(x*2);
    }

    public static void tripleTheNumber(int x) {
        try {
            if (x == 0) {
                throw new MyCustomException("x should not be 0 in tripleTheNumber method");
            }
            System.out.println(x*3);
        } catch (MyCustomException e) {
            System.out.println("I am handling tripleTheNumber method's exception directly inside the method, with the try-catch blocks");
            System.out.println("e = " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("------------------------------START------------------------------");
        try {
            // System.out.println(10/0); // This will throw ArithmeticException. The next lines in the try block will not be executed
            System.out.println("------------------------------------------------------------");

            int[] arr = new int[5];
            // System.out.println("arr[5] = " + arr[5]); // This will throw ArrayIndexOutOfBoundsException
            System.out.println("------------------------------------------------------------");

            String s = null; // s is null, so we can't get the length of s with length() method
            // System.out.println("s.length() = " + s.length()); // This will throw NullPointerException and as we are not catching it specifically, this exception will be caught by 'catch (Exception e)' block
            System.out.println("------------------------------------------------------------");

            int x = 5;
            if (x == 5) {
                // throw new ArithmeticException("My arithmetic exception: I don't want x to be 5");
            }
            System.out.println("------------------------------------------------------------");

            int y = 5;
            if (y == 5) {
                throw new MyCustomException("My custom exception: I don't want y to be 5");
            }
            System.out.println("------------------------------------------------------------");
        } catch (ArithmeticException e) {
            System.out.println("e in Arithmetic Exception catch block = " + e);
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e in ArrayIndexOutOfBoundsException catch block = " + e);
        } catch (MyCustomException e) {
            System.out.println("e in MyCustomException catch block" + e);
        } catch (Exception e) {
            System.out.println("e in Exception catch block = " + e);
            e.printStackTrace();
        } finally {
            System.out.println("This block is executed regardless if the try block throws any exception or not");
        }
        System.out.println("------------------------------------------------------------");

        try {
            // // We have to handle the exception thrown by 'doubleTheNumber' method here as
            // // we are not doing this in the method itself. Another way to handle this, is,
            // // adding 'throws MyCustomException' to this current running method(i.e. main method),
            // // But it is not recommended here (as this is the main method,
            // // which will be called by the JVM directly)

            // doubleTheNumber(0);
            doubleTheNumber(10);
        } catch (MyCustomException e) {
            System.out.println("I am handling doubleTheNumber method's exception inside the main method, with the try-catch blocks");
            System.out.println("e = " + e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("e in the Exception block = " + e);
        }

        tripleTheNumber(0);
        System.out.println("------------------------------END------------------------------");
    }
}

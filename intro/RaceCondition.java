package intro;

import java.util.function.Function;

class Counter {
    int count;
    public void increment() {
        count++;
    }

    public synchronized void synchronizedIncrement() {
        count++;
    }
}

public class RaceCondition {
    static void runIncrementFunctionInThreads(Counter c) {
        // This method may or may not print the final count value as 20000

        System.out.println("c.count at the beginning = " + c.count);
        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted: " + e);
        }
        System.out.println("c.count after running both threads = " + c.count);
    }

    static void runSynchronizedIncrementFunctionInThreads(Counter c) {
        // This method will definitely print the final count value as 20000

        System.out.println("c.count at the beginning = " + c.count);
        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.synchronizedIncrement();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.synchronizedIncrement();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted: " + e);
        }
        System.out.println("c.count after running both threads = " + c.count);
    }


    public static void main(String[] args) {
        RaceCondition.runIncrementFunctionInThreads(new Counter());
        RaceCondition.runIncrementFunctionInThreads(new Counter());
        RaceCondition.runIncrementFunctionInThreads(new Counter());

        RaceCondition.runSynchronizedIncrementFunctionInThreads(new Counter());
        RaceCondition.runSynchronizedIncrementFunctionInThreads(new Counter());
        RaceCondition.runSynchronizedIncrementFunctionInThreads(new Counter());
    }
}

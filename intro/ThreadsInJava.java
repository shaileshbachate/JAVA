package intro;

import java.util.Arrays;

class A extends Thread {
    public void run() {
        System.out.println("Hi from A");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye from A");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Hi from B");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye from B");
    }
}

class C implements Runnable {
    public void run() {
        System.out.println("Hi from C");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye from C");
    }
}

class D implements Runnable {
    public void run() {
        System.out.println("Hi from D");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye from D");
    }
}

public class ThreadsInJava {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
        try {
            obj1.join();
            obj2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted: " + e);
        }
        System.out.println("------------------------------------------------------------");

        C obj3 = new C();
        D obj4 = new D();
        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();

        if (t1.isAlive()) {
            System.out.println("Thread 1 is still running");
        }
        if (t2.isAlive()) {
            System.out.println("Thread 2 is still running");
        }

        for (Thread thread : Arrays.asList(t1, t2)) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e);
            }
        }
        System.out.println("------------------------------------------------------------");

        Runnable obj5 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi from E");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Bye from E");
            }
        };
        Runnable obj6 = () -> {
            System.out.println("Hi from F");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Bye from F");
        };
        Thread t3 = new Thread(obj5);
        Thread t4 = new Thread(obj6);
        Thread t5 = new Thread(() -> {
            System.out.println("Hi from G");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Bye from G");
        });
        t3.start();
        t4.start();
        t5.start();

        for (Thread thread : Arrays.asList(t3, t4, t5)) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e);
            }
        }
        System.out.println("------------------------------------------------------------");


        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("Hi ");
            }
        });
        Thread t7 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("Hey ");
            }
        });

        System.out.println("t6.getPriority() = " + t6.getPriority());
        System.out.println("t7.getPriority() = " + t7.getPriority());

        // Threads have default priority of 5 and can be set in the range [1, 10] both inclusive
        t6.setPriority(Thread.MIN_PRIORITY); // i.e. 1
        t7.setPriority(10); // i.e. Thread.MAX_PRIORITY

        t6.start();
        t7.start();
    }
}

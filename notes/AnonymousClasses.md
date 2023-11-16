## Anonymous class OR Anonymous inner class in JAVA

Anonymous or Anonymous inner classes in Java are inner classes without a name¹². Only a single object is created for an anonymous class¹². They are useful when you need to override a method of a class or interface without having to actually subclass a class¹².

Anonymous classes can be created in two ways¹²:
1. Class (may be abstract or concrete)
2. Interface

Here's an example of an anonymous class that implements an interface:

```java
interface Eatable {
    void eat();
}

class TestAnnonymousInner1 {
    public static void main(String args[]) {
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
```

In this example, an anonymous class is created that implements the `Eatable` interface².

Please note that anonymous classes have some restrictions¹:
- They can implement only one interface at a time.
- They can extend a class or implement an interface, but not both at the same time.
- You can't write any constructor for an anonymous class because it does not have any name.
- An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
- You cannot declare static initializers or member interfaces in an anonymous class. However, an anonymous class can have static members provided that they are constant variables¹.

Source: Conversation with Bing, 30/10/2023
(1) Anonymous Class in Java - GeeksforGeeks. https://www.geeksforgeeks.org/anonymous-inner-class-java/.
(2) Java Anonymous Class - javatpoint. https://www.javatpoint.com/anonymous-inner-class.
(3) Anonymous Classes in Java | Baeldung. https://www.baeldung.com/java-anonymous-classes.
(4) github.com. https://github.com/ShioKub/java-core/tree/9b7c701fc3b1c4a9c18b9143b9d9fd23a9d403e4/innerClass%2FnonStaticInner%2FAnonymousInner.java.


## Q. "An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final." what does this mean?

In Java, an anonymous inner class can access local variables of its enclosing scope only if they are declared as `final` or are effectively final.

A local variable is considered to be "effectively final" if it is not modified after it is initialized. In other words, the variable's value cannot change.

This restriction exists because an instance of an anonymous inner class can outlive the execution of the method in which the class is defined. For example, this can happen if a reference to the instance is passed to another thread. If the local variables were allowed to change, it would create a synchronization problem.

Here's an example:

```java
int notFinal = 100; // Not final or effectively final
new Thread(new Runnable() {
    public void run() {
        System.out.println(notFinal); // Error: Cannot refer to changing 'notFinal' in an inner class
    }
}).start();
```

In this example, the `notFinal` variable is not final or effectively final, so it cannot be accessed inside the anonymous inner class.


## Q. "You cannot declare static initializers or member interfaces in an anonymous class. However, an anonymous class can have static members provided that they are constant variables." What does this mean?

In Java, an anonymous inner class cannot have static initializers or member interfaces. This means you cannot define a `static` block (which is used for initializing static fields) or an interface inside an anonymous inner class.

However, an anonymous inner class can have static members if they are constant variables. A constant variable in Java is a variable that is declared as `final` and `static`. The value of this variable cannot change after it is initialized, and it is common to all instances of the class.

Here's an example:

```java
new Thread() {
    static final int i = 5; // This is allowed

    // static { } // Not allowed, would cause a compile error

    public void run() {
        System.out.println(i);
    }
}.start();
```

In this example, the anonymous inner class has a static final variable `i`, which is allowed. However, a static initializer block (commented out in the example) would not be allowed and would cause a compile error.
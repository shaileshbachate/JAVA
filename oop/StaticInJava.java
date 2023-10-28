package oop;

public class StaticInJava {
    String name;
    int roll;
    static String college = "VRCE";

    public StaticInJava(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    static {
        // static block is not called everytime an object is created from this class, it is called only once, when the
        // class is loaded
        System.out.println("This static block in StaticInJava class will be executed before the main method." + 
            " Also, wherever we are using this class, this block will be executed before anything else in this class");
    }

    public StaticInJava() {
        this.name = "";
        this.roll = 0;
    }

    public void getDetails() {
        System.out.println("Hi, I am " + name + "(" + roll + "), currently studying in " + college + " college." );
    }

    static void myStaticMethod() {
        System.out.println("static method can be called without creating objects");
    }

    void myMethod() {
        System.out.println("this method must be called by creating objects");
    }

    static void myStaticMethodToChangeCollegeName(String newCollegeName) {
        college = newCollegeName;

        // // We can't access non static fields from a static method, so we can't access 'roll' or 'name' from this method
        // System.out.println(roll); // Exception Error: Cannot make a static reference to the non-static field roll
        // roll = 1; // Exception Error: Cannot make a static reference to the non-static field roll
        // // error: non-static variable roll cannot be referenced from a static context

        myStaticMethod(); // This works
        // myMethod(); // Exception Error: Cannot make a static reference to the non-static method myMethod() from the type StaticInJava
        // // error: non-static method myMethod() cannot be referenced from a static context
    }

    public static void main(String[] args) {
        // myMethod(); // error: non-static method myMethod() cannot be referenced from a static context
        
        myStaticMethod(); // this works
        StaticInJava.myStaticMethod(); // this works too

        StaticInJava myObj = new StaticInJava();
        myObj.myMethod();
        // myObj.myStaticMethod(); // works too, but a static method should be accessed in a static way, i.e. without using the obj
        // this.myStaticMethod(); // Exception Error: Cannot use this in a static context

        StaticInJava std1 = new StaticInJava("Shailesh", 103);
        StaticInJava std2 = new StaticInJava("Suraj", 102);
        StaticInJava std3 = new StaticInJava("Saurabh", 101);


        std1.getDetails();
        std2.getDetails();
        std3.getDetails();

        college = "VNIT"; // we can also do 'std1.college = "VNIT";'
        std1.getDetails();
        std2.getDetails();
        std3.getDetails();

        // static int abc = 5; // Exception Error: Illegal modifier for parameter abc; only final is permitted // OR // error: illegal start of expression

        StaticInJava.myStaticMethodToChangeCollegeName("IITN");
        std1.getDetails();
        std2.getDetails();
        std3.getDetails();
    }
}

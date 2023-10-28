package oop;

class Person {
    private String firstName;
    private String lastName;
    protected String fullName;
    protected int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        fullName = this.firstName + " " + this.lastName;
        this.age = age;
    }

    void getDetails() {
        System.out.println("I am " + fullName + ", and I am " + age + " years old.");
    }
}

class Student extends Person {
    private int roll;

    public Student(String firstName, String lastName, int age, int roll) {
        super(firstName, lastName, age);
        this.roll = roll;
    }
    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    void getDetails() {
        System.out.println("I am " + fullName + ", and I am " + age + " years old. My roll number is " + roll + ".");
    }
}

public class TryingOOP {
    public static void main(String[] args) {
        Person p = new Person("Shubham", "Bachate", 21);
        Student s1 = new Student("Shailesh", "Bachate", 21, 103);
        Person s2 = new Student("Shailesh", "Bachate", 21, 103);
        // Student s3 = new Person("Shailesh", "Bachate", 21); // Type mismatch: cannot convert from Person to Student
        // Student s3 = (Student) new Person("Shailesh", "Bachate", 21); // Exception in thread "main" java.lang.ClassCastException: class OOP.Person cannot be cast to class OOP.Student (OOP.Person and OOP.Student are in unnamed module of loader 'app')

        p.getDetails();
        s1.getDetails();
        s2.getDetails();
    }
}

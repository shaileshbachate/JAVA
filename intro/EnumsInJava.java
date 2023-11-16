package intro;

enum Status {
    Pending, Running, Failed, Success
}

enum Laptops {
    MacBook(100000), XPS(90000), Surface(80000), MSF, VivoBook;

    int price;

    // Constructors in enum cannot be public, they are private by default
    Laptops(int price) {
        this.price = price;
    }
    // We don't need to explicitly write private for the constructor, but we can
    private Laptops() {
        this.price = 50000;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumsInJava {
    public static void main(String[] args) {
        // Status s = new Status(); // ERROR: Enum types cannot be instantiated
        Status s1 = Status.Running;
        System.out.println("s1 = " + s1); // Running
        // Status s2 = Status.NoIdea; // ERROR: Cannot resolve symbol 'NoIdea'

        System.out.println("s1.ordinal() = " + s1.ordinal()); // 1 // prints the index of status s1 (i.e. 'Running' in this case) in the enum
        System.out.println("Status.Success.ordinal() = " + Status.Success.ordinal()); // 3
        System.out.println("------------------------------------------------------------");

        Status[] statusArray = Status.values();
        System.out.println("statusArray.length = " + statusArray.length);
        for (Status s :
                statusArray) {
            System.out.println(s.ordinal() + ": " + s);
        }
        System.out.println("------------------------------------------------------------");

        // If-Else statements with Enums
        Status s3 = statusArray[1];
        if (s3 == Status.Running) {
            System.out.println("This is true");
        }
        System.out.println("------------------------------------------------------------");

        // Switch-Case statement for enums. Switch case can directly handle Enum values,
        // so no need to write 'Status.Running' in case, you can directly write 'Running'
        int randomIndex = (int) (Math.random() * 4);
        Status processStatus = statusArray[randomIndex];
        switch (processStatus) {
            case Running:
                System.out.println("All good, process is in progress");
                break;
            case Pending:
                System.out.println("process is pending");
                break;
            case Failed:
                System.out.println("This is bad, process has failed");
                break;
            case Success:
                System.out.println("All good, process has succeeded");
                break;
            default:
                System.out.println("Error in status");
        }
        System.out.println("------------------------------------------------------------");

        Laptops mb = Laptops.MacBook;
        System.out.println(mb);             // MacBook
        System.out.println(mb.getPrice());  // 100000
        System.out.println("------------------------------------------------------------");
    }
}

package intro;

public class switchCaseInJava {
    public static void switchFunction(int a)
    {
        switch (a)
        {
            case 9:
                System.out.println("case: 9");
                break;
            case 10:
                System.out.println("case: 10");
                System.out.println("still in case: 10");
                // if we don't add break here, the code in next cases will also be executed without checking the case
            case 11:
                System.out.println("case: 11");
            default:
                System.out.println("default case");
        }
        System.out.println("__________________________________");
    }

    public static void main(String[] args) {
        switchFunction(9);
        switchFunction(10);
        switchFunction(11);
    }
}

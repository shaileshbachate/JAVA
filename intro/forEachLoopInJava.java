package intro;

public class forEachLoopInJava {
    public static void main(String[] args) {
        String[] subjects = {"DSPD", "IOOM", "DBSM"};
        for (String subject: subjects)
        {
            System.out.println(subject);
        }

        // there is no need of curly braces {} if there is only one statement inside the loops
        for (String subject: subjects)
            System.out.println(subject + 1);
    }
}

package intro;

public class StringPractice {
    public static void main(String[] args) {
        String s = "Hello World!";

        char[] ch_arr = { 67, 68, 69 };

        for (char ch : ch_arr) {
            System.out.print(ch + " ");
        }
        System.out.println();

        String strFromCh_arr = new String(ch_arr);
        System.out.println("strFromCharr = " + strFromCh_arr);


        StringBuilder sbr = new StringBuilder(s);
        sbr.append("!!");   // append string
        sbr.append('$');    // append character
        sbr.append(true);   // append boolean
        sbr.append(ch_arr);  // append char array
        System.out.println("sbr = " + sbr);

        sbr.reverse();
        System.out.println("sbr = " + sbr);
    }
}

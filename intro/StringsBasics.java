package intro;

public class StringsBasics {
    public static void main(String[] args) {
        System.out.println("Hello" + 15);       // Hello15
        System.out.println(15 + 15);            // 30
        System.out.println("Hello" + 15 + 15);  // Hello1515
        System.out.println(15 + "Hello" + 15);  // 15Hello15
        System.out.println(15 + 15 + "Hello");  // 30Hello

        System.out.println("use of 'single' and \"double\" quotes inside a string");

        String firstName = "shailesh";
        String firstAndMiddleName = firstName.concat(" navnath"); // concat doesn't change the original string i.e. firstName in this case
        String lastName = "bachate";
        String s = firstAndMiddleName + " " + lastName;
        System.out.println(s);                                     // shailesh navnath bachate

        System.out.println(s.length());                            // 24
        System.out.println(s.toUpperCase());                       // SHAILESH NAVNATH BACHATE
        System.out.println(s.toLowerCase());                       // shailesh navnath bachate

        System.out.println(s.startsWith("sh"));             // true
        System.out.println(s.startsWith("le"));             // false
        System.out.println(s.startsWith("le", 4));  // true
        // The method startsWith(String) in the type String is not applicable for the arguments (char)
        // System.out.println(s.startsWith('s')); // error: incompatible types: char cannot be converted to String
        System.out.println(s.startsWith("s"));              // true
        System.out.println(s.endsWith("ate"));              // true
        System.out.println(s.endsWith("at"));               // false
        System.out.println(s.endsWith("ate"));              // true

        System.out.println(s.indexOf('s'));                     // 0
        System.out.println(s.indexOf("sh"));                   // 0
        System.out.println(s.indexOf("sh", 3));      // 6
        System.out.println(s.lastIndexOf("sh"));               // 6
        System.out.println(s.lastIndexOf("sh", 3));  // 0 // searching backward from the specified index
        System.out.println(s.indexOf("xyz"));                  // -1

        // System.out.println(s[0]);             // error: array required, but String found
        System.out.println(s.charAt(0));                     // s
        // System.out.println(s.charAt(999));    // StringIndexOutOfBoundsException: String index out of range: 999
    }
}

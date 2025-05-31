package basic_questions;

public class StringQuestions {
    // Most efficient way to reverse the string
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Uses native code optimized for performance internally.
    // Very concise and readable.
    String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        StringQuestions q = new StringQuestions();

        String reversed_s = q.reverseString("Hello");
        System.out.println(reversed_s);
    }
}

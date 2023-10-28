## Q. What are the methods in String class

1. **charAt(int index)**: Returns the character at the specified index¹.
```java
String str = "Hello";
char ch = str.charAt(1);
System.out.println(ch); // Outputs: e
```

2. **length()**: Returns the length of the string¹.
```java
String str = "Hello";
int len = str.length();
System.out.println(len); // Outputs: 5
```

3. **substring(int beginIndex, int endIndex)**: Returns a new string that is a substring of the string¹.
```java
String str = "Hello, World";
String subStr = str.substring(7, 12);
System.out.println(subStr); // Outputs: World
```

4. **contains(CharSequence sequence)**: Returns true if the sequence of char values are contained in this sequence¹.
```java
String str = "Hello, World";
boolean contains = str.contains("World");
System.out.println(contains); // Outputs: true
```

5. **indexOf(String substring)**: Returns the index within this string of the first occurrence of the specified substring¹.
```java
String str = "Hello, World";
int index = str.indexOf("World");
System.out.println(index); // Outputs: 7
```

6. **equals(Object anObject)**: Compares this string to the specified object¹.
```java
String str1 = "Hello";
String str2 = "Hello";
boolean isEqual = str1.equals(str2);
System.out.println(isEqual); // Outputs: true
```

7. **isEmpty()**: Returns true if, and only if, length() is 0¹.
```java
String str = "";
boolean isEmpty = str.isEmpty();
System.out.println(isEmpty); // Outputs: true
```

8. **replace(char oldChar, char newChar)**: Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar¹.
```java
String str = "Hello, World";
String replacedStr = str.replace('o', 'a');
System.out.println(replacedStr); // Outputs: Halla, Warld
```

9. **toLowerCase()** and **toUpperCase()**: Converts all of the characters in this String to lower case and upper case respectively¹.
```java
String str = "Hello, World";
String lowerCaseStr = str.toLowerCase();
String upperCaseStr = str.toUpperCase();
System.out.println(lowerCaseStr); // Outputs: hello, world
System.out.println(upperCaseStr); // Outputs: HELLO, WORLD
```

10. **trim()**: Returns a string whose value is this string, with any leading and trailing whitespace removed¹.
```java
String str = " Hello, World ";
String trimmedStr = str.trim();
System.out.println(trimmedStr); // Outputs: Hello, World
```

Source: Conversation with Bing, 15/10/2023
(1) Java String Methods with Examples - javatpoint. https://www.javatpoint.com/methods-of-string-class.
(2) Java String Methods Tutorial With Examples - Software Testing Help. https://www.softwaretestinghelp.com/java-string-methods-tutorial-with-examples/.
(3) String class in Java - GeeksforGeeks. https://www.geeksforgeeks.org/string-class-in-java/.
(4) String Class Methods in Java with Examples - Sanfoundry. https://www.sanfoundry.com/java-program-create-strings-use-some-important-methods-string-class/.
(5) Java Strings - W3Schools. https://www.w3schools.com/java/java_strings.asp.


## Are there any overloaded implementations of these methods, if so include that info in the solution as well

Yes, several methods in the `String` class in Java have overloaded versions¹²³⁴. Here are some examples:

1. **substring(int beginIndex)** and **substring(int beginIndex, int endIndex)**: The `substring` method has two versions¹²³⁴. One takes a single argument, the beginning index, and returns a substring from that index to the end of the string¹²³⁴. The other takes two arguments, the beginning index and the ending index, and returns a substring from the beginning index to one character before the ending index¹²³⁴.
```java
String str = "Hello, World";
String subStr1 = str.substring(7);
String subStr2 = str.substring(7, 12);
System.out.println(subStr1); // Outputs: World
System.out.println(subStr2); // Outputs: Worl
```

2. **indexOf(String str)** and **indexOf(String str, int fromIndex)**: The `indexOf` method also has two versions¹²³⁴. One takes a single argument, the substring to find, and returns the index of the first occurrence of the substring¹²³⁴. The other takes two arguments, the substring to find and an index to start the search from, and returns the index of the first occurrence of the substring from that index¹²³⁴.
```java
String str = "Hello, World";
int index1 = str.indexOf("o");
int index2 = str.indexOf("o", 5);
System.out.println(index1); // Outputs: 4
System.out.println(index2); // Outputs: 8
```

3. **replace(char oldChar, char newChar)** and **replace(CharSequence target, CharSequence replacement)**: The `replace` method has two versions¹²³⁴. One takes two characters as arguments and replaces all occurrences of the old character with the new character¹²³[^4^. The other takes two `CharSequence` objects as arguments (a `CharSequence` can be a `String`, `StringBuilder`, or `StringBuffer`) and replaces all occurrences of the target sequence with the replacement sequence[^1^[2^[3^[4^. 
```java
String str = "Hello, World";
String replacedStr1 = str.replace('o', 'a');
String replacedStr2 = str.replace("World", "Java");
System.out.println(replacedStr1); // Outputs: Halla, Warld
System.out.println(replacedStr2); // Outputs: Hello, Java
```

Source: Conversation with Bing, 15/10/2023
(1) JAVA Object/String method overload - Stack Overflow. https://stackoverflow.com/questions/17669804/java-object-string-method-overload.
(2) Method Overloading in Java - GeeksforGeeks. https://www.geeksforgeeks.org/method-overloading-in-java/.
(3) Method Overloading in Java - Javatpoint. https://www.javatpoint.com/method-overloading-in-java.
(4) Confusion in method overloading using abstract class in java. https://stackoverflow.com/questions/11554290/confusion-in-method-overloading-using-abstract-class-in-java.


11. **startsWith(String prefix)** and **startsWith(String prefix, int toffset)**: These methods test if the string starts with the specified prefix¹²³⁴. The second version also takes an index to start the check from¹²³⁴.
```java
String str = "Hello, World";
boolean startsWith1 = str.startsWith("Hello");
boolean startsWith2 = str.startsWith("World", 7);
System.out.println(startsWith1); // Outputs: true
System.out.println(startsWith2); // Outputs: true
```

12. **endsWith(String suffix)**: This method tests if the string ends with the specified suffix¹²³⁴.
```java
String str = "Hello, World";
boolean endsWith = str.endsWith("World");
System.out.println(endsWith); // Outputs: true
```

13. **intern()**: This method returns a canonical representation for the string object¹²³[^4^. It follows that for any two strings `s` and `t`, `s.intern() == t.intern()` is `true` if and only if `s.equals(t)` is `true`[^1^[2^[3^[4^. 
```java
String s1 = new String("Hello");
String s2 = s1.intern();
System.out.println(s1 == s2); // Outputs: false
System.out.println(s1.intern() == s2.intern()); // Outputs: true
```

14. **valueOf(Object obj)**: This method returns the string representation of the Object argument[^1^[2^[3^[4^. 
```java
int number = 123;
String str = String.valueOf(number);
System.out.println(str); // Outputs: 123
```

15. **split(String regex)** and **split(String regex, int limit)**: These methods split this string around matches of the given regular expression[^1^[2^[3^[4^. The second version also takes a limit argument which controls the number of times the pattern is applied and therefore affects the length of the resulting array[^1^[2^[3^[4^. 
```java
String str = "Hello, World";
String[] words1 = str.split(", ");
String[] words2 = str.split(", ", 1);
System.out.println(Arrays.toString(words1)); // Outputs: [Hello, World]
System.out.println(Arrays.toString(words2)); // Outputs: [Hello]
```

Source: Conversation with Bing, 15/10/2023
(1) JAVA Object/String method overload - Stack Overflow. https://stackoverflow.com/questions/17669804/java-object-string-method-overload.
(2) Java String Methods with Examples - javatpoint. https://www.javatpoint.com/methods-of-string-class.
(3) Java String - javatpoint. https://www.javatpoint.com/java-string.
(4) Method Overloading in Java - Javatpoint. https://www.javatpoint.com/method-overloading-in-java.


16. **getBytes()**: This method encodes the `String` into a sequence of bytes using the platform's default charset, storing the result into a new byte array¹²³⁴.
```java
String str = "Hello, World";
byte[] bytes = str.getBytes();
System.out.println(Arrays.toString(bytes)); // Outputs: [72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100]
```

17. **equalsIgnoreCase(String anotherString)**: This method compares this `String` to another `String`, ignoring case considerations¹²³⁴.
```java
String str1 = "Hello, World";
String str2 = "hello, world";
boolean isEqual = str1.equalsIgnoreCase(str2);
System.out.println(isEqual); // Outputs: true
```

18. **format(String format, Object... args)** and **format(Locale l, String format, Object... args)**: These methods return a formatted string using the specified format string and arguments¹²³⁴.
```java
String str = String.format("Hello, %s", "World");
System.out.println(str); // Outputs: Hello, World
```

19. **join(CharSequence delimiter, CharSequence... elements)** and **join(CharSequence delimiter, Iterable<? extends CharSequence> elements)**: These methods concatenate the given elements with the specified delimiter between each element¹²³⁴.
```java
String str = String.join(", ", "Hello", "World");
System.out.println(str); // Outputs: Hello, World
```

20. **matches(String regex)**: This method tells whether or not this string matches the given regular expression¹²³⁴.
```java
String str = "Hello, World";
boolean matches = str.matches("Hello, .*");
System.out.println(matches); // Outputs: true
```

21. **toCharArray()**: This method converts this string to a new character array[^1^[2^[3^[4^. 
```java
String str = "Hello";
char[] chars = str.toCharArray();
System.out.println(Arrays.toString(chars)); // Outputs: [H, e, l, l, o]
```

These are just a few examples. The `String` class provides many more methods that you can use based on your requirements[^4^. You can find more details in the [official Java documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html).

Source: Conversation with Bing, 15/10/2023
(1) Java String Methods with Examples - javatpoint. https://www.javatpoint.com/methods-of-string-class.
(2) Java String (With Examples) - Programiz. https://www.programiz.com/java-programming/string.
(3) String Class Methods in Java with Examples - Sanfoundry. https://www.sanfoundry.com/java-program-create-strings-use-some-important-methods-string-class/.
(4) String Class in Java | Methods, Example - Scientech Easy. https://www.scientecheasy.com/2022/01/java-string-class.html/.
## Q. Difference between String and StringBuilder

In Java, `String` and `StringBuilder` are both used to work with strings, but they have some key differences:

1. **Immutability**: `String` is immutable, which means once a `String` object is created, it cannot be changed. On the other hand, `StringBuilder` is mutable, which means you can change its value¹²³.

2. **Performance**: When you perform repeated modifications to a string, `StringBuilder` is faster than `String`. This is because every time a `String` is modified, a new `String` object is created in the memory as `String` objects are immutable¹²³.

3. **Thread Safety**: `String` objects are thread-safe as they are immutable. `StringBuilder` is not thread-safe¹².

4. **Methods**: Both `String` and `StringBuilder` provide methods for string manipulation. However, methods like `append()`, `insert()`, `delete()`, and `reverse()` are available in `StringBuilder` but not in `String`, as these methods change the value of the object¹.

Here's an example to illustrate the difference:

```java
// String Example
String str = "Hello";
str += " World";
System.out.println(str); // Outputs: Hello World

// StringBuilder Example
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Outputs: Hello World
```

In the first example, a new string is created when we append " World" to "Hello". In the second example, " World" is appended to the existing StringBuilder object without creating a new object.

The choice between using `String` or `StringBuilder` depends on your specific requirements. For simple and small-scale operations where thread safety is required, `String` is a good choice. However, for large-scale or performance-critical operations involving numerous manipulations, `StringBuilder` is typically the better option⁴.

Source: Conversation with Bing, 15/10/2023
(1) String vs StringBuilder vs StringBuffer in Java - GeeksforGeeks. https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/.
(2) String vs StringBuilder vs StringBuffer in Java | Edureka. https://www.edureka.co/blog/string-vs-stringbuffer-vs-stringbuilder/.
(3) String vs StringBuffer vs StringBuilder | DigitalOcean. https://www.digitalocean.com/community/tutorials/string-vs-stringbuffer-vs-stringbuilder.
(4) Java String vs StringBuilder: Key Differences | Medium. https://medium.com/@AlexanderObregon/understanding-string-vs-stringbuilder-in-java-50448cbbf253.


## Q. when should we use String and when should we use StringBuilder or StringBuffer?

In Java, `String`, `StringBuilder`, and `StringBuffer` are all used to work with strings, but they each have their own use cases¹²³⁴⁵:

1. **Use String**: If a string is going to remain constant throughout the program, then use the `String` class object because a `String` object is immutable¹²³⁴⁵.

2. **Use StringBuilder**: If a string can change (for example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a `StringBuilder` is good enough¹²³⁴⁵. `StringBuilder` is not synchronized, so it is not thread-safe but faster than `StringBuffer`¹²³⁴⁵.

3. **Use StringBuffer**: If a string can change and will be accessed from multiple threads, use a `StringBuffer` because `StringBuffer` is synchronous, so you have thread-safety¹²³⁴⁵. If you don’t want thread-safety than you can also go with `StringBuilder` class as it is not synchronized¹².

Source: Conversation with Bing, 15/10/2023
(1) String vs StringBuilder vs StringBuffer in Java | Edureka. https://www.edureka.co/blog/string-vs-stringbuffer-vs-stringbuilder/.
(2) String vs StringBuilder vs StringBuffer in Java - GeeksforGeeks. https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/.
(3) String vs StringBuffer vs StringBuilder in java - W3schools. https://www.w3schools.blog/string-stringbuffer-stringbuilder-java.
(4) StringBuffer vs. StringBuilder: Understanding Java Strings. https://javabeat.net/stringbuffer-vs-stringbuilder/.
(5) String vs StringBuilder vs StringBuffer | by Asep Saputra ... - Medium. https://medium.com/javarevisited/string-vs-stringbuilder-vs-stringbuffer-d9ffed208777.

## Q. Difference between StringBuilder and StringBuffer

In Java, both `StringBuffer` and `StringBuilder` are used to create and manipulate strings. However, they have some key differences:

1. **Thread Safety**: `StringBuffer` is thread-safe and synchronized, which means it is safe to use in a multi-threaded environment¹²³⁴⁵. On the other hand, `StringBuilder` is not thread-safe¹²³⁴⁵.

2. **Performance**: `StringBuilder` is faster than `StringBuffer` because it does not need to synchronize its operations¹²⁴⁵. This makes `StringBuilder` more efficient when the string operations are being performed in a single-threaded environment¹²⁴⁵.

Here's an example to illustrate the difference:

```java
// StringBuffer Example
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World");
System.out.println(sbf); // Outputs: Hello World

// StringBuilder Example
StringBuilder sbr = new StringBuilder("Hello");
sbr.append(" World");
System.out.println(sbr); // Outputs: Hello World
```

In the first example, a new string is appended to the existing `StringBuffer` object without creating a new object. The same operation is performed in the second example using `StringBuilder`.

The choice between using `StringBuffer` or `StringBuilder` depends on your specific requirements. If your application needs to be run in a multi-threaded environment, then it is better to use `StringBuffer`. However, for single-threaded environments or performance-critical applications, `StringBuilder` is typically the better option¹²⁴⁵.

Source: Conversation with Bing, 15/10/2023
(1) Difference Between StringBuffer and StringBuilder in Java. https://www.geeksforgeeks.org/difference-between-stringbuffer-and-stringbuilder-in-java/.
(2) String vs StringBuilder vs StringBuffer in Java | Edureka. https://www.edureka.co/blog/string-vs-stringbuffer-vs-stringbuilder/.
(3) Difference between StringBuffer and StringBuilder - Scaler Topics. https://www.scaler.com/topics/java/difference-between-string-buffer-and-string-builder/.
(4) java - String, StringBuffer, and StringBuilder - Stack Overflow. https://stackoverflow.com/questions/2971315/string-stringbuffer-and-stringbuilder.
(5) java - StringBuilder vs StringBuffer - Stack Overflow. https://stackoverflow.com/questions/41608490/stringbuilder-vs-stringbuffer.


## Q. Are methods same in stringbuilder and stringbuffer classes?

Yes, the `StringBuilder` and `StringBuffer` classes in Java have the same set of methods because they both extend the same abstract class, `AbstractStringBuilder`⁴. Here are some of the common methods that they share¹²:

1. `append(String s)`: Appends the specified string to this character sequence¹².
2. `insert(int offset, String s)`: Inserts the specified string at the specified position¹².
3. `replace(int start, int end, String str)`: Replaces the characters in a substring of this sequence with characters in the specified String¹².
4. `delete(int start, int end)`: Deletes the string from the specified start index until the end index¹².
5. `reverse()`: Reverses the sequence¹².
6. `capacity()`: Returns the current capacity of the buffer¹².
7. `ensureCapacity(int minimumCapacity)`: Ensures that the capacity is at least equal to the given minimum¹².
8. `charAt(int index)`: Returns the character at the specified position¹².
9. `length()`: Returns the length (character count) of this sequence¹².
10. `substring(int beginIndex)`, `substring(int beginIndex, int endIndex)`: Returns a new string that contains a subsequence of characters currently contained in this sequence¹².

The main difference between these two classes is not in their methods but in their properties: `StringBuilder` is not synchronized (i.e., it is not thread-safe), while `StringBuffer` is synchronized (i.e., it is thread-safe)³. This difference can lead to significant performance differences when working in multi-threaded environments³. In single-threaded environments, or when thread safety is not a concern, using `StringBuilder` can be more efficient because it avoids the overhead of synchronization³. However, if thread safety is necessary, then `StringBuffer` should be used³.

Source: Conversation with Bing, 15/10/2023
(1) java - one method for different classes StringBuilder and StringBuffer .... https://stackoverflow.com/questions/48689962/one-method-for-different-classes-stringbuilder-and-stringbuffer.
(2) Java StringBuffer class- javatpoint. https://www.javatpoint.com/StringBuffer-class.
(3) String Buffer and String Builder Classes - Online Tutorials Library. https://www.tutorialspoint.com/java/java_string_buffer.htm.
(4) String vs StringBuilder vs StringBuffer in Java | Edureka. https://www.edureka.co/blog/string-vs-stringbuffer-vs-stringbuilder/.


## Code examples

The following examples are of StringBuilder, but we can use these methods in the same way for StringBuffer. Just replace StringBuilder with StringBuffer in the below code.

**1. append(String s):**
This method appends the specified string to the end of the current sequence. In the example, " World" is appended to "Hello", resulting in "Hello World".

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Outputs: Hello World
```

**2. insert(int offset, String s):**
This method inserts the specified string at the specified position (offset). In the example, ", Beautiful" is inserted at position 5 in "Hello World", resulting in "Hello, Beautiful World".

```java
StringBuilder sb = new StringBuilder("Hello World");
sb.insert(5, ", Beautiful");
System.out.println(sb.toString()); // Outputs: Hello, Beautiful World
```

**3. replace(int start, int end, String str):**
This method replaces the characters in a substring of this sequence with characters in the specified String. In the example, "Beautiful" is replaced with "Wonderful" in "Hello, Beautiful World", resulting in "Hello, Wonderful World".

```java
StringBuilder sb = new StringBuilder("Hello, Beautiful World");
sb.replace(7, 16, "Wonderful");
System.out.println(sb.toString()); // Outputs: Hello, Wonderful World
```

**4. delete(int start, int end):**
This method deletes the characters in a substring of this sequence. In the example, ", Wonderful" is deleted from "Hello, Wonderful World", resulting in "Hello, World".

```java
StringBuilder sb = new StringBuilder("Hello, Wonderful World");
sb.delete(7, 17);
System.out.println(sb.toString()); // Outputs: Hello, World
```

**5. reverse():**
This method reverses the sequence. In the example, "Hello, World" is reversed to "dlroW ,olleH".

```java
StringBuilder sb = new StringBuilder("Hello, World");
sb.reverse();
System.out.println(sb.toString()); // Outputs: dlroW ,olleH
```

**6. capacity():**
This method returns the current capacity of the buffer. The default capacity of a StringBuilder object is 16 if no initial capacity is specified.

```java
StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity()); // Default capacity is 16
```

**7. ensureCapacity(int minimumCapacity):**
This method ensures that the capacity is at least equal to the given minimum. If it is greater than the current capacity, a new internal array is allocated with greater capacity.

```java
StringBuilder sb = new StringBuilder();
sb.ensureCapacity(20);
System.out.println(sb.capacity()); // Capacity is now at least 20
```

**8. charAt(int index):**
This method returns the character at the specified position in this sequence.

```java
StringBuilder sb = new StringBuilder("Hello, World");
char ch = sb.charAt(0);
System.out.println(ch); // Outputs: H
```

**9. length():**
This method returns the length (character count) of this sequence.

```java
StringBuilder sb = new StringBuilder("Hello, World");
int len = sb.length();
System.out.println(len); // Outputs: 12
```

**10. substring(int beginIndex), substring(int beginIndex, int endIndex):**
These methods return a new string that contains a subsequence of characters currently contained in this sequence.

```java
StringBuilder sb = new StringBuilder("Hello, World");
String subStr1 = sb.substring(7);
String subStr2 = sb.substring(0, 5);
System.out.println(subStr1); // Outputs: World
System.out.println(subStr2); // Outputs: Hello
```

11. **setCharAt(int index, char ch)**: Sets the character at the specified index to `ch`¹².
```java
StringBuilder sb = new StringBuilder("Hello");
sb.setCharAt(1, 'a');
System.out.println(sb.toString()); // Outputs: Hallo
```

12. **setLength(int newLength)**: Sets the length of the character sequence¹². If `newLength` is less than the current length, the last characters are truncated. If `newLength` is greater than the current length, null characters are added at the end.
```java
StringBuilder sb = new StringBuilder("Hello");
sb.setLength(3);
System.out.println(sb.toString()); // Outputs: Hel
```

13. **trimToSize()**: Attempts to reduce storage used for the character sequence¹².
```java
StringBuilder sb = new StringBuilder(50);
sb.append("Hello");
sb.trimToSize();
System.out.println(sb.capacity()); // Outputs: 5
```

14. **substring(int start, int end)**: Returns a new string that contains a subsequence of characters currently contained in this sequence¹².
```java
StringBuilder sb = new StringBuilder("Hello, World");
String subStr = sb.substring(7, 12);
System.out.println(subStr); // Outputs: World
```

15. **indexOf(String str)**: Returns the index within this string of the first occurrence of the specified substring¹².
```java
StringBuilder sb = new StringBuilder("Hello, World");
int index = sb.indexOf("World");
System.out.println(index); // Outputs: 7
```

16. **lastIndexOf(String str)**: Returns the index within this string of the rightmost occurrence of the specified substring¹².
```java
StringBuilder sb = new StringBuilder("Hello, World, World");
int index = sb.lastIndexOf("World");
System.out.println(index); // Outputs: 13
```

These are just a few examples. There are other methods as well in these classes that you can use based on your requirements⁴. You can find more details in the [official Java documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html). Remember to choose the right method based on your specific needs and requirements.

Source: Conversation with Bing, 15/10/2023
(1) Java StringBuffer class- javatpoint. https://www.javatpoint.com/StringBuffer-class.
(2) String vs StringBuilder vs StringBuffer in Java - GeeksforGeeks. https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/.
(3) String Buffer and String Builder : Syntax, Uses & Differences. https://www.prepbytes.com/blog/java/string-buffer-and-string-builder/.
(4) String vs StringBuilder vs StringBuffer in Java - Stack Abuse. https://stackabuse.com/string-vs-stringbuilder-vs-stringbuffer-in-java/.
(5) String vs StringBuilder vs StringBuffer in Java | Edureka. https://www.edureka.co/blog/string-vs-stringbuffer-vs-stringbuilder/.

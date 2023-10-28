`CharSequence` is an interface in Java that represents a sequence of characters¹²³⁴. This interface provides uniform, read-only access to many different kinds of character sequences¹²³⁴. A `char` value represents a character in the Basic Multilingual Plane (BMP) or a surrogate¹²³⁴.

Here are some key points about `CharSequence`¹²³⁴:
- `CharSequence` is an interface, so it can't be instantiated directly; it needs an implementation to instantiate a variable⁴.
- Both mutable and immutable classes implement this interface⁴.
- Several classes in Java, such as `String`, `StringBuilder`, and `StringBuffer`, implement the `CharSequence` interface¹²³⁴.
- Any method which accepts a `CharSequence` can operate on all of these equally well¹.

Here's an example of how you might use `CharSequence`:

```java
CharSequence cs = "Hello, World!";
System.out.println(cs);
```

In this example, the `String` "Hello, World!" is being treated as a `CharSequence`. The variable `cs` can be used wherever a `CharSequence` is expected. This includes methods in various classes that accept a `CharSequence` as a parameter¹²³⁴.

Source: Conversation with Bing, 15/10/2023
(1) Exact difference between CharSequence and String in java. https://stackoverflow.com/questions/11323962/exact-difference-between-charsequence-and-string-in-java.
(2) CharSequence (Java Platform SE 8 ) - Oracle. https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html.
(3) CharSequence (Java SE 11 & JDK 11 ) - Oracle. https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/CharSequence.html.
(4) CharSequence vs. String in Java | Baeldung. https://www.baeldung.com/java-char-sequence-string.
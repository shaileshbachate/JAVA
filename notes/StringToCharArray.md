## Q. Why would someone want to convert string to chararray

Converting a string to a character array can be useful in several scenarios:

1. **String Manipulation**: In Java, strings are immutable, which means once a string is created, it cannot be changed. If you need to manipulate a string, like reversing it or changing the case of its characters, it's often easier to convert it to a character array.

2. **Character-by-Character Processing**: If you need to process a string character by character, converting it to a character array can make the process more straightforward. You can use a simple loop to iterate through the array.

3. **Algorithm Implementation**: Some algorithms, like those used in cryptography or text processing (e.g., palindrome checking), require working with individual characters of a string. In these cases, having a character array can be beneficial.

4. **Performance**: In some cases, working with character arrays can be faster than working with strings because of the overhead associated with string immutability.

Remember, the choice between using strings or character arrays depends on the specific requirements of your program and the operations you need to perform. It's always important to consider the trade-offs in terms of readability, performance, and code complexity.

In Java, you can convert a string to an array of characters using toCharArray() method of String class

```java
String str = "Hello World";
char[] ch = str.toCharArray();

for (char c : ch) {
    System.out.println(c);
}

String strFromCharArray = new String(ch);
System.out.println(strFromCharArray);
```

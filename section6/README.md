# Strings in Java
Strings are one of the most commonly used data types in Java, representing a sequence of characters. In Java, strings are immutable, meaning their values cannot be changed after they are created.
## Creating Strings
### Using String Literal
```java
String str="Hello, World! 😀";
```
###  Using the new Keyword
```java
String str=new String("Hello, World! 😀";
```
### Using 'StringBuilder' or 'StringBuffer'
```java
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("Hello");
stringBuilder.append(", ");
stringBuilder.append("World! 😀 ");
String str = stringBuilder.toString();
```
### String Pool
```java
public class StringPool {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2="Hello";
        String str3="hai";
        Sytsem.out.println(str1==str2);// true, because content of 'str1' and 'str2' is same thats why both referring to the same memory loaction.

        Sytsem.out.println(str1.hashCode());// eg. 151516
        Sytsem.out.println(str2.hashCode()); // eg. 151516 // both 'HashCode' values are same because content of the both strings are same.


        String obj1=new String("hello");
        String obj2=new String("hello");
        String Obj3=new String("hai");

        Sytsem.out.println(obj1.hashCode());//eg. 121212
        Sytsem.out.println(obj2.hashCode());//eg. 121212
        Sytsem.out.println(obj3.hashCode());//eg. 124566

        Sytsem.out.println(obj1==obj2);// false, even if HashCode values are same both objects are not stored same memory loaction.
        
    }

}
```
## String.intern() Method in Java
The `intern()` method in the `String` class is a useful tool for managing memory efficiently when working with strings in Java. It returns a canonical representation of the string object, which means that for any two strings `s` and `t`, `s.intern() == t.intern()` holds true if and only if `s.equals(t)`.
### Example 💡
```java
public class InternMethodDemo {

    public static void main(String[] args) {
        String hello = "Hello";
        String obj = new String("Hello").intern();
        System.out.println(hello==obj); // false

        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1==s2);
        String s3 = s2.intern();
        System.out.println(s1==s3); //true
    }

}
```
## String.concat() Method in Java
The `concat()` method in Java is used to concatenate one string to the end of another string. It returns a new string that represents the concatenation of the two strings.
```java
public class Concat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World!";
        
        String result = str1.concat(str2);
        System.out.println(result); // Output: Hello World!
    }
}
```
## Escape Sequence Characters and Unicode Character Values in Strings
- In programming, especially when working with strings, it's essential to understand escape sequence characters and Unicode character values. These elements allow developers to represent special characters or control sequences within a string.
- This repository provides a comprehensive reference guide for escape sequence characters and Unicode character values, along with examples demonstrating their usage in various programming languages.
###  Escape Sequence Characters
Escape sequence characters are special characters that are preceded by a backslash (\) in a string. They represent characters that are difficult or impossible to represent directly in code. Common escape sequence characters include :
- `\n` - Newline
- `\t` - Tab
- `\r` - Carriage return
- `\\` - Backslash
- `\"` - Double quote
- `\'` - Single quote
- `\b` - Backspace
- `\f` - Form feed
- `\v` - Vertical tab
- `\xhh` - ASCII character represented by hexadecimal value `hh`
- `\uhhhh` - Unicode character represented by hexadecimal value `hhhh`
- `\Uhhhhhhhh` - Unicode character represented by hexadecimal value `hhhhhhhh`
### Unicode Character Values
Unicode character values represent characters from various writing systems and symbol sets. These values are commonly used to include special characters or symbols in strings. Examples include :
- `\uXXXX` - Unicode character represented by hexadecimal value `XXXX`
- `\UXXXXXXXX` - Unicode character represented by hexadecimal value `XXXXXXXX`
#### Example 💡
```java
public class EscapeSeqDemo {

    public static void main(String[] args) {
        String name = "\"Madan\"";
        System.out.println(name);// Output : "Madan"

        String m =  "\u004D";
        System.out.println(m);// Output : M
        String unicodeName = "\u004Dadan\u0021";
        System.out.println(unicodeName);// Output : Madan!
    }

}
```
## String.length() Method in Java
The `length()` method in Java is a part of the `String` class. It returns the length of the string - the number of characters in the string.
### Parameters
This method does not take any parameters
### Return Value
The length() method returns an integer value representing the number of characters in the string.
#### Example 💡
```java
public class LengthMethodDemo {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String combined = str1+ " "+str2;

        int length1 = str1.length();
        int length2 = str2.length();
        int length3 = combined.length();

        int emptyLength = "".length(); 
        int length4 = "Hello".length();

        System.out.println(combined);// Output : 11
        System.out.println(emptyLength);// Output : 0
    }
}
```
### Usage
The length() method is commonly used to find the length of a string in Java. It is particularly useful when you need to validate input length, iterate over characters in a string, or perform other string manipulation tasks.
### Notes ✍️
- The length of a string is equal to the number of Unicode code units in the string.
- This method returns 0 if the string is empty ("").
### Conclusion 🎉
- The length() method in Java's String class is a simple yet powerful tool for determining the length of a string. With its straightforward syntax and predictable behavior, it provides developers with a convenient way to retrieve the number of characters in a string. Whether you're validating user input, iterating through characters, or performing string manipulation tasks, 'length()' is there to help you get the job done efficiently.
- So go ahead, leverage the length() method in your Java projects and let it simplify your string handling tasks! 🚀
## String.equals() Method in Java
The `equals()` method in Java is used to compare the contents of two strings. It returns `true` if the strings are equal, and `false` otherwise.
### Return Value
Return value of the `equals()` method is 'boolean'.
#### Example 💡 
```java
public class StringComparisonDemo {

    public static void main(String[] args) {

        String str1 = new String("Hey");
        String str2 = new String("Hello");
        String str3 = new String("Hey");

        boolean b1 = str1.equals(str2); // false
        boolean b2 = str1.equals(str3); // true

        boolean b3 = str1.equals("Hey"); // true
        boolean b4 = "Hey".equals(str1);// true
        boolean b5 = "Hey".equals("Hello");// false

        String str4 ="java";
        String str5 ="JAVA";
        boolean b6 = str4.equalsIgnoreCase(str5); // true

    }

}
```
### Important Notes ✍️
- The equals() method is case-sensitive.
- It's recommended to use equals() to compare strings rather than == operator, which compares references.
## String.compareTo() Method in Java
The `compareTo()` method in Java is used to compare two strings lexicographically. It returns an integer value that indicates whether the current string is less than, equal to, or greater than the specified string.
#### Return Value
- 0 if the strings are equal.
- A negative integer if the current string is lexicographically less than the specified string.
- A positive integer if the current string is lexicographically greater than the specified string.
#### Example 💡
```java
public class StringComparisonDemo {

    public static void main(String[] args) {

        int comparison1 = "java".compareTo("java"); // 0
        int comparison2 = "java".compareTo("python"); // -6
        int comparison3 = "python".compareTo("java"); // 6

    }

}
```
#### Usage 🚀
The compareTo() method is useful when you need to compare strings alphabetically or numerically in Java.
#### Conclusion 🎉
The compareTo() method in Java is a powerful tool for comparing strings lexicographically. By returning an integer value indicating whether one string is less than, equal to, or greater than another, it facilitates various sorting and comparison tasks in Java programming. Understanding how to use compareTo() effectively can greatly enhance your ability to manipulate and analyze strings in Java applications.
## String.charAt() Method in Java
The `String.charAt()` method in Java returns the character located at the specified index within the given string. The index value should be between 0 and `length() - 1`.
### Parameters
**index :** An integer representing the index of the character.
### Return Value
The method returns the character at the specified index within the string.
### Exceptions
**IndexOutOfBoundsException :** If the index argument is negative or not less than the length of the string.
#### Example 💡
```java
public class CharAtMethodDemo {

    public static void main(String[] args) {
        String java = "JAVA";
        char j = java.charAt(0); // 'J'
        char exception = java.charAt(4);// IndexOutOfBoundsException, because index value (4) is not with in the range of 'String.length()-1'.
    }

}
```
### Usage 🚀
- Use this method when you need to retrieve a specific character from a string by its index.
- It's handy when you want to iterate over each character in a string.
### Note ✍️
- Remember that index starts from 0. So, the first character of the string is at index 0.
### Conclusion 🎉
- The String.charAt() method in Java provides a simple and efficient way to access individual characters within a string by their index. By specifying the desired index, you can retrieve the character located at that position in the string.
- This method is particularly useful when you need to work with individual characters within a string, such as extracting specific characters or iterating through each character in the string.
- However, it's important to be mindful of the index values to avoid IndexOutOfBoundsException. The index should be within the range of 0 to length() - 1 for the string.
- Overall, String.charAt() is a fundamental method for string manipulation in Java, offering versatility and ease of use in various string processing tasks.
- Happy coding! 💻 🙂.
## isEmpty() Method in Java
The `isEmpty()` method in Java is used to check whether a string is empty or not. An empty string is defined as a string that has a length of zero.
### Return Value
- 'true' if the length of the string is 0, indicating that it is empty.
- 'false' otherwise
#### Example 💡
```java
public class EmptyCheckDemo {

    public static void main(String[] args) {
        String myString = "";
        boolean isEmpty = myString.isEmpty(); //true
        boolean isLengthZero = myString.length()==0;// true
        boolean isEqualEmpty = "".equals(myString); //true

        String nullString = null;
        boolean isnullEmpty = "".equals(nullString); //false
        // boolean isEmptyNull = nullString.length()==0; // NullPointerException
    }

}
```
### Usage  🚀
The isEmpty() method is commonly used in scenarios where you need to check if a string contains any meaningful content before performing further operations on it.
### Notes ✍️
- The 'isEmpty()' method is a part of the java.lang.String class and can be called on any string object.
- It's important to handle empty strings appropriately in your code to avoid unexpected behavior, especially when dealing with user input or data processing.
### Conclusion 🎉
- The isEmpty() method in Java provides a convenient way to check whether a string is empty or not. By simply calling this method on a string object, you can quickly determine if it contains any meaningful content or if it's just a blank string.
- This method is particularly useful in scenarios where you need to validate user input, process data, or control flow based on the presence of content in a string. By incorporating isEmpty() into your Java code, you can ensure that your applications handle empty strings gracefully and avoid unexpected behavior.
- Remember to use isEmpty() judiciously in your code, especially when dealing with user input or data processing, to enhance the reliability and robustness of your Java applications.
## toUpperCase() and toLowerCase() methods in Java
Java provides the `toUpperCase()` and `toLowerCase()` methods in the `String` class to convert the case of characters within a string. These methods are commonly used when you need to manipulate or normalize string data, such as converting text to uppercase for comparison or formatting purposes.
## toUpperCase()
The `toUpperCase()` method converts all the characters in a `String` to uppercase. Here's the syntax :
```java
String upperCaseString = originalString.toUpperCase();
```
#### Example 💡
```java
String str = "Hello, World!";
String upperCaseStr = str.toUpperCase();
System.out.println(upperCaseStr); // Output: HELLO, WORLD!
```
## toLowerCase()
The toLowerCase() method converts all the characters in a String to lowercase. Here's the syntax :
```java
String lowerCaseString = originalString.toLowerCase();
```
#### Example 💡
```java
String str = "Hello, World!";
String lowerCaseStr = str.toLowerCase();
System.out.println(lowerCaseStr); // Output: hello, world!
```
### Usage 🚀
These methods are useful for case-insensitive string comparisons, normalizing user input, and formatting string data for output. They are commonly used in various applications, including text processing, data validation, and user interfaces.
### Considerations  🤔
- **Locale :** It's important to note that the behavior of these methods can vary based on the locale settings of the system. In some languages, certain characters may have different uppercase or lowercase representations.
- **Immutability :** Both toUpperCase() and toLowerCase() methods return a new String object with the modified case. The original string remains unchanged.
### Conclusion 🎉
The toUpperCase() and toLowerCase() methods provide convenient ways to convert the case of characters within a string in Java. Understanding their usage and considerations can help you effectively manipulate string data in your Java applications.
## String.valueOf() Method in Java
The String.valueOf() method in Java is a static method provided by the String class, which converts different types of data, including primitive types and objects, into their string representations.
```java
public static String valueOf(Object obj)
```
### Parameters
- obj: The object whose string representation is to be returned.
### Return Value
- Returns the string representation of the specified object. If the specified object is 'null', it returns the string "null".
#### Example 💡
```java
public class ConvertStringDemo {

    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14;
        boolean boolValue = true;

        String str1 = String.valueOf(intValue);// "42"
        String str2 = String.valueOf(doubleValue);// "3.14"
        String str3 = String.valueOf(boolValue);// "true"
        String str4 = String.valueOf('M');// "M"

        int age = 30;
        String message = "My age is : "+ age; //" My age is : 42"
        String piValue = ""+ 3.14;// "3.14"
    }
}
```
### Usage 🚀
- Convert primitive data types to strings.
- Convert objects to strings by invoking their toString() methods.
- Concatenate strings with other data types easily.
### Note ✍️
- This method returns "null" for 'null' inputs to prevent 'NullPointerException'.
### Conclusion 🎉
The String.valueOf() method in Java is a versatile tool for converting various data types into their string representations. Its simplicity and flexibility make it a fundamental part of Java programming, allowing for easy manipulation and concatenation of strings with other data types. Whether you need to convert primitive types, objects, or handle null values gracefully, String.valueOf() provides a reliable solution. By understanding its syntax, parameters, and return value, you can leverage this method effectively in your Java projects.
## String.indexOf() Method in java
- The `indexOf()` method in Java is used to find the index of a specific character or substring within a given string. This method returns the index of the first occurrence of the specified character or substring within the string, or -1 if the character or substring is not found.
- The syntax for using the `indexOf()` method is:
```java
int indexOf(int ch)
int indexOf(int ch, int fromIndex)
int indexOf(String str)
int indexOf(String str, int fromIndex)
```
- 'ch' is the character to be searched.
- 'str' is the substring to be searched.
- 'fromIndex' is the index to start the search from.
### Parameters
The method returns the index of the first occurrence of the specified character or substring within the string, or -1 if the character or substring is not found.
#### Example 💡
```java
String str = "Hello, World!";
int index1 = str.indexOf('o'); // Returns 4
int index2 = str.indexOf('o', 5); // Returns 8
int index3 = str.indexOf("World"); // Returns 7
int index4 = str.indexOf("World", 8); // Returns -1
```
#### In this example :
- 'index1' returns 4 because the first occurrence of 'o' is at index 4.
- 'index2' returns 8 because the search starts from index 5, and the next occurrence of 'o' is at index 8.
- 'index3' returns 7 because the substring "World" starts at index 7.
- 'index4' returns -1 because the substring "World" is not found when starting the search from index 8.
### Note ✍️
- The 'indexOf()' method is case-sensitive.
- If you need a case-insensitive search, consider using 'toLowerCase()' or 'toUpperCase()' before invoking indexOf().
### Conclusion 🎉
- The 'indexOf()' method in Java is a powerful tool for searching for specific characters or substrings within a string. By understanding its syntax, parameters, and return value, you can efficiently locate the desired elements within your strings.
- Remember that 'indexOf()' is case-sensitive, so ensure that your search criteria match the case of the characters or substrings within the string. If case-insensitive searching is required, consider converting the string to lowercase or uppercase before using 'indexOf()'.
- With its versatility and ease of use, 'indexOf()' is a valuable method to have in your Java programming arsenal for string manipulation tasks.
## String.startsWith() and String.endsWith() Methods in Java
The 'startsWith()' and 'endsWith()' methods in Java are used to check whether a string begins or ends with a specific prefix or suffix, respectively. These methods are helpful in various scenarios where string manipulation is required.
### startsWith()
#### Syntax
```java
public boolean startsWith(String prefix)
```
### Parameters
- **'prefix' :** The prefix to check against the beginning of the string.
### Return Value
- 'true' if the string starts with the specified prefix; otherwise, 'false'.
#### Example 
```java
String str = "Hello, world!";
boolean startsWithHello = str.startsWith("Hello");
System.out.println(startsWithHello); // Output: true
```
### endsWith()
#### Syntax
```java
public boolean endsWith(String suffix)
```
### Parameters
- **'suffix' :** The suffix to check against the end of the string.
### Return Value
- 'true' if the string ends with the specified suffix; otherwise, false.
#### Example 
```java
String str = "Hello, world!";
boolean endsWithWorld = str.endsWith("world!");
System.out.println(endsWithWorld); // Output: true
```
### Use Cases
- **Validation :** Checking if a file name has a specific extension.
- **Parsing :** Determining if a line of text ends with a particular punctuation mark.
- **Filtering :** Filtering a list of strings based on prefixes or suffixes.
### Notes ✍️
- Both methods are case-sensitive.
- If the length of the prefix or suffix is greater than the length of the string, 'startsWith()' and 'endsWith()' will return 'false'.
- Both methods return true for an empty prefix or suffix, indicating that the string starts or ends with nothing.
- If either the prefix or suffix is 'null', these methods will throw a 'NullPointerException'.
## String.trim() Method in Java
The 'String.trim()' method in Java is used to remove leading and trailing whitespace from a string. Whitespace refers to any character that has no visible representation, such as spaces, tabs, and newline characters.
### Syntax
```java
public String trim()
```
### Parameters
- This method does not take any parameters.
### Return Value
- A new string with leading and trailing whitespace removed.
#### Example
```java
public class StringTrimDemo {

    public static void main(String[] args) {
        String java1 = " java ".trim(); //java
        String java2 = "java ".trim(); // java
        String java3 = "\n \t java \n \r ".trim();// java
        String java5 = " ja va ".trim();//ja va
        String java6 = " ja \n va ".trim();//ja
                                           //  va
        boolean isSame = "java".equals("java ".trim());//true
        boolean isSame = "java".equals("java ");// false

    }

}
```
### Conclusion 🎉
- The 'String.trim()' method in Java provides a convenient way to remove leading and trailing whitespace from a string. It is useful for cleaning up user input, parsing data, and manipulating strings in various applications.
- By utilizing 'trim()', developers can ensure that strings are properly formatted and free of unnecessary whitespace, improving the reliability and readability of their code.
- Remember to handle cases where the string may be null to avoid 'NullPointerExceptions', and be aware that 'trim()' creates a new string instance rather than modifying the original string.
- In summary, 'String.trim()' is a simple yet powerful method that contributes to the effectiveness and efficiency of string manipulation in Java programming.
## String.substring() Method in Java
The `String.substring()` method in Java is used to extract a substring from the given string. It returns a new string that is a substring of this string.
### Syntax
```java
public String substring(int beginIndex)
public String substring(int beginIndex, int endIndex)
```
### Parameters
- **beginIndex :** The beginning index, inclusive.
- **endIndex :** The ending index, exclusive.
### Return Value
A new string that is a substring of this string.
#### Examples
```java
public class SubStringDemo {

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String subString1 = originalString.substring(7); // "World"
        String subString2 = originalString.substring(0,5);// "Hello"
    }

}
```
### Notes ✍️
- The 'beginIndex' must be less than the 'endIndex'.
- If 'beginIndex' is equal to 'endIndex', the returned string is empty.
- If 'beginIndex' or 'endIndex' is negative or greater than the length of the string, it throws 'IndexOutOfBoundsException'.
### Conclusion 🎉
- The 'String.substring()' method in Java provides a convenient way to extract substrings from a given string based on specified indices. Whether you need to extract a substring starting from a particular index or within a range of indices, this method allows you to do so with ease.

- By understanding its syntax, parameters, and return value, you can effectively utilize this method in your Java programs. Remember to handle edge cases such as negative indices or out-of-bounds indices to ensure robustness in your code.

- With the examples provided, you should now have a clear understanding of how to use 'String.substring()' method in various scenarios, enabling you to manipulate strings effectively in your Java applications.
##  String.replace(), String.replaceAll(), and String.replaceFirst() Methods in Java
### String.replace()
The `replace()` method in Java `String` class replaces all occurrences of a specified character or sequence of characters with another character or sequence of characters.
### String.replaceAll()
The `replaceAll()` method in Java `String` class replaces each substring of this string that matches the given regular expression with the given replacement.
###  String.replaceFirst()
The `replaceFirst()` method in Java `String` class replaces the first substring of this string that matches the given regular expression with the given replacement.
#### Example 💡
```java
public class StringReplaceDemo {

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String replacedString = originalString.replace('o', '*');// "Hell*, W*rld!"
        String replacedString1 = originalString.replace("World","Universe");// "Hello, Universe!"
        String replacedString2 = originalString.replace("world","Universe");// Hello, World!"

        String originalString1 = "abababab";
        String replacedString3 = originalString1.replace("ab","X");// "XXXX"

        String originalString2 = "Java is fun!";
        String replacedString4 = originalString2.replaceAll("a|e|i|o|u", "*");// J*v* *s f*n!"

        String originalString3 = "apple orange apple banana apple";
        String replacedString5 = originalString3.replaceFirst("apple", "grape");// "grape orange apple banana apple"

    }

}
```
### Conclusion 🎉
- Use `replace()` when you want to replace all occurrences of a specific character or sequence.
- Use `replaceAll()` when you want to replace all occurrences based on a regular expression.
- Use `replaceFirst()` when you only want to replace the first occurrence based on a regular expression.
  
  These methods provide flexibility in manipulating strings according to specific requirements.
## String.split() Method in Java
The `split()` method in Java is a function provided by the `String` class to split a string into an array of substrings based on a delimiter. It's commonly used for parsing and manipulating textual data.
###  Syntax
```java
public String[] split(String regex)
```
- **regex :** The regular expression to use as a delimiter.
### Parameters
**regex :** The regular expression that defines where the string should be split.
### Return Value
An array of strings split from the original string based on the delimiter provided.
### Example 💡
```java
public class StringSplitDemo {

    public static void main(String[] args) {
        String fruits = "apple,orange,banana,grape";
        String[] fruitArray = fruits.split(",");
        for(int i=0; i<fruitArray; i++){
        System.out.println(i); /*Output : apple
                                          orange
                                          banana
                                          grape */                        
    }

}
```
In this example, the string `"apple,orange,banana,grape"` is split into parts using the comma `(,)` as the delimiter.
### Notes
- If the regex pattern is not found in the string, the resulting array will contain only one element, which is the original string.
- To split a string into individual characters, you can use an empty string as the regex: `str.split("")`.
### Conclusion
- The `split()` method in Java is a versatile tool for splitting strings into substrings based on a specified delimiter. Whether you're parsing CSV files, breaking down user input, or manipulating textual data, `split()` offers a convenient way to achieve your goals.

- By understanding its syntax, parameters, and return value, along with practical examples, you can leverage this method effectively in your Java applications.Remember to consider edge cases, such as handling empty strings or using appropriate regex patterns, to ensure robustness and accuracy in your implementations.
## String.join() Method in Java
The `String.join()` method in Java is used to join multiple strings into a single string. It's a convenient way to concatenate strings with a specified delimiter.
### Syntax
```java
public static String join(CharSequence delimiter, CharSequence... elements)
```
### Parameters
- **delimiter :** The delimiter to use for joining the strings.
- **elements :** The strings to be joined.
### Returns
A string consisting of the elements joined together with the specified delimiter.
### Example 💡
```java
public class StringJoinDemo {

    public static void main(String[] args) {
        String result = String.join(",", "Hello", "World", "Java"); // "Hello,World,Java"
        String result1 = String.join("", "Java is", "fun and", "powerful");// "Java isfun andpowerfull"
    }

}
```
### Notes ✍️
- If the delimiter is null, then `NullPointerException` is thrown.
- If the elements array is null, then `NullPointerException` is thrown.
- If any element is null, then "null" is added to the joined string.
- The String.join() method was introduced in Java 8.
### Conclusion 🎉
The `String.join()` method in Java provides a concise and efficient way to concatenate multiple strings with a specified delimiter. By using this method, you can avoid manually iterating over the elements and appending them together, which leads to cleaner and more readable code.

Remember to handle cases where the delimiter or elements array is null to prevent `NullPointerExceptions`. Additionally, keep in mind that if any element in the array is null, it will be represented as "null" in the joined string.

Overall, the `String.join()` method is a valuable addition to the Java language introduced in Java 8, simplifying string concatenation tasks and improving code maintainability.
## String.format() Method in Java
In Java, the `String.format()` method is used to format strings. It returns a formatted string using the specified format string and arguments. This method is useful for creating complex output strings with placeholders for variables.
### Syntax
```java
String formattedString = String.format(String format, Object... args);
```
**format :** A format string that specifies how the output string should be formatted. It may contain placeholders that will be replaced by the corresponding arguments.
**args :** Optional arguments that will replace the placeholders in the format string.
### Example 💡
```java
public class StringFormatDemo {

    public static void main(String[] args) {
        String message = "Hello, %s ! You have %d messages.";
        String msgForMadan = String.format(message, "Madan", 3); // "Hello, Madan ! You have 3 messages."
        String msgForSaanvi = String.format(message, "Saanvi", 6);// "Hello, Saanvi  ! You have 6 messages."

        String message1 = "The price is $%.2f";
        String price1 = String.format(message1, 19.99);
        String price2 = String.format(message1, 9.99);

    }
}
```
In this example, we used String.format() to create a formatted string with placeholders %s, %d, and %.2f for name, messages, and price, respectively.
### Format Specifiers
- **%s :** String
- **%d :** Integer
- **%f :** Float or double
- **%c :** Character
- **%b :** Boolean
- **%t :** Date/time
### Conclusion 🎉
The `String.format()` method in Java provides a powerful way to create formatted strings with placeholders. By using format specifiers in the format string, you can control the formatting of different types of data in the output string.
## System.out.printf() Method in Java
`System.out.printf()` is a method in Java used for formatted output. It allows you to print formatted strings to the standard output stream (`System.out`).
### Syntax
```java
public PrintStream printf(String format, Object... args)
```
### Parameters
**format :** This is a string that specifies the formatting of the output. It can contain format specifiers, which start with % and are followed by optional flags, width, precision, and conversion characters.
**args :** These are the arguments to be inserted into the format string. They correspond to the format specifiers in the format string.
### Return Value
This method returns a reference to the PrintStream object (System.out).
### Example 💡
```java
public class PrintfDemo {

    public static void main(String[] args) {

        System.out.printf("Name: %s, Age: %d%n", "John", 25); // "Name: John, Age:25"
        System.out.printf("Price: %.2f%n", 19.99); // "Price: 19.99"
        System.out.printf("Grade: %c%n", 'A');
        System.out.printf("Is Java fun ?: %b%n", true);
    }

}
```
### Notes ✍️
- The `printf()` method uses the same formatting conventions as the Formatter class.
- If the number of arguments does not match the number of format specifiers, an `IllegalFormatException` will be thrown.
### Conclusion 🎉
- The System.out.printf() method in Java provides a convenient way to format output strings. By using format specifiers within the format string, you can control the layout and appearance of the output. This method is particularly useful when you need to display data in a structured and visually appealing manner.
- By leveraging System.out.printf(), you can enhance the readability and professionalism of your Java applications' output. Whether you're printing simple text or complex data structures, this method offers the flexibility and precision needed to meet your formatting requirements.
## Mutable Strings in Java
Mutable Strings in Java refer to strings that can be modified after their creation. Unlike the traditional String class, which is immutable, mutable strings offer the flexibility to change their content without creating new objects.
### Introduction
Mutable strings are particularly useful in scenarios where frequent modifications to the string content are required, such as in performance-critical applications or when dealing with large datasets
In Java, the StringBuilder and StringBuffer classes provide mutable string functionality.
### StringBuilder
`StringBuilder` is a mutable sequence of characters. It is similar to StringBuffer, but differs in that it is not synchronized, making it faster for single-threaded operations.
### StringBuffer
`StringBuffer` is a thread-safe, mutable sequence of characters. It is similar to StringBuilder, but synchronized, making it safe for use in multi-threaded environments.
### Example 💡
```java
import java.io.CharArrayWriter;
import java.io.IOException;

public class StringMutableDemo {

    public static void main(String[] args) throws IOException {

        // Approach 1
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("World");
        stringBuilder.insert(0,"Hello "); // "Hello World"
        stringBuilder.deleteCharAt(4); //" Hell World"
        stringBuilder.insert(4,'o'); // "Hello World"
        stringBuilder.setLength(5); //"Hello"
        stringBuilder.reverse(); //"olleh"
        String str = stringBuilder.toString();

        // Approach 2
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("World");
        stringBuffer.insert(0,"Hello ");
        stringBuffer.deleteCharAt(4);
        stringBuffer.insert(4,'o');
        stringBuffer.setLength(5);
        stringBuffer.reverse();
        String str1 = stringBuffer.toString();

        // Approach 3

        CharArrayWriter cw = new CharArrayWriter();
        cw.write("Hello");
        cw.write(" World");
        String string3 = cw.toString();

    }

}
```
### Conclusion 🎉
Mutable strings provided by `StringBuilder` and `StringBuffer` classes offer efficient ways to manipulate string data in Java applications. Choose `StringBuilder` for single-threaded scenarios where synchronization is not needed, and `StringBuffer` for multi-threaded environments requiring thread safety.

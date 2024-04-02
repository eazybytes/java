# Accept input using BufferedReader and Scanner 
## Understanding System.out.println()
In Java, `System.out.println()` is a method used to print data to the standard output stream, typically the console. It belongs to the `java.io.PrintStream` class and is widely used for debugging, logging, and displaying information to the user.
### Syntax
The syntax of `System.out.println()` is as follows
```java
System.out.println(data);
```
Here, data can be of any primitive `data` type or an object. Multiple parameters can also be passed, which are automatically converted to strings and then printed.
#### Example
```java
public class HelloWorld {
    public static void main(String[] args) {
        int number = 10;
        String message = "Hello, world!";
        
        // Printing integer variable
        System.out.println("The number is: " + number);
        
        // Printing string variable
        System.out.println(message);
        
        // Printing multiple variables
        System.out.println("Number: " + number + ", Message: " + message);
    }
}
```
```java
The number is: 10
Hello, world!
Number: 10, Message: Hello, world!
```
#### Key Points
- `System.out.println()` automatically adds a newline character after printing the data.
- It can be used with any primitive data type or object.
- The method is overloaded to handle different types of parameters.
- It's commonly used for debugging purposes to print variable values and messages.
### Conclusion
Understanding `System.out.println()` is fundamental to Java programming. It's a versatile method for printing data to the console and is essential for debugging and communicating with the user.
## System.in.read()
`System.in.read()` is a method in Java that reads a single byte of data from the standard input stream (`System.in`). It primarily reads bytes of data, making it suitable for handling low-level input operations. This method can be useful in scenarios where more sophisticated input handling, such as reading strings or other data types, is not required.
### Syntax
```java
public static int read() throws IOException
```
#### Example
```java
package com.eazybytes.input;

import java.io.IOException;

public class JavaBasicInputDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a value...");
        int num = System.in.read();
        System.out.println("The user entered a value: "+ num); // It will display the ASCII value of entered number
    }

}
```
### Return Value
- Returns the next byte of data from the input stream as an integer in the range 0 to 255. If the end of the stream has been reached, the value -1 is returned.
### Exceptions
- IOException - If an I/O error occurs.
### Notes
- This method reads only one byte at a time, making it suitable for handling raw byte input. For reading characters or strings, consider using higher-level input operations provided by classes like `Scanner` or `BufferedReader`.
- Since `System.in.read()` reads bytes, it may not handle multibyte characters correctly in all cases, especially when dealing with character encodings beyond the ASCII range.
- Always wrap the call to `System.in.read()` within a try-catch block to handle any potential I/O errors.
## BufferedReader
BufferedReader is a class in Java that reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
#### Example
```java
package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Please enter a value...");
        String input = bf.readLine();
        System.out.println("The user entered a value: "+ input);
        bf.close();
    }

}
```
#### Example for identify even and odd numbers
```java
package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Please enter a value...");
        String input = bf.readLine();
       // System.out.println("The user entered a value: "+ input);
       int number = Integer.parseInt(input);
       if(number % 2 == 0){
           System.out.println("You have entered even number");
       }else{
           System.out.println("You have entered odd number");
       }   
        bf.close();
    }

}
```
## Scanner 
## The `Scanner` class in Java is used to parse primitive types and strings from the standard input.
#### Example
```java
package com.eazybytes.input;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Hello "+ name+ " , you are "+ age+" years old.");
        sc.close();
    }

}
```
## Java Logging
Logging is an essential aspect of software development, providing insight into the behavior of applications during runtime. In Java, the `java.util.logging` package offers a straightforward logging solution that comes bundled with the JDK.
### Features
- Logging configuration
- Log levels (INFO, WARNING, SEVERE)
- Writing log messages to console and file
#### Example
```java
package com.eazybytes.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {

    private static Logger logger = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.SEVERE);
        logger.info("This is info level logging");
        logger.log(Level.WARNING, "This is warning level logging");
        logger.severe("This is severe level logging");
        System.out.println("Hello using System.out.println");
    }

}
```
### Usage
- The `Logger` class is used to log messages in your Java code.
- Log messages can be categorized into different levels such as INFO, WARNING, and SEVERE.
- Use appropriate log levels to convey the importance of log messages.
- Log messages can be directed to different destinations such as console, file, or custom handlers.
### Conclusion
- Logging plays a crucial role in understanding the behavior of Java applications during runtime. By integrating logging into your projects, you gain valuable insights into the execution flow, identify issues, and monitor application health.

- This Java logging example demonstrates the fundamental concepts of logging, including configuring log levels, directing log output to different destinations, and utilizing the `java.util.logging` package effectively.

- With the knowledge gained from this example, you can enhance the robustness and maintainability of your Java applications by implementing logging practices tailored to your specific use cases.

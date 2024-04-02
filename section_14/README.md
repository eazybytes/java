# Exception handling using try, catch and finally
In Java, an exception is an event that disrupts the normal flow of a program's instructions during execution. When an exceptional condition occurs, the Java runtime creates an exception object, which contains information about the error, such as its type and the state of the program when the error occurred. This exception object is then "thrown" from the point in the code where the error occurred, and the runtime searches for an exception handler that can handle it.

There are two main types of exceptions in Java: checked exceptions and unchecked exceptions. Checked exceptions are exceptions that must be either caught or declared to be thrown by the method in which they may occur. Unchecked exceptions, on the other hand, are exceptions that do not need to be explicitly caught or declared, and they typically indicate programming errors or other exceptional conditions that are beyond the control of the program.

Java provides a robust exception handling mechanism through the use of try-catch blocks, where code that may throw exceptions is enclosed in a try block, and any exceptions that are thrown are caught and handled by catch blocks. Additionally, Java allows for the use of finally blocks to execute cleanup code regardless of whether an exception is thrown or not. This combination of try, catch, and finally blocks provides a powerful mechanism for managing exceptional conditions in Java programs.

## Exception Hierarchy 
Throwable:

- **Error :** Represents serious problems that are typically beyond the control of the application, such as OutOfMemoryError or StackOverflowError. Usually, it is not appropriate for applications to catch or handle Error instances.
- **Exception :** Represents exceptional conditions that a program should catch and handle. This is further divided into:
- **Checked Exceptions (Compiletime Exceptions) :** These are exceptions that must be either caught or declared in the method's throws clause. They are subclasses of Exception but not of RuntimeException.
- **Unchecked Exceptions (RuntimeExceptions) :** These are exceptions that don't need to be caught or declared. They typically represent programming errors or other conditions that are beyond the control of the program. They are subclasses of RuntimeException.
### Checked Exceptions:

- **IOException :** Represents an error occurred during I/O operations.
- **FileNotFoundException :** Indicates that a file could not be found.
- **EOFException :** Indicates that the end of a file or stream has been reached unexpectedly.
- **SQLException :** Indicates an error occurred while accessing a database.
- **ClassNotFoundException :** Indicates that a class could not be found during runtime.
And many more...
### Unchecked Exceptions (RuntimeExceptions):

- **ArithmeticException :** Indicates that an arithmetic operation has failed.
- **NullPointerException :** Indicates an attempt to access or invoke a method on a null object.
- **ArrayIndexOutOfBoundsException :** Indicates that an array has been accessed with an illegal index.
- **IllegalArgumentException :** Indicates that a method has been passed an illegal or inappropriate argument.
- **IllegalStateException :** Indicates that the application is in an inappropriate state for the requested operation.
- **ClassCastException :** Indicates an invalid cast operation.
And many more...
### Example with try, catch block
```java
package com.eazybytes.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
             scanner = new Scanner(System.in);
            System.out.println("Enter a number....");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        }
    }
}
```
### ArrayIndexOutofBoundsException 
`ArrayIndexOutOfBoundsException` is a runtime exception in Java that occurs when you try to access an index that is outside the bounds of an array. For example, if you have an array with 5 elements and you try to access the 6th element, it will throw `ArrayIndexOutOfBoundsException`.
```java
package com.eazybytes.exception;

import java.util.logging.Logger;

public class ArrayIndexOutofBoundsExceptionDemo {

    private static Logger logger = Logger.getLogger(
            ArrayIndexOutofBoundsExceptionDemo.class.getName());

    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[5]);
        } catch (Exception ex) {
            logger.severe("Invalid Array index. Please try again with a valid index number");
        }

    }
}
```
### With Multipple catch blocks
```java
package com.eazybytes.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.Logger;

public class MultipleCatchDemo {

    private static Logger logger = Logger.getLogger(
            MultipleCatchDemo.class.getName());

    public static void main(String[] args) {
        String input = null;
        try {
                input = "Madan";
                input = input.toUpperCase();
                logger.info(input);
                input = input.substring(1,10);
            logger.info(input);
        } catch (NullPointerException ex) {
            logger.severe("An null pointer exception occurred. Please check your data");
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException  ex) {
            logger.severe("IndexOutOfBoundsException exception occurred. Please check your input data");
        } catch (Exception ex) {
            logger.severe("An exception occurred. Please check your program");
        }
    }
}
```
### finally block
In Java, the `finally` block is used to define a block of code that will be executed after a `try` block has completed execution, whether an exception is thrown or not. This block ensures that certain cleanup or finalization tasks are performed, such as closing resources like files or database connections.
### Syntax
```java
try {
    // Code that may throw an exception
} catch (Exception e) {
    // Exception handling code
} finally {
    // Code to be executed regardless of whether an exception is thrown or not
}
```
- The `try` block contains the code that may throw an exception.
- The `catch` block is optional and is used to handle exceptions.
- The `finally` block contains the code that will be executed regardless of whether an exception occurs or not.
#### Example
```java
package com.eazybytes.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
             scanner = new Scanner(System.in);
            System.out.println("Enter a number....");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        }
        finally {
            System.out.println("finally block is being executed");
            if(scanner != null) {
                scanner.close();
            }
        }

    }

}
```
### Key Points
- The `finally` block is always executed, even if an exception is thrown.
- If an exception is thrown and caught, the `finally` block is executed after the `catch` block.
- If no exception is thrown, the `finally` block is still executed after the `try` block.
- The `finally` block is often used to perform cleanup tasks, such as closing resources opened in the `try` block.
### Best Practices
- **Resource Management :** Use the `finally` block to ensure that resources like files, database connections, or network connections are properly closed, regardless of whether an exception occurs.
- **Error Cleanup :** Perform any necessary cleanup operations in the `finally` block to leave the program or system in a consistent state, even in the event of an error.
- **Avoid Logic :** Keep the `finally` block free from complex logic to ensure that it executes quickly and reliably. Complex logic in the `finally` block can make code harder to understand and maintain.
### Try-With-Resources
Try-With-Resources is a feature introduced in Java 7 that simplifies resource management by automatically closing resources that are opened within the try block. It ensures that resources are closed properly without the need for explicit finally blocks.
#### Example
```java
package com.eazybytes.exception;

import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number....");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch(Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        }
    }

}
```
### Advantges
**Automatic Resource Management :** With try-with-resources, resources are automatically closed after the try block, ensuring proper cleanup without the need for explicit finally blocks. This reduces the chance of resource leaks and simplifies code maintenance.

**Concise and Readable Code :** By eliminating the need for boilerplate code to close resources in finally blocks, try-with-resources leads to cleaner and more readable code. Developers can focus on the core logic of the program without getting distracted by resource management concerns.

**Improved Exception Handling :** Any exceptions thrown during the execution of the try block, as well as any exceptions thrown during resource closing, are properly handled. This simplifies error handling and makes code more robust.
## Try-with-Resources
Try-with-resources is a feature introduced in Java 7 that simplifies resource management by automatically closing resources at the end of their usage. This feature can significantly reduce the boilerplate code required for managing resources such as files, database connections, and network connections.
### How to Use Try-with-Resources

Using try-with-resources is straightforward. You declare the resources within the parentheses of the try statement. The resources must implement the `AutoCloseable` interface. Java automatically closes the resources at the end of the try block, whether an exception is thrown or not.

Here's the basic syntax:

```java
try (ResourceType1 resource1 = new ResourceType1();
     ResourceType2 resource2 = new ResourceType2();
     // Add more resources as needed
) {
    // Code that uses the resources
} catch (Exception e) {
    // Exception handling
}
```
Replace `ResourceType1`, `ResourceType2` etc., with the actual types of resources you want to manage.
#### Example
```java
package com.eazybytes.exception;

import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number....");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch(Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        }
    }

}
```
### Benefits of Try-with-Resources
- Automatic Resource Management: Resources are automatically closed at the end of the try block, reducing the risk of resource leaks.
- Concise and Readable: Try-with-resources reduces boilerplate code, making your code cleaner and easier to understand.
- Exception Handling: Exceptions that occur during resource management are properly handled without the need for explicit finally blocks.
### Conclusion
Try-with-resources is a powerful feature in Java for managing resources efficiently and safely. By using this feature, you can simplify your code and improve its robustness by ensuring that resources are properly closed after use.
## throws Keyword
The `throws` keyword in Java is used in method declarations to indicate that the method may throw one or more specific exceptions during its execution. When a method uses `throws`, it essentially delegates the responsibility of handling the exception to the caller of the method.
### Syntax
```java
return_type method_name(parameters) throws exception_type1, exception_type2, ...
```
#### Example
```java
package com.eazybytes.exception;

public class Division {

    public double divide (String num1, String num2) throws
            NumberFormatException, ArithmeticException {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1/n2;
    }

}

package com.eazybytes.exception;

public class ThrowsDemo {

    public static void main(String[] args) {
        Division division = new Division();
        try{
            double ouput = division.divide("4", "2");
            System.out.println(ouput);
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Invalid data provided. Please provide valid numbers and try again..");
        }
    }

}
```
### Key Points
- The `throws` keyword is used in method declarations.
- It specifies the exceptions that a method might throw during its execution.
- The caller of the method must handle the declared exceptions using try-catch blocks or propagate them using the throws clause.
## throw Keyword
In Java, the `throw` keyword is used to explicitly throw an exception. This means that when a certain condition occurs in your program, you can use the `throw` keyword to create and throw an exception manually.
### Syntax
The syntax for using the `throw` keyword is as follows:
```java
throw throwableObject;
```
Here, `throwableObject` is the exception object that you want to throw.
#### Example
```java
package com.eazybytes.exception;

import java.util.Scanner;

public class ThrowDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numerator value");
        String num1 = scanner.next();
        System.out.println("Please enter the denominator value");
        String num2 = scanner.next();
        Division division = new Division();
        if(num2.equals("0")) {
            throw new ArithmeticException("Division by zero");
        }
        double output = division.divide(num1, num2);
        System.out.println(output);
    }

}

package com.eazybytes.exception;

public class Division {

    public double divide (String num1, String num2) throws
            NumberFormatException, ArithmeticException {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1/n2;
    }

}
```
### When to Use
- Use the `throw` keyword when you encounter an exceptional condition in your program that you want to handle.
- It is commonly used within methods or constructors to signal that something unexpected has occurred.
### Conclusion
The `throw` keyword in Java provides a way to manually throw exceptions in your code, allowing you to handle exceptional conditions gracefully. It is an essential part of Java's exception handling mechanism.
## Exception Propagation
Exception propagation is a mechanism in Java where an exception that is not caught in a method is automatically propagated to the calling method. This process continues until the exception is caught or until it reaches the top of the call stack.
###  How Exception Propagation Works
1. **Exception Occurrence**: An exception occurs within a method.
2. **Uncaught Exception**: If the exception is not caught within the method, it is automatically propagated to the calling method.
3. **Propagation Continues**: The process of propagating the exception continues until it is either caught or it reaches the top of the call stack.
4. **Handling the Exception**: If the exception is caught at any point during propagation, it can be handled using try-catch blocks or it can be propagated further up the call stack.
#### Example

```java
public class ExceptionPropagationExample {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main method: " + e);
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        // Simulating an exception
        int result = 10 / 0;
    }
}
```
In this example, an exception occurs in `method3()` due to division by zero. Since the exception is not caught within `method3()`, it is propagated to `method2()`, then to `method1()`, and finally caught in the `main` method.
### Best Practices
- Catch Exceptions at the Appropriate Level: Catch exceptions at a level where you can handle them effectively.
- Use try-catch Blocks Judiciously: Use try-catch blocks only where necessary to maintain code readability and to handle exceptions appropriately.
- Log Exceptions: Always log exceptions or at least handle them gracefully to provide useful information for debugging and troubleshooting.
### Conclusion
Understanding exception propagation is essential for writing robust and reliable Java applications. By knowing how exceptions propagate through method calls, you can effectively handle errors and ensure the stability of your code.
## Nested Try Block
In Java, exception handling is accomplished using try-catch blocks. A nested try block is a try block inside another try block. This allows for more granular handling of exceptions and enables developers to handle exceptions at different levels of code execution.
### Usage
Nested try blocks are particularly useful when dealing with complex code structures where different parts of the code may throw different types of exceptions. By nesting try blocks, you can handle exceptions more precisely and maintain the flow of your program.
### Example
```java
public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5]; // This line will throw an ArrayIndexOutOfBoundsException
            try {
                int quotient = 10 / 0; // This line will throw an ArithmeticException
            } catch (ArithmeticException ex) {
                System.out.println("ArithmeticException caught: " + ex.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + ex.getMessage());
        }
    }
}
```
In this example, we have an outer try block that contains an array access statement, which may throw an `ArrayIndexOutOfBoundsException`. Inside the outer try block, we have a nested try block that contains a division operation, which may throw an `ArithmeticException`. By using nested try blocks, we can handle these exceptions separately and provide specific error messages or take appropriate actions based on the type of exception thrown.
### Conclusion
Nested try blocks are a powerful feature of Java's exception handling mechanism that allows developers to handle exceptions at different levels of code execution. When used judiciously, nested try blocks can make your code more robust and maintainable by providing fine-grained control over exception handling.
## Custom Checked Exceptions
In Java, exceptions play a crucial role in handling errors and abnormal conditions that may occur during program execution. While Java provides a wide range of built-in exceptions, sometimes it's necessary to create custom exceptions to handle specific scenarios unique to your application.
Custom exceptions allow you to define your own exception types tailored to the requirements of your application domain. Checked exceptions, in particular, are those that are checked at compile-time, ensuring that they are either caught or declared to be thrown by the method in which they may occur.
#### Example
```java
package com.eazybytes.exception;

import com.eazybytes.exception.custom.InvalidAgeException;

import java.util.Scanner;

public class AcceptAgeDetails {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = scanner.nextInt();
        if(age<0 || age>100) {
            throw new InvalidAgeException("Invalid age details entered. Please enter a age between 0-100");
        }
        System.out.println("Your age is : "+age);
    }

}

package com.eazybytes.exception.custom;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }

}
```
## Understanding final, finally, and finalize
### final
The `final` keyword in Java is used to declare constants, prevent method overriding, and restrict subclassing. Here's a brief overview of its usage:
 - **Constant Declaration:** When a variable is declared with `final`, its value cannot be changed once initialized.
  ```java
  final int MAX_VALUE = 100;
```
- **Method Declaration :** When a method is declared as final, it cannot be overridden by subclasses.

```java
public final void display() {
    // Method implementation
}
```
- **Class Declaration :** When a class is declared as final, it cannot be subclassed.

```java
public final class MyClass {
    // Class implementation
}
```
### finally
The `finally` block in Java is used in exception handling to execute code that must be run regardless of whether an exception is thrown or not. It is usually placed after the `try` block and/or `catch` block. Here's how it works:
```java
try {
    // Code that may throw an exception
} catch (Exception e) {
    // Exception handling
} finally {
    // Code that always executes, irrespective of whether an exception occurred or not
}
```
The `finally` block is often used for releasing resources like closing files or database connections, ensuring they are properly cleaned up.
### finalize
The `finalize()` method in Java is called by the garbage collector before an object is reclaimed. It's used for performing cleanup operations on an object before it is garbage collected. However, it's important to note that `finalize()` method has been deprecated in Java 9 and may be removed in future versions. It's generally not recommended to rely on `finalize()` for resource cleanup. Instead, developers should use explicit resource management techniques such as try-with-resources or implement AutoCloseable interface for resource cleanup.
#### Example
```java
public class MyClass {
    // Class implementation

    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup operations
        } finally {
            super.finalize();
        }
    }
}
```
### Conclusion
Understanding the distinctions between `final`, `finally`, and `finalize` is crucial for writing robust and maintainable Java code. Proper usage of these constructs can lead to better resource management, exception handling, and class design.

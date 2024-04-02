# Control Flow Statements in Java
Control flow statements in Java are used to control the execution flow of a program. They allow you to make decisions, execute code repeatedly, and branch execution based on conditions. Java provides several types of control flow statements, including:
## If-else Statements 
If-else statements are fundamental to programming as they allow you to make decisions based on certain conditions.
### Example  💡
```java
public class FindNumber {
    public static void main(String[] args) {
        int num = 10;
        
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is non-positive");
        }
    }
}
```
## if, else-if, else
### Example  💡
```java
public class FindTheDay {

    public static void main(String[] args) {
        String whatIsToday = "Monday";
      // Approach 1

        if(whatIsToday.equals("Monday")) {
            System.out.println("It is weekday");
        } else if (whatIsToday.equals("Tuesday")) {
            System.out.println("It is weekday");
        } else if (whatIsToday.equals("Wednesday")) {
            System.out.println("It is weekday");
        } else if (whatIsToday.equals("Thursday")) {
            System.out.println("It is weekday");
        } else if (whatIsToday.equals("Friday")) {
            System.out.println("It is weekday");
        } else if (whatIsToday.equals("Saturday")) {
            System.out.println("It is weekend");
        } else if (whatIsToday.equals("Sunday")) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid input. Please check the same");
        }

      //Approach 2

        if(whatIsToday.equals("Monday") || whatIsToday.equals("Tuesday")
         || whatIsToday.equals("Wednesday") || whatIsToday.equals("Thursday")
         || whatIsToday.equals("Friday")) {
            System.out.println("It is weekday");
        } else if (whatIsToday.equals("Saturday") || whatIsToday.equals("Sunday")) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid input. Please check the same");
        }

    }

}
```
## Nested If-else
```java
public class MessageForDay {

    public static void main(String[] args) {

        String dayOfWeek = "Wednesday";

        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println("Hooray, it's the weekend!");
            if (dayOfWeek.equals("Saturday")) {
                System.out.println("Time for a relaxing day or maybe some outdoor activities!");
            } else {
                System.out.println("Lazy Sunday vibes perfect for a cozy day indoors.");
            }
        } else {
            System.out.println("It's a weekday. Time to work or attend classes.");
            if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")
                    || dayOfWeek.equals("Friday")) {
                System.out.println("Midweek hustle! Keep going, the weekend is approaching.");
            } else {
                System.out.println("Monday blues? Grab some coffee and power through the day!");
            }
        }

    }

}
```
##  Ternary Operator 
The ternary operator is a concise way of writing if-else statements in Java. It's also known as the conditional operator. It's a one-liner syntax that evaluates a condition and returns one of two values, depending on whether the condition is true or false.
### Example  💡
```java
public class TernaryOperator {

    public static void main(String[] args) {
        int x = 10;
        int y;
       
        y = x > 5 ? 20 : 30;
        System.out.println(y);
        sum(x, x > 5 ? 20 : 30 );
    }

    public static void sum (int x, int y) {
        System.out.println(x+y);
    }
}
```
### Advantages  🚀
- **Concise syntax :** It reduces code length compared to if-else statements, making code more readable and easier to maintain.
- **Functional programming :** It allows for functional programming-style expressions, especially when used with lambda expressions.
### Limitations  🚫
- **Readability :** Overuse or complex nesting of ternary operators can reduce code readability.
- **Limited to simple conditions :** Ternary operators are best suited for simple conditions. Complex conditions may be difficult to read or understand when expressed using the ternary operator.
### Conclusion  🎉
The ternary operator in Java provides a concise and elegant way to express conditional statements. When used appropriately, it can improve code readability and maintainability. However, it's essential to use it judiciously and avoid overcomplicating expressions.
## Switch-Case Statements
Switch-case statements in Java provide a convenient way to execute different blocks of code based on the value of a variable or expression. They offer a cleaner alternative to multiple `if-else` statements when dealing with multiple possible conditions.
### Example  💡
```java
public class SwitchCaseDemo {

    public static void main(String[] args) {

        String fruitName = "Banana";

        switch (fruitName) {

            case "Banana":
            case "Apple":
                System.out.println("$ 1.0 charged");
                break;
            case "Grapes":
                System.out.println("$ 2.0 charged");
                break;
            case "Pineapple":
                System.out.println("$ 2.5 charged");
                break;
            case "Mango":
                System.out.println("$ 3.0 charged");
                break;
            default:
                System.out.println("Pick a valid fruit");
                break;
                                                               // Output : $ 1.0 charged
        }

    }

}
```
- **switch :** Begins the switch statement and evaluates the expression.
- **case value :** Specifies a value to compare the expression against.
- **break :** Terminates the switch block. Without a break statement, execution will continue to the next case.
- **default :** Executes if the expression doesn't match any of the cases. It's optional but recommended for handling unexpected values.
### Key Points 🚀
- **Expression :** The variable or expression whose value is being compared against different cases. It must evaluate to a primitive type (such as int, char, or enum) or String (Java 7 and later).
- **Values :** Each case specifies a value to compare the expression against. These values must be constant expressions.
- **Execution Flow :** When a match is found, the corresponding code block executes. If there's no break, execution will continue to the next case. The default case, if present, is executed if no matches are found.
- **Break Statement :** Each case block should end with a break statement to prevent fall-through to subsequent cases.
- **Default Case :** It's good practice to include a default case to handle unexpected values gracefully.
##  Switch Expression
A switch expression is a control flow statement that evaluates an expression and selects one of several code blocks to execute, depending on the value of the expression. It's an enhanced version of the traditional switch statement found in many programming languages.
#### Example  💡
```java
public class SwitchExpressionDemo {

    public static void main(String[] args) {
        String fruitName = "Banana";
        switch (fruitName) {
            case "Banana", "Apple" -> System.out.println("$ 1.0 charged");
            case "Grapes" -> System.out.println("$ 2.0 charged");
            case "Pineapple" -> System.out.println("$ 2.5 charged");
            case "Mango" -> System.out.println("$ 3.0 charged");
            default -> System.out.println("Pick a valid fruit");
        }

        String output = switch (fruitName) {
            case "Banana", "Apple" -> "$ 1.0 charged";
            case "Grapes" -> "$ 2.0 charged";
            case "Pineapple" -> "$ 2.5 charged";
            case "Mango" -> "$ 3.0 charged";
            default -> "Pick a valid fruit";
        };

    String day = "FRIDAY";

        int numLetters = switch (day) {

            case "MONDAY", "FRIDAY", "SUNDAY" -> {
                System.out.println(6);
                yield 6;
            }
            case "TUESDAY" -> {
                System.out.println(7);
                yield 7;
            }
            case "THURSDAY", "SATURDAY" -> {
                System.out.println(8);
                yield 8;
            }
            case "WEDNESDAY" -> {
                System.out.println(9);
                yield 9;
            }
            default -> {
                System.out.println("Invalid Day");
                yield 0;
            }

        };

    }

}
```
## While Statement
In Java, the `while` statement is a control flow statement that repeatedly executes a block of code as long as a specified condition is true. It is used when the number of iterations is not known beforehand and depends on the condition being evaluated.
### Syntax
```java
while (condition) {
    // Code block to be executed
}
```
- The condition is a boolean expression. If it evaluates to true, the code block inside the loop will be executed. If it evaluates to false, the loop terminates, and the program continues with the next statement after the loop.
- The code block within the curly braces {} contains the statements to be executed repeatedly.
### Example 💡
```java
public class WhileStatementDemo {

    public static void main(String[] args) {

        int i = 1;

        while (i<=10 ) {
            System.out.println(i);
            i++;
        }

        while (true) {
            System.out.println("I can print infinitely");
        }
    }
}
```
### Key Points 🚀
- Use the `while` loop when the number of iterations is not known beforehand.
- Ensure that the condition eventually becomes false to avoid infinite loops.
- The code block inside the while loop must contain statements that alter the variables involved in the condition to avoid an infinite loop.
## Do-While Statement
In Java, a do-while statement is used to execute a block of code repeatedly until a specified condition evaluates to false. Unlike the while loop, the do-while loop ensures that the block of code is executed at least once, even if the condition is initially false.
### Syntax
```java
do {
    // code block to be executed
} while (condition);
```
- The code block within the do statement is executed first.
- Then, the condition is evaluated.
- If the condition is true, the code block will be executed again.
- This process continues until the condition becomes false
### Example 💡
```java
public class DoWhileStatementDemo {

    public static void main(String[] args) {

        int n = 6;

        do {
            System.out.println(n);
            n++;
        } while ( n < 10);

    }

}
```
### Conclusion 🎉
The do-while loop in Java is useful when you need to execute a block of code at least once, regardless of whether the condition is initially true or false. It's commonly used in situations where the exact number of iterations is not known beforehand.
## for Loop
In Java, the for loop provides a concise way to iterate over a range of values or elements in an array or collection. It consists of three parts: initialization, condition, and iteration expression.
### Syntax
```java
for (initialization; condition; iteration) {
    // code block to be executed
}
```
- **Initialization :** Initializes the loop control variable.
- **Condition :** Evaluates to true or false. If true, the code block is executed; if false, the loop terminates.
- **Iteration :** Updates the loop control variable after each iteration.
### Example 💡
```java
public class ForLoopDemo {

    public static void main(String[] args) {
        int result ;
        for (int i = 1; i <= 10; i++) {
                result = i * 9;
            System.out.println("9 * " + i + " = "+ result);
        }
    }
}
```
### Notes 🚀
- The initialization step is executed only once at the beginning of the loop.
- The condition is evaluated before each iteration. If it evaluates to false, the loop terminates.
- The iteration expression is executed after each iteration.
## Nested For Loops
Nested for loops in Java are used when you need to iterate over a collection of items that contain another collection. This is commonly seen when dealing with multi-dimensional arrays or when you need to perform a task on each combination of elements from two or more collections.
### Syntax
```java
for (initialization; condition; increment/decrement) {
    // Outer loop
    for (initialization; condition; increment/decrement) {
        // Inner loop
        // Code to be executed
    }
}
```
The outer loop controls the execution of the inner loop. It runs once for each iteration of the outer loop.
### Example 💡
```java
public class NestedForLoopDemo {

    public static void main(String[] args) {

        int number = 10;

        for(int i = 1; i <= number; i++) {
            for(int j =1; j<=number;j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }

        int rows = 10;
        for (int i =1; i <=rows; i ++ ) {
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
```
### Nested Loop Behavior
When using nested loops, keep in mind that the inner loop runs to completion for each iteration of the outer loop. This means that the inner loop will run its entire course before the outer loop moves to its next iteration.
### Advantages 🚀
- Nested loops provide a way to handle complex iterations over multi-dimensional data structures.
- They allow you to perform operations on combinations of elements from multiple collections.
### Tips
- Ensure that you are incrementing/decrementing loop variables properly to avoid infinite loops.
- Be cautious of performance implications, especially with deeply nested loops and large datasets.
### Conclusion 🎉
Nested for loops in Java are a powerful tool for iterating over multi-dimensional data structures and handling combinations of elements. Understanding how to use them effectively can greatly enhance your ability to work with complex data.
## break Statement
The `break` statement in Java is used to terminate the execution of a loop prematurely. When the `break` statement is encountered inside a loop, the loop is immediately terminated, and the program control resumes at the next statement following the loop.
### Example 💡
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Reached the break statement, terminating loop.");
                break;
            }
            System.out.println("Iteration: " + i); //5
        }
    }
}

```
In this example, the loop terminates when the value of i becomes equal to 5, and the program control resumes at the statement following the loop.

### Notes 🚀
- The `break` statement can be used with for, while, and do-while loops.
- When `break` is used inside nested loops, it only terminates the innermost loop.
### continue Statement
The `continu`e statement is used in Java to skip the rest of the code inside a loop for the current iteration and proceed to the next iteration. It is mainly used within loops to control the flow of execution based on certain conditions.
### How it Works
When the `continue` statement is encountered inside a loop, the control immediately jumps to the next iteration of the loop, skipping any remaining code within the current iteration.
### Example 💡
```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;
    }
    System.out.print(i+" ");
}
```
In this example, when i is equal to 2, the `continue` statement is executed, causing the loop to skip the current iteration. As a result, the output will be:0 1 3 4 
### Use Cases
- **Skipping Certain Iterations :** It can be used to skip certain iterations of a loop based on specific conditions, improving the efficiency of the code.
- **Avoiding Nested if Statements :** It can help avoid deeply nested if statements by allowing you to skip iterations directly within the loop.
### Notes 🚀
- The `continue` statement can only be used within loops (for, while, do-while).
- If the `continue` statement is encountered in a nested loop, it only affects the innermost loop.
### Conclusion 🎉
The `continue` statement in Java provides a way to control the flow of execution within loops, allowing you to skip certain iterations based on conditions. It is a useful tool for improving the efficiency and readability of your code.
## Local Variables
Local variables in Java are variables that are declared within a method, constructor, or block of code. These variables are only accessible within the scope in which they are declared.
### Declaration and Initialization
Local variables must be declared and initialized before they can be used. Here's how you can declare and initialize a local variable in Java:
```java
public class LocalVariablesExample {
    public void exampleMethod() {
        // Declaration and initialization of a local variable
        int localVar = 10;
        System.out.println("The value of localVar is: " + localVar);
    }
}
```
In this example, localVar is a local variable of type int declared within the exampleMethod() method.
### Scope
The scope of a local variable is limited to the block of code in which it is declared. Once the block of code is exited, the variable goes out of scope and cannot be accessed anymore. Here's an example illustrating the scope of local variables:
```java
public class LocalVariablesScopeExample {
    public void exampleMethod() {
        int localVar = 10;
        System.out.println("Inside exampleMethod, localVar is: " + localVar); // 10

        // localVar is accessible only within exampleMethod
    }

    public void anotherMethod() {
        // Uncommenting the line below will cause a compilation error
        // System.out.println("Inside anotherMethod, localVar is: " + localVar);

        // localVar is not accessible here
    }
}
```
In this example, localVar is accessible only within the `exampleMethod()` method and cannot be accessed from `anotherMethod()`.
### Final Thoughts
Local variables are crucial in Java programming as they provide a way to store and manipulate data within a specific context or scope. Understanding their scope and usage is essential for writing efficient and bug-free code.

## Conclusion 🎉
Understanding control flow statements is essential for writing efficient and structured Java code. By mastering if-else statements, switch statements, for loops, while loops, and do-while loops, you gain the ability to control the flow of your program, making it more dynamic and responsive to different conditions.

As you continue to develop your Java programming skills, remember to choose the appropriate control flow statement for each scenario to ensure readability, maintainability, and performance of your code. Experiment with different control flow constructs and explore their nuances to become proficient in using them effectively.

By referring to the examples provided in this documentation and experimenting with your own code, you'll build a solid foundation in control flow statements, empowering you to write more robust and efficient Java applications.

Happy coding! 😊

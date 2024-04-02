# Operators and Operands in Java
### Overview
In Java programming, operators are symbols that perform operations on operands. Operands can be variables, constants, or expressions. Understanding operators and operands is crucial for writing efficient and concise code.
## Java Expressions
In Java, expressions are combinations of variables, operators, and method invocations that produce a single value. They can be as simple as a single variable or as complex as a mathematical formula.
### Arithmetic Expressions
Arithmetic expressions involve arithmetic operators (+, -, *, /, %) and operands (variables or literals) to perform mathematical calculations.
### Relational Expressions
Relational expressions compare two values using relational operators (==, !=, >, <, >=, <=) and evaluate to a boolean value (true or false).
### Logical Expressions
Logical expressions combine boolean values using logical operators (&&, ||, !) to form compound conditions.
### Assignment Expressions
Assignment expressions use the assignment operator (=) to assign a value to a variable.
### Conditional Expressions
Conditional expressions, also known as the ternary operator (?:), evaluate a boolean expression and return one of two values based on the result of the evaluation.

### Assignment Operator 
The assignment operator in Java (`=`) is used to assign a value to a variable. It is one of the most commonly used operators in Java programming.
#### Syntax
```java
variable = expression;
```
###### where :
- variable is the name of the variable to which the value will be assigned.
- expression is the value that will be assigned to the variable.
#### Example 💡
```java
public class AssignmentOperatorDemo {

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        num1 = num2 = num3 = num4 = num5 = 98;

        double dNum1 = 3.14;
        double dNum2 = 4.48;
        dNum1 = dNum2;
        System.out.println(dNum1); //4.48
        dNum2 = 6.58;
        System.out.println(dNum1); //4.48
    }

}
```
### Usage
- Assigning a value to a variable.
- Updating the value of a variable.
### Notes
- The assignment operator is a binary operator, meaning it requires two operands: the variable and the value to be assigned.
- It evaluates the expression on the right-hand side and assigns the result to the variable on the left-hand side.
- The data type of the variable must be compatible with the data type of the expression.
## Arithmetic Operators in Java
Arithmetic operators are used to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. Java provides several arithmetic operators that allow you to perform these operations on numeric operands.
### Addition Operator (+)
The addition operator (+) is used to add two operands together.
```java
int a = 5;
int b = 3;
int result = a + b;
```
### Subtraction Operator (-)
The subtraction operator (-) is used to subtract the right operand from the left operand.
```java
int a = 10;
int b = 4;
int result = a - b; // result will be 6
```
### Multiplication Operator (*)
The multiplication operato
r (*) is used to multiply two operands.
```java
int a = 3;
int b = 4;
int result = a * b; // result will be 12
```
### Division Operator (/)
The division operator (/) is used to divide the left operand by the right operand.
```java
int a = 10;
int b = 2;
int result = a / b; // result will be 5
```
### Modulus Operator (%)
The modulus operator (%) is used to find the remainder of dividing the left operand by the right operand.
```java
int a = 10;
int b = 3;
int result = a % b; // result will be 1
```
### Increment (++) and Decrement (--) Operators
The increment (++) operator is used to increment the value of an operand by 1. The decrement (--) operator is used to decrement the value of an operand by 1.
```java
int a = 5;
a++; // Increment a by 1, now a is 6
int b = 10;
b--; // Decrement b by 1, now b is 9
```
### Unary Plus Operator in Java
The unary plus operator (+) in Java is used to indicate a positive value. It is primarily used to explicitly specify the sign of a numeric expression, although it does not change the value itself.
#### Example 💡
```java
int number = 10;
int positiveNumber = +number; // positiveNumber will be 10
```
In the above example, the unary plus operator is used to explicitly indicate that the value of number is positive. However, since number is already positive, the unary plus operator does not affect its value.

###  Unary Minus Operator in Java
The unary minus operator (-) in Java is used to negate the value of its operand. It is a unary operator because it operates on only one operand.
#### Example 💡
```java
public class Main {
    public static void main(String[] args) {
        int number = 10;
        int result = -number;

        System.out.println("Original Number: " + number); //10
        System.out.println("Negated Number: " + result);// -10
    }
}
```
### Usage 🚀
The unary minus operator is commonly used when you need to change the sign of a numeric value, for example, to convert a positive number to a negative one or vice versa.
### Notes ✍️
- The operand of the unary minus operator must be a numeric type (byte, short, int, long, float, or double).
- If the operand is an integer type (byte, short, int, long), the result will be the negation of that integer.
- If the operand is a floating-point type (float or double), the result will be the negation of that floating-point number.
## Compound Arithmetic Assignment Operators in Java
### Overview
Compound arithmetic assignment operators in Java are shorthand notation for performing arithmetic operations and assignment in a single step. They combine an arithmetic operator with the assignment operator (`=`) to modify the value of a variable. These operators are useful for simplifying and streamlining code, especially when incrementing or decrementing variables by a fixed amount.
### List of Compound Arithmetic Assignment Operators
Java supports the following compound arithmetic assignment operators :
- `+=`: Addition assignment operator
- `-=`: Subtraction assignment operator
- `*=`: Multiplication assignment operator
- `/=`: Division assignment operator
- `%=`: Modulus assignment operator
### Addition Assignment `(+=)`
The `+=` operator adds the value of the right operand to the value of the left operand and assigns the result to the left operand.
#### Example 💡
```java
int x = 5;
x += 3; // Equivalent to: x = x + 3;
System.out.println(x); // Output: 8
```
### Subtraction Assignment `(-=)`
The `-=` operator subtracts the value of the right operand from the value of the left operand and assigns the result to the left operand.
#### Example 💡
```java
int x = 10;
x -= 4; // Equivalent to: x = x - 4;
System.out.println(x); // Output: 6
```
### Multiplication Assignment `(*=)`
The `*=` operator multiplies the value of the left operand by the value of the right operand and assigns the result to the left operand.
#### Example 💡
```java
int x = 3;
x *= 2; // Equivalent to: x = x * 2;
System.out.println(x); // Output: 6
```
### Division Assignment `(/=)`
The `/=` operator divides the value of the left operand by the value of the right operand and assigns the result to the left operand.
#### Example 💡
```java
int x = 8;
x /= 2; // Equivalent to: x = x / 2;
System.out.println(x); // Output: 4
```
### Modulus Assignment `(%=)`
The `%=` operator divides the value of the left operand by the value of the right operand and assigns the remainder to the left operand.
#### Example 💡
```java
int x = 10;
x %= 3; // Equivalent to: x = x % 3;
System.out.println(x); // Output: 1
```
### Conclusion  🎉
Compound arithmetic assignment operators in Java are useful for performing arithmetic operations and assignment in a single step, making code concise and readable. They offer a convenient way to update variables based on their current values.

## Realational Operators
## Equality Operator in Java
The Equality Operator `(==)` in Java is used to compare two operands to determine if they are equal. It's important to understand how it works and its nuances to avoid unexpected behavior in your Java programs.
### Basic Usage
The Equality Operator compares the values of two operands. If the values are equal, it returns `true`; otherwise, it returns `false`. It's commonly used in conditional statements and expressions.
#### Example
```java
int a = 5;
int b = 5;

boolean resul t= a==b;
System.out.println(result); //true

String str1=new String("hello");
String str2=new String("hello");

boolean isSame = str1==str2;

System.out.println(isSame);// false
```
- When comparing reference types (objects), the Equality Operator checks if the references point to the same object in memory, not if the objects have the same values.
- In the above example, `str1` and `str2` are different objects in memory, even though they have the same value. Therefore, the result of the comparison will be `false`.
### Equality vs. Identity
- **Equality :** Compares the values of two operands.
- **Identity :** Compares the memory addresses of two operands.
### Conclusion
Understanding how the Equality Operator works in Java is crucial for writing reliable and bug-free code. Always consider the types of operands you are comparing and whether you need to check for equality or identity.
## Inequality Operator in Java
In Java, the inequality operator `!=` is used to compare two values and check if they are not equal. It returns `true` if the two values are different, and `false` if they are equal.
#### Example
```java
int a = 5;
int b = 10;

boolean result= a!=b;

System.out.println(result);// true

```
### Notes
- The inequality operator can be used with all primitive data types in Java (e.g., int, float, double, char, boolean, etc.).
- It can also be used to compare objects in Java, where it checks if the references point to different objects.
- When comparing objects, it's important to understand the difference between reference equality and object equality. For object comparison, you might need to override the `equals()` method.

## Comparison Operators in Java
In Java, comparison operators are used to compare two values. These operators return a boolean value (`true` or `false`) based on the comparison result. Here, we'll discuss the greater than (`>`), greater than or equal to (`>=`), less than (`<`), and less than or equal to (`<=`) operators.

### Greater Than (`>`) Operator
The greater than operator (`>`) is used to check if the value on the left side of the operator is greater than the value on the right side.

#### Example
```java
int a = 5;
int b = 3;

Systsem.out.println(a > b); // true
```
### Greater Than or Equal To (`>=`) Operator
The greater than or equal to operator (`>=`) is used to check if the value on the left side of the operator is greater than or equal to the value on the right side.
#### Example
```java
int a = 5;
int b = 5;

System.out.println(a >= b); // Output: true
```
### Less Than (`<`) Operator
The less than operator (`<`) is used to check if the value on the left side of the operator is less than the value on the right side.
#### Example 
```java
int a = 3;
int b = 5;

System.out.println(a < b); // Output: true
```
### Less Than or Equal To (`<=`) Operator
The less than or equal to operator (`<=`) is used to check if the value on the left side of the operator is less than or equal to the value on the right side.
#### Example
```java
int a = 5;
int b = 5;

System.out.println(a <= b); // Output: true
```
## Logical Operators

### Logical NOT  Operator
The logical NOT operator (`!`) is used to invert the value of a boolean expression. It returns `true` if the operand is `false`, and false if the operand is true. Here's an example :
#### Example
```java
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean isValid;
        isValid = !true; //false
        isValid = !false; // true
        int num1 = 9;
        int num2 = 6;
        isValid = ! (num1>num2); // false
    }
}
```
## Logical AND (`&&`) Operator 
The logical AND (`&&`) operator returns `true` if both operands are `true`, otherwise it returns `false`. However, if the first operand evaluates to `false`, the second operand is not evaluated because the result will always be `false` regardless of its value.
#### Example 
```java
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean isValid;
        isValid = !true;
        isValid = !false;
        int num1 = 9;
        int num2 = 6;
        isValid = ! (num1>num2);

        boolean a = (num1>5) && ((num2=16)>15);
        System.out.println(a); // true
        System.out.println(num2); // 16
    }

}
```
### Logical OR (`||`) Operator
The logical OR (`||`) operator returns true if at least one of the operands is true. Similar to the logical AND operator, the logical OR operator also short-circuits the evaluation of an expression. If the first operand evaluates to true, the second operand is not evaluated because the result will always be true regardless of its value.
#### Example
```java
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean isValid;
        isValid = !true;
        isValid = !false;
        int num1 = 9;
        int num2 = 6;
        isValid = ! (num1>num2);

        boolean a = (num1>10) && ((num2=16)>15);
        System.out.println(a);
        System.out.println(num2);

        boolean b = (num1 < 10) || ((num2=18)>15);
        System.out.println(b); //true
        System.out.println(num2);// 6

    }

}
```
## Logical XOR Operator 
The `XOR` operator, denoted by the caret symbol `^`, is a binary operator that returns true if and only if the operands differ. It returns false if both operands are the same.
#### Example
```java
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean isValid;
        isValid = !true;
        isValid = !false;
        int num1 = 9;
        int num2 = 6;
        isValid = ! (num1>num2);

        boolean a = (num1>10) && ((num2=16)>15);
        System.out.println(a);
        System.out.println(num2);

        boolean b = (num1 < 10) || ((num2=18)>15);
        System.out.println(b);
        System.out.println(num2);

        boolean c = (num1>5) ^ (num2<10);
        System.out.println(c);// false

        boolean d = (num1>5) ^ (num2>10); true
    }
}
```
## Compound Logical Assignment operator in Java
Compound logical assignment operators in Java are shorthand operators used to combine an arithmetic or bitwise operation with an assignment. These operators perform the operation and then assign the result to the variable in a single step. They are convenient for modifying variables based on certain conditions efficiently.
#### Example 
```java
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean b1 = true;
        b1 &= true;
        System.out.println(b1);// true

        boolean b2 = true;
        b2 |= false;
        System.out.println(b2); //true

        boolean b3 = true;
        b3 ^= false;
        System.out.println(b3); // true
    }

}

```
## Biwise Operators in Java
Bitwise operators in Java are used to perform operations on individual bits of integer operands. These operators work on the binary representation of numbers. Java provides six bitwise operators :
### Bitwise NOT Operator in Java
The bitwise `NOT` operator in Java, denoted by `~`, is a unary operator that flips the bits of its operand. It's used to perform bitwise negation on individual bits of an integer operand.
### Usage
The bitwise NOT operator flips each bit of its operand. If a bit is 1, it becomes 0, and if it's 0, it becomes 1.
#### Example
```java
public class BitwiseOperatorsDemo {

    public static void main(String[] args) {

        int x = 9;
        int y = ~x;
        System.out.println(y); // -10
    }

}
```
##  Bitwise AND Operator
The BITWISE AND operator (`&`) in Java is a binary operator that performs a bitwise AND operation between two integer operands. It evaluates to 1 if both corresponding bits in the operands are 1; otherwise, it evaluates to 0.
#### Example
```java
public class BitwiseAndExample {
    public static void main(String[] args) {
        int num1 = 10;   // Binary: 1010
        int num2 = 6;    // Binary: 0110
        int result = num1 & num2; // Binary result: 0010 (2 in decimal)
        System.out.println("Result of BITWISE AND operation: " + result); // 2
    }
}
```
## Bitwise OR Operator 
In Java, the bitwise OR operator (`|`) is a binary operator that performs a bitwise OR operation between two integer operands. It evaluates to 1 if either or both of the corresponding bits in the operands are 1 else 0.
#### Example
```java
int a = 5;     // 101 in binary
int b = 3;     // 011 in binary
int result = a | b;  // result = 7 (111 in binary)
```
In this example, the bitwise OR operation is performed between a and b, resulting in 7 which is 111 in binary.
### Usage
- Combining Flags: Bitwise OR is commonly used to combine or set specific flags or options in programming.
- Masking: It's used in bitmasking techniques to manipulate individual bits or groups of bits within an integer.
### Notes
- The bitwise OR operator evaluates each bit position independently.
- It sets the corresponding bit in the result to 1 if either of the bits in the operands is 1.
### Alternatives
**Logical OR (`||`) Operator :** This is a conditional OR operator used for boolean expressions. It evaluates to true if either operand is true.
### Conclusion
The bitwise OR operator in Java provides a powerful tool for manipulating individual bits within integers. It's commonly used in low-level programming and for various bitwise operations.
## Bitwise XOR Operator
In Java, the bitwise XOR operator (`^`) is used to perform a bitwise exclusive OR operation between two integers.It compares each bit two operands, and if the bits are diffrent then the resulting bit is 1, otherwise resulting bit is 0.
#### Example
```java
int a = 5;      // 101 in binary
int b = 3;      // 011 in binary

int result = a ^ b; // result = 110 in binary, which is 6 in decimal

System.out.println("5 ^ 3 = " + result); // Output: 6
```
### Usage
The bitwise XOR operator is commonly used for various purposes such as :
- Flipping bits: XORing a value with a bit pattern of all 1s flips all of its bits.
- Encrypting and decrypting data.
- Checking for differences between two bit patterns.
- Swapping values without using a temporary variable.
### Important Notes
- The operands for the XOR operator must be of integer types (byte, short, int, long, char).
- The XOR operation sets a bit to 1 if it is different in the operands, otherwise sets it to 0.
### Conclusion
The bitwise XOR operator (^) in Java is a fundamental tool for performing bitwise exclusive OR operations between integers. Understanding its behavior and applications is essential for working with binary data and performing bitwise manipulations efficiently.
##  Left Shift Operator
In Java, the left shift operator (`<<`) is a bitwise operator used to shift the bits of a number to the left. It is used to perform multiplication by powers of two.

Where:
- `operand` is the value to be shifted.
- `numBits` is the number of positions to shift the bits to the left.

## Example

```java
int num = 5;  // Binary representation: 00000101

// Left shifting by 2 bits
int result = num << 2;  // Binary representation: 00010100

System.out.println(result);  // Output: 20
```
In this example, the binary representation of 5 is 00000101. When we left shift this number by 2 bits (num << 2), the result is 00010100, which is equivalent to 20 in decimal.

### Usage
- The left shift operator is commonly used for performing quick multiplication or division by powers of two.
- It can also be used for bit manipulation and optimizing certain algorithms.
### Notes
- Left shifting a number by n bits is equivalent to multiplying the number by 2^n.
- The leftmost bits that are shifted out of the number are discarded, and zero bits are shifted in from the right.
## Signed Right Shift Operator
In Java, the signed right shift operator (>>) is used to shift the bits of a number to the right. It preserves the sign of the number, meaning it fills the shifted positions with the sign bit (the leftmost bit) of the original number.
### Syntax
The syntax for the signed right shift operator is as follows:
```java
result = number >> shiftAmount;
```
Where :
- number is the integer value whose bits are to be shifted.
- shiftAmount is the number of positions to shift the bits.
### Example
```java
int x = 10;    // Binary: 0000 1010
int shifted = x >> 2;  // Shift right by 2 positions // Binary: 0000 0010
System.out.println(shifted); // 2

```
After the shift operation, shifted will have the value 2, because the rightmost two bits are discarded.
### Behavior
- The signed right shift operator preserves the sign of the number.
- If the number is positive, it fills the vacant positions on the left with 0.
- If the number is negative, it fills the vacant positions on the left with 1.
### Applications
- It is commonly used in optimizing division by powers of 2.
- It can be used for efficient multiplication or division by 2^n, where n is the shift amount.
### Note
- When shifting right by n positions, the number effectively gets divided by 2^n.
- Care should be taken when using the signed right shift operator with negative numbers to avoid unexpected results.
### Conclusion
The signed right shift operator (>>) in Java is a useful tool for shifting the bits of a number to the right while preserving its sign. Understanding its behavior and applications can help in writing efficient and concise code.
## Unsigned Right Shift Operator (>>>)
In Java, the Unsigned Right Shift operator (`>>>`) is used to shift the bits of a number to the right by a specified number of positions. Unlike the Right Shift operator (`>>`), the Unsigned Right Shift operator always fills the leftmost bits with zeros, irrespective of the sign bit.
### Syntax
The syntax for the Unsigned Right Shift operator is :
- result = value >>> numPositions;
- Here, `value` is the number whose bits are to be shifted, `numPositions` is the number of positions to shift the bits to the right, and `result` is the variable that will hold the result of the operation.
#### Example

```java
int number = 10; // binary representation: 0000 0101
int result = number >>> 1; // Shift right by 1 position // binary representation : 0000 0010
System.out.println(result) //2
```
### Use Cases
- Dividing by powers of 2: Unsigned Right Shift is often used for dividing by powers of 2 because it's a fast operation.
- Working with binary data: When dealing with binary data and you need to shift bits to the right while maintaining the unsigned nature of the data, the Unsigned Right Shift operator comes in handy.
### Notes
- The Unsigned Right Shift operator (>>>) does not preserve the sign bit, which means it treats the number as if it were positive, shifting all bits to the right and filling the leftmost bits with zeros.
- This operator is useful when working with binary data or when you want to perform logical right shifts without considering the sign of the number.
## Compound Assignment Bitwise Operators
Compound assignment bitwise operators combine a bitwise operation with assignment, allowing you to perform an operation and assign the result to the same variable in a single statement.
### Compound Assignment Bitwise And Operator
#### Example 
```
int x = 10; //binary representation :1010
int y = 6; // binary representation :0110
 x &= y
System.out.println(x) //2 // binary representation :0010
```
Please practice remaing `Compound Assignment Bitwise And Operator`

## Ternary Conditional Operator
The Ternary Conditional Operator, often referred to as the "conditional operator" or "ternary operator", is a concise way to express conditional statements in Java. It provides a shorthand for the if-else statement.
### Syntax
```
condition ? expression1 : expression2
```
- If the condition evaluates to true, the expression1 is executed.
- If the condition evaluates to false, the expression2 is executed.
#### Example
```java
int x = 10;
int y = 5;
int max = (x > y) ? x : y;
System.out.println("The maximum value is: " + max);// 10
```
In this example :
- If `x` is greater than `y`, `x` is assigned to max.
- If `y` is greater than or equal to `x`, `y` is assigned to max.
### Advantages
- **Conciseness :** The ternary operator reduces the amount of code required for simple conditional statements.
- **Readability :** It can make the code more readable, especially for simple conditions.
### Limitations
- Complexity: Overuse of nested ternary operators can lead to decreased readability and maintainability.
- Not Suitable for Complex Logic: For complex conditions, using if-else statements is often more appropriate.
### Conclusion
The Ternary Conditional Operator is a powerful tool for writing concise conditional statements in Java. It can improve code readability and reduce verbosity for simple conditions. However, it should be used judiciously and avoided for complex logic to maintain code clarity and understandability.

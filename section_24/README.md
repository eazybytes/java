# Functional programming using Lambda Expressions 📚
Functional programming is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing-state and mutable data. In functional programming, functions are first-class citizens, meaning they can be passed as arguments to other functions, returned as values from other functions, and assigned to variables.

Key concepts in functional programming include:

**Pure Functions :** Functions that produce output based only on their inputs, with no side effects. Given the same input, a pure function will always return the same output, making it easier to reason about and test.

**Immutability :** Data structures, once created, cannot be modified. Instead of changing the state of existing data, functional programming encourages creating new data structures with the desired modifications.

**Higher-order Functions :** Functions that can take other functions as arguments or return functions as results. This allows for powerful abstractions and concise code.

**Recursion :** Recursion is often used instead of looping constructs like for or while loops. Functions call themselves with modified arguments until a base case is reached.

**Referential Transparency :** The idea that an expression can be replaced with its value without changing the program's behavior. This facilitates reasoning about code and enables optimizations.

**Functional Composition :** Combining smaller functions to create larger functions, often using techniques like function composition or chaining.

**Lazy Evaluation :** Delaying the evaluation of an expression until its value is actually needed. This can improve performance and support infinite data structures.

Languages that support functional programming include Haskell, Scala, Clojure, Erlang, and Lisp. However, many mainstream languages, such as JavaScript, Python, and Java, also incorporate functional programming features to varying degrees.

## How to Build Lambda Expressions in Java
Lambda expressions in Java are a powerful feature introduced in Java 8, allowing you to treat functionality as a method argument, or to create anonymous functions. This README provides a guide on how to build lambda expressions in Java.

## What are Lambda Expressions?
Lambda expressions introduce the concept of functional programming to Java. They allow you to treat functionality as a method argument, or to create anonymous functions. Lambda expressions are particularly useful when working with collections and streams, where you need to pass behavior as a parameter.

## Syntax of Lambda Expressions

The syntax of a lambda expression consists of three parts: 

1. **Parameters**: A lambda expression can have zero or more parameters. The type of each parameter can be explicitly declared or inferred.

2. **Arrow token (->)**: It is used to separate the parameter list from the body of the lambda expression. It is also called the lambda operator.

3. **Body**: It contains the code that defines the functionality of the lambda expression. It can consist of a single expression or a block of code.

Here's the basic syntax:

```java
(parameters) -> expression
```
or

```java
(parameters) -> { statements; }
```
### Examples 💡
### 1. Lambda with No Parameters:
```java
() -> System.out.println("Hello Lambda!");
```
### 2. Lambda with Single Parameter:
```java
(x) -> x * x
```
### 3. Lambda with Multiple Parameters:
```java
(x, y) -> x + y
```
### 4. Lambda with Body:
```java
(x, y) -> {
    int sum = x + y;
    return sum;
}
```
### 5. Lambda as Method Parameter:
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));
```
### Benefits of Lambda Expressions
**Conciseness :** Lambda expressions reduce boilerplate code and make your code more readable by focusing on the actual functionality.

**Improved Code Organization :** By allowing code to be passed around more flexibly, lambdas can promote a more modular and organized code structure.

**Parallelism :** Lambdas facilitate writing code that can be executed in parallel using features like Java's Stream API.

**Enhanced APIs :** Many new APIs introduced in Java 8 and later are designed to work seamlessly with lambdas, providing developers with more powerful and expressive tools.

**Functional Programming Paradigm :** Lambda expressions encourage the use of functional programming paradigms, leading to cleaner, more declarative code.

### Conclusion 🎉
Lambda expressions are a powerful addition to the Java language, enabling developers to write more expressive and concise code. By understanding their syntax and benefits, you can leverage lambdas to make your Java code more efficient and maintainable.

## Functional Interface
Functional Interface in Java is an interface that contains only one abstract method. It can have any number of default or static methods but must contain exactly one abstract method. They are also known as Single Abstract Method (SAM) interfaces.

Functional Interfaces play a crucial role in enabling functional programming features in Java, particularly with the introduction of lambda expressions in Java 8.

## Usage

To define a functional interface in Java, you can use the `@FunctionalInterface` annotation. This annotation is not mandatory, but it's recommended as it ensures the interface has only one abstract method.

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```
Now, you can use this functional interface to create lambda expressions or method references


```java
public class Main {
    public static void main(String[] args) {
        // Using lambda expression
        MyFunctionalInterface myLambda = () -> System.out.println("Hello from lambda");
        myLambda.myMethod();

        // Using method reference
        MyFunctionalInterface myMethodRef = Main::someMethod;
        myMethodRef.myMethod();
    }

    static void someMethod() {
        System.out.println("Hello from method reference");
    }
}
```

### Characteristics
Single Abstract Method (SAM): Functional interfaces must contain exactly one abstract method.
@FunctionalInterface Annotation: While not mandatory, using this annotation helps to ensure that the interface is intended to be used as a functional interface.
Lambda Expressions: Functional interfaces are often used with lambda expressions to provide concise implementations of the abstract method.
Method References: Method references allow you to refer to methods or constructors without invoking them.
### Examples 💡
Here are some common examples of functional interfaces in Java:

- **Runnable :** Represents a task that can be executed.
- **Callable :** Represents a task that returns a result and may throw an exception.
- **Comparator :** Used to compare two objects.
- **Supplier :** Provides a value without taking any input.
- **Consumer :** Consumes a value without returning any result.
- **Function :** Represents a function that accepts one argument and produces a result.
### Benefits
- **Concise Code :** Functional interfaces combined with lambda expressions allow for more concise and expressive code.
- **Readability :** Lambda expressions can make the code more readable by focusing on what needs to be done rather than how it is done.
- **Flexibility :** Functional interfaces provide flexibility in designing APIs, allowing methods to accept behaviors as parameters.
### Conclusion 🎉
Functional interfaces in Java enable functional programming paradigms by allowing the use of lambda expressions and method references. They provide a concise and expressive way to define behaviors, leading to cleaner and more maintainable code.

## Functional Interface and Lambda Expressions
Functional Interface and Lambda Expressions are two closely related concepts in Java, introduced in Java 8. They are instrumental in enabling functional programming paradigms within the language.
### Functional Interface
A Functional Interface in Java is an interface that contains exactly one abstract method. It may contain any number of default or static methods, but it must have exactly one abstract method. Functional interfaces are also known as Single Abstract Method (SAM) interfaces.

Functional interfaces serve as the foundation for lambda expressions in Java. They provide a way to define the signature for lambda expressions.

### Lambda Expressions

Lambda Expressions, introduced in Java 8, provide a concise syntax for representing anonymous functions. They allow you to express instances of single-method interfaces (functional interfaces) more compactly.

Lambda expressions are essentially a way to pass functionality as an argument to a method. They provide a clear and concise way to represent behavior without the need for verbose anonymous inner classes.

Linking Functional Interfaces and Lambda Expressions

Lambda expressions are intimately linked with functional interfaces in Java. When you use a lambda expression, you are essentially implementing the abstract method of a functional interface in a more concise and expressive way.

Let's take a look at an example:

```java
// Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class Main {
    public static void main(String[] args) {
        // Lambda Expression
        MyFunctionalInterface myLambda = () -> System.out.println("Hello from lambda");
        myLambda.myMethod();
    }
}
```
In the example above:

We define a functional interface MyFunctionalInterface with a single abstract method myMethod().
We then create a lambda expression () -> System.out.println("Hello from lambda"), which represents an instance of MyFunctionalInterface.
Finally, we invoke the myMethod() using the lambda expression.
This demonstrates how lambda expressions can be used to implement the abstract method of a functional interface concisely.

### Benefits
The linking of functional interfaces and lambda expressions in Java provides several benefits:

**Concise Syntax :** Lambda expressions allow for more concise and readable code compared to anonymous inner classes.
**Functional Programming :** Enables functional programming paradigms in Java by providing a way to pass behavior as an argument to methods.
**Improved Expressiveness :** Enhances code expressiveness by focusing on what needs to be done rather than how it is done.
**Flexibility :** Provides flexibility in designing APIs by allowing methods to accept behaviors as parameters.
### Conclusion 🎉
Functional interfaces and lambda expressions in Java are closely linked concepts that enable functional programming paradigms within the language. By using lambda expressions, you can implement the abstract methods of functional interfaces concisely and expressively, leading to cleaner and more maintainable code.

## Using Anonymous Inner Class in Place of Lambda Expression in Java
In Java, lambda expressions provide a concise way to express instances of single-method interfaces (also known as functional interfaces). However, before the introduction of lambda expressions in Java 8, anonymous inner classes were used to achieve similar functionality. This README aims to explain how to use anonymous inner classes in place of lambda expressions.

### Anonymous Inner Class
An anonymous inner class is a class defined inline without a name. It is typically used when you need to create an instance of a class that will be used only once and don't want to create a separate class for it.

### Lambda Expressions
Lambda expressions, introduced in Java 8, are used to represent instances of functional interfaces. They provide a concise way to write anonymous functions, making your code more readable and maintainable.

### Using Anonymous Inner Class Instead of Lambda Expression
To demonstrate using an anonymous inner class instead of a lambda expression, consider the following example where we have a functional interface MathOperation with a single method calculate(int a, int b):

```java
public interface MathOperation {
    int calculate(int a, int b);
}
Using Lambda Expression
java
Copy code
public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Result: " + addition.calculate(10, 5));
    }
}
```
In this code, the lambda expression `(a, b) -> a + b` represents the calculate method of the MathOperation interface.

### Using Anonymous Inner Class
```java
public class Main {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Result: " + addition.calculate(10, 5));
    }
}
```
In this code, we've used an anonymous inner class to implement the MathOperation interface.

### Conclusion 🎉
While lambda expressions offer a more concise syntax for representing instances of functional interfaces, anonymous inner classes can still be used in Java to achieve the same functionality. Depending on the context and readability concerns, you may choose between lambda expressions and anonymous inner classes.

## Predefined Functional Interfaces in Java Development Kit (JDK)
Functional interfaces, introduced in Java 8, are interfaces that have only one abstract method. They are a key feature of Java's support for functional programming. The JDK provides several predefined functional interfaces in the java.util.function package to support common functional programming idioms.

### List of Predefined Functional Interfaces
Here are some of the commonly used predefined functional interfaces in the JDK:

### 1. Predicate<T>
Represents a predicate (boolean-valued function) of one argument.

### 2. Function<T, R>
Represents a function that accepts one argument and produces a result.

### 3. Consumer<T>
Represents an operation that accepts a single input argument and returns no result.

### 4. Supplier<T>
Represents a supplier of results.

### 5. UnaryOperator<T>
Represents an operation on a single operand that produces a result of the same type as its operand.

### 6. BinaryOperator<T>
Represents an operation upon two operands of the same type, producing a result of the same type as the operands.

### Usage Examples
Here are some examples demonstrating the usage of these predefined functional interfaces:

### 1. Predicate<T>
```java
Predicate<String> isLong = str -> str.length() > 5;
System.out.println(isLong.test("Hello")); // Output: false
System.out.println(isLong.test("Hello World")); // Output: true
```
### 2. Function<T, R>
```java
Function<Integer, String> intToString = num -> "Number: " + num;
System.out.println(intToString.apply(42)); // Output: Number: 42
```
### 3. Consumer<T>
```java
Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
printUpperCase.accept("hello"); // Output: HELLO
```
### 4. Supplier<T>
```java
Supplier<Double> randomDouble = () -> Math.random();
System.out.println(randomDouble.get()); // Output: Random double value
```
### 5. UnaryOperator<T>
```java
UnaryOperator<Integer> square = num -> num * num;
System.out.println(square.apply(5)); // Output: 25
```
### 6. BinaryOperator<T>
```java
BinaryOperator<Integer> sum = (a, b) -> a + b;
System.out.println(sum.apply(10, 20)); // Output: 30
```
### Conclusion 🎉
Predefined functional interfaces in the JDK provide a convenient way to work with functional programming constructs in Java. By leveraging these interfaces, developers can write more concise and expressive code. Understanding and using these interfaces effectively can lead to more readable and maintainable code.

## Predicate Functional Interface
Predicates are widely used in Java programming, especially in functional programming paradigms and stream processing.

### What is a Predicate?
In Java, a Predicate is a functional interface included in the java.util.function package. It represents a boolean-valued function that takes an argument and returns true or false.

### Predicate Interface Signature
The Predicate interface in Java has a single abstract method called test, which takes one argument and returns a boolean value.

```java
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```
### Usage
Predicates are commonly used in scenarios where conditional checks need to be performed. They can be used in conjunction with lambda expressions, method references, and stream operations.

### Example 1: Filtering a Collection
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Using a Predicate to filter even numbers
List<Integer> evenNumbers = numbers.stream()
                                   .filter(num -> num % 2 == 0)
                                   .collect(Collectors.toList());
```
### Example 2: Combining Predicates
```java
Predicate<Integer> isEven = num -> num % 2 == 0;
Predicate<Integer> isGreaterThan5 = num -> num > 5;

// Combining predicates using 'and' method
Predicate<Integer> isEvenAndGreaterThan5 = isEven.and(isGreaterThan5);

List<Integer> filteredNumbers = numbers.stream()
                                       .filter(isEvenAndGreaterThan5)
                                       .collect(Collectors.toList());
```
### Advantages
Provides a clean and concise way to perform conditional checks.
Facilitates functional programming paradigms in Java.
Promotes code reusability and composability.
### Conclusion
The Predicate Functional Interface in Java offers a convenient way to perform boolean-valued checks on data. It is widely used in stream processing, filtering collections, and implementing conditional logic in functional programming styles. Understanding and utilizing predicates can lead to more expressive and maintainable code in Java applications.

## Function Functional Interface
The `Function` functional interface in Java is a part of the `java.util.function` package introduced in Java 8. It represents a function that accepts one argument and produces a result. This interface is commonly used in functional programming and provides a convenient way to define and use functions as first-class objects in Java.

## Usage

The `Function` interface consists of a single abstract method `apply(T t)` which accepts an argument of type `T` and returns a result of type `R`. It is commonly used in scenarios where you need to perform a transformation or computation on input data.

Here's a simple example demonstrating the usage of the `Function` interface:

```java
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Define a function to convert a string to its length
        Function<String, Integer> stringLength = str -> str.length();

        // Apply the function
        int length = stringLength.apply("Hello, World!");
        System.out.println("Length of the string: " + length);
    }
}
```
In this example, we create a Function that takes a String and returns its length.

### Additional Operations
### Chaining Functions
You can chain multiple Function instances together using the andThen method. This method returns a composed function that first applies the current function and then applies the specified function.

```java
Function<Integer, Integer> addOne = x -> x + 1;
Function<Integer, Integer> multiplyByTwo = x -> x * 2;


Function<Integer, Integer> addOneThenMultiplyByTwo = addOne.andThen(multiplyByTwo);
System.out.println("Result: " + addOneThenMultiplyByTwo.apply(5)); // Output: 12
```
In this example, addOneThenMultiplyByTwo first adds one to the input and then multiplies it by two.

### Identity Function
The `identity()` method returns a function that always returns its input argument. It is useful when you need a function that does nothing but return the input itself.

```java
Function<Integer, Integer> identityFunction = Function.identity();
System.out.println("Result: " + identityFunction.apply(10)); // Output: 10
```
In this example, identityFunction returns the same value that is passed to it.

### Functional Programming Paradigm
The Function interface is widely used in functional programming paradigms such as lambda expressions and method references. It allows for concise and expressive code by treating functions as first-class citizens.

Here's an example of using lambda expressions with the Function interface:

```java
Function<Integer, Integer> square = x -> x * x;
System.out.println("Square of 5: " + square.apply(5)); // Output: 25
```
### Functional Interfaces Hierarchy
The `Function` interface is part of the Java 8 functional interfaces hierarchy, which includes other interfaces like Predicate, Consumer, Supplier, etc. These interfaces provide common function types used in functional programming.

### Conclusion
The `Function` functional interface in Java provides a powerful way to represent and use functions as first-class objects. It promotes functional programming paradigms and enables developers to write more concise and expressive code. By leveraging lambda expressions, method references, and additional operations like function chaining and identity functions, you can leverage the full potential of the Function interface in your Java applications.

## UnaryOperator Interface
The `UnaryOperator` interface in Java is a functional interface introduced in Java 8. It belongs to the `java.util.function` package and represents an operation on a single operand that produces a result of the same type as its operand. It extends the `Function` interface.

### Usage
The `UnaryOperator` interface is commonly used in scenarios where you need to transform or operate on an object of a certain type and return an object of the same type. Here's an example of how you can use `UnaryOperator`:

```java
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // Define a UnaryOperator for String concatenation
        UnaryOperator<String> concatOperator = s -> s + " World";

        // Apply the UnaryOperator to a String
        String result = concatOperator.apply("Hello");

        System.out.println(result); // Output: Hello World
    }
}
```

# UnaryOperator Interface

The `UnaryOperator` interface in Java is a functional interface introduced in Java 8. It belongs to the `java.util.function` package and represents an operation on a single operand that produces a result of the same type as its operand. It extends the `Function` interface.

## Functional Descriptor

```java
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
    // Inherits abstract method from Function interface
}
```
The UnaryOperator interface is commonly used in scenarios where you need to transform or operate on an object of a certain type and return an object of the same type. Here's an example of 
how you can use UnaryOperator:

```java
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // Define a UnaryOperator for String concatenation
        UnaryOperator<String> concatOperator = s -> s + " World";

        // Apply the UnaryOperator to a String
        String result = concatOperator.apply("Hello");

        System.out.println(result); // Output: Hello World
    }
}
```
In this example, we define a UnaryOperator that concatenates " World" to a given String. Then, we apply this operator to the String "Hello", resulting in "Hello World".

### Functional Method
The `UnaryOperator` interface inherits the following abstract method from the Function interface:

```java
T apply(T t);
```
This method applies the operation to the given argument and returns the result.

### Functional Interface
`UnaryOperator` is a functional interface, which means it has exactly one abstract method. It can be used in lambda expressions and method references.

### Related Interfaces
- **Function :** Represents a function that accepts one argument and produces a result.
- **BinaryOperator :** Represents an operation upon two operands of the same type, producing a result of the same type as the operands.

## Consumer Interface
The consumer interface is a functional interface provided by Java's `java.util.function` package. It represents an operation that accepts a single input argument and returns no result.

### Features
- **Genericity**: The consumer interface is generic, allowing it to accept different types of input arguments.
- **Flexibility**: Consumers can be used to perform a wide range of operations, such as printing values, adding them to a collection, or applying transformations.

## Example
```java
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        // Example 1: Printing elements of an array using a consumer
        String[] names = {"Alice", "Bob", "Charlie"};
        Consumer<String> printConsumer = System.out::println;
        forEach(names, printConsumer);

        // Example 2: Adding elements to a list using a consumer
        List<Integer> numbers = new ArrayList<>();
        Consumer<Integer> addConsumer = numbers::add;
        addConsumer.accept(1);
        addConsumer.accept(2);
        addConsumer.accept(3);
        System.out.println("Numbers added to list: " + numbers);
    }

    // Generic method to iterate over an array and apply a consumer to each element
    public static <T> void forEach(T[] array, Consumer<T> consumer) {
        for (T element : array) {
            consumer.accept(element);
        }
    }
}
```
## Supplier Interface in Java
The `Supplier` interface in Java is a functional interface defined in the `java.util.function` package. It represents a supplier of results. It does not accept any arguments and is expected to generate or supply results when called upon by the functional method `get()`.

### Usage
The Supplier interface is primarily used when a function needs to generate or supply values without taking any input. It can be useful in scenarios such as lazy initialization, where you want to defer the creation of an object until it's actually needed.

The Supplier interface is commonly used with Java 8's Stream API to generate streams of elements. It can also be used in various functional programming constructs to provide values on demand.

### Example 
```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Example 1: Using a Supplier to lazily initialize an object
        Supplier<String> lazyStringSupplier = () -> {
            // Simulating expensive object creation
            System.out.println("Creating an expensive object...");
            return "Expensive Object";
        };

        // Lazy initialization only happens when get() is called
        System.out.println("First get(): " + lazyStringSupplier.get());
        System.out.println("Second get(): " + lazyStringSupplier.get());

        // Example 2: Using a Supplier with Stream API
        Stream.generate(() -> "Hello").limit(5).forEach(System.out::println);
    }
}
```

## BiFunctional Interfaces
BiFunctional interfaces are functional interfaces that accept two arguments and produce a result. They are useful for scenarios where you need to perform operations on two inputs and return a result.

### Examples
Example 1: Adding Two Numbers
```java
import java.util.function.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int result = add.apply(10, 20);
        System.out.println("Sum: " + result); // Output: Sum: 30
    }
}
```
### Example 2: Concatenating Two Strings
```java
import java.util.function.*;

public class ConcatenateStrings {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (str1, str2) -> str1 + " " + str2;
        String result = concat.apply("Hello", "World");
        System.out.println("Concatenated String: " + result); // Output: Concatenated String: Hello World
    }
}
```
### Example 3: Custom Operation on Two Integers
```java
import java.util.function.*;

public class CustomOperation {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> customOperation = (a, b) -> (a * a) + (b * b);
        int result = customOperation.apply(3, 4);
        System.out.println("Result of Custom Operation: " + result); // Output: Result of Custom Operation: 25
    }
}
```

## Primitive Type Functional Interfaces 
This repository contains examples and explanations of primitive type functional interfaces in Java. `Primitive` type functional interfaces are special types of functional interfaces designed to work with primitive data types (int, long, double, etc.) rather than objects. These interfaces are part of the `java.util.function` package introduced in Java 8 and are used extensively in functional programming paradigms.

Primitive type functional interfaces are useful when you need to optimize performance or when you're working with large datasets, as they avoid the overhead of autoboxing and unboxing. By using primitive type functional interfaces, you can write more efficient and concise code.

In this repository, you will find examples and explanations of the following primitive type functional interfaces:

- IntSupplier
- IntConsumer
- IntPredicate
- IntFunction
- IntUnaryOperator
- IntBinaryOperator
- LongSupplier
- LongConsumer
- LongPredicate
- LongFunction
- LongUnaryOperator
- LongBinaryOperator
- DoubleSupplier
- DoubleConsumer
- DoublePredicate
- DoubleFunction
- DoubleUnaryOperator
- DoubleBinaryOperator

### Usage
Each interface is accompanied by examples demonstrating how to use it in various scenarios. These examples are provided as Java code snippets along with explanations to help you understand their usage and behavior.

To use these interfaces in your projects, simply import them from the java.util.function package:

```java
import java.util.function.IntSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.IntBinaryOperator;
```

##  Lexical scoping of Lambda Expressions

Lexical scoping of lambda expressions in Java refers to the ability of a lambda expression to access variables from its surrounding context. In lexical scoping, the variables that are accessible to a lambda expression are determined by the code structure (the lexical scope) where the lambda expression is defined, rather than where it is executed.

In Java, lambda expressions can access variables from the enclosing scope if those variables are effectively final or effectively final. An effectively final variable is one whose value does not change after it is initialized, even though it might not be explicitly declared as final. Lambda expressions can access such variables without any issues.

Here's a simple example to illustrate lexical scoping of lambda expressions in Java:

```java
public class LexicalScopingExample {
    public static void main(String[] args) {
        int x = 10; // Outer variable
        
        // Lambda expression accessing outer variable
        Runnable runnable = () -> {
            System.out.println("Value of x: " + x);
        };
        
        runnable.run(); // Output: Value of x: 10
    }
}
```
In this example, the lambda expression accesses the variable x from its surrounding context. Since x is effectively final (its value doesn't change after initialization), the lambda expression can access it without any issues.

Lexical scoping allows lambda expressions in Java to capture and use variables from their enclosing scope, which enables concise and expressive code in functional programming paradigms.

## this and super keywords inside Lambda expression 
Understanding how `this` and `super` behave within lambda expressions is crucial for writing clean and effective code, especially in object-oriented programming scenarios.

### Examples
#### 1. Using `this` Inside Lambda Expression

```java
public class ThisSuperExample {
    private String name = "Example";

    public void exampleMethod() {
        Runnable runnable = () -> {
            // Accessing instance variable using 'this' inside lambda expression
            System.out.println("Name using 'this': " + this.name);
        };
        runnable.run();
    }

    public static void main(String[] args) {
        ThisSuperExample example = new ThisSuperExample();
        example.exampleMethod(); // Output: Name using 'this': Example
    }
}
```
#### 2. Using super Inside Lambda Expression
```java
class Parent {
    String name = "Parent";

    public void printName() {
        System.out.println("Parent class name: " + name);
    }
}

public class ThisSuperExample extends Parent {
    String name = "Child";

    public void exampleMethod() {
        Runnable runnable = () -> {
            // Accessing superclass instance variable using 'super' inside lambda expression
            super.printName(); // Output: Parent class name: Parent
        };
        runnable.run();
    }

    public static void main(String[] args) {
        ThisSuperExample example = new ThisSuperExample();
        example.exampleMethod();
    }
}
```

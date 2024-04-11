# Generics in Java 📚
Generics in Java are a powerful feature that allow you to write code that can work with different types while providing compile-time type safety. They were introduced in Java 5 to enable developers to create classes, interfaces, and methods that operate on a wide range of data types without sacrificing type safety.
## Why we need Generics in java
Generics in Java serve several important purposes :

**Type Safety :** Generics provide compile-time type checking, which helps catch type-related errors at compile time rather than runtime. This ensures that you cannot insert the wrong type of object into a generic container, reducing the likelihood of bugs and making code more robust.

**Code Reusability :** Generics enable you to write code that can operate on a wide range of data types without sacrificing type safety. This promotes code reuse, as you can write generic classes, interfaces, and methods that work with different types of data.

**Abstraction :** Generics allow you to write code that is more abstract and flexible, as it can work with different types of data. This promotes cleaner, more modular code that is easier to maintain and extend.

**Performance :** Generics can improve performance by eliminating the need for type casting in many situations. This can lead to more efficient code execution, especially in performance-critical applications.

**API Design :** Generics enable you to design APIs that are more flexible and easier to use. By using generics, you can create APIs that are type-safe and provide better compile-time checking, leading to improved usability and readability.

Overall, generics in Java are essential for writing robust, reusable, and type-safe code, and they play a crucial role in modern Java programming. They help improve code quality, maintainability, and performance, making them an indispensable feature of the language.
## Generic Class
GenericClass.java
```java
public class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printType() {
        System.out.println("Type of data: " + data.getClass().getName());
    }
}
```
### GenericClass<T> in Java

This is a simple Java class `GenericClass<T>` that demonstrates the use of generics in Java programming.

The `GenericClass<T>` is a generic class, where `T` is a type parameter. This allows the class to be flexible in handling different data types without the need for explicit casting.

## Usage

1. **Instantiate GenericClass with a specific data type:**

    ```java
    // Instantiate GenericClass with String data
    GenericClass<String> stringGenericClass = new GenericClass<>("Hello, world!");
    ```

2. **Set and Get Data:**

    ```java
    // Set new data
    stringGenericClass.setData("New data");

    // Get data
    String data = stringGenericClass.getData();
    ```

3. **Print Type:**

    ```java
    // Print the type of data
    stringGenericClass.printType();
    ```

### Example

```java
public class Main {
    public static void main(String[] args) {
        // Instantiate GenericClass with String data
        GenericClass<String> stringGenericClass = new GenericClass<>("Hello, world!");

        // Set new data
        stringGenericClass.setData("New data");

        // Get data
        String data = stringGenericClass.getData();
        System.out.println("Data: " + data);

        // Print the type of data
        stringGenericClass.printType();
    }
}
```
## Generic Methods
Generic methods are methods that introduce their own type parameters. This allows you to create methods that operate on parameterized types. They are essential in writing reusable and type-safe code in Java. This README provides an overview of generic methods in Java and how to use them effectively.
### Why Use Generic Methods?
- **Reusability**: Generic methods allow you to write methods that can work with any type, enhancing code reusability.
- **Type Safety**: With generic methods, you can catch type mismatches at compile time, reducing runtime errors.
- **Cleaner Code**: By using generics, you can write cleaner and more concise code, avoiding the need for casting.
### Syntax

A generic method declaration looks like a regular method declaration, except that it includes a type parameter section delimited by angle brackets (< and >) before the method's return type.

```java
public <T> void methodName(T parameter) {
    // Method implementation
}
```
#### Example
```java
package com.eazybytes.generics;

public class GenericMethodDemo {

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
        Integer[] intArray = {1,2,3,4,5};
        printArray(intArray);
    }

    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.println(element);
        }
    }

}
```
## Collections without Generics
Java collections framework provides a set of classes and interfaces to store and manipulate groups of objects. Before the introduction of generics, these collections could hold any type of objects, which could lead to runtime errors if the wrong type of object was added or retrieved.
#### Example
```java
package com.eazybytes.generics;

import java.util.ArrayList;

public class WithOutGenericsDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(true);

        String greeting = (String) list.get(0);
        int number = (Integer) list.get(1);
        boolean flag = (Boolean) list.get(2);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        // list1.add(123);
        // list1.add(true);

        String greeting1 = list1.get(0);
        // int number = (Integer) list.get(1);
        // boolean flag = (Boolean) list.get(0);

    }

}
```
## Covariance
### What is Covariance?
Covariance is a concept in object-oriented programming that allows a subclass to override a method in its superclass with a return type that is a subclass of the return type of the superclass method. This enables more flexibility in method overriding and allows for a more specific return type in the subclass.

In Java, covariance is primarily used in the context of method overriding and return types in inheritance hierarchies.
### Understanding Covariance
In Java, covariance can be illustrated with the use of method overriding and inheritance. Consider a scenario where you have a superclass `Animal` and a subclass `Dog` that extends `Animal`. If the `Animal` class has a method `makeSound()` that returns an `Animal` object, the `Dog` class can override this method to return a `Dog` object instead, thanks to covariance.
#### Example
```java
class Animal {
    Animal makeSound() {
        System.out.println("Some sound");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog makeSound() {
        System.out.println("Woof");
        return new Dog();
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }
}
```
In this example, the `makeSound()` method in the `Dog` class overrides the same method in the `Animal` class with a more specific return type (Dog).
## Upper Bound Wildcards
Upper bound wildcards in Java are a feature of generics that allow greater flexibility when working with generic types. They are denoted by the `<? extends T>` syntax, where `T` is a specific type. 
### What are Upper Bound Wildcards?
Upper bound wildcards are used when you want to specify that a parameterized type may be any subtype of a certain type. For instance, if you have a method that accepts a List of any type that is a subtype of Number, you can use an upper bound wildcard to indicate this:
```java
public void processNumbers(List<? extends Number> numbers) {
    // Method implementation
}
```
This method can accept a `List<Integer>`, `List<Double>`, or any other `List` containing elements that extend Number.
### Key Points to Remember
- Upper bound wildcards are indicated by <? extends T> where T is the upper bound type.
- They allow methods to accept generic types that are subtypes of a specific type.
- When using upper bound wildcards, you can only read from the collection, not write to it. This is because the compiler cannot guarantee the type safety of adding elements to the collection.
- Upper bound wildcards are useful when you want to write methods that operate on collections of objects of unknown types but with a certain upper limit.

#### Example
```java
import java.util.List;

public class UpperBoundExample {
    public static double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Double> doubles = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Sum of integers: " + sum(integers)); // Output: Sum of integers: 15.0
        System.out.println("Sum of doubles: " + sum(doubles));   // Output: Sum of doubles: 16.5
    }
}
```
In this example, the sum method can accept both List<Integer> and List<Double> because they both extend Number.

### Conclusion
Upper bound wildcards in Java provide a powerful tool for writing flexible and reusable code when working with generic types. By using them, you can create methods that accept collections of any subtype of a specific type, enhancing the versatility of your code.
## Lower Bounded Wildcards
This Java project demonstrates the use of lower bounded wildcards in Java generics. Lower bounded wildcards are used to relax the restrictions on the type of objects that can be passed as arguments to a method. This README provides an overview of how lower bounded wildcards work and includes examples to illustrate their usage.
### What are Lower Bounded Wildcards?
- In Java generics, wildcards (`?`) can be used to represent unknown types. Lower bounded wildcards are denoted by `<? super T>`, where `T` is a specific type. Lower bounded wildcards allow for greater flexibility when dealing with generic types by specifying that the type parameter must be either of type `T` or a superclass of `T`.
- Consider a scenario where we have a method `addAllNumbers` that adds numbers from a list to another list. We want to ensure that the destination list can accept any type that is a superclass of `Number`. We can achieve this using a lower bounded wildcard.
```java
import java.util.List;

public class LowerBoundedWildcardExample {

    public static void addAllNumbers(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20.5);

        List<Integer> integers = Arrays.asList(1, 2, 3);

        addAllNumbers(numbers, integers);

        System.out.println("Combined List: " + numbers);
    }
}
```
In this example, the `addAllNumbers` method accepts a destination list (dest) with a lower bounded wildcard `<? super Number>`, which means it can accept any type that is a superclass of Number. The source list (src) uses an upper bounded wildcard `<? extends Number> to specify that it can accept any subtype of Number. This allows us to add elements from the source list to the destination list without worrying about the specific type of elements in the source list.
## Unbounded Wildcards in Java
In Java, wildcards are used in generics to represent an unknown type. Unbounded wildcards, denoted by the question mark (?), allow flexibility by accepting any type. They are particularly useful when the code doesn't rely on the specific type of objects in a generic class or method.
### Syntax
The syntax for an unbounded wildcard is simply a question mark (?).

```java
List<?> list;
```
### Use Cases
Unbounded wildcards are commonly used in the following scenarios:

When the code is agnostic about the type: If the code doesn't depend on the specific type of objects in a generic class or method, unbounded wildcards can be used to provide flexibility.

When working with collections of unknown types: When dealing with collections where the type of elements is unknown or irrelevant, unbounded wildcards can be used to ensure compatibility.

As a parameter or return type in methods: Unbounded wildcards can be used as parameter types or return types in methods to accept or return any type of object.


### Examples
### Example 1: Using Unbounded Wildcards with Collections
```java
import java.util.List;

public class UnboundedWildcardsExample {
    public static double sum(List<?> list) {
        double sum = 0.0;
        for (Object obj : list) {
            if (obj instanceof Number) {
                sum += ((Number) obj).doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of integers: " + sum(integers));
        System.out.println("Sum of doubles: " + sum(doubles));
    }
}
```
In this example, the sum method accepts a list of any type `(List<?>). It iterates over the elements of the list and sums up the values if they are instances of Number. This method can accept lists of integers, doubles, or any other numeric type.

### Example 2: Using Unbounded Wildcards with Methods
```java
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardsExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("Hello", "World");

        System.out.print("Integers: ");
        printList(integers);

        System.out.print("Strings: ");
        printList(strings);
    }
}
```
In this example, the printList method accepts a list of any type `(List<?>)`. It prints the elements of the list without knowing their specific type. This method can be used to print lists of integers, strings, or any other type.

### Conclusion
Unbounded wildcards `(?)` in Java generics provide flexibility when the code doesn't rely on the specific type of objects in a generic class or method. They are useful for scenarios where the type is unknown or irrelevant, allowing for more versatile and reusable code.

# Method References 📚
Method references in Java provide a way to refer to methods or constructors without invoking them. They are similar to lambda expressions but provide a more concise syntax when the lambda expression simply calls an existing method. Method references are particularly useful when you want to pass a method as an argument to another method or when you want to use a method as a functional interface implementation.

## Types of Method References
There are four main types of method references in Java:

- **Reference to a Static Method :** References a static method of a class.
- **Reference to an Instance Method of a Particular Object :** References an instance method of a specific object.
- **Reference to an Instance Method of an Arbitrary Object of a Particular Type :** References an instance method of an object determined at runtime.
Reference to a Constructor: References a constructor.

### Syntax
The syntax for method references depends on the type of method being referenced:

- **Reference to a Static Method :** ContainingClass::staticMethodName
- **Reference to an Instance Method of a Particular Object :** objectReference::instanceMethodName
- **Reference to an Instance Method of an Arbitrary Object of a Particular Type :** ContainingType::methodName
- **Reference to a Constructor :** ClassName::new

### Example 💡
Consider a list of strings that we want to sort using a case-insensitive comparison. We can achieve this using method references.

```java
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Mary");
        
        // Using lambda expression
        names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("Sorted names (lambda): " + names);
        
        // Using method reference
        names.sort(String::compareToIgnoreCase);
        System.out.println("Sorted names (method reference): " + names);
    }
}
```
In this example, String::compareToIgnoreCase is a method reference that refers to the compareToIgnoreCase method of the String class. It's equivalent to the lambda expression (s1, s2) -> s1.compareToIgnoreCase(s2).

### Benefits
Method references provide several benefits:

- **Conciseness :** They offer a more concise syntax compared to lambda expressions, especially when simply delegating to an existing method.
- **Readability :** They make the code more readable by clearly indicating which method is being used.
- **Reusability :** They promote code reuse by allowing you to reuse existing methods.
### Conclusion 🎉
Method references are a powerful feature introduced in Java 8 that provide a shorthand syntax for referencing methods or constructors. They offer conciseness, readability, and promote code reuse. Understanding and using method references effectively can lead to cleaner and more expressive Java code.

## Static Method References
Static method references in Java provide a concise and expressive way to refer to static methods using the `::` operator. This feature was introduced in Java 8 as part of the lambda expressions and method references enhancements.

### Syntax

The syntax for static method references is as follows:

```java
ContainingClass::staticMethodName
```

### Example 💡
Consider a scenario where you have a static method `staticMethod()` in a class `MyClass`. You can refer to this method using static method references as follows:

```java
public class MyClass {
    public static void staticMethod() {
        System.out.println("Hello from static method!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using static method references
        Runnable runnable = MyClass::staticMethod;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
```
In the above example, `MyClass::staticMethod` refers to the static method `staticMethod()` of the MyClass class.

### Advantages
**Conciseness :** Static method references provide a concise alternative to lambda expressions when referring to static methods.

**Readability :** They enhance the readability of code by providing a clear and direct reference to the method being invoked.

**Reusability :** Static method references enable reusing existing static methods without the need for additional code.

### Limitations
Access to Instance Variables: Static method references cannot access instance variables or instance methods directly. They operate only on the parameters passed to them.

Interface Method Compatibility: The method signature of the static method being referenced must match the functional interface's abstract method signature.

### Conclusion 🎉
Static method references in Java offer a convenient way to refer to static methods, improving code readability and conciseness. By leveraging this feature, developers can write cleaner and more expressive code while promoting code reuse and maintainability.

## Instance Method Reference
In Java, instance method reference is a feature introduced in Java 8 as part of the lambda expressions and functional interfaces enhancements. It provides a concise way to reference instance methods of objects as functional interfaces, particularly useful when those methods match the signature of the functional interface's abstract method.

Instance method reference is often used in conjunction with functional interfaces like `Function`, `Predicate`, `Consumer`, etc., where you want to refer to an existing method to implement the abstract method of the interface.

### Syntax

The syntax for instance method reference is as follows:

```java
ClassName::instanceMethodName
```

where ClassName is the name of the class containing the instance method.instanceMethodName is the name of the instance method.

### Example
Consider a simple example of sorting strings in alphabetical order using instance method reference:

```java
import java.util.Arrays;
import java.util.Comparator;

public class InstanceMethodReferenceExample {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Using lambda expression
        Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted names: " + Arrays.toString(names));

        // Using instance method reference
        Arrays.sort(names, String::compareTo);
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}
```
In this example, `String::compareTo` is an instance method reference that refers to the `compareTo` method of the String class. This method is compatible with the Comparator functional interface, which expects a method with the same signature.

### When to Use
Instance method reference is useful when:

You have an existing method that matches the signature of the abstract method of a functional interface.
You want to improve code readability by avoiding verbose lambda expressions.

### Conclusion 🎉
Instance method reference in Java provides a concise and readable way to refer to instance methods as functional interface implementations. It enhances code readability and promotes a more functional programming style in Java.

## Instance Method Reference Using Class Type
Instance method references in Java allow you to reference methods of an object. When using instance method references with a class type, you're essentially referring to a method of an object of that class. This can be useful when you want to pass a method as a functional interface parameter, such as in lambda expressions or streams.

## Example 💡

Suppose we have a class `MyClass` with an instance method `myMethod`:

```java
class MyClass {
    void myMethod() {
        System.out.println("Instance method called");
    }
}
```
We can use instance method references using Class Type as follows:
```java
// Define a functional interface
interface MyFunctionalInterface {
    void myMethod();
}

public class Demo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Using instance method reference with Class Type
        MyFunctionalInterface functionalInterface = obj::myMethod;

        // Calling the method through functional interface
        functionalInterface.myMethod();
    }
}
```
This will output:

```sql
Instance method called
```

## Demo of Constructor Reference
Constructor reference is a shorthand syntax for creating instances of functional interfaces. It's particularly useful when working with functional interfaces like `Supplier`, `Function`, `Consumer`, etc.

### Usage
The ConstructorReferenceDemo.java file contains examples of how to use constructor reference. It demonstrates creating instances of functional interfaces using constructor references.

### Example 💡
```java
import java.util.function.Supplier;

public class ConstructorReferenceDemo {

    // Define a simple class
    static class MyClass {
        private String message;

        MyClass(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        // Using constructor reference to create a new instance of MyClass
        Supplier<MyClass> supplier = MyClass::new;
        
        // Getting instance using supplier
        MyClass instance = supplier.get();
        
        // Outputting message from MyClass instance
        System.out.println(instance.getMessage());
    }
}
```

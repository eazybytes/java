# Optional class 📚
The `Optional` class was introduced in Java 8 to address the problem of null references. It provides a container object that may or may not contain a non-null value. This can be useful for methods that may or may not return a value or when dealing with potentially null values returned from external sources.

## Introduction

The `Optional` class is part of the `java.util` package and provides methods for working with potentially null values without encountering NullPointerExceptions.

## Usage

### Creating Optional Objects

You can create an `Optional` object using the static `of()` method, which requires a non-null value. Alternatively, you can use `ofNullable()` if the value might be null.

```java
import java.util.Optional;

Optional<String> nonEmpty = Optional.of("Hello");
Optional<String> empty = Optional.empty();
Optional<String> nullable = Optional.ofNullable(null);
```
### Accessing Values
You can retrieve the contained value using the get() method, but it's recommended to use methods like orElse() or orElseGet() to provide a default value if the optional is empty.

```java
String value = nonEmpty.get(); // "Hello"
String defaultVal = empty.orElse("Default Value");
String defaultValSupplier = empty.orElseGet(() -> "Default Value from Supplier");
```
### Handling Absent Values
To perform an action only if a value is present, you can use the ifPresent() method.

```java
nonEmpty.ifPresent(val -> System.out.println("Value is present: " + val));
```
### Best Practices
Avoid using `get()` method directly, prefer `orElse()` or `orElseGet()` to handle absent values safely.
Use `isPresent()` or `isEmpty()` to check if a value is present or absent.
Be cautious when using `orElseThrow()` as it may introduce unnecessary complexity.
### Examples 💡
Here's a simple example demonstrating the usage of Optional:

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        
        // Printing value if present
        optional.ifPresent(val -> System.out.println("Value is present: " + val));
        
        // Using orElse to provide default value
        String value = optional.orElse("Default Value");
        System.out.println("Value: " + value);
        
        // Using orElseThrow to throw exception if value is absent
        String val = optional.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
        System.out.println("Value: " + val);
    }
}
```
### Conclusion 🎉
The Optional class provides a concise and safe way to handle potentially null values in Java, reducing the risk of `NullPointerExceptions` and making code more readable and robust.

### ifPresent() Method
The `ifPresent()` method takes a consumer function as an argument and executes it if a value is present.

```java
optional.ifPresent(val -> System.out.println("Value is present: " + val));
```
### ifPresentOrElse() Method
Introduced in Java 9, the `ifPresentOrElse()` method executes one of two given actions, depending on whether a value is present or not.

```java
optional.ifPresentOrElse(
    val -> System.out.println("Value is present: " + val),
    () -> System.out.println("Value is absent")
);
```
### orElse() Method
The `orElse()` method returns the value if present, otherwise returns the specified default value.

```java
String value = optional.orElse("Default Value");
```
### orElseGet() Method
The `orElseGet()` method is similar to orElse(), but instead of a default value, it accepts a Supplier that provides the default value.

```java
String defaultValSupplier = empty.orElseGet(() -> "Default Value from Supplier");
```
### Best Practices
- Avoid using `get()` method directly, prefer `orElse()` or `orElseGet()` to handle absent values safely.
- Use `isPresent()` or `isEmpty()` to check if a value is present or absent.
- Be cautious when using `orElseThrow()` as it may introduce unnecessary complexity.
### Examples 💡
Here's a simple example demonstrating the usage of Optional:

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        
        // Printing value if present
        optional.ifPresent(val -> System.out.println("Value is present: " + val));
        
        // Using orElse to provide default value
        String value = optional.orElse("Default Value");
        System.out.println("Value: " + value);
        
        // Using orElseThrow to throw exception if value is absent
        String val = optional.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
        System.out.println("Value: " + val);
    }
}
```
### Conclusion 🎉
The Optional class provides a concise and safe way to handle potentially null values in Java, reducing the risk of `NullPointerExceptions` and making code more readable and robust.

### orElseThrow() Method
The `orElseThrow()` method returns the value if present, otherwise throws an exception provided by the Supplier.

```java
String value = optional.orElseThrow(() -> new NoSuchElementException("Value is absent"));
```
### map() Method
The `map()` method applies a given function to the value if present and returns an Optional describing the result, or an empty Optional if the value is absent.

```java
Optional<Integer> lengthOptional = optional.map(String::length);
```
### filter() Method
The `filter()` method returns an Optional describing the value if a predicate is true, otherwise returns an empty Optional.

```java
Optional<String> filteredOptional = optional.filter(val -> val.startsWith("H"));
```
### Best Practices
- Avoid using `get()` method directly, prefer `orElse() or orElseGet() to handle absent values safely.
- Use `isPresent()` or `isEmpty()` to check if a value is present or absent.
- Be cautious when using orElseThrow() as it may introduce unnecessary complexity.
### Examples 💡
Here's a simple example demonstrating the usage of Optional:

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        
        // Printing value if present
        optional.ifPresent(val -> System.out.println("Value is present: " + val));
        
        // Using orElse to provide default value
        String value = optional.orElse("Default Value");
        System.out.println("Value: " + value);
        
        // Using orElseThrow to throw exception if value is absent
        String val = optional.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
        System.out.println("Value: " + val);
    }
}
```
### Conclusion 🎉
The Optional class provides a concise and safe way to handle potentially null values in Java, reducing the risk of NullPointerExceptions and making code more readable and robust.
### Quick tip to filter Null elements with Stream API
You can filter out null elements from a Stream using the `filter()` method along with a null-check condition. Here's a quick tip using the Stream API:

```java
import java.util.stream.Stream;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> listWithNulls = List.of("a", null, "b", null, "c");

        // Filter out null elements using Stream API
        List<String> listWithoutNulls = listWithNulls.stream()
                                                      .filter(Objects::nonNull)
                                                      .toList();

        // Print the list without null elements
        System.out.println("List without nulls: " + listWithoutNulls);
    }
}
```
In this example:

- We have a list `listWithNulls` containing some elements along with null values.
- We use the `stream()` method to convert the list into a Stream.
- We apply the `filter()` method with a predicate Objects::nonNull to exclude null elements.
- Finally, we collect the filtered elements into a new list using the `toList()` method introduced in Java 16.
- This results in a new list `listWithoutNulls` containing only non-null elements.

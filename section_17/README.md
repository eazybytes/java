# Lists and ArrayLists
## List Interface
The List interface in Java is a part of the Java Collections Framework. It extends the Collection interface and represents an ordered collection of elements where elements can be accessed and inserted by their index. Lists in Java allow duplicate elements and can hold elements of different data types. The List interface provides various methods to perform operations such as insertion, deletion, searching, and iteration over elements.
### Key Features
- **Ordered Collection**: Lists maintain the order of elements as they are inserted.
- **Allows Duplicates**: Lists can contain duplicate elements.
- **Random Access**: Elements in a List can be accessed using their index.
- **Dynamic Size**: Lists automatically resize themselves as elements are added or removed.
### Implementations
Java provides several implementations of the List interface, each with its own characteristics:

1. **ArrayList**: Implements a dynamic array that can grow as needed. Provides fast random access and is suitable for storing large collections of elements.
   
2. **LinkedList**: Implements a doubly linked list, which allows for efficient insertion and deletion operations at the beginning, middle, or end of the list. It is not suitable for random access but provides better performance for frequent insertion and deletion operations.
   
3. **Vector**: Similar to ArrayList but is synchronized, making it thread-safe. However, it is less efficient than ArrayList in terms of performance.
   
4. **Stack**: Extends Vector and represents a last-in, first-out (LIFO) stack of objects.
###  Common Operations
- **Adding Elements**: `add(E element)`, `add(int index, E element)`
- **Accessing Elements**: `get(int index)`, `indexOf(Object o)`
- **Removing Elements**: `remove(Object o)`, `remove(int index)`
- **Size and Empty Check**: `size()`, `isEmpty()`
- **Iteration**: Using enhanced for loop or iterators.
### Example

```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> names = new ArrayList<>();
        
        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Accessing elements
        System.out.println("First name: " + names.get(0));
        
        // Iterating over elements
        for (String name : names) {
            System.out.println(name);
        }
        
        // Removing an element
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);
    }
}
```
### Conclusion
The List interface in Java is a fundamental part of the Java Collections Framework, providing a versatile and efficient way to manage ordered collections of elements. With implementations like ArrayList, LinkedList, Vector, and Stack, Java developers have a variety of options to choose from based on their specific requirements for performance, thread safety, and usage patterns.

Whether you need fast random access, efficient insertion and deletion, or thread-safe operations, the List interface has you covered. By leveraging its rich set of methods and features, you can build robust and scalable applications in Java.

Keep exploring the Java Collections Framework and experiment with different List implementations to discover the most suitable solution for your projects.
## ArrayList
ArrayList is a part of the Java Collection Framework and is a dynamic array that can resize itself when elements are added or removed. It is similar to arrays, but with the ability to dynamically resize itself. ArrayList is implemented in the `java.util` package.
###  Features
- **Dynamic Sizing**: ArrayList can dynamically resize itself to accommodate more elements.
- **Random Access**: Elements can be accessed using their index, allowing for fast random access.
- **Generic**: ArrayList is a generic class, allowing it to store elements of any data type.
- **Iterable**: Implements the Iterable interface, allowing for easy iteration over its elements.
- **Automatic Boxing and Unboxing**: ArrayList automatically handles the conversion between primitive types and their corresponding wrapper classes.
### Creating an ArrayList
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
```
### Adding Elements
```java
list.add("Java");
list.add("Python");
list.add("C++");
```
### Accessing Elements
```java
String element = list.get(0);
System.out.println(element); // Output: Java
```
### Removing Elements
```java
list.remove("Python");
```
### Iterating over ArrayList
```java
for (String item : list) {
    System.out.println(item);
}
```
### Other Operations
**size() :** Returns the number of elements in the ArrayList.
**isEmpty() :** Returns true if the ArrayList is empty, false otherwise.
**contains(Object o) :** Returns true if the ArrayList contains the specified element.
**clear() :** Removes all elements from the ArrayList.
### Performance
- Insertion/Deletion: O(n)
- Random Access: O(1)
- Search: O(n)
### Thread Safety
ArrayList is not thread-safe. If multiple threads access an ArrayList concurrently and at least one of the threads modifies the list structurally, it must be synchronized externally.
## Diamond Operator
The diamond operator (`<>`) in Java is a feature introduced in Java 7 that simplifies the use of generics. It allows you to instantiate a generic class without specifying the type arguments if the compiler can infer the type arguments from the context.
### Usage
Consider the following example:
```java
// Before Java 7
List<String> list = new ArrayList<String>();

// With Diamond Operator (Java 7+)
List<String> list = new ArrayList<>();
```
In the second line of the example, the type arguments <String> are omitted after new ArrayList<>. The compiler infers the type arguments from the declaration of list.
### Benefits
Using the diamond operator provides several benefits:

**Conciseness :** It reduces boilerplate code by omitting redundant type arguments.
**Readability :** The code becomes cleaner and easier to read, especially for complex generic types.
**Maintainability :** It simplifies code maintenance as there are fewer explicit type declarations to update when modifying code.
### Limitations
While the diamond operator offers convenience, there are certain limitations to be aware of:

**Type Inference :** The type inference performed by the compiler may not always produce the expected results, especially in complex scenarios.
**Compatibility :** Code using the diamond operator is not compatible with Java versions prior to Java 7.
### Best Practices
To make the most of the diamond operator, consider the following best practices:

**Use Where Appropriate :** Apply the diamond operator where type inference is straightforward and enhances code readability.
**Avoid Overuse :** While the diamond operator reduces verbosity, avoid overusing it in scenarios where explicit type arguments are necessary for clarity.
**Keep Code Compatible :** Ensure that your codebase is compatible with Java 7 or higher if you plan to utilize the diamond operator extensively.
### Conclusion
The diamond operator in Java is a convenient feature for simplifying generic type instantiation. By allowing type inference, it reduces boilerplate code and enhances code readability. However, it's important to use it judiciously and be aware of its limitations to maintain code clarity and compatibility.
## Creating Immutable List Objects
In Java, immutable objects are objects whose state cannot be modified after they are created. This prevents unintended changes to the object's data and promotes safer, more predictable code. Immutable list objects are particularly useful when you need to ensure that a collection of elements remains unchanged throughout the program's execution.
###  Why Use Immutable Lists?
- **Thread Safety**: Immutable lists are inherently thread-safe because their state cannot change once they are created. This eliminates the need for synchronization and helps prevent concurrency issues.
  
- **Predictable Behavior**: Since immutable lists cannot be modified after creation, they provide predictable behavior, making it easier to reason about your code and avoid unexpected side effects.
  
- **Security**: Immutable lists can be shared freely without the risk of their contents being altered. This is especially important when dealing with sensitive data or in distributed systems.
### How to Create Immutable Lists
- Using `Collections.unmodifiableList()`
```java
import java.util.*;

public class ImmutableListExample {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        mutableList.add("Orange");

        List<String> immutableList = Collections.unmodifiableList(mutableList);

        // Attempting to modify the immutable list will throw UnsupportedOperationException
        // immutableList.add("Grapes"); // This will throw UnsupportedOperationException
    }
}
```
### Using List.of() (Java 9 and later)
```java
import java.util.*;

public class ImmutableListExample {
    public static void main(String[] args) {
        List<String> immutableList = List.of("Apple", "Banana", "Orange");

        // Attempting to modify the immutable list will throw UnsupportedOperationException
        // immutableList.add("Grapes"); // This will throw UnsupportedOperationException
    }
}
```

# Creating Immutable List Objects in Java

In Java, immutable objects are objects whose state cannot be modified after they are created. This prevents unintended changes to the object's data and promotes safer, more predictable code. Immutable list objects are particularly useful when you need to ensure that a collection of elements remains unchanged throughout the program's execution.

## Why Use Immutable Lists?

- **Thread Safety**: Immutable lists are inherently thread-safe because their state cannot change once they are created. This eliminates the need for synchronization and helps prevent concurrency issues.
  
- **Predictable Behavior**: Since immutable lists cannot be modified after creation, they provide predictable behavior, making it easier to reason about your code and avoid unexpected side effects.
  
- **Security**: Immutable lists can be shared freely without the risk of their contents being altered. This is especially important when dealing with sensitive data or in distributed systems.

## How to Create Immutable Lists in Java

Java provides several ways to create immutable lists:

### Using `Collections.unmodifiableList()`

```java
import java.util.*;

public class ImmutableListExample {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        mutableList.add("Orange");

        List<String> immutableList = Collections.unmodifiableList(mutableList);

        // Attempting to modify the immutable list will throw UnsupportedOperationException
        // immutableList.add("Grapes"); // This will throw UnsupportedOperationException
    }
}
```
Using List.of() (Java 9 and later)
```java
import java.util.*;

public class ImmutableListExample {
    public static void main(String[] args) {
        List<String> immutableList = List.of("Apple", "Banana", "Orange");

        // Attempting to modify the immutable list will throw UnsupportedOperationException
        // immutableList.add("Grapes"); // This will throw UnsupportedOperationException
    }
}
```
### Using Third-party Libraries
Several third-party libraries like Guava and Apache Commons Collections provide utilities for creating immutable lists. Here's an example using Guava:

```java
import com.google.common.collect.ImmutableList;

public class ImmutableListExample {
    public static void main(String[] args) {
        ImmutableList<String> immutableList = ImmutableList.of("Apple", "Banana", "Orange");

        // Attempting to modify the immutable list will throw UnsupportedOperationException
        // immutableList.add("Grapes"); // This will throw UnsupportedOperationException
    }
}
```
### Conclusion
Immutable lists in Java provide a convenient and safe way to work with collections of data. By ensuring that lists cannot be modified after creation, they help improve code clarity, maintainability, and reliability.
## Iterating ArrayList with for-each and Iterator()
### Iterating with Enhanced For Loop (for-each)
The enhanced for loop, also known as the for-each loop, provides a concise and readable way to iterate over elements in a collection such as an ArrayList.
```java
ArrayList<String> list = new ArrayList<>();
// Add elements to the ArrayList

for (String element : list) {
    System.out.println(element);
}
```
In this example, element represents each item in the `ArrayList` list, and the loop iterates through all elements of the list, printing each one.
### Iterating with Iterator
The `Iterator` interface provides a way to iterate over elements in a collection sequentially. It allows for safe removal of elements during iteration.
```java
ArrayList<String> list = new ArrayList<>();
// Add elements to the ArrayList

Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}
```
In this example, `iterator()` method returns an iterator over the elements in the ArrayList list. The `hasNext()` method checks if there are more elements to iterate over, and `next()` returns the next element in the iteration.

### Conclusion
Both the enhanced for loop and the Iterator interface provide effective ways to iterate over an ArrayList in Java. Choose the one that suits your coding style and requirements.
## Iterating ArrayList using listIterator()
In Java, the `ArrayList` class provides a convenient way to store and manipulate collections of objects dynamically. Iterating over elements of an `ArrayList` is a common operation. One way to iterate over an `ArrayList` is by using the `listIterator()` method, which allows traversal of the list in both forward and backward directions.
### 1. Import ArrayList and ListIterator classes
```java
import java.util.ArrayList;
import java.util.ListIterator;
```
### 2. Create an ArrayList
```java
ArrayList<String> arrayList = new ArrayList<>();
```
### 3. Add elements to the ArrayList
```java
arrayList.add("Element 1");
arrayList.add("Element 2");
arrayList.add("Element 3");
```
### 4. Iterate over the ArrayList using listIterator()
```java
ListIterator<String> iterator = arrayList.listIterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}
```
### 5. Iterate over the ArrayList in reverse order using listIterator()
```java
while (iterator.hasPrevious()) {
    String element = iterator.previous();
    System.out.println(element);
}
```
### Conclusion
Using listIterator() provides a flexible way to iterate over an ArrayList in both forward and backward directions. This allows for efficient traversal and manipulation of elements in the list.
## Sorting ArrayList in Java using `sort()`

This guide demonstrates how to sort an ArrayList in Java using the `sort()` method from the `java.util.Collections` class.

## Steps

1. **Create an ArrayList**: First, create an ArrayList and add elements to it. For example:
    ```java
    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(1);
            numbers.add(10);

            System.out.println("Original ArrayList: " + numbers);
        }
    }
    ```

2. **Sort the ArrayList**: Use the `sort()` method from the `java.util.Collections` class to sort the ArrayList. For example:
    ```java
    import java.util.Collections;

    // After adding elements to the ArrayList (numbers)
    Collections.sort(numbers);

    System.out.println("Sorted ArrayList: " + numbers);
    ```

3. **Complete code**:
    ```java
    import java.util.ArrayList;
    import java.util.Collections;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(1);
            numbers.add(10);

            System.out.println("Original ArrayList: " + numbers);

            Collections.sort(numbers);

            System.out.println("Sorted ArrayList: " + numbers);
        }
    }
    ```

## Conclusion
Sorting an ArrayList in Java is straightforward using the `sort()` method provided by the `java.util.Collections` class. This method arranges the elements of the ArrayList in ascending order.
##  Sorting ArrayList using Custom Comparator
In Java, you can sort an `ArrayList` using a custom comparator to define your own sorting logic. This is particularly useful when you want to sort objects based on certain criteria that are not directly supported by their natural ordering.
### Custom Comparator
A custom comparator is an implementation of the `Comparator` interface that defines how objects should be compared for sorting. You can create a custom comparator by implementing the `compare` method.

Here's a simple example of a custom comparator for sorting strings based on their lengths:

```java
```java
import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
```
### Sorting ArrayList using Custom Comparator
Once you have defined your custom comparator, you can use it to sort an `ArrayList` of objects. Here's how you can sort an `ArrayList` of strings using the StringLengthComparator:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");

        // Create an instance of the custom comparator
        StringLengthComparator comparator = new StringLengthComparator();

        // Sort the ArrayList using the custom comparator
        Collections.sort(strings, comparator);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
```
In this example, the ArrayList of strings is sorted based on their lengths using the `StringLengthComparator`.

### Conclusion
Using a custom comparator gives you the flexibility to define your own sorting logic when sorting `ArrayList` or any other collections in Java.
## Sorting ArrayList of Custom Data Type Using Comparable in Java

This guide will walk you through sorting an ArrayList of custom data types using the `Comparable` interface in Java. By implementing the `Comparable` interface, you can define a natural ordering for your custom objects, allowing them to be sorted using built-in sorting methods.


## Steps

### 1. Define Your Custom Data Type

First, you need to define a class for your custom data type. Ensure that it implements the `Comparable` interface and overrides the `compareTo()` method to define the natural ordering of objects.

```java
public class CustomObject implements Comparable<CustomObject> {
    private int value;

    public CustomObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(CustomObject other) {
        // Implement comparison logic based on the 'value' field
        return Integer.compare(this.value, other.value);
    }
}
```
### 2. Create and Populate ArrayList
Next, create an ArrayList of your custom data type and populate it with objects.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<CustomObject> customList = new ArrayList<>();
        customList.add(new CustomObject(5));
        customList.add(new CustomObject(2));
        customList.add(new CustomObject(8));
    }
}
```
### 3. Sort ArrayList
Use the `Collections.sort()` method to sort the ArrayList. Since your custom data type implements the Comparable interface, it will automatically use the `compareTo()` method for sorting.

```java
Collections.sort(customList);
```
### 4. Complete Example
Here's the complete example:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<CustomObject> customList = new ArrayList<>();
        customList.add(new CustomObject(5));
        customList.add(new CustomObject(2));
        customList.add(new CustomObject(8));

        // Sort the ArrayList
        Collections.sort(customList);

        // Print sorted ArrayList
        for (CustomObject obj : customList) {
            System.out.println(obj.getValue());
        }
    }
}

class CustomObject implements Comparable<CustomObject> {
    private int value;

    public CustomObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(CustomObject other) {
        return Integer.compare(this.value, other.value);
    }
}
```
### Conclusion
Using the `Comparable` interface in Java allows you to define the natural ordering of custom objects, enabling you to easily sort `ArrayLists` containing these objects. By following the steps outlined in this guide, you can effectively sort `ArrayLists` of custom data types using `Comparable` in Java.
## Sorting ArrayList of Custom Data Type using Comparator in Java

This guide demonstrates how to sort an ArrayList containing custom data types in Java using the `Comparator` interface.


### Sorting ArrayList of Custom Data Type

1. **Create your custom data type:** Define a class representing your custom data type. For example, let's consider a `Person` class with `name` and `age` attributes.

    ```java
    public class Person {
        private String name;
        private int age;
        
        // Constructor, getters, and setters
    }
    ```

2. **Implement Comparator interface:** Implement the `Comparator` interface to define custom comparison logic for your custom data type. Override the `compare` method.

    ```java
    import java.util.Comparator;

    public class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            // Custom comparison logic, e.g., comparing by age
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }
    ```

3. **Sort ArrayList using Comparator:** Use the `Collections.sort()` method to sort the ArrayList using your custom Comparator.

    ```java
    import java.util.ArrayList;
    import java.util.Collections;

    public class Main {
        public static void main(String[] args) {
            // Create ArrayList of Person objects
            ArrayList<Person> people = new ArrayList<>();
            people.add(new Person("Alice", 30));
            people.add(new Person("Bob", 25));
            people.add(new Person("Charlie", 35));
            
            // Sort the ArrayList using Comparator
            Collections.sort(people, new PersonComparator());
            
            // Print sorted ArrayList
            for (Person person : people) {
                System.out.println(person.getName() + ", " + person.getAge());
            }
        }
    }
    ```

### Running the Code

1. Compile the Java files: `javac Main.java Person.java PersonComparator.java`
2. Run the compiled Java program: `java Main`

You should see the sorted list of `Person` objects printed in the console.

### Conclusion

Sorting an ArrayList of custom data types in Java using Comparator provides flexibility in defining custom comparison logic. By implementing the `Comparator` interface, you can sort the ArrayList based on any attributes or criteria specific to your application.

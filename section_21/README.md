# Set in Java 📚
In Java, a Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction and provides methods to perform set operations such as union, intersection, and difference. Sets do not guarantee the order of elements, and they typically do not have methods to access elements by index.

Java provides several implementations of the Set interface, including HashSet, TreeSet, and LinkedHashSet.


**HashSet :** It stores elements using a hash table, which provides constant-time performance for basic operations like add, remove, and contains, assuming a good hash function is used. However, it does not maintain the insertion order of elements.

**TreeSet :** It maintains elements in sorted order (according to their natural ordering or a custom Comparator provided at construction time). It is implemented as a red-black tree, providing guaranteed `log(n)` time cost for the basic operations.

**LinkedHashSet :** It maintains the insertion order of elements, in addition to providing the Set interface's functionalities. It achieves this by using a doubly linked list internally.
## HashSet 📚
HashSet is a part of the Java Collections Framework and provides an unordered collection of unique elements.
### Example 💡

Here's a simple example demonstrating the usage of HashSet:

```java
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Displaying the HashSet
        System.out.println("HashSet: " + fruits);

        // Adding a duplicate element
        fruits.add("Apple");

        // Displaying the HashSet after adding a duplicate element
        System.out.println("HashSet after adding duplicate element: " + fruits);

        // Removing an element
        fruits.remove("Banana");

        // Displaying the HashSet after removing an element
        System.out.println("HashSet after removing an element: " + fruits);

        // Checking if an element exists
        System.out.println("Does HashSet contain Orange? " + fruits.contains("Orange"));

        // Clearing the HashSet
        fruits.clear();

        // Displaying the HashSet after clearing
        System.out.println("HashSet after clearing: " + fruits);
    }
}
```
Output:
```java
HashSet: [Apple, Orange, Banana]
HashSet after adding duplicate element: [Apple, Orange, Banana]
HashSet after removing an element: [Apple, Orange]
Does HashSet contain Orange? true
HashSet after clearing: []
```
### Iterating HashSet
### Using Iterator:
```java
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Iterating through the HashSet using Iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
```
### Using Enhanced For Loop:
```java
import java.util.HashSet;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Iterating through the HashSet using enhanced for loop
        for (String element : set) {
            System.out.println(element);
        }
    }
}
```
### Conclusion  🎉
In conclusion, HashSet in Java provides a powerful and efficient way to store unique elements. It offers constant-time performance for basic operations like adding, removing, and checking for the presence of elements. HashSet is based on a hash table data structure, which ensures fast retrieval and storage of elements.

Here are some key points to remember about HashSet:

Unique Elements: HashSet does not allow duplicate elements. It ensures that each element is unique within the set.

**Hashing :** HashSet uses hashing to store elements. This ensures that elements are distributed evenly across the internal data structure, providing fast access and retrieval.

**Performance :** HashSet offers constant-time performance for basic operations, such as add, remove, and contains, making it ideal for scenarios where fast access to unique elements is required.

**No Ordering :** HashSet does not maintain any order of elements. Elements are stored based on their hash codes, and the order of insertion is not preserved.

**Iterating :** While HashSet does not provide any specific order of iteration, you can iterate through the elements using an iterator or enhanced for loop.

**Concurrency :** HashSet is not thread-safe. If multiple threads need to access a HashSet concurrently, external synchronization is required.

**Null Elements :** HashSet allows the insertion of a single null element.

HashSet is part of the Java Collections Framework and is widely used in various applications where a collection of unique elements is required.

In summary, HashSet in Java is a versatile and efficient data structure for storing unique elements, offering excellent performance and ease of use for developers.
## TreeSet 📚
`TreeSet` is a part of the Java Collections Framework and implements the `Set` interface. It provides an ordered collection of unique elements, where the elements are stored in a sorted tree structure.

In this demo, we'll cover the following:
- Creating a TreeSet
- Adding elements to the TreeSet
- Removing elements from the TreeSet
- Performing basic operations like checking for element existence and getting the size of the TreeSet
### Example 💡
```java
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");

        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Removing an element
        treeSet.remove("Banana");

        // Displaying the TreeSet after removal
        System.out.println("TreeSet after removal: " + treeSet);

        // Checking if an element exists
        System.out.println("Contains Orange? " + treeSet.contains("Orange"));

        // Getting the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

       // Iterate over the TreeSet using Iterator
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

       // Iterate over the TreeSet using Enhanced For Loop
        for (String element : treeSet) {
            System.out.println(element);
        }   
    }
}
```
### Conclusion 🎉
TreeSet class in Java is a powerful implementation of the Set interface that provides a sorted set of unique elements. Here's a summary of its key features and advantages:

**Ordered Collection :** TreeSet maintains elements in sorted order, according to their natural ordering or a specified comparator.

**Unique Elements :** Like other implementations of the Set interface, TreeSet ensures that it contains only unique elements. Duplicate elements are automatically discarded.

**Efficient Operations :** TreeSet offers efficient performance for basic operations such as insertion, deletion, and searching, with time complexity of O(log n) for most operations.

**Useful in Sorted Operations :** Its sorted nature makes TreeSet particularly useful for scenarios where elements need to be maintained in sorted order, such as when retrieving elements in a specific order.

**Backed by Red-Black Tree :** Internally, a TreeSet is backed by a Red-Black Tree, which is a self-balancing binary search tree. This ensures efficient insertion, deletion, and retrieval operations.

**Iterating Elements :** TreeSet provides various methods for iterating over its elements, including iterators, enhanced for loops, and Java 8 streams.

When using a TreeSet, it's important to consider the overhead of maintaining the sorted order, especially for large data sets. Additionally, the choice of comparator or relying on natural ordering can affect the behavior and performance of the TreeSet.

Overall, TreeSet is a versatile and efficient data structure for maintaining a sorted set of unique elements, making it a valuable tool in Java programming, especially when ordered collections are required.
## LinkedHashSet 📚
LinkedHashSet is a part of the Java Collections Framework that extends HashSet, providing a linked-list implementation of the Set interface. It maintains the insertion order of elements, which means that when you iterate through a LinkedHashSet using an iterator, the elements are returned in the order in which they were inserted.

### Features 🌟
**Insertion Order :** LinkedHashSet maintains the order in which elements are inserted.
**No Duplicate Elements :** Like HashSet, LinkedHashSet does not allow duplicate elements.
**Backed by a Hash Table :** Internally, it uses a hash table for storing elements, providing constant-time performance for basic operations such as add, remove, contains, and size.
### Usage  🚀
Initialization
```java
// Creating a LinkedHashSet of String type
LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

// Adding elements to the LinkedHashSet
linkedHashSet.add("Apple");
linkedHashSet.add("Banana");
linkedHashSet.add("Orange");
```
### Iteration
```java
// Iterating through the LinkedHashSet
for (String element : linkedHashSet) {
    System.out.println(element);
}
```
### Removing an Element
```java
// Removing an element from the LinkedHashSet
linkedHashSet.remove("Banana");
```
### Checking if an Element Exists
```java
// Checking if an element exists in the LinkedHashSet
boolean exists = linkedHashSet.contains("Orange");
```
### Size of LinkedHashSet
```java
// Getting the size of the LinkedHashSet
int size = linkedHashSet.size();
```
### Advantages over HashSet  🚀
- **Preserves Insertion Order :** LinkedHashSet preserves the order of elements insertion while HashSet does not.
- **Faster Iteration :** Iterating through a LinkedHashSet is generally faster compared to a HashSet because of its linked-list implementation.
### Limitations 🚫
- **Higher Memory Consumption :** LinkedHashSet consumes slightly more memory than HashSet because it maintains a doubly-linked list in addition to the hash table.
### When to Use
- Use LinkedHashSet when you need to maintain the order of insertion.
- If you require fast iteration over the elements and you don't have a concern about memory consumption, LinkedHashSet is a good choice.
## Creating Immutable Sets
Immutable sets in Java are sets whose contents cannot be changed after they are created. This ensures that once a set is created, its elements cannot be added, removed, or modified. Immutable sets are useful in scenarios where you want to guarantee that the data remains constant throughout the program execution.
### 1. Using `Collections.unmodifiableSet()`
This technique involves using the `Collections.unmodifiableSet()` method to create an immutable wrapper around an existing set.
```java
import java.util.*;

public class ImmutableSetExample {
    public static void main(String[] args) {
        Set<String> mutableSet = new HashSet<>();
        mutableSet.add("apple");
        mutableSet.add("banana");
        mutableSet.add("orange");

        Set<String> immutableSet = Collections.unmodifiableSet(mutableSet);

        // Any attempt to modify immutableSet will throw UnsupportedOperationException
        // immutableSet.add("grape"); // This will throw UnsupportedOperationException
    }
}
```
### Advantages of Immutable Sets
**Thread-safe :** Immutable sets are inherently thread-safe because their contents cannot be modified after creation.
**Security :** Immutable sets prevent accidental or malicious modification of data.
**Performance :** Immutable sets can be optimized by the compiler and runtime environment, leading to better performance in certain scenarios.
### Conclusion
Creating immutable sets in Java ensures data integrity and can simplify concurrent programming. Choose the technique that best fits your requirements and coding style.

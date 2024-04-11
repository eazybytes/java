# Map in Java 📚
In Java, a Map is an interface that represents a collection of key-value pairs. Each key in a Map must be unique, and it is used to retrieve its corresponding value. Map does not allow duplicate keys, but it allows duplicate values.

There are several implementations of the Map interface in Java, including:

**HashMap :** This implementation uses a hash table to store key-value pairs. It provides constant-time performance for basic operations (add, remove, get, contains), assuming the hash function disperses the elements properly among the buckets.

**TreeMap :** This implementation maintains its keys in sorted order. It is based on a Red-Black tree, providing log(n) time complexity for most operations.

**LinkedHashMap :** This implementation maintains the insertion order of the elements. It is implemented as a hash table with a linked list running through it, providing predictable iteration order.

These are some of the common implementations of the Map interface in Java, each suited for different use cases based on factors such as performance, order preservation, and key type.
## HashMap 📚
HashMap is a part of the Java Collections Framework and provides a convenient way to store key-value pairs.
### Features 🌟
**Add Key-Value Pair :** Demonstrates how to add key-value pairs to a HashMap.
**Retrieve Value by Key :** Shows how to retrieve values by providing the corresponding key.
**Update Value :** Illustrates updating the value associated with a key.
**Remove Key-Value Pair :** Shows how to remove key-value pairs from the HashMap.
**Iterate Over Entries :** Demonstrates how to iterate over all key-value pairs in the HashMap.
### Example  💡
Here's a simple example demonstrating the basic usage of the HashMap:

```java
import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);

        // Retrieve value by key
        System.out.println("Value associated with 'banana': " + hashMap.get("banana"));

        // Update value
        hashMap.put("apple", 25);

        // Remove key-value pair
        hashMap.remove("orange");

        // Iterate over entries
        System.out.println("All entries in the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}
```
### Iterating HashMap using values
```java
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);

        // Iterate over values
        System.out.println("All values in the HashMap:");
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
    }
}
```
### Conclusion  🎉
In conclusion, this demo showcases the basic functionality of the HashMap data structure in Java. It covers adding key-value pairs, retrieving values by keys, updating values, removing key-value pairs, and iterating over entries. The provided example code serves as a starting point for understanding how to use HashMaps in your Java projects.
## TreeMap 📚
The `TreeMap` class in Java is a part of the Java Collections Framework and provides an efficient way to store key-value pairs in a sorted order based on the natural ordering of its keys or by a custom comparator.
This demo will illustrate basic operations such as insertion, deletion, and retrieval of elements from a TreeMap.
### Example 💡

```java
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Inserting elements
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");

        // Removing an element
        treeMap.remove(2);

        // Displaying TreeMap contents
        System.out.println("TreeMap after operations: " + treeMap);
    }
}
```
### Conclusion 🎉
TreeMap in Java is a powerful data structure provided by the Java Collections Framework. It offers efficient storage of key-value pairs in a sorted order, either based on the natural ordering of its keys or using a custom comparator. The TreeMap provides logarithmic time complexity for most of its operations such as insertion, deletion, and retrieval, making it suitable for scenarios where sorted data and efficient search operations are required. With its versatility and performance characteristics, the TreeMap serves as a valuable tool for developers working on projects that involve the organization and manipulation of key-value data in a sorted manner.
## LinkedHashMap 📚
The `LinkedHashMap` class in Java is a part of the Java Collections Framework and extends the `HashMap` class. It maintains the insertion order of its elements, which means the order in which elements are inserted is preserved. Additionally, it also provides optional access-ordering, where the entries are ordered based on their access order.
This demo will illustrate basic operations such as insertion, deletion, and retrieval of elements from a LinkedHashMap.
#### Example 💡
```java
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Inserting elements
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(2, "Orange");

        // Removing an element
        linkedHashMap.remove(2);

        // Displaying LinkedHashMap contents
        System.out.println("LinkedHashMap after operations: " + linkedHashMap);
    }
}
```
### Conclusion 🎉
 LinkedHashMap in Java is a versatile data structure provided by the Java Collections Framework. It extends the HashMap class and maintains the insertion order of its elements, making it suitable for scenarios where the order of insertion needs to be preserved. Additionally, LinkedHashMap also offers optional access-ordering, allowing entries to be ordered based on their access patterns.

The LinkedHashMap provides efficient performance for basic operations such as insertion, deletion, and retrieval of elements. It combines the features of a HashMap with the ability to maintain the insertion order, making it a valuable tool for developers working on projects that require both fast lookup operations and preservation of the order in which elements are added.

With its flexibility and performance characteristics, the LinkedHashMap is a useful choice for a wide range of applications, from implementing caches to maintaining ordered collections of data.
## Creating Immutable Map Objects
Immutable objects are objects whose state cannot be modified after they are created. In Java, immutable objects are useful for ensuring thread safety, simplifying code, and avoiding unexpected side effects. Immutable maps, in particular, are useful for representing fixed collections of key-value pairs.
### Using Map.of()
Starting from Java 9, you can create immutable map objects using the `Map.of()` method. This method provides a convenient way to create small immutable maps with up to 10 key-value pairs.

```java
import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        // Creating an immutable map with three key-value pairs
        Map<String, Integer> immutableMap = Map.of(
            "key1", 1,
            "key2", 2,
            "key3", 3
        );

        // Attempting to modify the immutable map will result in an UnsupportedOperationException
        // immutableMap.put("key4", 4); // This will throw UnsupportedOperationException
    }
}
```
### Using Map.ofEntries()
If you need to create an immutable map with more than 10 key-value pairs, you can use the Map.ofEntries() method.

```java
import java.util.Map;
import java.util.Map.Entry;

public class ImmutableMapExample {
    public static void main(String[] args) {
        // Creating an immutable map with more than 10 key-value pairs
        Map<String, Integer> immutableMap = Map.ofEntries(
            Map.entry("key1", 1),
            Map.entry("key2", 2),
            Map.entry("key3", 3),
            // Add more entries as needed
        );

        // Attempting to modify the immutable map will result in an UnsupportedOperationException
        // immutableMap.put("key4", 4); // This will throw UnsupportedOperationException
    }
}
```
### Conclusion 🎉
Creating immutable map objects in Java using the `Map.of()` method provides a concise and convenient way to define fixed collections of `key-value` pairs. Whether you need a small map with up to 10 entries or a larger map with more entries, you can leverage these methods to ensure data integrity and thread safety in your applications.

Keep coding happily! 😊

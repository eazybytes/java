# LinkedList in Java 📚
In Java, LinkedList is a class that implements the List interface and represents a linked list data structure. It is a linear data structure where each element, known as a node, contains a reference to the next node in the sequence, forming a chain-like structure. Unlike arrays, which have contiguous memory allocation, linked lists use dynamic memory allocation, which allows for efficient insertion and deletion operations, especially in the middle of the list.

Here are some key points about LinkedList in Java:

**Node Structure :** Each node in a LinkedList contains two fields: the data field, which holds the element value, and the next field, which holds a reference to the next node in the sequence.

**Doubly Linked List :** In Java, the LinkedList class implements a doubly linked list, meaning each node contains references to both the next node and the previous node in the sequence. This allows for efficient traversal in both directions.

**Dynamic Size :** Unlike arrays, linked lists do not have a fixed size. They can grow or shrink dynamically as elements are added or removed.

**Random Access :** Unlike arrays, accessing elements in a linked list by index requires traversing the list from the beginning or end, which can be less efficient for large lists compared to arrays.

**Insertion and Deletion :** Linked lists excel at insertion and deletion operations, especially in the middle of the list, as they only require adjusting references between nodes, rather than shifting elements like in arrays.

Here's a simple example of how to use LinkedList in Java:

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Printing elements
        System.out.println("LinkedList: " + linkedList);

        // Removing an element
        linkedList.remove("Banana");
        System.out.println("LinkedList after removing 'Banana': " + linkedList);
    }
}
```
Output:
```java
LinkedList: [Apple, Banana, Orange]
LinkedList after removing 'Banana': [Apple, Orange]
```
## Iterating over a LinkedList
LinkedList is a class in Java that provides a linked-list data structure. It implements the List interface and provides methods to manipulate the elements in the list. Iterating over a LinkedList is a common operation in Java programming.
### Using Iterator
```java
import java.util.LinkedList;
import java.util.Iterator;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Using Iterator
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
```
### Using Enhanced for Loop
```java
import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Using Enhanced for Loop
        for(String element : linkedList) {
            System.out.println(element);
        }
    }
}
```
### Using ListIterator
```java
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Using ListIterator
        ListIterator<String> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }
    }
}
```
These are the common ways to iterate over a LinkedList in Java. Choose the method that suits your requirements best based on factors like performance, readability, and specific use case.
## Sorting a LinkedList Using Collections.sort()
Java's `Collections.sort()` method can be used to sort elements in a `LinkedList`. This method sorts the elements in their natural order or using a specified comparator.
### Example  💡
```java
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(1);

        System.out.println("Original LinkedList: " + linkedList);

        // Sorting using Collections.sort()
        Collections.sort(linkedList);

        System.out.println("Sorted LinkedList: " + linkedList);
    }
}
```

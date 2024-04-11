# Methods in Object Class
In Java, an `Object` class refers to any class that extends the fundamental base class, Object. Every class in Java implicitly or explicitly extends Object, which is the root of the class hierarchy.
## Object.getClass()
The `getClass()` method in Java is a part of the Object class, which is the root of the Java class hierarchy. It returns the runtime class of an object. In other words, it returns an instance of the Class class representing the runtime class of the object.
### Syntax
```java
public final Class<?> getClass()
```
### Return Value
- Returns the runtime class of this object.
#### Example
```java
package com.eazybytes.object.demo;

public class GetClassDemo {

    public static void main(String[] args) {
        Person person = new Person();
        Class prsnClass = person.getClass();
        System.out.println(prsnClass.getName());
        System.out.println(prsnClass.getSimpleName());
        System.out.println(prsnClass.getPackageName());
    }

}
```
### Usage
- Use `getClass()` when you need to determine the runtime class of an object at runtime.
- It's commonly used in scenarios where the exact type of an object needs to be identified dynamically.
### Notes
- The `getClass()` method is a final method and cannot be overridden.
- If the object is null, a `NullPointerException` will be thrown when getClass() is invoked on it.
### The getClass() method is a final method and cannot be overridden.
If the object is null, a NullPointerException will be thrown when getClass() is invoked on it.
## Object.hashCode()
In Java, `Object.hashCode()` is a method provided by the `Object` class, which is the root of the class hierarchy. This method returns a hash code value for the object. It is crucial for various algorithms, such as hashing-based collections like `HashMap` and `HashSet`.
### Syntax
```java
public int hashCode()
```
### Description
- Returns a hash code value for the object. This value is typically used to support hash-based collections.
- The general contract of hashCode method is:
  - Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same 
  - integer, provided no information used in equals comparisons on the object is modified.
  - If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.
  - It's not required that if two objects are unequal according to the equals(Object) method, then calling the hashCode method on each of the two objects must 
  - produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables.
#### Example
```java
public class MyClass {
    private String name;
    private int id;

    public MyClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }

    // other methods...
}
```
In this example, the `hashCode` method is overridden to generate a hash code based on the name and `id` fields of the object.
### Best Practices
- Consistency with `equals()` : If you override the `equals()` method, make sure to also override the `hashCode()` method and ensure that they are consistent with each other.
- Efficiency: While it's not strictly required that hash codes be unique, producing distinct hash codes for distinct objects can improve the performance of hash-based collections.
- Stable Hash Codes: Ensure that the hash code of an object remains the same over its lifetime, as long as the information used in `equals()` comparisons remains constant.
- Use in Collections: Be mindful when using objects with mutable state as keys in hash-based collections, as changing the state of the object after it has been used as a key can lead to unexpected behavior.
## Object.equals()
`Object.equals()` is a method in Java that is used to compare the equality of two objects. It is inherited by all classes in Java since all classes ultimately extend the `Object` class.
### Syntax
```java
public boolean equals(Object obj)
```
### Parameters
- `obj` : The object to be compared for equality with this object.
### Return Value
- `true` if the specified object is equal to this object.
- `false` otherwise.
### Usage
The `equals()` method is typically overridden in classes that need custom equality comparison. By default, it compares object references, i.e., whether the two object references point to the same memory location.
```java
public class MyClass {
    private int value;

    // Constructor, getters, setters...

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyClass myObj = (MyClass) obj;
        return value == myObj.value;
    }

    // Other methods...
}
```
In the above example, the `equals()` method is overridden to compare the `value` attribute of two `MyClass` objects for equality.
### Best Practices
- Override `equals()` when necessary : If your class needs a custom equality comparison, override the `equals()` method to provide it.
- Follow the contract: Ensure that your implementation of `equals()` satisfies the contract defined in the Java documentation.
- Override hashCode(): If you override `equals()`, it's recommended to also override the `hashCode()` method to maintain consistency.
```java
public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(10);

        System.out.println(obj1.equals(obj2));  // Output: true
    }
}
```
## Object.toString()
The `toString()` method in Java is a method provided by the `Object` class, which is the root of the Java class hierarchy. It returns a string representation of the object. The default implementation provided by the `Object` class returns a string consisting of the class name followed by the "@" character and the object's hashcode in hexadecimal format.
### Syntax
```java
public String toString()
```
### Return Value
- A string representation of the object.
#### Example 💡
```java
public class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(1, "Example");
        System.out.println(obj.toString());
    }
}
```
```java
MyClass{id=1, name='Example'}
```
### Usage  🚀
- Override the `toString()` method in your custom classes to provide a meaningful string representation of the object.
- Useful for debugging purposes to print object information.
- Used in logging or displaying object information to users.
### Notes  🚀 
If you don't override `toString()` in your custom class, you'll get the default implementation provided by the `Object` class, which may not provide meaningful information about the object.
## Object.finalize()
`Object.finalize()` is a method in Java that is called by the garbage collector on an object when garbage collection determines that there are no more references to the object. It's provided as a means for an object to perform cleanup operations before it is garbage collected.
However, it's important to note that `finalize()` is generally considered unreliable and should not be relied upon for critical resource cleanup. This is because there's no guarantee as to when or if the finalize method will be called.
### Usage 🚀
Here's a basic usage example:

```java
public class MyClass {
    // Override finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup operations
        } finally {
            // Call superclass finalize method
            super.finalize();
        }
    }
}
```
### Considerations
- **Unreliability :** As mentioned earlier, the finalize() method is not guaranteed to be called promptly or at all, so it should not be relied upon for critical cleanup tasks.
- **Performance :** Invoking finalize() can have performance implications due to its impact on garbage collection. Objects with finalizers may take longer to be collected than those without.
- **Alternative Approaches :** For resource cleanup, it's generally better to use other mechanisms such as try-with-resources statements (for managing resources that implement AutoCloseable) or explicit close() methods.
## Object.clone()
- In Java, `Object.clone()` is a method used to create a shallow copy of an object. This method is declared in the Object class and is protected, meaning it can be accessed only by the classes within the same package or subclasses.
- A shallow copy of an object is a new object that is created, but it shares the same fields (references) with the original object. That means if the original object contains references to other objects, the copied object will also refer to the same objects.
### Usage 🚀
To use `Object.clone()` effectively, follow these steps:
1. **Implement the Cloneable Interface :** The Cloneable interface must be implemented by the class whose objects are to be cloned. This is a marker interface, meaning it does not contain any methods.
```java
public class MyClass implements Cloneable {
    // Class definition
}
```
2. **Override the clone() Method :** Override the `clone()` method in the class to specify how the cloning operation should be performed.
```java
@Override
public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
```
It's important to throw CloneNotSupportedException if cloning is not supported by the class.
3. **Handle Exceptions :** Ensure that `CloneNotSupportedException` is properly handled either by catching it or declaring it in the method signature.

4. **Use clone() Method :** Call the `clone()` method on the object you want to clone.
```java
MyClass original = new MyClass();
try {
    MyClass copy = (MyClass) original.clone();
} catch (CloneNotSupportedException e) {
    e.printStackTrace();
}
```
### Important Points
- `Object.clone()` performs a shallow copy. If the object contains mutable fields, changes made in the cloned object will affect the original object and vice versa.
- Deep cloning can be achieved by overriding the `clone()` method to create a new object and copying all mutable fields recursively.
- `clone()` method returns Object, so explicit casting is required.
- It's recommended to use `clone()` judiciously, as it can lead to unexpected behavior, especially when dealing with mutable objects.
#### Example 💡
```java
public class MyClass implements Cloneable {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        MyClass original = new MyClass(1, "Original");
        try {
            MyClass copy = (MyClass) original.clone();
            System.out.println("Original: " + original.getId() + ", " + original.getName());
            System.out.println("Copy: " + copy.getId() + ", " + copy.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```
## Shallow Cloning and Deep Cloning
In Java, cloning allows you to create a copy of an object. There are two types of cloning: shallow cloning and deep cloning.
### Shallow Cloning
Shallow cloning creates a new object and copies all of the fields of the original object to the new object. However, if the field of the original object is a reference to another object, only the reference is copied, not the actual object itself. This means that changes made to the original object's referenced objects will also be reflected in the cloned object.
### Implementing Shallow Cloning
To implement shallow cloning in Java, you need to override the `clone()` method of the `Object` class and use the `super.clone()` method to create a shallow copy of the object.
```java
@Override
public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
```
### Deep Cloning
Deep cloning creates a new object and recursively copies all of the fields of the original object as well as all of its referenced objects. This ensures that changes made to the original object or its referenced objects do not affect the cloned object.
### Implementing Deep Cloning
Implementing deep cloning in Java requires a bit more effort compared to shallow cloning. One common approach is to serialize the original object and then deserialize it to create a deep copy.
```java
public static <T extends Serializable> T deepClone(T object) throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(object);
    oos.flush();
    oos.close();
    bos.close();

    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);
    T copy = (T) ois.readObject();
    ois.close();
    bis.close();

    return copy;
}
```
### Conclusion 🎉
- Understanding the differences between shallow cloning and deep cloning is crucial when working with objects in Java. Shallow cloning creates a new object with copies of the original object's fields, while deep cloning creates a new object with copies of both the original object's fields and its referenced objects.
- For simple objects, shallow cloning may be sufficient. However, for complex objects with nested references, deep cloning is often necessary to ensure that changes made to the original object do not affect the cloned object.
## Mutable vs Immutable Objects
In Java, objects can be classified into two categories based on whether they can be modified after creation: mutable and immutable. Understanding the difference between them is crucial for writing efficient and bug-free code.
### Mutable Objects
Mutable objects are those whose state (data) can be modified after creation. This means that the values of their fields can change over time.
#### Example: StringBuilder 💡
```java
```java
StringBuilder mutableStr = new StringBuilder("Hello");
mutableStr.append(", World!");
System.out.println(mutableStr); // Output: Hello, World!
```
### Immutable Objects
Immutable objects, on the other hand, are objects whose state cannot be modified after creation. Once instantiated, the values of their fields remain constant throughout their lifetime.
#### Example: String 💡
```java
String immutableStr = "Hello";
immutableStr.concat(", World!");
System.out.println(immutableStr); // Output: Hello
```
In the above example, the String object is immutable. Even though we call the `concat()` method, it doesn't modify the original string. Instead, it returns a new string with the concatenated value.
### Guidelines for Using Immutable Objects
- Immutable objects are inherently thread-safe because their state cannot change, making them ideal for concurrent programming.
- When designing classes, consider making them immutable if their state should not change once initialized.
- Immutable objects are suitable for use as keys in hash maps and for caching.
### Benefits of Immutability
- Simplified concurrent programming: Immutable objects can be shared across threads without the need for synchronization.
- Improved performance: Immutable objects can be cached and reused, leading to better memory management and potentially faster execution.
- Enhanced reliability: Since immutable objects cannot be changed, they are less prone to unexpected side effects or bugs caused by unintended modifications.
### When to Use Mutable Objects
While immutable objects offer several advantages, mutable objects are still necessary in many scenarios, especially when dealing with data that needs to be modified frequently or when performance is a concern.
### Conclusion 🎉
Understanding the distinction between mutable and immutable objects is essential for writing robust and efficient Java code. By leveraging immutable objects where appropriate, developers can improve code reliability, concurrency, and performance.
## Record Class
The `Record` class is a simple Java class designed to represent a record or entry in a data system. It provides a basic structure for storing information about a particular entity, such as a person, product, or event.
### Features
**Data Storage :** Stores information about a single entity.
**Immutability :** Once initialized, the data stored in a Record instance cannot be modified.
**Readability :** Provides methods to access individual fields of the record.
**Easy Integration :** Can be easily integrated into larger Java applications.
### Usage
To use the Record class in your Java project, follow these steps:
- **Download the `Record.java` file :** Download the Record.java file from this repository and add it to your project's source folder.

- **Create a Record Instance :** Create a new instance of the Record class by providing values for its fields.
```java
Record record = new Record("John Doe", 30, "john.doe@example.com");
```
- **Access Record Fields :** Access individual fields of the record using getter methods.
```java
String name = record.getName();
int age = record.getAge();
String email = record.getEmail();
```
- **Immutable Nature :** Note that once a Record instance is created, its fields cannot be modified. This ensures data integrity.
#### Example 💡
```java
public class Main {
    public static void main(String[] args) {
        // Create a new Record instance
        Record record = new Record("John Doe", 30, "john.doe@example.com");
        
        // Access record fields
        String name = record.getName();
        int age = record.getAge();
        String email = record.getEmail();
        
        // Print record information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
```
## var Feature
The `var` keyword in Java allows for type inference, reducing verbosity in variable declarations. Introduced in Java 10 as part of Project Amber, `var` enhances code readability and maintainability by emphasizing the intent over implementation details.
### Benefits
- **Conciseness :** Eliminates repetitive type declarations, resulting in cleaner code.
- **Readability :** Focuses on the variable's purpose rather than its specific type.
- **Flexibility :** Supports various contexts, including local variables, enhanced for loops, and try-with-resources statements.
### Considerations
- **Maintainability :** While var enhances readability, overuse may obfuscate code, especially in complex scenarios.
- **Clarity :** Prioritize clarity over brevity; use var judiciously where type inference improves code comprehension.
- **Compatibility :** Compatible with Java 10 and later versions; ensure compatibility with target runtime environments.
### Example 💡
```java

var list = new ArrayList<String>();
list.add("Java");
list.add("is");
list.add("awesome");
```

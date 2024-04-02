# Inheritance in Java
Inheritance is a fundamental concept in object-oriented programming (OOP) languages like Java. It allows a class (subclass/derived class) to inherit properties and behaviors from another class (superclass/base class). This promotes code reusability and establishes a hierarchical relationship between classes.

# Inheritance in Java

Inheritance is a fundamental concept in object-oriented programming (OOP) languages like Java. It allows a class (subclass/derived class) to inherit properties and behaviors from another class (superclass/base class). This promotes code reusability and establishes a hierarchical relationship between classes.

## How Inheritance Works

In Java, inheritance is achieved using the `extends` keyword. Here's a simple example:

```java
// Superclass
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move(); // Output: Vehicle is moving...
        myCar.accelerate(); // Output: Car is accelerating...
    }
}
```
#### In this example:
- `Vehicle` is the superclass, and `Car` is the subclass.
- `Car` inherits the `move()` method from Vehicle.
-` Car` also has its own method `accelerate()`.
### Types of Inheritance
**1.Single Inheritance :** A subclass extends only one superclass.
**2.Multilevel Inheritance :** A subclass extends another subclass.
**3.Hierarchical Inheritance :** Multiple subclasses extend the same superclass.
**4.Multiple Inheritance (achieved through interfaces):** A class implements multiple interfaces.
### Rules and Considerations
When working with inheritance in Java, keep these points in mind:
- Java does not support multiple inheritance for classes (i.e., a class cannot extend more than one class). However, it supports multiple inheritance through interfaces.
- The access level of the inherited members depends on their access modifiers. Inherited members with private access are not visible in the subclass.
- Constructors are not inherited but can be invoked using the super() keyword.
- Overriding allows a subclass to provide a specific implementation for a method defined in the superclass.
### When to Use Inheritance
- You want to model an "is-a" relationship between classes (e.g., a Car is-a Vehicle).
- You need to reuse code from existing classes.
- You want to establish a hierarchical structure to organize classes.
### Conclusion 🎉
Inheritance is a powerful feature in Java that allows classes to inherit properties and behaviors from other classes. By understanding and leveraging inheritance, you can write more efficient and maintainable code.
## Object Class in Java
## Methods
### public boolean equals(Object obj)
The equals method is used to compare the current object with another object for equality. By default, this method compares the memory addresses of the objects. However, it is often overridden by subclasses to provide custom equality comparison.

### public int hashCode()
The hashCode method returns a hash code value for the object. This method is used in conjunction with hash-based data structures such as HashMap and HashSet.

### public String toString()
The toString method returns a string representation of the object. By default, this method returns a string consisting of the class name followed by the "@" symbol and the object's hash code.

### protected Object clone() throws CloneNotSupportedException
The clone method creates and returns a copy of the object. It is declared protected and must be overridden in subclasses to support cloning.

### public final Class<?> getClass()
The getClass method returns the runtime class of the object. It returns an instance of the Class class that provides information about the class.

### public final void notify()
The notify method wakes up a single thread that is waiting on the object's monitor.

### public final void notifyAll()
The notifyAll method wakes up all threads that are waiting on the object's monitor.

### public final void wait() throws InterruptedException
The wait method causes the current thread to wait until another thread calls the notify() or notifyAll() method on the object.

### public final void wait(long timeout) throws InterruptedException
The wait method causes the current thread to wait until another thread calls the notify() or notifyAll() method on the object, or until the specified timeout expires.

### public final void wait(long timeout, int nanos) throws InterruptedException
Similar to the previous wait method, but allows specifying a timeout in nanoseconds.
#### Example 💡
```java
public class ObjectExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Using equals method
        if (obj1.equals(obj2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }

        // Using hashCode method
        System.out.println("Hash code of obj1: " + obj1.hashCode());
        System.out.println("Hash code of obj2: " + obj2.hashCode());

        // Using toString method
        System.out.println("String representation of obj1: " + obj1.toString());

        // Using getClass method
        System.out.println("Class of obj1: " + obj1.getClass().getName());
    }
}
```
### Notes  🚀
- The `Object` class provides default implementations for many of its methods, which can be overridden by subclasses to customize behavior.
- When overriding the `equals` method, it is recommended to also override the `hashCode` method to maintain the general contract between the two methods.
- The `wait`, `notify`, and `notifyAll` methods are used for inter-thread communication and synchronization.
## is-a Realationship
In Java, the "is-a" relationship is a fundamental principle of object-oriented programming (OOP) that is implemented through inheritance. It signifies a relationship between classes where one class is considered to be a specialized version of another class.
#### Example  💡
```java
// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
class Dog extends Animal { // Dog is a Animal
    void wagTail() {
        System.out.println("Dog wags its tail.");
    }
}

// Subclass
class Cat extends Animal { // Cat is a Animal
    void purr() {
        System.out.println("Cat purrs.");
    }
}
```
## "has-a" Relationship 
In the "has-a" relationship, one class (usually referred to as the container or composite class) contains an instance of another class (referred to as the contained or component class) as one of its members. This implies that the container class "has" an object of the component class.
#### Example  💡
```java
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    // Other methods and attributes of the Car class...
}

public class Engine {
    // Properties and methods of the Engine class...
}
```
### In this example:
The `Car` class has an instance of the Engine class as one of its attributes.
The `Engine` class represents the component that the Car class possesses.
### Benefits of "has-a" Relationship:
**1.Modularity :**
- Allows for modular design by encapsulating related functionality within separate classes.
#### 2.Code Reusability :
- Promotes code reusability as the same component class can be used across multiple container classes.
#### 3.Flexibility :
- Provides flexibility in designing complex systems by composing smaller, reusable components.
### How to Use:
When designing classes in Java, consider whether one class needs to contain an instance of another class to represent a "has-a" relationship. If so, define the appropriate attributes and methods to interact with the contained class.

### Conclusion  🎉
Understanding the "has-a" relationship is crucial for designing modular and maintainable Java applications. By utilizing this relationship effectively, you can create flexible and reusable code that accurately models real-world scenarios.
## Up-casting
Up-casting refers to the process of converting an object of a subclass to a reference of its superclass. It is implicit and does not require any explicit casting operator. Up-casting is always safe because a subclass object inherently possesses all the attributes and behaviors of its superclass.
#### Example  💡
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound"); //   
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Up-casting
        animal.sound(); // Output: Dog barks
    }
}
```
### Down-casting
Down-casting is the opposite of up-casting. It refers to the process of converting a reference of a superclass type to its subclass type. Down-casting is explicit and requires the use of the casting operator. It can potentially lead to a `ClassCastException` at runtime if the object being casted is not actually an instance of the target subclass.
#### Example  💡
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Up-casting
        animal.sound(); // Output: Dog barks
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Up-casting
        Dog dog = (Dog) animal; // Down-casting
        dog.sound(); // Output: Dog barks
    }
}
```
In the above example, we first up-cast a Dog object to an Animal reference. Then, we down-cast the Animal reference back to a Dog reference. Since the original object was indeed a Dog, down-casting is safe in this scenario.
### Conclusion  🎉
Up-casting and down-casting are important concepts in Java that allow for flexibility and polymorphism in object-oriented programming. While up-casting is implicit and safe, down-casting requires explicit type casting and should be used carefully to avoid runtime errors.
### instanceof Operator
The `instanceof` operator in Java is used to test whether an object is an instance of a particular class or interface. It returns either `true` or `false` based on whether the object is an instance of the specified type.
#### Example  💡
```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello";

        // Using instanceof to check if str is an instance of String class
        boolean isString = str instanceof String;
        System.out.println("Is str an instance of String? " + isString); // Output: true

        // Using instanceof to check if str is an instance of Object class
        boolean isObject = str instanceof Object;
        System.out.println("Is str an instance of Object? " + isObject); // Output: true // Object class is super class of all the classes


        // Using instanceof to check if str is an instance of Integer class
        boolean isInteger = str instanceof Integer;
        System.out.println("Is str an instance of Integer? " + isInteger); // Output: false
    }
}
```
In this example:
- We create a String object str.
- We use the instanceof operator to check if str is an instance of the `String` class, which returns `true`.
- Similarly, we check if `str` is an instance of the `Object` class, which also returns `true`.
- Finally, we check if str is an instance of the `Integer` class, which returns `false`.
### Key Points  🚀
- The `instanceof` operator is used for type checking at runtime.
- It returns true if the object is an instance of the specified type or any of its subtypes, otherwise false.
- It's commonly used when working with polymorphic code to determine the actual type of an object before performing certain operations.
## Static Binding and Dynamic Binding
In Java, binding refers to the process of associating a method call with the method body. There are two types of binding in Java: static binding and dynamic binding.
## Static Binding
Static binding, also known as early binding, occurs during compile time. In static binding, the method call is resolved by the compiler based on the reference type. This means that the compiler determines which method to call based on the reference type of the object at compile time.
### Dynamic Binding
Dynamic binding, also known as late binding, occurs during runtime. In dynamic binding, the method call is resolved by the JVM (Java Virtual Machine) based on the actual object type. This means that the JVM determines which method to call based on the actual object type at runtime.
#### Example  💡
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.sound(); // Output: Animal makes a sound (static binding)
        animal2.sound(); // Output: Dog barks (dynamic binding)
        animal3.sound(); // Output: Cat meows (dynamic binding)
    }
}

```
In this example:

- animal1 is of type Animal, and the sound() method call is resolved at compile time because the reference type is known.
- animal2 is of type Animal, but it refers to a Dog object. The method call is resolved at runtime, and the sound() method of Dog class is invoked (dynamic binding).
- animal3 is also of type Animal, but it refers to a Cat object. Again, the method call is resolved at runtime, and the sound() method of Cat class is invoked (dynamic binding).
- This demonstrates the difference between static binding, where the method is determined at compile time based on the reference type, and dynamic binding, where the method is determined at runtime based on the actual object type.
## Polymorphism in Java
Polymorphism is one of the fundamental concepts in object-oriented programming (OOP) languages like Java. It allows objects of different classes to be treated as objects of a common superclass. This enables a single interface to be used for entities of different types.
### Types of Polymorphism
### 1. Compile-time Polymorphism (Method Overloading)
Method overloading allows a class to have multiple methods with the same name but with different parameters. The appropriate method is called based on the number and type of parameters during compile-time.
#### Example  💡
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}
```
### Runtime Polymorphism (Method Overriding)
Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. It allows the subclass to provide its own implementation of the method.
#### Example  💡
```java
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
```
### Benefits of Polymorphism
**Code Reusability :** Polymorphism allows methods to be written that can work with objects of any subclass of a common superclass, promoting code reuse.
**Flexibility and Extensibility :** New classes can be added without modifying existing code, as long as they inherit from the common superclass.
#### Conclusion  🎉
Polymorphism is a powerful feature of Java that enhances code flexibility, reusability, and extensibility. By treating objects of different classes uniformly through a common interface, it simplifies code maintenance and promotes good design practices.
## Using the super Keyword
In Java, the `super` keyword is used to refer to the superclass (parent class) of the current object. One common use of `super` is to invoke superclass methods or constructors from a subclass.
### Invoking Superclass Methods
When a subclass overrides a method defined in its superclass, you can use `super` to invoke the overridden method of the superclass. This is particularly useful when you want to extend the behavior of the superclass method rather than replace it entirely.
### Syntax
```java
super.methodName();
```
#### Example  💡
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        super.start(); // invoking superclass method
        System.out.println("Car started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
```
#### Output:
```java
Vehicle started
Car started
```
In this example, the `start()` method of the Car class invokes the `start()` method of the superclass Vehicle using `super.start()`, and then it adds its own behavior.
#### Conclusion  🎉
The `super` keyword in Java provides a way to access superclass members (methods, fields, and constructors) from within a subclass. It's particularly handy when you want to customize or extend the behavior of superclass methods in your subclass implementations.
## Method Hiding in Java
Method hiding is a concept in Java where a subclass can define a static method with the same signature as a static method in its superclass. This hides the superclass method from the subclass, effectively replacing it with the subclass method. This behavior is different from method overriding, where the subclass provides a specific implementation of a non-static method from its superclass.
## Usage
To understand method hiding, consider the following example:
```java
class Superclass {
    static void myStaticMethod() {
        System.out.println("Static method in Superclass");
    }
}

class Subclass extends Superclass {
    static void myStaticMethod() {
        System.out.println("Static method in Subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        Superclass.myStaticMethod(); // Output: Static method in Superclass
        Subclass.myStaticMethod();   // Output: Static method in Subclass
    }
}
```
In this example, both Superclass and Subclass have a static method named `myStaticMethod()`. When called from the Main class, the output demonstrates that the method from the subclass is invoked, even though the reference is of the superclass type.
### Key Points
- Method hiding occurs when a subclass defines a static method with the same signature as a static method in its superclass.
- Method hiding is resolved at compile time based on the reference type, not the object type.
- It is recommended to use method hiding judiciously, as it can lead to confusion and make the code harder to understand.
- Unlike method overriding, method hiding does not involve polymorphism because it is based on the reference type, not the object type.
#### Conclusion 🎉
Method hiding in Java provides a mechanism for subclasses to hide static methods of their superclass and provide their own implementations. While it can be useful in certain situations, it should be used carefully to avoid confusion and maintain code clarity.
## Feild Hiding 
To achieve field hiding in Java, you can use inheritance along with declaring fields with the same name in the superclass and subclass. Here's a simple example to demonstrate field hiding :
```java
// Superclass
class Parent {
    int x = 10; // Field in the superclass

    void display() {
        System.out.println("Value of x in Parent: " + x);
    }
}

// Subclass
class Child extends Parent {
    int x = 20; // Field in the subclass, hiding the field in the superclass

    void display() {
        System.out.println("Value of x in Child: " + x);
        System.out.println("Value of x in Parent: " + super.x); // Accessing superclass field
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // This will print the value of x in Child and Parent
    }
}
```
In this example, the Child class extends the Parent class, and both classes have a field named `x`. However, the field in the subclass hides the field in the superclass. When you access x inside the Child class, it refers to the field in the subclass. If you want to access the field in the superclass, you can use the `super` keyword.
## Types of Inheritance
### Single Inheritance
Single inheritance refers to the inheritance of properties and behaviors from a single parent class. In Java, a class can extend only one other class.
```java
class Parent {
    // Parent class members
}

class Child extends Parent {
    // Child class members
}
```
### Multilevel Inheritance
Multilevel inheritance involves a chain of inheritance where a subclass becomes the superclass for another subclass. This creates a hierarchical relationship between classes.

```java
class Grandparent {
    // Grandparent class members
}

class Parent extends Grandparent {
    // Parent class members
}

class Child extends Parent {
    // Child class members
}
```
### Hierarchical Inheritance
Hierarchical inheritance involves multiple subclasses inheriting from a single superclass. Each subclass inherits the properties and behaviors of the superclass.

```java
class Animal {
    // Animal class members
}

class Dog extends Animal {
    // Dog class members
}

class Cat extends Animal {
    // Cat class members
}
```
### Multiple Inheritance (with Interfaces)
Java does not support multiple inheritance of classes due to the "diamond problem" (ambiguous references). However, it supports multiple inheritance of interfaces. A class can implement multiple interfaces, inheriting abstract methods from each.

```java
interface Interface1 {
    // Interface1 methods
}

interface Interface2 {
    // Interface2 methods
}

class MyClass implements Interface1, Interface2 {
    // MyClass members
}
```
Using Inheritance
To use inheritance in Java, you simply need to extend a class using the extends keyword or implement interfaces using the implements keyword.

```java
class Vehicle {
    void drive() {
        System.out.println("Driving...");
    }
}

class Car extends Vehicle {
    void park() {
        System.out.println("Parking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive(); // Output: Driving...
        myCar.park(); // Output: Parking...
    }
}
```
### Conclusion 🎉
Inheritance is a fundamental concept in Java programming, allowing classes to inherit properties and behaviors from other classes. Understanding the types of inheritance and how to use them is essential for building maintainable and efficient Java applications.
## Abstract Classes and Methods
In Java, abstract classes and methods are fundamental concepts in object-oriented programming. They allow you to define a blueprint for classes and methods that must be implemented by subclasses.
### Abstract Classes
An abstract class in Java is a class that cannot be instantiated on its own and may contain one or more abstract methods. Abstract classes are typically used to define a common interface for subclasses. They can also include concrete methods.
#### Example 💡
To create an abstract class in Java, use the `abstract` keyword in the class declaration. Abstract classes can have abstract methods (methods without a body) and concrete methods (methods with a body).
```java
public abstract class Shape {
    // Abstract method
    public abstract double area();

    // Concrete method
    public void display() {
        System.out.println("Displaying shape...");
    }
}
```
### Abstract Methods
An abstract method in Java is a method declared without implementation. It must be overridden by concrete subclasses. Abstract methods serve as placeholders for functionality that must be implemented by subclasses.
### Usage
To declare an abstract method, use the abstract keyword in the method declaration. Abstract methods must be implemented by non-abstract subclasses.
```java

public abstract double area();
```
#### Example 💡
```java
public abstract class Shape {
    // Abstract method
    public abstract double area();

    // Concrete method
    public void display() {
        System.out.println("Displaying shape...");
    }
}

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    @Override
    public double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + rectangle.area());
        rectangle.display();
    }
}

```
#### Conclusion 🎉
Abstract classes and methods provide a powerful mechanism for defining common interfaces and behaviors in Java. They promote code reusability and help in achieving abstraction and encapsulation.
## final Keyword
In Java, the `final` keyword is used to restrict the user. It can be applied to variables, methods, and classes, each with its own implications. Here's a breakdown of its usage
###  Final Variables
When a variable is declared as `final`, its value cannot be changed once initialized.
```java
final int x = 10;
x = 20; // This will result in a compilation error
```
### Final Methods
When a method is declared as final in a class, it means that the method cannot be overridden by subclasses.
```java
class Parent {
    final void display() {
        System.out.println("Parent class method");
    }
}


class Child extends Parent {
    void display() { // This will result in a compilation error
        System.out.println("Child class method");
    }
}
```
### Final Classes
When a class is declared as `final`, it means that it cannot be subclassed.
```java
final class FinalClass {
    // Class implementation
}

// This will result in a compilation error
class SubClass extends FinalClass {
    // Class implementation
}
```
### Benefits of Using final
- **Security :** It prevents modifications to sensitive data or methods.
- **Performance :** The JVM can optimize final variables, methods, and classes more aggressively.
- **Design Clarity :** It communicates intent to other developers, making the code easier to understand and maintain.
#### Conclusion 🎉
The `final` keyword in Java provides a way to create constants, enforce immutability, and define methods or classes that cannot be overridden or subclassed. Proper use of final can enhance code clarity, security, and performance.
## Sealed Classes and Interfaces
Sealed classes and interfaces were introduced in Java 15 as a preview feature and became a permanent feature starting from Java 17. They provide a mechanism to restrict which classes can extend or implement a particular class or interface. This enhances encapsulation and improves maintainability by controlling the inheritance hierarchy.
### Key Concepts
### Sealed Classes
A sealed class is a class that restricts which other classes can extend it. It explicitly specifies the permitted subclasses. To declare a sealed class, you use the `sealed` modifier followed by the permitted subclasses. The permitted subclasses can be either `final` classes or non-sealed classes.
#### Example:
```java
public sealed class Shape permits Circle, Square, Triangle {
    // Class implementation
}
```
## Sealed Interfaces
Similarly, a sealed interface restricts which classes can implement it. It specifies the permitted implementing classes using the `permits` keyword.
```java
public sealed interface Vehicle permits Car, Truck, Motorcycle {
    // Interface methods
}
```
### Permitting Classes
Permitted subclasses or implementing classes can be either final or non-sealed. If a subclass is final, it cannot have further subclasses. If it's non-sealed, it can have subclasses that are not explicitly listed in the permits clause.

### Non-sealed Classes and Interfaces
Non-sealed classes and interfaces can be extended or implemented by any class in the same package. They provide flexibility while designing the class hierarchy.
#### Example
```java
public non-sealed class Animal {
    // Class implementation
}

public non-sealed interface Printable {
    void print();
}

```
### Benefits
**Enhanced Encapsulation :** Sealed classes and interfaces explicitly specify the allowed subclasses or implementing classes, thus preventing unexpected extensions or implementations.
**Improved Maintainability :** By controlling the inheritance hierarchy, sealed classes and interfaces make the codebase more maintainable and easier to understand.
**Stronger Contracts :** They provide clearer contracts for subclasses or implementing classes, reducing the likelihood of unintentional misuse.
### Usage Guidelines
- Use sealed classes and interfaces when you want to tightly control the inheritance hierarchy and provide clear boundaries for extensions or implementations.
- Prefer sealed classes/interfaces over final classes/interfaces when you need to allow limited extension or implementation.
### Compatibility
- Sealed classes and interfaces were introduced as a preview feature in Java 15 and became permanent in Java 17. Ensure that you're using a compatible JDK version to leverage this feature.
### Conclusion
Sealed classes and interfaces are a powerful addition to Java's type system, providing fine-grained control over class hierarchies. By explicitly specifying permitted subclasses or implementing classes, they enhance encapsulation and maintainability of the codebase.

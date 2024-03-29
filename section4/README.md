# Basic Core Java Concepts
## Declaring Feilds in Java Class
In Java, fields are declared within a class. They represent the state or attributes of objects created from that class. Fields can store data that characterize the objects and are accessible throughout the class.
Fields are declared within the body of a class. Here's the syntax for declaring fields :

   ```java
   public class ClassName {
      // Instance variables (fields)
      dataType fieldName1;
      dataType fieldName2;
      // ...
   }
   ```
### Example
   ```java
   public class Person {
      // Instance variables (fields)
      String name;
      int age;
      double height;
   }
   ```
#### In the above exapmle
- "name", "age", and "height" are fields of the 'Person' class.
- Each field has a data type (String, int, double) followed by the field name.
- These fields represent the characteristics of a 'Person' object.
### Field Types
#### Instance Variables or Non-Static Variables :
Instance variables are associated with objects of the class. Each instance (object) of the class has its own copy of instance variables.
```java
public class MyClass {
    public int instanceVariable; // Instance variable
}
```
#### Static Variables :
Static variables are shared among all instances of a class. They are associated with the class rather than with any object.
```java
public class MyClass {
    public static int staticVariable; // Static variable
}
```
### Access Modifiers
Java provides access modifiers to control the visibility of fields. The commonly used access modifiers are :
- **public :** The field is accessible from any other class.
- **private :** The field is accessible only within the same class.
- **protected :** The field is accessible within the same package and subclasses.
- **default (no modifier) :** The field is accessible only within the same package.
### Example
```java
public class MyClass {
    public int publicField;
    private int privateField;
    protected int protectedField;
    int defaultField; // Default access modifier
}
```
### Conclusion
Declaring fields in a Java class is a fundamental aspect of object-oriented programming. Fields represent the state of objects and store data that characterize them. Understanding how to declare and use fields is crucial for building Java applications.


# Declaring Methods in Java Class
In Java, methods are functions defined within a class. They encapsulate behavior and define what objects of that class can do. Methods are used to perform specific tasks and manipulate the state of objects.
## Declaring Methods
```java
public class ClassName {

    // Method declaration
    public returnType methodName() {
        // Method body
        // Perform tasks here
        return value; // Return statement (if returnType is not void)
    }

}
```
#### Example
```java
public class Car {

    String model;
    String color;
    int horsePower;

    public void startCar() {
        System.out.println("Vehicle started...");
    }

    public String stopCar() {
        String output = "Vehicle stopped...";
        return output;
    }

}
```
## Method With Parameters
```java
public class ClassName {

    // Method declaration
    public returnType methodName(parameterType parameter1, parameterType parameter2, ...) {
        // Method body
        // Perform tasks here
        return value; // Return statement (if returnType is not void)
    }

}
```
### Example
```java
public class AithmeticOperations {

    public int add(int num1, int num2) {
        int sum =num1+num2;
        return sum;
    }

}
```
##### In the above example :
- 'add' is a method of the 'AithmeticOperations' class.
- It takes two parameters (num1 and num2) of type int.
- It returns the sum of num1 and num2 as an int.

## Method Invocation

If method is static and present in the same class then call that method with method name.
```java
public class AithmeticOperations {

    public static void main(String[]args){
        int result=add(10, 20); // Method Invocation
    }

    public int add(int num1, int num2) {
        return num1 + num2; 
    }

}
```
If method is static and present outside of the class then call that with ClassName.methodName.
```java
public class AithmeticOperations {

    public static void main(String[]args){
        int result=Addition.add(10, 20); // Method Invocation
        System.out.println(result);
    }

}

public class Addition{

    public int add(int num1, int num2) {
        return num1 + num2; 
    }

}
```
## Object Creation
Once you have defined the class, you can create an object of that class using 'new' keyword. The 'new' keyword allocates memory for the object and returns a reference to it.
```java
public class Employee {

      public static void main(String[]args){

        Employee obj=new Employee();// Object Creation

        //obj is the Object reference variable.
        // The Object reference variable name should always a class name but in camel case.
        Employee employee=new Employee();// Object creation
        // This creates a new object of the Employee class and assigns its to the employee variable.
        // The new keyword calls the constructor of the class to intialize the object.

    }
}
```

If the method is Non-Static and present inside the same calss then call that method with ObjectReferenceVariable.methodName()
```java
public class AithmeticOperations {

   public static void main(String[]args){
        // Create Object of class where the method is present.
        AithmeticOperations aithmeticOperations=new AithmeticOperations(); //Object Creation
        // aithmeticOperations is Object reference variable
        int result=aithmeticOperations.add(10, 20); // Method Invocation
         System.out.println(result);
    }

    public int add(int num1, int num2) {
        return num1 + num2; 
    }

}
```
If the method is Non-Static and present outside calss then call that method with ObjectReferenceVariable.methodName()
```java

public class AithmeticOperations {

    public static void main(String[]args){
        // Create Object of class where the method is present.
        Addition addition=new Addition(); //Object Creation
        // addition is Object reference variable
        int result=addition.add(10, 20); // Method Invocation
         System.out.println(result);
    }

}

public class Addition{

    public int add(int num1, int num2) {
        return num1 + num2; 
    }

}
```
# Constructors in Java

In Java, a constructor is a special type of method that is automatically called when an instance of a class is created. Constructors are used to initialize the newly created object.

## Types of Constructors

### Default Constructor

A default constructor is one that doesn't take any parameters. If you don't explicitly define a constructor for a class, Java provides a default constructor that initializes member variables to their default values (e.g., 0 for numeric types, null for reference types).

```java
public class MyClass {

    // Default constructor
    public MyClass() {
        // Initialization code here
    }

}

MyClass myClass= new MyClass();// Object Creation to call default constructor

```
#### Example
```java
public class Employee {

    public Employee() {
        System.out.println("Object is getting created");
    }
    
}

Employee employee= new Employee();

```

### Parameterized Constructor
A parameterized constructor is one that takes one or more parameters. It allows you to initialize instance variables with values passed as arguments during object creation.
```java
public class MyClass {

    private int myVariable;
    
    // Parameterized constructor
    public MyClass(int value) {
        this.myVariable = value;
    }

}

MyClass myClass= new MyClass(20);// Object Creation  to call parameterized constructor

```
#### Example
```java
public class Employee {
    public String name;
    public String empId;
    
    public Employee(String empName, String id) {
        this.name = empName;
        this.empId=id;
    }

}

Employee employee=new Employee("Suresh","A4678");
```
### Constructor Overloading
Java allows you to have multiple constructors with different parameter lists in a class. This is known as constructor overloading.
```java
public class MyClass {
    private int myVariable;
    
    // Default constructor
    public MyClass() {
        // Initialization code here
    }
    
    // Parameterized constructor
    public MyClass(int value) {
        this.myVariable = value;
    }
    
    // Another parameterized constructor
    public MyClass(String name, int age) {
        // Initialization code here
    }

}

MyClass myClass1= new MyClass();// To call default constructor
MyClass myClass2= new MyClass(20);// To call Constructor with one 'int' parameter
MyClass myClass3= new MyClass("Ramesh",20);// To call Constructor with one 'String' parameter and one 'int' parameter.

```
#### Example
```java
public class Employee {
    public int name;
    public String age;
    
    public Employee() {
        // Initialization code here
    }
    
    public Employee(int value) {
        this.name = value;
    }
    
    public Employee(String name, int age) {
        this.name=name;
        this.age=age;
    }

}

Employee employee1=new Employee();
Employee employee2=new Employee(20);
Employee employee3=new Employee("Suresh",20);

```
### Constructor Chaining
Constructor chaining allows one constructor to call another constructor in the same class. This is achieved using the 'this()' keyword.
```java
public class MyClass {
    private int myVariable;
    private String myString;
    
    // Parameterized constructor
    public MyClass(int value) {
        this(value, "Default");
    }
    
    // Another parameterized constructor
    public MyClass(int value, String str) {
        this.myVariable = value;
        this.myString = str;
    }

}
```
MyClass myClass=new MyClass(10);

#### Example
```java
public class Employee {

    private int id;
    private String name;
    
    public Employee() {
        this(282717, "Suresh");
    }

    public Employee(int value, String str) {
        this.id = value;
        this.name = str;
    }

}

Employee employee=new Employee();
```
#### Conclusion
Constructors are essential for initializing objects in Java. Understanding their types and usage is crucial for 
creating well-structured and efficient Java programs.

# New Features of java 22
## Multi-file source code programs
A "multiple source code program" in Java typically refers to a Java program that consists of multiple source code files. In Java, a program can be divided into multiple source files, each containing a class or a group of related classes. These source files are then compiled separately and combined into a single executable or library.

Here's a brief explanation of how a multiple source code program works in Java:

- **Organizing Code :** In larger Java projects, it's common to organize code into multiple files for better maintainability and readability. Each file typically contains one or more related classes.
- **Compilation :** Each source code file (.java file) is compiled into a corresponding bytecode file (.class file) using the Java compiler (javac). For example, if you have Main.java, Class1.java, and Class2.java, each will be compiled into Main.class, Class1.class, and Class2.class, respectively.
- **Dependencies :** If one class depends on another, you import it using the import statement at the beginning of your source file. This allows you to use classes and interfaces defined in other source files.
- **Execution :** When you run the program, you typically specify the main class that contains the `main()` method. Java runtime (java) loads the necessary classes and executes the program.

## Unnamed variables and patterns

Unnamed variables are variables that can be initialized but not used. Unnamed patterns can appear in a pattern list of a record pattern, and always match the corresponding record component. You can use them instead of a type pattern. They remove the burden of having to write a type and name of a pattern variable that's not needed in subsequent code. You denote both with the underscore character (_).

For background information about unnamed variables and patterns, see JEP 456.

### Unnamed Variables

You can use the underscore keyword `(_)` as the name of a local variable, exception, or lambda parameter in a declaration when the value of the declaration isn't needed. This is called an unnamed variable, which represents a variable that’s being declared but it has no usable name.

Unnamed variables are useful when the side effect of a statement is more important than its result.

#### Example

```java
package com.eazybytes.java22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UnnamedVariables {

    public static void main(String[] args) {
        // Scenario 1
        List<String> wordList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        int totalWords = countWords(wordList);
        System.out.println(totalWords);

        // Scenario 2
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
        Map<String, String> fruitMap = fruits.stream()
                .collect(Collectors.toMap(f -> f, _ -> "Fruit"));
        System.out.println(fruitMap);

        // Scenario 3
        boolean isValid = convertAndDisplay("45");

        // Scenario 4
        executeIfFilePresent();

        // Scenario 5
        Point point = new Point(7, 3);
        if (point instanceof Point(int x, _)) {
            // Only use the 'x' property from the Point record
            System.out.printf("Point object with value of x: %d%n", x);
        }
    }

    public static int countWords(Iterable<String> words) {
        int totalWords = 0;
        for (String _ : words) {
            totalWords++;
        }
        return totalWords;
    }

    public static boolean convertAndDisplay(String input) {
        boolean isValid;
        try{
            int _ = Integer.parseInt(input);
            isValid = true;
        }catch (NumberFormatException _) {
            System.out.println("NumberFormatException due to invalid input: " + input);
            isValid = false;
        }catch (Exception _) {
            System.out.println("Exception due to invalid input: " + input);
            isValid = false;
        }
        return isValid;
    }

    public static void executeIfFilePresent() {
        String filePath = "example.txt";
        try(BufferedReader _ = new BufferedReader(new FileReader(filePath));){
            System.out.println("Executing some logic");
        } catch (FileNotFoundException _) {
            System.out.println("FileNotFoundException");
        } catch (IOException _) {
            System.out.println("IOException");
        }
    }

}

record Point(int x, int y) { }

```
```java
package com.eazybytes.java22;

public class UnnamedPatterns {

    public static void main(String[] args) {
        Vehicle vehicle = new Truck("Toyota");

        switch (vehicle) {
            case Car _ -> processCar(vehicle);
            case Bike _ -> processBike(vehicle);
            case Truck _ -> processTruck(vehicle);
        }
    }

    public static void processCar(Vehicle vehicle) {
        if(vehicle instanceof Car car) {
            System.out.println("Processing car model: " + car.getModel());
        }
    }

    public static void processBike(Vehicle vehicle) {
        if(vehicle instanceof Bike bike) {
            System.out.println("Processing bike brand: " + bike.getBrand());
        }
    }

    public static void processTruck(Vehicle vehicle) {
        if(vehicle instanceof Truck truck) {
            System.out.println("Processing truck manufacturer: " + truck.getManufacturer());
        }
    }

}
```
```java
package com.eazybytes.java22;

public sealed interface Vehicle permits Car, Bike, Truck {

}

final class Bike implements Vehicle {
    private final String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

final class Car implements Vehicle {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

final class Truck implements Vehicle {
    private final String manufacturer;

    public Truck(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
```

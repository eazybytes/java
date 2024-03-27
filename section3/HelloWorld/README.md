# Getting Started with Java in IntelliJ IDEA
Welcome to our Java course! In this guide, we'll walk you through creating your first Java class using IntelliJ IDEA, a powerful integrated development environment (IDE) for Java development.
### Prerequisites
Before getting started, ensure that you have the following installed on your system:
- IntelliJ IDEA (Community or Ultimate edition) https://www.jetbrains.com/idea/download/?section=windows
- Java Development Kit (JDK) installed on your machine https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html
### Steps to Create Your First Java Class
1. #### Open IntelliJ IDEA : Launch IntelliJ IDEA on your system.
2. #### Create a New Project :
     - Click on Create New Project on the welcome screen or go to File > New > Project.
3. #### Set Up Your Project :
     - Enter a Project Name for your project (HelloWorld).
     - Choose a Project Location where you want to save your project files.
     - Select the Language as Java.
     - Build system as IntelliJ.
     - Add JDK as corretto-21 or click on New... and locate your JDK installation directory.
     - Click on Create to create the project.
4. #### Create a Java Class :
     - In the Project tool window (usually located on the left-hand side), right-click on the src folder.
     - Go to New > Java Class.
     - Enter a name for your class in the Name field (e.g., HelloWorld).
     - Optionally, you can specify a Package for your class. If you're just starting out, you can leave it as the default package.
     - Click OK to create the class.
5. #### Write Your First Java Code :
     - IntelliJ IDEA will create a Java class file with a template for you.
     - You can start writing your Java code inside the class.
 ```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello Madan");
    }

}
```

6. #### Run Your Java Program :
   - Click on the green Run icon next to the main method or right-click anywhere inside the main method and select Run 'HelloWorld.main()'.
7. #### View Output :
   - You should see the output "Hello Madan" printed in the Run tool window at the bottom of the IntelliJ IDEA window.
  
Congratulations! You've successfully created and executed your first Java class using IntelliJ IDEA.

# Multithreading in Java 
Multithreading in Java refers to the ability of a Java program to execute multiple threads concurrently. A thread in Java represents an independent path of execution within a program. Multithreading allows a program to perform multiple tasks simultaneously, enhancing performance and responsiveness.

In Java, multithreading is achieved primarily by using two mechanisms:

Extending the Thread class: You can create a new class that extends the Thread class and override its `run()` method to define the code that will run concurrently. Then, you instantiate objects of this class and call their `start()` method to begin execution.

```java
class MyThread extends Thread {
    public void run() {
        // Code to be executed concurrently
    }
}
```
Implementing the Runnable interface: Alternatively, you can implement the Runnable interface, which defines a single method run(), and pass an instance of your class to a Thread object. This method is often preferred because Java doesn't support multiple inheritance, and implementing interfaces is more flexible than extending classes.

```java
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed concurrently
    }
}
```
Then, you create a Thread object and pass an instance of MyRunnable to it:

```java
MyRunnable myRunnable = new MyRunnable();
Thread thread = new Thread(myRunnable);
thread.start();
```
Multithreading allows different parts of a program to execute simultaneously, thus making the program more responsive, efficient, and capable of handling multiple tasks concurrently. However, it also introduces challenges such as synchronization and coordination between threads to avoid issues like race conditions and deadlocks. Java provides various mechanisms and classes, such as locks, mutexes, and synchronized blocks, to address these challenges and ensure safe concurrent execution.

## How Multiple Threads Improve Performance 
In Java programming, threading allows you to execute multiple tasks concurrently, thus improving performance by leveraging the computational resources more effectively. This README provides an overview of how multiple threads improve performance in Java.

### Benefits of Multithreading
- **1. Concurrency :**
Multithreading enables concurrent execution of tasks, allowing different parts of a program to run simultaneously. This concurrency leads to better resource utilization and faster execution of tasks.
- **2. Parallelism:**
With multithreading, tasks can be executed in parallel on multicore processors. This parallelism leads to significant performance improvements, especially for CPU-bound tasks.
- **3. Responsiveness :**
By offloading time-consuming tasks to separate threads, multithreading ensures that the application remains responsive to user input. This is crucial for creating interactive and user-friendly applications.
- **4. Scalability :**
Multithreading facilitates scalability by enabling the distribution of tasks across multiple threads. As the workload increases, more threads can be created to handle the additional load, resulting in better scalability.
- **5. Resource Utilization :**
Multithreading allows better utilization of system resources such as CPU and memory. By keeping the CPU busy with multiple threads, idle time is reduced, leading to improved overall performance.
- **6. Asynchronous Execution :**
Multithreading enables asynchronous execution of tasks, where a thread can continue executing other tasks while waiting for I/O operations or other blocking tasks to complete. This improves overall throughput and responsiveness.
### How to Implement Multithreading in Java
In Java, multithreading can be implemented using the Thread class or the Runnable interface. Here's a basic example using the Thread class:

```java
public class MyThread extends Thread {
    public void run() {
        // Code to be executed concurrently
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        thread1.start();
        thread2.start();
    }
}
```
Alternatively, you can use the Runnable interface:

```java
public class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed concurrently
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        
        thread1.start();
        thread2.start();
    }
}
```
### Conclusion
Multithreading is a powerful technique in Java programming for improving performance and scalability. By allowing concurrent execution of tasks, multithreading maximizes CPU utilization, enhances responsiveness, and enables efficient resource utilization. When used effectively, multithreading can significantly boost the performance of Java applications.

## Creating Threads in Java
Threads in Java allow you to execute multiple tasks concurrently, improving the efficiency of your programs by leveraging the available resources. Here's a guide on how to create threads in Java:

### 1. Extending the Thread Class
You can create a thread in Java by extending the Thread class and overriding its `run()` method.

```java
public class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}
```
### 2. Implementing the Runnable Interface
Alternatively, you can implement the Runnable interface and pass it to a Thread object.

```java
public class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start(); // Start the thread
    }
}
```
### 3. Using Lambda Expressions
With Java 8 and later versions, you can use lambda expressions to define the `run()` method directly.

```java
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            // Code to be executed in the thread
            System.out.println("Thread is running");
        });
        thread.start(); // Start the thread
    }
}
```
### Thread Lifecycle
Understanding the lifecycle of a thread is essential for effective thread management. The main states of a thread are:

- **New :** When a thread is instantiated.
- **Runnable :** When a thread is ready to run but waiting for CPU time.
- **Running :** When the thread is executing its task.
- **Blocked/Waiting :** When a thread is waiting for some resource.
- **Terminated :** When the thread has completed its task or terminated abruptly.
### Thread Synchronization
When multiple threads access shared resources, synchronization is essential to prevent data corruption. Java provides synchronization mechanisms like synchronized blocks and `volatile` keyword to ensure thread safety.
## Multithreading Program in Java
This Java program demonstrates a simple multithreading example where multiple threads are created to perform tasks concurrently. It illustrates basic multithreading concepts such as thread creation, synchronization, and joining threads.

### Example
Suppose we have a task of printing numbers from 1 to 10,000. We'll create multiple threads, each responsible for printing a portion of these numbers concurrently.

```java
public class Main {
    public static void main(String[] args) {
        // Create multiple threads
        Thread thread1 = new Thread(new Task(1, 2500));
        Thread thread2 = new Thread(new Task(2501, 5000));
        Thread thread3 = new Thread(new Task(5001, 7500));
        Thread thread4 = new Thread(new Task(7501, 10000));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```
The Task class represents the task to print numbers within a specified range.

```java
public class Task implements Runnable {
    private int start;
    private int end;

    public Task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
```
## Thread Methods in Java
### `getId()`

- **Description:** Returns the identifier of this Thread. The thread ID is a unique long value assigned to each new thread when it is created.
- **Syntax:** `public long getId()`
- **Return Type:** `long`
- **Example:**
  ```java
  Thread thread = new Thread();
  long id = thread.getId();
  System.out.println("Thread ID: " + id);
  ```
### getName()
- **Description :** Returns the name of this Thread.
- **Syntax :** public String getName()
- **Return Type :** String
### Example:
```java
Thread thread = new Thread();
String name = thread.getName();
System.out.println("Thread Name: " + name);
```
### setName()
- **Description :** Sets the name of this Thread.
- **Syntax :** public final void setName(String name)
### Parameters:
- **name :** The new name for this Thread.
### Example:
```java
Thread thread = new Thread();
thread.setName("MyThread");
currentThread();
```
- **Description :** Returns a reference to the currently executing Thread object.
- **Syntax :** public static native Thread currentThread()
- **Return Type :** Thread
### Example:
```java
Thread currentThread = Thread.currentThread();
System.out.println("Current Thread: " + currentThread.getName());
```
### sleep()
- **Description :** Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
- **Syntax :** public static void sleep(long millis) throws InterruptedException
### Parameters:
- **millis :** The length of time to sleep in milliseconds.
- **Throws :** InterruptedException - if any thread has interrupted the current thread.
### Example:
```java
try {
    Thread.sleep(1000); // Sleep for 1 second
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

### join()
- **Description :** Waits for this thread to die.
- **Syntax :** public final void join() throws InterruptedException
- **Throws :** InterruptedException - if any thread has interrupted the current thread.
### Example:
```java
Thread thread = new Thread();
thread.start();
thread.join(); // Wait for the thread to finish execution
```
### setPriority()
- **Description :** Sets the priority of this thread.
- **Syntax :** public final void setPriority(int newPriority)
### Parameters:
- **newPriority :** The new priority for this thread. The value should be in the range 1-10.
### Example:
```java
Thread thread = new Thread();
thread.setPriority(Thread.MAX_PRIORITY); // Set priority to maximum
```
### getPriority()
- **Description :** Returns the priority of this thread.
- **Syntax :** public final int getPriority()
- **Return Type :** int
### Example:
```java
Thread thread = new Thread();
int priority = thread.getPriority();
System.out.println("Thread Priority: " + priority);
```
### wait()
- **Description :**  Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.
- **Syntax :** public final void wait() throws InterruptedException
- **Throws :** InterruptedException - if any thread interrupted the current thread before or while the current thread was waiting for a notification.
#### Example:
```java
synchronized (sharedObject) {
    sharedObject.wait(); // Wait for notification
}
```
### notify()
- **Description :** Wakes up a single thread that is waiting on this object's monitor.
- **Syntax :** public final void notify()
#### Example:
```java
synchronized (sharedObject) {
    sharedObject.notify(); // Notify a single waiting thread
}
```
### notifyAll()
- **Description :** Wakes up all threads that are waiting on this object's monitor.
- **Syntax :** public final void notifyAll()
#### Example:
```java
synchronized (sharedObject) {
    sharedObject.notifyAll(); // Notify all waiting threads
}
```

### Race Condition:
A race condition occurs in concurrent programming when the outcome of a program depends on the relative timing or interleaving of multiple threads or processes. It happens when two or more threads or processes attempt to modify shared data at the same time. The result of the program becomes unpredictable and may lead to erroneous behavior.

#### Example:
Consider a scenario where two threads, Thread A and Thread B, increment a shared counter variable:

```java
// Shared Counter
int counter = 0;

// Thread A
Thread threadA = new Thread(() -> {
    for (int i = 0; i < 1000; i++) {
        counter++;
    }
});

// Thread B
Thread threadB = new Thread(() -> {
    for (int i = 0; i < 1000; i++) {
        counter++;
    }
});

// Start both threads
threadA.start();
threadB.start();

// Wait for both threads to finish
threadA.join();
threadB.join();

// Print the final value of the counter
System.out.println("Counter: " + counter);
```
In this example, the expected final value of the counter should be 2000 (1000 increments from Thread A and 1000 increments from Thread B). However, due to the race condition, the actual final value may vary, and the program may produce unexpected results.

### Synchronization Keywords:
Java provides synchronization mechanisms to prevent race conditions and ensure thread-safe access to shared resources. Two main synchronization keywords are used: synchronized keyword and volatile keyword.

### synchronized Keyword:
The synchronized keyword is used to create synchronized blocks of code or methods.
It ensures that only one thread can execute a synchronized block or method at a time, preventing concurrent access to shared resources.
It can be applied to instance methods, static methods, and blocks of code.
### Example of synchronized method:
```java
public synchronized void incrementCounter() {
    counter++;
}
Example of synchronized block:
java
Copy code
synchronized (sharedObject) {
    // Critical section of code
}
```
### volatile Keyword:
The volatile keyword is used to indicate that a variable's value will be modified by different threads.
It ensures that changes to the variable made by one thread are immediately visible to other threads.
It does not provide atomicity like synchronized, but it ensures visibility of changes across threads.
#### Example:
```java
private volatile int sharedVariable;
```
### Conclusion:
Race conditions can lead to unpredictable behavior in concurrent programs. To avoid race conditions, synchronization mechanisms such as synchronized and volatile are used in Java to ensure thread safety and proper coordination among threads accessing shared resources. Understanding and correctly applying these synchronization keywords are essential for writing reliable and efficient concurrent programs.

## Demo of volatile keyword 

```java
public class VolatileDemo {
    // Shared variable accessed by multiple threads
    private volatile boolean flag = false;

    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();

        // Thread to modify the flag
        Thread modifierThread = new Thread(() -> {
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            demo.setFlag(true);
            System.out.println("Flag has been set to true");
        });

        // Thread to read the flag
        Thread readerThread = new Thread(() -> {
            while (!demo.isFlag()) {
                // Spin-wait until flag becomes true
            }
            System.out.println("Flag is now true");
        });

        // Start both threads
        modifierThread.start();
        readerThread.start();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
```
In this demo:

- We have a `VolatileDemo` class with a private `volatile` boolean variable `flag`.
- There are two threads: `modifierThread` and `readerThread`.
- `modifierThread` sets the flag to true after 1 second of sleep.
- readerThread continuously checks the value of the flag in a loop until it becomes true.
Without the `volatile` keyword, the `readerThread` might cache the value of the flag and never see it change, leading to an infinite loop. However, with the `volatile` keyword, changes made to the flag by one thread are immediately visible to other threads, ensuring that the `readerThread` sees the updated value and exits the loop when the flag becomes true.

This demonstrates how the volatile keyword ensures visibility of changes across threads without providing atomicity.

## Demo of Synchronized methods and blocks
```java
public class SynchronizationDemo {
    private int counter = 0;

    // Synchronized method
    public synchronized void synchronizedMethod() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }

    // Non-synchronized method
    public void nonSynchronizedMethod() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizationDemo demo = new SynchronizationDemo();

        // Create multiple threads to call synchronized method
        Thread thread1 = new Thread(() -> {
            demo.synchronizedMethod();
        });

        Thread thread2 = new Thread(() -> {
            demo.synchronizedMethod();
        });

        // Create multiple threads to call non-synchronized method
        Thread thread3 = new Thread(() -> {
            demo.nonSynchronizedMethod();
        });

        Thread thread4 = new Thread(() -> {
            demo.nonSynchronizedMethod();
        });

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for threads to finish
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        // Print counter value
        System.out.println("Counter value with synchronized method: " + demo.counter);

        // Reset counter
        demo.counter = 0;

        // Create threads to call synchronized block
        Thread thread5 = new Thread(() -> {
            synchronized (demo) {
                for (int i = 0; i < 1000; i++) {
                    demo.counter++;
                }
            }
        });

        Thread thread6 = new Thread(() -> {
            synchronized (demo) {
                for (int i = 0; i < 1000; i++) {
                    demo.counter++;
                }
            }
        });

        // Start threads
        thread5.start();
        thread6.start();

        // Wait for threads to finish
        thread5.join();
        thread6.join();

        // Print counter value
        System.out.println("Counter value with synchronized block: " + demo.counter);
    }
}
```

In this demo:

- `SynchronizationDemo` class contains a shared counter variable counter.
- It has two methods: `synchronizedMethod()` and `nonSynchronizedMethod()`.
- `synchronizedMethod()` is synchronized, while `nonSynchronizedMethod()` is not.
- We create multiple threads to call these methods simultaneously.
- In the second part of the demo, we use synchronized blocks to ensure thread safety while accessing the shared variable `counter`.
- After executing the threads, we print the final value of the counter to observe the difference between synchronized and `non-synchronized` access.

## Dead lock

Deadlock is a situation in concurrent programming where two or more threads are blocked forever, waiting for each other to release resources. It typically occurs in a multi-threaded environment when two or more threads hold resources and wait for other resources held by different threads, causing a cyclic dependency. As a result, none of the threads can proceed further, leading to a deadlock.

Characteristics of Deadlock:
**Mutual Exclusion :**
Threads hold exclusive access to resources, and only one thread can use a resource at a time.
**Hold and Wait :**
Threads hold resources while waiting for other resources. A thread may hold one resource while waiting for another, leading to potential deadlock.
**No Preemption :**
Resources cannot be forcibly taken from a thread. They can only be released voluntarily.
**Circular Wait :**
There exists a circular chain of two or more threads, each waiting for a resource held by the next thread in the chain.
**Example of Deadlock :**
Consider a scenario with two threads, Thread A and Thread B, and two resources, Resource 1 and Resource 2:

- Thread A holds Resource 1 and requests Resource 2.
- Thread B holds Resource 2 and requests Resource 1.
If both threads acquire their first resource and then attempt to acquire the second resource, a deadlock may occur. Thread A is waiting for Resource 2 to be released by Thread B, while Thread B is waiting for Resource 1 to be released by Thread A. Both threads are blocked indefinitely, waiting for each other to release resources.

### Prevention and Handling of Deadlock:
Deadlock can be prevented or resolved using various techniques:

### Avoidance:
Design the system in such a way that the conditions necessary for deadlock are not possible.
 **Detection and Recovery :**
Implement algorithms to detect deadlock and take corrective actions, such as killing processes or rolling back transactions.
**Preemption :**
Allow resources to be preempted from threads when necessary to break potential deadlocks.
**Resource Ordering :**
Establish a global order in which resources must be acquired to avoid circular waits.
**Timeouts :**
Implement timeouts for resource acquisition to prevent threads from waiting indefinitely.
### Conclusion :
Deadlock is a critical issue in multi-threaded programming that can lead to application failure and system instability. Understanding the characteristics of deadlock and adopting appropriate prevention and handling strategies are essential for writing robust and reliable concurrent programs.

## Demo of Dead lock and possible fixes
```java
public class DeadlockDemo {
    // Resources
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1...");
                try {
                    Thread.sleep(100); // Adding delay to increase the chance of deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding resource 1 and resource 2...");
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");
                try {
                    Thread.sleep(100); // Adding delay to increase the chance of deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Holding resource 1 and resource 2...");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
```
In this code:

We have two threads, thread1 and thread2, each trying to acquire two resources resource1 and resource2 in a different order.
Both threads acquire one resource and then wait for the other resource to be released, creating a potential deadlock scenario.
Now, let's explore some possible fixes for the deadlock:

### Resource Ordering:
Ensure that threads acquire resources in a consistent global order to prevent circular waits. In this case, we can make both threads acquire resources in the same order:
```java
Copy code
// Thread 1
synchronized (resource1) {
    System.out.println("Thread 1: Holding resource 1...");
    try {
        Thread.sleep(100); // Adding delay to increase the chance of deadlock
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Thread 1: Waiting for resource 2...");
    synchronized (resource2) {
        System.out.println("Thread 1: Holding resource 1 and resource 2...");
    }
}

// Thread 2
synchronized (resource1) { // Acquire resource1 first
    System.out.println("Thread 2: Holding resource 1...");
    try {
        Thread.sleep(100); // Adding delay to increase the chance of deadlock
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Thread 2: Waiting for resource 2...");
    synchronized (resource2) {
        System.out.println("Thread 2: Holding resource 1 and resource 2...");
    }
}
```
### Timeouts:
Implement timeouts for resource acquisition to prevent threads from waiting indefinitely. If a thread cannot acquire a resource within a certain time limit, it can release the acquired resources and retry later.
### Preemption:
Allow resources to be preempted from threads when necessary to break potential deadlocks. In Java, this can be achieved by using methods like `Thread.interrupt()` to interrupt waiting threads or using ReentrantLock with `tryLock()` method to attempt non-blocking acquisition of resources.
Applying one or more of these fixes can help prevent or resolve deadlock situations in multi-threaded applications.

## Introduction to virtual Threads
Virtual threads, introduced in Java 17 as part of Project Loom, are lightweight threads managed by the Java Virtual Machine (JVM) rather than the operating system. They provide a more efficient and scalable alternative to traditional OS threads, allowing developers to create thousands or even millions of threads without incurring the overhead associated with OS threads.

### Key Features of Virtual Threads:
### Lightweight:
Virtual threads are significantly lighter than OS threads, consuming minimal memory and resources. This lightweight nature allows the creation of a large number of threads without the performance overhead associated with traditional threads.
### Efficient Scheduling:
Virtual threads are scheduled by the JVM's thread scheduler, which can optimize thread execution based on available CPU resources and thread priorities. This enables more efficient resource utilization and better performance compared to OS thread scheduling.
### Simplified Programming Model:
Virtual threads follow the same programming model as traditional threads, making it easy for developers to migrate existing thread-based code to use virtual threads. They support standard thread operations such as starting, joining, and interrupting.
### Scoped Concurrency:
Virtual threads support scoped concurrency, where groups of related threads can be managed together. This allows for better organization and control of concurrent tasks within an application.
### Integration with Existing APIs:
Virtual threads seamlessly integrate with existing Java APIs, such as CompletableFuture and ExecutorService, allowing developers to leverage the benefits of virtual threads without significant code changes.
### Use Cases for Virtual Threads:
### High-Concurrency Applications:
Virtual threads are ideal for applications requiring high concurrency, such as web servers, network services, and reactive applications. They enable efficient handling of a large number of concurrent tasks without overwhelming system resources.
### Asynchronous Programming:
Virtual threads simplify asynchronous programming by allowing developers to write code that appears synchronous while executing asynchronously in the background. This enhances code readability and maintainability.
### Task Parallelism:
Virtual threads support task parallelism, where multiple tasks can execute concurrently to improve overall application performance. Developers can parallelize independent tasks without worrying about thread management overhead.
### Scalable Workloads:
Applications with dynamic workloads that require scaling up or down based on demand can benefit from virtual threads. The lightweight nature of virtual threads makes it easier to scale resources dynamically to meet changing workload requirements.
### Conclusion
Virtual threads represent a significant advancement in Java's concurrency model, offering lightweight, scalable, and efficient threading capabilities. By providing a more efficient alternative to traditional OS threads, virtual threads enable developers to build highly concurrent and responsive applications with improved performance and resource utilization. As Java continues to evolve, virtual threads are expected to play a crucial role in the development of modern, scalable, and resilient Java applications.

To create a virtual thread in Java, you can use the Thread.startVirtualThread() method introduced in Java 17. Here's a conceptual example:

```java
Copy code
public class VirtualThreadDemo {

    public static void main(String[] args) {
        // Creating and starting a virtual thread
        Thread virtualThread = Thread.startVirtualThread(() -> {
            System.out.println("Virtual thread is running");
        });

        // Wait for the virtual thread to complete
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");
    }
}
```
In this example:

We create a virtual thread using the `Thread.startVirtualThread()` method, passing a `Runnable` lambda expression that prints a message indicating that the virtual thread is running.
We then use `join()` to wait for the virtual thread to complete before printing a message indicating that the main thread is exiting.
Remember that in order to run this code, you need to have Java 17 or later installed on your system, as virtual threads are a feature introduced in Java 17.

Please note that this is a conceptual demonstration, and you may need to adapt the code based on your specific requirements and the version of Java you are using. Additionally, virtual threads are designed to integrate seamlessly with existing Java concurrency APIs, so you can also explore their usage with classes like `CompletableFuture` and `ExecutorService`.

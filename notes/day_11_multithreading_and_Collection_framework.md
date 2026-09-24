Java Multithreading

Definition
Program, Process, Processor and Thread

Before learning multithreading, understand these four terms clearly.

1.1 Program

A program is a set of instructions written to perform a particular task.

Example:

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

This Java source code is a program.

Simple meaning

Program = instructions stored on disk.

2. Process

When a program is executed, the operating system creates a process.
time taken to execute the code. 

For example, when you run:

java Hello

the operating system creates a process for the running Java application.

A process has its own:

Memory
Resources
Address space

Threads
Example

Suppose you open:

Chrome
IntelliJ IDEA
MS Word

Each running application can have one or more processes.

Simple meaning

Process = a running program.

3. Processor / CPU

A processor, or CPU, is the hardware that executes instructions.

For example:

Program
   ↓
Process
   ↓
Threads
   ↓
CPU executes instructions

Modern computers can have multiple CPU cores.

For example:

CPU
 ├── Core 1
 ├── Core 2
 ├── Core 3
 └── Core 4

Multiple threads can execute concurrently, depending on the number of CPU cores and the operating system's scheduling.

4. Thread

A thread is the smallest unit of execution inside a process.
or 
thread is a smallest execution of a code within a process. 

thread also known as light weighted process  means it takes less memory or less 
resources of our machine.

A process can contain multiple threads.

For example:

Java Application Process
│
├── Thread 1
├── Thread 2
├── Thread 3
└── Thread 4

Each thread can perform a different task.

Example

An online shopping application may have:

Thread 1 → Process customer request
Thread 2 → Send email
Thread 3 → Process payment
Thread 4 → Generate report
5. Program vs Process vs Thread



| Term      | Meaning                             | Example                   |
| --------- | ----------------------------------- | ------------------------- |
| Program   | Set of instructions                 | Java `.class` application |
| Process   | Running program                     | Running Java application  |
| Processor | Hardware that executes instructions | CPU                       |
| Thread    | Unit of execution inside process    | `main` thread             |


Multi tasking : 
Process  : in our machine we need more than one processor.  
Thread : within one process using coding we can create more than one thread. 
they are light weighted. they share same memory space part of process. 

What is Multithreading?

Multithreading is the process of executing multiple threads concurrently within a single process.

For example:

Java Application
       |
       +----------------+
       |                |
   Thread 1          Thread 2
       |                |
 Download file     Play music

Both tasks can make progress concurrently.

Why use multithreading?

Common use cases:

Web servers
Banking applications
Payment processing
File processing
Background tasks
Downloading files
Database operations
Chat applications
Games
Enterprise applications

7. Default Thread in Java

When a Java application starts, JVM automatically creates a thread called the main thread.

Consider:

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }
}

The main() method is executed by the main thread.

We can verify this using:

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");

        System.out.println(
            "Current Thread: " +
            Thread.currentThread().getName()
        );
    }
}
Output
Hello Java
Current Thread: main

The JVM created the main thread automatically.

8. Default Thread Example

public class Main {

    public static void main(String[] args) {

        System.out.println("Program started");

        System.out.println(
            "Thread Name: " +
            Thread.currentThread().getName()
        );

        System.out.println(
            "Thread ID: " +
            Thread.currentThread().getId()
        );

        System.out.println(
            "Thread Priority: " +
            Thread.currentThread().getPriority()
        );

        System.out.println("Program completed");
    }
}

Possible output:

Program started
Thread Name: main
Thread ID: 1
Thread Priority: 5
Program completed
Important
Thread.currentThread()

returns the thread currently executing the code.

9. Creating a Custom Thread

There are two traditional ways to create a thread:

Approach 1

Extends the Thread class.

Approach 2

Implements the Runnable interface.


10. Creating Thread Using Thread Class

Create a class that extends Thread.

class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println(
            "Custom thread is running"
        );

    }
}

Then create the object:

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

    }
}

Output:

Custom thread is running
11. Why start() Instead of run()?

This is extremely important.

We should normally use:

thread.start();

not:

thread.run();
start()

start() asks JVM to create/start a new thread, and that thread eventually executes run().

start()
  ↓
New thread
  ↓
run()
run()

If you directly call:

thread.run();

it is simply a normal method call.

No new thread is created.

12. Thread Example with Loop
class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Child Thread: " + i
            );

        }
    }
}

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Main Thread: " + i
            );

        }
    }
}

The output order is not guaranteed.

You might see:

Main Thread: 1
Child Thread: 1
Main Thread: 2
Child Thread: 2
Child Thread: 3
Main Thread: 3
...

or another order.

Why?

Because the JVM/OS scheduler decides when each runnable thread gets CPU time.

13. Thread Name

We can assign a custom thread name.

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(
            "Running: " +
            Thread.currentThread().getName()
        );
    }
}

public class Main {

    public static void main(String[] args) {

        MyThread t1 =
            new MyThread("Employee-Thread");

        t1.start();
    }
}

Output:

Running: Employee-Thread
14. Creating Thread Using Runnable

Another approach is implementing Runnable.

class MyTask implements Runnable {

    @Override
    public void run() {

        System.out.println(
            "Runnable task is running"
        );
    }
}

Create a Thread object:

public class Main {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread thread = new Thread(task);

        thread.start();
    }
}

Output:

Runnable task is running
15. Why Use Runnable?

Java supports single inheritance.

Suppose:

class Employee extends Person

Now you cannot do:

class Employee extends Person, Thread

because Java doesn't support multiple class inheritance.

Instead:

class Employee extends Person
              implements Runnable

This allows the class to inherit from another class and still define a task that can run in a thread.

16. Thread vs Runnable


| Thread                              | Runnable                       |
| ----------------------------------- | ------------------------------ |
| Extend `Thread`                     | Implement `Runnable`           |
| Class cannot extend another class   | Class can extend another class |
| Task and thread are tightly coupled | Task and thread are separated  |
| Simple examples                     | More flexible design           |
| `new MyThread()`                    | `new Thread(task)`             |


Thread Life Cycle Diagram

              start()
   NEW --------------------> RUNNABLE
                               |
                               |
                         CPU Scheduler
                               |
                               v
                            RUNNING*
                               |
              +----------------+----------------+
              |                |                |
              v                v                v
          BLOCKED          WAITING       TIMED_WAITING
              |                |                |
              +----------------+----------------+
                               |
                               v
                            RUNNABLE
                               |
                               |
                         run() completes
                               |
                               v
                         TERMINATED

RUNNING is commonly used when explaining execution, but in Java's Thread.State enum, active execution is represented by RUNNABLE.

21. NEW State

When we create a thread:

Thread t =
    new Thread();

the thread is in the:

NEW

state.

It has not started yet.

22. RUNNABLE State

When we call:

t.start();

the thread becomes eligible to run.

NEW
 ↓
start()
 ↓
RUNNABLE

The scheduler decides when it actually executes.

23. BLOCKED State

A thread enters BLOCKED when it is waiting to acquire a monitor lock.

This commonly occurs with:

synchronized

Example:

synchronized void process() {
    // critical section
}

If Thread 1 has the lock and Thread 2 tries to enter the synchronized method, Thread 2 may become BLOCKED.

24. WAITING State

A thread can enter WAITING when it waits indefinitely for another thread's action.

Examples:

object.wait();

or:

thread.join();

without a timeout.

25. TIMED_WAITING State

A thread waits for a specific amount of time.

Examples:

Thread.sleep(2000);

or:

thread.join(2000);
26. TERMINATED State

When the run() method completes:

public void run() {

    System.out.println("Task completed");

}

the thread becomes:

TERMINATED

A terminated thread cannot be started again.

Thread Life Cycle Working Example

class MyTask extends Thread {

    @Override
    public void run() {

        System.out.println(
            "Thread is running"
        );

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }

        System.out.println(
            "Thread completed"
        );
    }
}

public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        MyTask t =
            new MyTask();

        System.out.println(
            "Before start: " +
            t.getState()
        );

        t.start();

        System.out.println(
            "After start: " +
            t.getState()
        );

        Thread.sleep(500);

        System.out.println(
            "During sleep: " +
            t.getState()
        );

        t.join();

        System.out.println(
            "After completion: " +
            t.getState()
        );
    }
}

Possible output:

Before start: NEW
After start: RUNNABLE
Thread is running
During sleep: TIMED_WAITING
Thread completed
After completion: TERMINATED

The exact state observed immediately after start() 
can vary because thread scheduling is nondeterministic.


Task : Booking ticket, Pay the amount, 
       order the products, 
    transfer the amount etc. 

    Number of client equal to number of thread. 

What is Synchronization?

Synchronization is a mechanism in Java used to control 
access to a shared resource when multiple threads are executing at the same time.

In simple words:

Synchronization allows only one thread at a time to access a critical section of code.

Real-world example

Suppose a movie has:

Available tickets = 1

Two customers try to book it:

Customer 1 → Thread 1
Customer 2 → Thread 2

Without synchronization, both threads may see:

Ticket available = 1

and both may book the same ticket.

With synchronization:

Thread 1 → checks → books ticket
                         ↓
                    ticket = 0
                         ↓
Thread 2 → checks → no ticket
2. Ticket Reservation Without Synchronization

First, let's see the problem.

TicketBooking class
class TicketBooking {

    private int availableTickets = 1;

    public void bookTicket(String customerName) {

        if (availableTickets > 0) {

            System.out.println(
                customerName + " found ticket available"
            );

            // Simulate booking processing
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            availableTickets--;

            System.out.println(
                customerName + " booked the ticket"
            );

        } else {

            System.out.println(
                customerName + " could not book the ticket"
            );
        }
    }
}
CustomerTask class

No anonymous class and no lambda.

class CustomerTask implements Runnable {

    private TicketBooking booking;
    private String customerName;

    public CustomerTask(
            TicketBooking booking,
            String customerName) {

        this.booking = booking;
        this.customerName = customerName;
    }

    @Override
    public void run() {

        booking.bookTicket(customerName);
    }
}
Main class
public class Main {

    public static void main(String[] args) {

        TicketBooking booking =
            new TicketBooking();

        CustomerTask customer1 =
            new CustomerTask(
                booking,
                "Raj"
            );

        CustomerTask customer2 =
            new CustomerTask(
                booking,
                "Ravi"
            );

        Thread thread1 =
            new Thread(customer1);

        Thread thread2 =
            new Thread(customer2);

        thread1.start();
        thread2.start();
    }
}
Possible output
Raj found ticket available
Ravi found ticket available
Raj booked the ticket
Ravi booked the ticket
Problem

We have:

Available tickets = 1

But:

Raj → booked
Ravi → booked

Two customers booked one ticket.

This is a race condition.

3. Why Does This Happen?

Look at this code:

if (availableTickets > 0) {

    Thread.sleep(100);

    availableTickets--;
}

Initially:

availableTickets = 1
Thread 1
Raj checks
1 > 0 → TRUE

Before Raj decreases the ticket count, Thread 2 gets a chance to execute.

Thread 2
Ravi checks
1 > 0 → TRUE

Both threads think the ticket is available.

Then:

Raj → books
Ravi → books

This is the problem synchronization solves.

4. Ticket Reservation With Synchronization

Now change only the method:

public synchronized void bookTicket(String customerName)

Complete code:

TicketBooking
class TicketBooking {

    private int availableTickets = 1;

    public synchronized void bookTicket(
            String customerName) {

        if (availableTickets > 0) {

            System.out.println(
                customerName + " found ticket available"
            );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            availableTickets--;

            System.out.println(
                customerName + " booked the ticket"
            );

        } else {

            System.out.println(
                customerName + " could not book the ticket"
            );
        }
    }
}
CustomerTask
class CustomerTask implements Runnable {

    private TicketBooking booking;
    private String customerName;

    public CustomerTask(
            TicketBooking booking,
            String customerName) {

        this.booking = booking;
        this.customerName = customerName;
    }

    @Override
    public void run() {

        booking.bookTicket(customerName);
    }
}
Main
public class Main {

    public static void main(String[] args) {

        TicketBooking booking =
            new TicketBooking();

        CustomerTask customer1 =
            new CustomerTask(
                booking,
                "Raj"
            );

        CustomerTask customer2 =
            new CustomerTask(
                booking,
                "Ravi"
            );

        Thread thread1 =
            new Thread(customer1);

        Thread thread2 =
            new Thread(customer2);

        thread1.start();
        thread2.start();
    }
}
Possible output
Raj found ticket available
Raj booked the ticket
Ravi could not book the ticket

Or:

Ravi found ticket available
Ravi booked the ticket
Raj could not book the ticket

The customer who gets the ticket is not guaranteed.

But only one customer can book the single available ticket.

5. What Does synchronized Do?

This:

public synchronized void bookTicket(...)

means:

Only one thread at a time can execute this synchronized method for the same TicketBooking object.

Suppose Raj gets the lock:

TicketBooking object
       |
       ↓
    Lock
       |
       ↓
    Raj Thread

Ravi has to wait:

Ravi Thread
     |
     ↓
Waiting for lock

After Raj finishes:

Raj
 ↓
releases lock
 ↓
Ravi gets lock
 ↓
checks tickets
 ↓
0 tickets

Therefore Ravi cannot book the same ticket.

6. Simple Comparison
Without synchronization
Tickets = 1

Raj  → Check → 1 available
Ravi → Check → 1 available

Raj  → Book
Ravi → Book

❌ Problem
Two customers booked one ticket
With synchronization
Tickets = 1

Raj  → Lock → Check → Book → Tickets = 0
                    ↓
                 Unlock

Ravi → Lock → Check → No ticket

✅ Correct
7. Why Do We Need Synchronization?

Synchronization is required when:

Multiple Threads
       ↓
Access Same Data
       ↓
At Least One Thread Modifies Data
       ↓
Race Condition Possible
       ↓
Use Synchronization

Common examples:

Ticket reservation
Bank account withdrawal
Bank account deposit
Inventory management
Seat reservation
Order processing
Shared counter
Stock management
Easy definition for trainees

Synchronization is the process of controlling multiple threads so that only one thread at a time can access a critical section involving shared data.


What is Collection Framework?
Equal to Data Structure 

The Java Collection Framework (JCF) is a set of interfaces, 
classes, and algorithms provided by Java to store and manipulate groups of objects.
or item or elements of any types. 
int a=10;
a=20;

array concept : it is use to store more than one value of same types in java. 
int num[]={1,2,3,5,6,7,8};

structure 

class 
class Employee {
    int id;
    String name
    float salary;


}
Employee emp1 = new Employee();
emp1.id=100;
emp1.name="Ravi";
emp1.salary = 12000.50f;


array objects 

Employee employees[]=new Employee[10];
Employee emp1 = new Employee();
employees[0]=emp1;
employees[0].id=100;
employees[0].name = "Ravi"
employees[0].salary = 34000;

Employee emp2 = new Employee();
employees[1]=emp1;
employees[1].id = 101
employees[1].name = "Raju";
employees[1].salary = 32000;

It provides ready-made data structures such as:
                    Collection ---> interface : part of util package. 
List
Set
Queue
Map
all 4 are interfaces. List, Set, Queue internally extends Collection but Map doesn't 

and implementations such as:

ArrayList
LinkedList
HashSet
TreeSet
HashMap

Simple definition

Collection Framework is a Java framework that provides 
reusable data structures and algorithms for storing and processing groups of objects 
of any types. 


6. Why Use Collection Framework?

Collections provide:

Dynamic size
Easy insertion
Easy deletion
Searching
Sorting
Iteration
Ready-made data structures
Better APIs than manually managing arrays

For example:

ArrayList<String> names = new ArrayList<>();

We can keep adding elements:

names.add("Raj");
names.add("Ravi");
names.add("Akash");

No fixed size needs to be specified.

7. Collection Framework Main Categories

The main concepts are:

Collection Framework(Collection)
       |
       +-------------------+
       |         |         |
      List      Set       Queue             Map

Important: Map is part of the Java Collections Framework,
 but Map does not extend the Collection interface.

8. List

A List is an ordered collection that: 

Maintains insertion order
Allows duplicate elements
Allows index-based access

Example:

List<String> names = new ArrayList<>();

names.add("Raj");
names.add("Ravi");
names.add("Raj");

Result:

Raj
Ravi
Raj

Duplicates are allowed.

Common List implementations

List
 |
 +-- ArrayList
 |
 +-- LinkedList
 |   Vector 
 +-- Stack

9. ArrayList

ArrayList is a dynamically resizable array implementation of List.

Example:

ArrayList<String> names =
    new ArrayList<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");

System.out.println(names);

Output:

[Raj, Ravi, Akash]
Characteristics
Maintains insertion order
Allows duplicates
Allows null
Fast random/index access
Dynamic size

Access:

System.out.println(names.get(1));

Output:

Ravi

Remove:

names.remove("Raj");
10. LinkedList

LinkedList is a list implementation based on linked nodes and also implements Deque.


Node divided into 2 or 3 part base upon type of linked list 

single linked list 
[data,refNextNode]----->[data,refNextNode]---->[data,refNextNode]----> null 

double linked list 

null <------>[pre,data,next]<------->[pre,data,next]<----->null

circular linked list 

Example:

LinkedList<String> names =
    new LinkedList<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");

System.out.println(names);

It can also be used like a queue/deque:

names.addFirst("John");
names.addLast("David");

System.out.println(names);
ArrayList vs LinkedList

| ArrayList                 | LinkedList                                       |
| ------------------------- | ------------------------------------------------ |
| Array-based               | Linked-node based                                |
| Fast index access         | Slower index access                              |
| Good general-purpose List | Useful for frequent end insert/remove operations |
| `get(index)` is efficient | `get(index)` requires traversal                  |


Stack : By default in Java Stack internally 
extends Vector class. 

Stack represents a LIFO structure:

Last In, First Out

Example:

Push A
Push B
Push C

Stack:

C ← top
B
A

Remove:

C

then:

B

Example:

Stack<String> stack =
    new Stack<>();

stack.push("A");
stack.push("B");
stack.push("C");

System.out.println(stack.pop());

Output:

C
Important

Stack is a legacy class. In modern Java code, Deque/ArrayDeque is generally preferred for stack behavior.

12. Set

A Set is a collection that does not allow duplicate elements.
Set doesn't provide index concept. 

Example:

Set<String> names =
    new HashSet<>();

names.add("Raj");
names.add("Ravi");
names.add("Raj");

System.out.println(names);

The second "Raj" is not added.

Conceptually:

Raj
Ravi
Raj  ← duplicate, ignored

13. HashSet

HashSet is a Set implementation based on hashing.

Example:

HashSet<String> names =
    new HashSet<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");
names.add("Raj");

System.out.println(names);

Characteristics:

No duplicates
Does not guarantee insertion order
Allows one null
Fast average-time basic operations

Do not depend on the displayed order.

14. LinkedHashSet

LinkedHashSet maintains insertion order while still preventing duplicates.

LinkedHashSet<String> names =
    new LinkedHashSet<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");
names.add("Raj");

System.out.println(names);

Output:

[Raj, Ravi, Akash]
Difference
HashSet
→ unique
→ order not guaranteed

LinkedHashSet
→ unique
→ insertion order maintained

15. TreeSet

TreeSet stores unique elements in sorted order 
according to their natural ordering or a supplied comparator.

Example:

TreeSet<Integer> numbers =
    new TreeSet<>();

numbers.add(50);
numbers.add(10);
numbers.add(30);
numbers.add(20);

System.out.println(numbers);

Output:

[10, 20, 30, 50]
Characteristics
No duplicates
Sorted order
Useful when sorted unique data is required
Basic operations are typically O(log n)

| Set           | Duplicate | Order               |
| ------------- | --------- | ------------------- |
| HashSet       | ❌         | No guaranteed order |
| LinkedHashSet | ❌         | Insertion order     |
| TreeSet       | ❌         | Sorted order        |


Easy memory
HashSet
→ Unique

LinkedHashSet
→ Unique + Insertion order

TreeSet
→ Unique + Sorted

17. Queue

A Queue is generally used when elements are processed in an order such as:

FIFO — First In, First Out

Example:

Customer 1
Customer 2
Customer 3
     ↓
Customer 1 processed first

Real-world examples:

Printer queue
Customer service
Job processing
Order processing
Background tasks

18. PriorityQueue

PriorityQueue processes elements according to 
priority rather than simple insertion order.

For integers, the natural ordering gives the smallest element at the head.

PriorityQueue<Integer> queue =
    new PriorityQueue<>();

queue.add(50);
queue.add(10);
queue.add(30);
queue.add(20);

System.out.println(queue.poll());

Output:

10

Then:

System.out.println(queue.poll());

Output:

20
Important

When you print the entire PriorityQueue, don't assume the output is fully sorted. The important guarantee is about the head element returned by operations such as peek() and poll().

19. Map

A Map stores data as:

Key → Value

Example:

101 → Raj
102 → Ravi
103 → Akash

A key is normally unique.

Example:

Map<Integer, String> employees =
    new HashMap<>();

employees.put(101, "Raj");
employees.put(102, "Ravi");
employees.put(103, "Akash");

Get value:

System.out.println(
    employees.get(101)
);

Output:

Raj
20. HashMap

HashMap stores key-value pairs using hashing.

HashMap<Integer, String> employees =
    new HashMap<>();

employees.put(101, "Raj");
employees.put(102, "Ravi");
employees.put(103, "Akash");

System.out.println(employees);

Characteristics:

Key-value structure
Keys are unique
One null key is permitted
Multiple null values are permitted
No guaranteed iteration order
Fast average-time put, get, and remove

If we do:

employees.put(101, "Rahul");

the value for key 101 is replaced.

21. LinkedHashMap

LinkedHashMap maintains insertion order of entries.

LinkedHashMap<Integer, String> employees =
    new LinkedHashMap<>();

employees.put(101, "Raj");
employees.put(102, "Ravi");
employees.put(103, "Akash");

System.out.println(employees);

Output:

{101=Raj, 102=Ravi, 103=Akash}
Difference
HashMap
→ Key-value
→ No guaranteed order

LinkedHashMap
→ Key-value
→ Insertion order
22. TreeMap

TreeMap stores key-value pairs sorted by key.

TreeMap<Integer, String> employees =
    new TreeMap<>();

employees.put(103, "Akash");
employees.put(101, "Raj");
employees.put(102, "Ravi");

System.out.println(employees);

Output:

{101=Raj, 102=Ravi, 103=Akash}
Characteristics
Key-value pairs
Keys are sorted
Duplicate keys are not allowed
Basic operations are typically O(log n)
23. Map Comparison


| Map           | Order               |
| ------------- | ------------------- |
| HashMap       | No guaranteed order |
| LinkedHashMap | Insertion order     |
| TreeMap       | Sorted by key       |


Easy memory
HashMap
→ Fast key-value storage

LinkedHashMap
→ Key-value + insertion order

TreeMap
→ Key-value + sorted keys
24. Complete Collection Framework Picture
                 Collection Framework
                         |
          +--------------+--------------+
          |              |              |
         List            Set           Queue
          |              |              |
     +----+----+     +----+----+        |
     |    |    |     |    |    |        |
 ArrayList | Stack HashSet | TreeSet PriorityQueue
          LinkedList       |
                    LinkedHashSet


                    Map
                     |
              +------+------+ 
              |      |      |
          HashMap LinkedHashMap TreeMap

Remember:

List → duplicates allowed
Set  → duplicates not allowed
Queue → processing/order of elements
Map → key-value
25. For-Each Loop

The enhanced for loop is commonly used to iterate over arrays and collections.

Array
int[] numbers = {
    10, 20, 30, 40
};

for (int number : numbers) {

    System.out.println(number);
}

Output:

10
20
30
40
ArrayList
ArrayList<String> names =
    new ArrayList<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");

for (String name : names) {

    System.out.println(name);
}
26. Iterator

Iterator is used to traverse elements of a collection.

Example:

ArrayList<String> names =
    new ArrayList<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");

Iterator<String> iterator =
    names.iterator();

while (iterator.hasNext()) {

    String name = iterator.next();

    System.out.println(name);
}

Output:

Raj
Ravi
Akash

Important methods:

hasNext()
→ Is another element available?

next()
→ Get next element

remove()
→ Remove current element
27. Iterator Example — Remove Safely

Suppose we want to remove employees whose name is "Ravi".

ArrayList<String> names =
    new ArrayList<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");

Iterator<String> iterator =
    names.iterator();

while (iterator.hasNext()) {

    String name = iterator.next();

    if (name.equals("Ravi")) {

        iterator.remove();
    }
}

System.out.println(names);

Output:

[Raj, Akash]

This is an important use case of Iterator.

28. ListIterator

ListIterator is specifically designed for List implementations.

It can move:

Forward
Backward

Example:

ArrayList<String> names =
    new ArrayList<>();

names.add("Raj");
names.add("Ravi");
names.add("Akash");

ListIterator<String> iterator =
    names.listIterator();

while (iterator.hasNext()) {

    System.out.println(
        iterator.next()
    );
}

Output:

Raj
Ravi
Akash

Now move backward:

while (iterator.hasPrevious()) {

    System.out.println(
        iterator.previous()
    );
}

Output:

Akash
Ravi
Raj
29. Iterator vs ListIterator

| Iterator               | ListIterator       |
| ---------------------- | ------------------ |
| Works with collections | Works with List    |
| Forward traversal      | Forward + backward |
| `hasNext()`            | `hasNext()`        |
| `next()`               | `next()`           |
| `remove()`             | `remove()`         |
| No `previous()`        | Has `previous()`   |
| No `add()`             | Has `add()`        |
| No `set()`             | Has `set()`        |


Easy memory
Iterator
→ Forward

ListIterator
→ Forward + Backward
30. Employee Details — Simple Collection Example

Now let's create a meaningful example using an Employee class.

Employee class
class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(
            int id,
            String name,
            String department,
            double salary) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {

        System.out.println(
            id + " | " +
            name + " | " +
            department + " | " +
            salary
        );
    }
}
31. Store Employees in ArrayList
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees =
            new ArrayList<>();

        employees.add(
            new Employee(
                101,
                "Raj",
                "IT",
                70000
            )
        );

        employees.add(
            new Employee(
                102,
                "Ravi",
                "HR",
                60000
            )
        );

        employees.add(
            new Employee(
                103,
                "Akash",
                "Finance",
                75000
            )
        );

        for (Employee employee : employees) {

            employee.display();
        }
    }
}

Possible output:

101 | Raj | IT | 70000.0
102 | Ravi | HR | 60000.0
103 | Akash | Finance | 75000.0

This is one of the most important real-world uses of ArrayList.

32. Employee Details Using Iterator

The same collection can be processed using Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees =
            new ArrayList<>();

        employees.add(
            new Employee(
                101,
                "Raj",
                "IT",
                70000
            )
        );

        employees.add(
            new Employee(
                102,
                "Ravi",
                "HR",
                60000
            )
        );

        employees.add(
            new Employee(
                103,
                "Akash",
                "Finance",
                75000
            )
        );

        Iterator<Employee> iterator =
            employees.iterator();

        while (iterator.hasNext()) {

            Employee employee =
                iterator.next();

            employee.display();
        }
    }
}
33. Employee Details Using Map

Sometimes we want to find an employee directly using an employee ID.

A Map is useful.

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Employee> employees =
            new HashMap<>();

        employees.put(
            101,
            new Employee(
                101,
                "Raj",
                "IT",
                70000
            )
        );

        employees.put(
            102,
            new Employee(
                102,
                "Ravi",
                "HR",
                60000
            )
        );

        Employee employee =
            employees.get(101);

        employee.display();
    }
}

Output:

101 | Raj | IT | 70000.0

Here:

Employee ID → Employee Object
101 → Raj
102 → Ravi

This is a very common enterprise application pattern.

34. List vs Set vs Map

| Feature          | List         | Set             | Map                  |
| ---------------- | ------------ | --------------- | -------------------- |
| Structure        | Elements     | Unique elements | Key-value            |
| Duplicate values | Yes          | No              | Values can duplicate |
| Duplicate keys   | N/A          | N/A             | No                   |
| Index            | Yes          | No              | No                   |
| Example          | `ArrayList`  | `HashSet`       | `HashMap`            |
| Main use         | Ordered data | Unique data     | Lookup by key        |


Simple real-world examples
List
→ Employee attendance list

Set
→ Unique department names

Map
→ Employee ID → Employee
35. Which Collection Should I Choose?

Use this simple decision guide during training:

Do I need key-value?
       |
      Yes
       ↓
      Map
       |
       +-- No order      → HashMap
       +-- Insertion     → LinkedHashMap
       +-- Sorted keys   → TreeMap


Do I need duplicates?
       |
      Yes
       ↓
      List
       |
       +-- General list  → ArrayList
       +-- Linked/deque operations → LinkedList


      No
       ↓
      Set
       |
       +-- No order      → HashSet
       +-- Insertion     → LinkedHashSet
       +-- Sorted        → TreeSet


Do I need priority-based processing?
       |
      Yes
       ↓
 PriorityQueue

 
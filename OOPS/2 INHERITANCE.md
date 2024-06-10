Sure, I'd be happy to explain inheritance in Java!

**Inheritance** is one of the four fundamental principles of Object-Oriented Programming (OOP), along with polymorphism, encapsulation, and abstraction. Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.

In Java, inheritance is implemented using the `extends` keyword. Here are some important features of inheritance in Java:

1. It represents the **IS-A** relationship, also known as parent-child relationship.
2. It provides a method for **Code Reusability** to reuse the fields and methods of the existing class when you create a new class.
3. It is used to achieve **Method Overriding** and **Runtime Polymorphism** benefits.

Here's an example of inheritance in Java:

```java
// Parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Child class
class Bike extends Vehicle {
    int speed;

    void increaseSpeed(int increment) {
        speed = speed + increment;
        System.out.println("Speed is: " + speed);
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run(); // calling method from parent class
        b.increaseSpeed(10); // calling method from child class
    }
}
```

In this example, `Bike` is a child class that inherits from the `Vehicle` parent class. The `Bike` class has access to the `run` method from the `Vehicle` class, and it also defines its own method `increaseSpeed`.

In Java, inheritance is a mechanism that allows one class to inherit the features (fields and methods) of another class. It's a powerful feature of object-oriented programming that promotes code reusability and establishes a parent-child relationship between classes¹². Here are the types of inheritance supported in Java:

1. **Single Inheritance**: In single inheritance, a subclass is derived from only one superclass. It inherits the properties and behavior of a single parent class¹.

```java
class Employee {
    float salary = 34534*12;
}

public class Executive extends Employee {
    float bonus = 3000*6;
    public static void main (String args []) {
        Executive obj = new Executive ();
        System.out.println ("Total salary credited: "+obj.salary);
        System.out.println ("Bonus of six months: "+obj.bonus);
    }
}
```

2. **Multi-level Inheritance**: In multi-level inheritance, a class is derived from a class which is also derived from another class¹.

3. **Hierarchical Inheritance**: In hierarchical inheritance, multiple classes share a single superclass¹.

4. **Hybrid Inheritance**: Hybrid inheritance is a combination of more than one type of inheritance¹.

Please note that **multiple inheritance** (a class extending more than one class) is not supported in Java through classes to avoid ambiguity⁴. However, it can be achieved through interfaces⁴.

Remember, the `extends` keyword is used to implement inheritance in Java². The constructor and private members of the superclass do not get inherited in the subclass¹. Also, cyclic inheritance is not permitted in Java¹.


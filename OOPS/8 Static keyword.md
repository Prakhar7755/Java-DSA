Certainly! Let's dive into the **`static`** keyword in Java, explore its properties, and provide some code examples.

1. **What is the `static` Keyword?**

   - In Java, the `static` keyword indicates that a particular member (variable or method) belongs to the **class itself**, rather than to an instance of that class.
   - When you declare something as `static`, there is only **one instance** of it shared across all objects of the class.

2. **Where Can We Use `static`?**

   - We can apply the `static` keyword to:
     - **Variables**: Creating static variables (also known as class variables).
     - **Methods**: Defining static methods (also known as class methods).
     - **Blocks**: Using static initialization blocks.
     - **Nested Classes**: Creating static nested classes.

3. **Static Variables (Class Variables)**:

   - A static variable is shared among all instances of the class.
   - It gets memory only once in the class area during class loading.
   - Example:

     ```java
     class Student {
         int rollno; // Instance variable
         String name;
         static String college = "ITS"; // Static variable

         Student(int r, String n) {
             rollno = r;
             name = n;
         }

         void display() {
             System.out.println(rollno + " " + name + " " + college);
         }
     }

     public class TestStaticVariable {
         public static void main(String[] args) {
             Student s1 = new Student(111, "Karan");
             Student s2 = new Student(222, "Aryan");

             s1.display();
             s2.display();
         }
     }
     ```

     Output:

     ```
     111 Karan ITS
     222 Aryan ITS
     ```

4. **Static Blocks**:

   - Static blocks are executed when the class is loaded into memory.
   - They are used for static initialization.
   - Example:

     ```java
     class Main {
         static int a = 23; // Static variable
         static int b;
         static int max;

         static {
             System.out.println("First Static block.");
             b = a * 4;
         }

         static {
             System.out.println("Second Static block.");
             max = 30;
         }

         static void display() {
             System.out.println("a = " + a);
             System.out.println("b = " + b);
         }

         public static void main(String[] args) {
             display();
         }
     }
     ```

     Output:

     ```
     First Static block.
     Second Static block.
     a = 23
     b = 92
     ```

5. **Static Methods (Class Methods)**:

   - Static methods belong to the class, not to any specific instance.
   - They can be called using the class name (e.g., `ClassName.methodName()`).
   - Example:

     ```java
     class MathUtils {
         static int add(int a, int b) {
             return a + b;
         }
     }

     public class TestStaticMethod {
         public static void main(String[] args) {
             int result = MathUtils.add(10, 20);
             System.out.println("Result: " + result);
         }
     }
     ```

     Output:

     ```
     Result: 30
     ```

6. **Advantages of `static`**:
   - Memory efficiency: Static members are shared, saving memory.
   - Common properties: Static variables represent common properties across instances.
   - Utility methods: Static methods provide utility functions without needing an instance.

Remember, the `static` keyword plays a crucial role in Java for memory management and utility methods. If you have more questions, feel free to ask! 😊¹²³⁴

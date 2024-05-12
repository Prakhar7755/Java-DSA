The `var` keyword in Java was introduced in Java 10. It allows you to declare a variable without explicitly specifying its type. Instead, the type is inferred from the variable's initial value. Here are some key points about the `var` keyword:

1. **Declaration with `var`**:
   - You can declare variables of any data type using `var`. For example:
     ```java
     class Demo1 {
         public static void main(String[] args) {
             var x = 100;
             var y = 1.90;
             var z = 'a';
             var p = "tanu";
             var q = false;
             System.out.println(x);
             System.out.println(y);
             System.out.println(z);
             System.out.println(p);
             System.out.println(q);
         }
     }
     ```
     Output:
     ```
     100
     1.9
     a
     tanu
     false
     ```

2. **Local Variables Only**:
   - You can use `var` for local variable declarations within methods.
   - However, you **cannot** use it for instance or global variable declarations:
     ```java
     class Demo3 {
         var x = 50; // Error: 'var' is not allowed here
         public static void main(String[] args) {
             System.out.println(x);
         }
     }
     ```

3. **Not for Generic Types**:
   - You **cannot** use `var` with generic types:
     ```java
     import java.util.*;
     class Demo4 {
         public static void main(String[] args) {
             var<var> al = new ArrayList<>(); // Error: 'var' is not allowed here
             al.add(10);
             al.add(20);
             al.add(30);
             System.out.println(al);
         }
     }
     ```

4. **Explicit Initialization Required**:
   - You **must** explicitly initialize a variable declared with `var`:
     ```java
     class Demo6 {
         public static void main(String[] args) {
             var variable; // Error: cannot infer type for local variable 'variable'
             var variable = null; // Error: variable initializer is 'null'
         }
     }
     ```

5. **Not for Lambda Expressions**:
   - You **cannot** use `var` for lambda expressions:
     ```java
     interface myInt {
         int add(int a, int b);
     }
     class Demo7 {
         public static void main(String[] args) {
             var obj = (a, b) -> (a + b); // Error: cannot infer type for local variable 'obj'
             System.out.println(obj.add(2, 3));
         }
     }
     ```

6. **Not for Method Parameters and Return Types**:
   - You **cannot** use `var` for method parameters or return types:
     ```java
     class Demo8 {
         var method1() { return "Inside Method1"; } // Error: 'var' is not allowed here
         void method2(var a) { System.out.println(a); } // Error: 'var' is not allowed here
         public static void main(String[] args) {
             Demo1 obj = new Demo1();
             var res = obj.method1();
             obj.method2(); // Error: 'var' is not allowed here
         }
     }
     ```
     
Remember that `var` is not a Java keyword; it's a reserved type name. While it can make your code more concise, use it judiciously to maintain readability and clarity¹²³⁴. If you have any more questions, feel free to ask! 😊

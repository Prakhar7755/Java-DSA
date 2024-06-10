In Java, access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and setter methods¹. They help to restrict the scope of a class, constructor, variable, method, or data member². There are four types of access modifiers in Java:

1. **Default (Package-Private)**: If we do not explicitly specify any access modifier, then by default the default access modifier is considered¹. The data members, classes, or methods that are not declared using any access modifiers i.e. having default access modifiers are accessible only within the same package².

```java
package defaultPackage;

class Logger {
    void message() {
        System.out.println("This is a message");
    }
}
```

2. **Private**: When variables and methods are declared private, they cannot be accessed outside of the class¹. Private members are accessible only within their class⁴.

```java
class Data {
    // private variable
    private String name;
}

public class Main {
    public static void main(String[] main){
        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz"; // This will throw a compile-time error
    }
}
```

3. **Protected**: The methods or data members declared as protected are accessible within the same package or subclasses in different packages².

```java
package p1;

public class A {
    protected void display() {
        System.out.println("GeeksforGeeks");
    }
}

package p2;

import p1.*;

class B extends A {
    public static void main(String args[]) {
        B obj = new B();
        obj.display();
    }
}
```

4. **Public**: Public members are accessible from anywhere⁴. If we want our class to be accessed everywhere, we use the public modifier³.

```java
public class Dog {
    // This class can be accessed from anywhere
}
```

Remember, you cannot set the access modifier of getter methods¹. Also, top-level classes or interfaces cannot be declared as private or protected².


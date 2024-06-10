class Student2 {/* POLYMORPHISM */
    String name;
    int age;

    // compile time polymorphism
    void printInfo(String name) {
        System.out.println(name);
    }

    void printInfo(int age) {
        System.out.println(age);
    }

    void printInfo(String name, int age) {
        System.out.println(name + "\t" + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        /*
         * Pen pen1 = new Pen();
         * pen1.color = "Red";
         * pen1.type = "Ball";
         * pen1.write();
         * pen1.printColor();
         * 
         * Pen pen2 = new Pen();
         * pen2.color = "Blue";
         * pen2.type = "Gel";
         * pen2.write();
         * pen2.printColor();
         */

        // CONSTURTOR

        /*
         * Student1 s1 = new Student1();
         * s1.name = "Gamushara";
         * s1.age = 69;
         * s1.printInfo();
         */
        /*
         * Student1 s2 = new Student1("Harish", 38);
         * s2.printInfo();
         */

        // POLYMORPHISM
        Student2 s2 = new Student2();
        s2.name = "Hari";
        s2.age = 55;
        s2.printInfo(s2.name, s2.age);

    }
}

class Student1 { /* CONSTURCTOR */
    String name;
    int age;

    // Student1() {/* NON PARAMETERIZED CONSTRUCTOR */
    // System.out.println("Constructor called");
    // }
    Student1(String name, int age) {/* PARAMETERIZED CONSTRUCTOR */
        System.out.println("Constructor called in parameterized one");
        this.name = name;
        this.age = age;
    }

    /*
     * COPY CONSTRUCTOR
     * Student1(Student1 s2){
     * this.name = s2.name;
     * this.age = s2.age;
     * }
     */

    void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Pen {/* OBJECT CREATION */
    String color;
    String type; // Ball point or Gel

    void write() {
        System.out.printf("Writing Something with %s %s pen\n", this.color, this.type);
    }

    void printColor() {
        System.out.printf("THis pen is of %s color\n", this.color);
    }
}
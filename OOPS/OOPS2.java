

class Shape {
    // String color;
    void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {/* SINGLE LEVEL INHERITANCE */
    void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    void area(int l, int h) {
        System.out.println(0.5 * l * h);

    }
}

class Circle extends Shape {
    void area(int r) {
        System.out.println(Math.PI * r * r);
    }
}

public class OOPS2 {
    public static void main(String[] args) {
        Shape c = new Circle();
        // c.area(2);
        c.area();

        /* PACKAGES */
        bank.Account b = new bank.Account();
        b.name = "Harshvardhan";
        b.print();
    }
}

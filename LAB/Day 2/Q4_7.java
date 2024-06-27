// multiple inheritance using interfaces

interface Walkable {
  void walk();
}

interface Swimmable {
  void swim();
}

class Duck implements Walkable, Swimmable {
  public void walk() {
    System.out.println("Duck is walking");
  }

  public void swim() {
    System.out.println("Duck is swimming");
  }
}

public class Q4_7 {
  public static void main(String[] args) {
    Duck d = new Duck();

    d.walk();
    d.swim();
  }
}

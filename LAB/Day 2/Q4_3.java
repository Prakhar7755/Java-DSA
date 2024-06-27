//          HIERARCHIAL INHERITANCE
class Animal {
  String name;

  public Animal(String name) {
    this.name = name;
  }

  public void speak() {
    System.out.println("Animal is Speaking");
  }
}

class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  @Override
  public void speak() {
    System.out.println(name + " is barking");
  }
}

class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  @Override
  public void speak() {
    System.out.println(name + " is Meowing!");
  }
}

public class Q4_3 {
  public static void main(String[] args) {
    Dog dog = new Dog("Doggy");
    Cat cat = new Cat("Catty");

    dog.speak();
    cat.speak();
  }
}

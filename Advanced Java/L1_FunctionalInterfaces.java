@FunctionalInterface
interface A {
  void show(String s);
}

@FunctionalInterface
interface B {
  int add(int a, int b);
}

interface C {
  int add(int a, int b);

  default void print() {
    System.out.println("This is a defalut method");
  }
}

class Cc implements C {
  @Override
  public int add(int a, int b) {
    return a + b;
  }

}

public class L1_FunctionalInterfaces {
  public static void main(String[] args) {

    /*
     * A obj = new A() {
     * public void show(String s) {
     * System.out.println(s);
     * }
     * };
     */
    /*
     * A obj = (String s) -> {
     * System.out.println(s);
     * };
     */

    A obj = s -> System.out.println(s);

    obj.show("Hello Terminal");

    B calc = (a, b) -> a + b;

    System.out.println(calc.add(2, 2));


    Cc obj3 = new Cc();
    
    obj3.add(4, 4);
    obj3.print();
  }
}
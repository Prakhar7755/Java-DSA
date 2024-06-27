// METHOD OVERLOADING
class Adder {
  public int add(int a, int b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }
}

public class Q4_4_Adder {

  public static void main(String[] args) {
    Adder adder = new Adder();

    System.out.println("the sum of 2 numbers (5,6) using method overloading is " + adder.add(5, 6));
    System.out.println("the sum of 3 numbers (5,6,7) using method overloading is " + adder.add(5, 6, 7));
  }
}

public class Q2_Calc {

  public static void main(String[] args) {
    int a, b, sum, diff, prod, quo, rem;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);

    sum = a + b;
    diff = a - b;
    prod = a * b;
    quo = a / b;
    rem = a % b;

    System.out.println("sum " + sum);
    System.out.println("difference " + diff);
    System.out.println("product " + prod);
    System.out.println("quotient " + quo);
    System.out.println("remainder " + rem);

  }
}

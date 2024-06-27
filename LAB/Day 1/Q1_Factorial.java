
public class Q1_Factorial {

  public static int factItr(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static int factRec(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factRec(n - 1);
  }

  public static void main(String[] args) {
    int n = 5;

    System.out.println("factorial of " + n + " is " + factItr(n));
    System.out.println("factorial of " + n + " is " + factRec(n));
  }

}

public class Q5_1_HandleArithmeticException {

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = divide(a, b);
            System.out.println("Result of division: " + result);
            System.out.println("SUCCESS");
        } catch (ArithmeticException e) {
            System.out.println("PRAKHAR's Arithmetic Exception caught: " + e.getMessage());
        }
    }
}
@SuppressWarnings("unused")
public class Q5_2_MultipleExceptionHandling {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Arithmetic Exception

            int[] arr = new int[5];
            System.out.println(arr[10]); // Array Index Out Of Bounds Exception

            System.out.println("SUCCESS");

        } catch (ArithmeticException e) {
            System.out.println("PRAKHAR's Arithmetic Exception: Division by zero ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("PRAKHAR's Array Index Out Of Bounds Exception: Array index is invalid");
        } catch (Exception e) {
            System.out.println("PRAKHAR's SOME OTHER ERROR " + e.getMessage());
        }
    }
}

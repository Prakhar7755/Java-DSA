public class Q5_3_MultipleExceptionInSingleCatch {

    @SuppressWarnings("unused")

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            int[] arr = new int[5];
            System.out.println(arr[10]);

            System.out.println("EXECUTION SUCCESS");
        } catch (Exception e) {
            System.out.println("PRAKHAR's ERROR: " + e.getMessage());
        }
    }
}

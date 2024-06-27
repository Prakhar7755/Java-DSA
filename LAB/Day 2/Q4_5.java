//          METHOD OVERLOADING PART-2 CHANGE DATA TYPES
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}

public class Q4_5 {
    public static void main(String[] args) {

        System.out.println("Adding INTS");
        System.out.println("Sum of 2 and 3: " + Adder.add(2, 3));

        System.out.println("\nAdding DOUBLES");
        System.out.println("Sum of 2.5 and 3.5: " + Adder.add(2.5, 3.5));

        System.out.println("\nAdding the ARRAY INTS");
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of integers in array: " + Adder.add(arr));
    }
}
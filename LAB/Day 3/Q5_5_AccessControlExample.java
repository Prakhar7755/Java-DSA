import java.util.Scanner;

class AgeBelow18Exception extends Exception {
    public AgeBelow18Exception(String message) {
        super(message);
    }
}

public class Q5_5_AccessControlExample {

    static void checkAccess(int age) throws AgeBelow18Exception {
        if (age < 18) {
            throw new AgeBelow18Exception("Access denied - You must be at least 18 years old");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter age");
            int age = sc.nextInt();
            checkAccess(age);
            sc.close();
        } catch (AgeBelow18Exception e) {
            System.out.println("PRAKHAR's  AgeBelow18Exception caught: " + e.getMessage());
        }
    }
}

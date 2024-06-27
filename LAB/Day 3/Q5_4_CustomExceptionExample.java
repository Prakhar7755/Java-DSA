
class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}

public class Q5_4_CustomExceptionExample {

  public static void main(String[] args) {
    try {
      int age = 22;
      validateAge(age);
    } catch (InvalidAgeException e) {
      System.out.println("PRAKHAR's InvalidAgeException caught: " + e.getMessage());
    }
  }

  static void validateAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Age is not valid to vote");
    } else {
      System.out.println("Age is valid to vote");
    }
  }

}

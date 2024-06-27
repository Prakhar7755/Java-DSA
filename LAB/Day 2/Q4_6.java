//        METHOD overriding BANK
class Bank {
  public double calculateInterest(double principal) {
    return principal * 0.05;
  }
}

class SavingsAccount extends Bank {
  @Override
  public double calculateInterest(double principal) {
    return principal * 0.06;
  }
}

class CurrentAccount extends Bank {
  @Override
  public double calculateInterest(double principal) {
    return principal * 0.04;
  }
}

public class Q4_6 {
  public static void main(String[] args) {
    SavingsAccount savings = new SavingsAccount();
    CurrentAccount current = new CurrentAccount();

    double savingsInterest = savings.calculateInterest(1000);
    System.out.println("Savings Account interest : Rs." + savingsInterest);

    double currentInterest = current.calculateInterest(1000);
    System.out.println("Current Account interest : Rs." + currentInterest);
  }
}

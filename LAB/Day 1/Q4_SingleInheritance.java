import java.util.Scanner;

class Person {
  String name;

  public void setName() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name");
    this.name = sc.nextLine();
    sc.close();
  }

  public String getName() {
    return this.name;
  }
}

class Employee extends Person {
  int salary;

  public void setSalary() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter salary");
    this.salary = sc.nextInt();
    sc.close();

  }

  public int getSalary() {
    return this.salary;
  }
}

public class Q4_SingleInheritance {
  public static void main(String[] args) {
    Employee e = new Employee();
    e.setName();
    e.setSalary();
    System.out.println("Name of employee is " + e.getName() + " and the salary is " + e.getSalary());
  }
}

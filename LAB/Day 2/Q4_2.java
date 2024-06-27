// Person , EMPLOYEE AND PROGRAMMER MULTILEVEL INHERITANCE
class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

}

class Employee extends Person {
  int employeeId;

  public Employee(String name, int age, int employeeId) {
    super(name, age);
    this.employeeId = employeeId;
  }

}

class Programmer extends Employee {
  String[] languages;

  public Programmer(String name, int age, int employeeId, String[] languages) {
    super(name, age, employeeId);
    this.languages = languages;
  }

  public void displayInfo() {
    System.out.println(super.name+" has age "+super.age+" has employee ID "+super.employeeId);
    System.out.print("Programming Languages: ");
    for (String language : languages) {
      System.out.print(language + " ");
    }
    System.out.println();
  }
}

public class Q4_2 {
  public static void main(String[] args) {
    String[] languages = { "Java", "Python", "C++" };
    Programmer programmer = new Programmer("GAMA PEHALWAN", 30, 1001, languages);
    programmer.displayInfo();
    
  }
}

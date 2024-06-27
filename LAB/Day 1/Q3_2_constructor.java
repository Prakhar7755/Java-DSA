import java.util.Scanner;

class Student {
  String name;
  String branch;
  int id;

  Student(String name, String branch, int id) {
    this.name = name;
    this.branch = branch;
    this.id = id;
  }

  void getData() {
    System.out.println("\n\nSTUDENT INFORMATION\n");
    System.out.println("Name " + this.name);
    System.out.println("Branch " + this.branch);
    System.out.println("ID " + this.id);
  }

}

public class Q3_2_constructor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name, branch and Id");
    String name = sc.nextLine();
    String branch = sc.nextLine();
    int id = sc.nextInt();

    Student s1 = new Student(name, branch, id);
    s1.getData();

    sc.close();

  }
}

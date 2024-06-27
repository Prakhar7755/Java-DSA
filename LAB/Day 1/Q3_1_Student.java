import java.util.Scanner;

public class Q3_1_Student {
  int id;
  String name;

  public void setId() {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter id ");
    this.id = sc.nextInt();
    sc.close();
  }

  public int getId() {
    return this.id;
  }

  public void setName() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Name");
    this.name = sc.nextLine();
    sc.close();
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Q3_1_Student s1 = new Q3_1_Student();
    s1.setId();
    s1.setName();
    System.out.println("Hello my name is " + s1.getName() + " and id is " + s1.getId());

  }

}

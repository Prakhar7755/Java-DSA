class Pen {
    String color;
    String type; // Ball point or Gel

    void write() {
        System.out.printf("Writing Something with %s %s pen\n", this.color, this.type);
    }
    void printColor(){
        System.out.printf("THis pen is of %s color\n",this.color);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "Ball";
        pen1.write();
        pen1.printColor();

    }
}
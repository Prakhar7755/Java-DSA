import java.util.*;
/* STREAM HERE CAN BE USED/CONSUMED ONLY ONCE */

public class L2_5 {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4, 5, 6, 2, 7, 8, 9);

    

    /* here we created almost 4 streams */
    nums.stream()
        .filter(n -> n % 2 == 1)
        .sorted()
        .map(n -> n * 2)
        .forEach(n -> System.out.println(n));
  }
}
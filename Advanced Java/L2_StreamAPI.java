import java.util.*;
import java.util.stream.Stream;

/* STREAM HERE CAN BE USED/CONSUMED ONLY ONCE */

public class L2_StreamAPI {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4, 5, 6, 2, 7, 8, 9);

    Stream<Integer> data = nums.stream();
    // nums.forEach(n -> System.out.println(n));

    // data.forEach(n -> System.out.println(n));
    // data.forEach(n -> System.out.println(n)); // ERROR : stream has already been
    // operated upon or closed

    /* HERE WE CREATED A NEW STREAM BY CONSUMING THE PREVIOUS ONE */
    Stream<Integer> sortedData = data.sorted();

    // sortedData.forEach(n -> System.out.println(n));

    Stream<Integer> mappedData = sortedData.map(n -> n * 2);

    mappedData.forEach(n -> System.out.println(n));
  }
}

import java.util.Arrays;
import java.util.Stack;

public class L4_reversal {
    static int[] arrayReversal(int[] input) {
        Stack<Integer> stc = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            stc.push(input[i]);
        }
        int[] reversedArray = new int[input.length];
        int index = 0;

        while (!stc.isEmpty()) {
            reversedArray[index] = stc.pop();
            index++;
        }
        return reversedArray;
    }

    static String stringReversal(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        StringBuilder reversedString = new StringBuilder();
        while (!st.isEmpty()) {
            reversedString.append(st.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello, World! Gamushara");
        String str1 = "Harry Potter";
        String str2 = "racecar";

        System.out.printf("The reversal of %s is %s\n", str1, stringReversal(str1));
        System.out.printf("The reversal of %s is %s\n", str2, stringReversal(str2));

        System.out.println("===============================");

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
        System.out.println("the reverse is : " + Arrays.toString(arrayReversal(arr)));

    }
}

/*
 * The reversal of Harry Potter is rettoP yrraH
 * The reversal of racecar is racecar
 * 
 * ===============================
 * 
 * [1, 2, 3, 4, 5]
 * the reverse is : [5, 4, 3, 2, 1]
 */

// git commit --allow-empty-message -m ''
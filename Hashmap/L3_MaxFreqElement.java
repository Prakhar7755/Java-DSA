import java.util.*;

public class L3_MaxFreqElement {
    static char maxFreq(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        // int maxFreq = hm.get(str.charAt(0));
        char maxFreqChar = str.charAt(0);

        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(maxFreqChar)) {
                maxFreqChar = key;
            }
        }
        System.out.printf("The maximum freq element is %c\n", maxFreqChar);
        return maxFreqChar;
    }

    public static void main(String[] args) {
        // make a map of char and its frequency
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        maxFreq(str);

    }
}

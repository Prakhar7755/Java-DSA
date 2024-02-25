/* 
 * a1 = 1   1   2   2   2   3   5
 * a2 = 1   1   1   2   2   4   5

 * O/P   =    1   1   2   2   5 
*/

import java.util.HashMap;

public class L4_GetCommonElement2 {
    public static void main(String[] args) {
        int a1[] = { 1, 1, 2, 2, 2, 3, 5 };
        int a2[] = { 1, 1, 1, 2, 2, 4, 5 };

        getCommonElements(a1, a2);
    }

    static void getCommonElements(int[] a1, int[] a2) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        // inputing all the keys with frequencies
        for (int val : a1) {
            if (mp.containsKey(val)) {
                mp.put(val, mp.get(val) + 1);
            } else {
                mp.put(val, 1);
            }
        }

        // printing the value if it exist along with that decreasing its frequency by 1
        // and then don't print if freq is 0
        for (int val : a2) {
            if (mp.containsKey(val) && mp.get(val) != 0) {
                System.out.printf("%d\t", val);
                mp.put(val, mp.get(val) - 1);
            }
        }
    }

}
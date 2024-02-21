import java.util.*;

public class L4_GetCommonElement {
    public static void main(String[] args) {
        /*
         * given two arrays a1 & a2 print all the common elements of a2 present in
         * a1(don't print duplicates)
         */

        int a1[] = { 1, 1, 2, 2, 2, 3, 5 };
        int a2[] = { 1, 1, 1, 2, 2, 4, 5 };
        getCommonElements(a1, a2);

    }

    static void getCommonElements(int[] a1, int[] a2) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int val : a1) {
            if (mp.containsKey(val))
                mp.put(val, mp.get(val) + 1);
            else
                mp.put(val, 1);
        }
        for (int val : a2) {
            if (mp.containsKey(val)) {
                System.out.printf(val + "\t");
                mp.remove(val);
            }
        }
        System.out.println();
    }
}
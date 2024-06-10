import java.util.*;

//              PUT(key,value), GET(key), CONTAINS(key), KEYSET(), EntrySet() all functions O(1)
/* 
 * put()
 * get()
 * containsKey()
 * remove()
 * size()
 * keySet()
 */

public class L1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // PUT
        hm.put("India", 140);
        hm.put("China", 135);
        hm.put("USA", 35);
        hm.put("Uttam Pradesh", 22);

        System.out.println(hm);
        System.out.println(hm.toString());
        // {USA=35, China=135, Uttam Pradesh=22, India=140}
        // {USA=35, China=135, Uttam Pradesh=22, India=140}

        // UPDATING
        hm.put("Nigeria", 222);
        hm.put("USA", 10);
        System.out.println(hm);
        System.out.println(hm.toString());
        // {USA=10, China=135, Uttam Pradesh=22, Nigeria=222, India=140}
        // {USA=10, China=135, Uttam Pradesh=22, Nigeria=222, India=140}

        // GET
        System.out.println(hm.get("India"));// 140
        System.out.println(hm.get("USA")); // 10
        System.out.println(hm.get("Gamushara")); // null as this key isn't present

        // CONTAINSKEY
        System.out.println(hm.containsKey("India"));// true
        System.out.println(hm.containsKey("USA")); // true
        System.out.println(hm.containsKey("Gamushara")); // false

        // KEYSET and LOOPS
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String key : hm.keySet()) {
            Integer value = hm.get(key);
            System.out.println(key + "\t" + value);
        }

        /*
         * USA 10
         * China 135
         * Uttam Pradesh 22
         * Nigeria 222
         * India 140
         */

        // ENTRY SET LOOPS 2 USING entry set

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.printf(e.getKey() + "\t");
            System.out.printf(e.getValue() + "\n");
        }
        /*
         * USA 10
         * China 135
         * Uttam Pradesh 22
         * Nigeria 222
         * India 140
         */
    }
}
import java.util.HashMap;

public class L7_SubsetOfArray {

    static boolean isSubset(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // create a hashmap to store the frequencies of elements in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // iterate over the elements of arr2 and check if they are present in the
        // hashmap
        for (int num : arr2) {
            // if the element is not in the hashmap or its frequency is zero, return false
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            // otherwise, decrement the frequency of the element by one
            map.put(num, map.get(num) - 1);
        }
        // if all elements of arr2 are found, return true
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 11, 1, 13, 21, 3, 7 };
        int[] arr2 = { 11, 3, 7, 1 };
        System.out.println(isSubset(arr1, arr2));
    }
}
/*
 * We use map.getOrDefault instead of map.get when we want to return a default
 * value if the key
 * is not found in the map. The map.get method returns null if the key is not
 * present, which may
 * cause problems or require extra checks. The map.getOrDefault method allows us
 * to specify a
 * default value as a second argument, which will be returned if the key is not
 * found. This can make
 * the code more concise and avoid null values
 */
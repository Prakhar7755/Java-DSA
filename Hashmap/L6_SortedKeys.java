import java.util.Arrays;
import java.util.HashMap;

public class L6_SortedKeys {
    static int[] sortedKeys(HashMap<Integer, String> map) {
        Integer[] keysArray = map.keySet().toArray(new Integer[map.size()]);

        // int[] intArray = Arrays.stream(keysArray).mapToInt(Integer::intValue).toArray();
        int[] result = new int[map.size()];
        for (int i = 0; i < map.size(); i++) {
            result[i] = keysArray[i];
        }

        return result;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "Element1");
        map.put(1, "Element1.3");
        map.put(2, "Element2");
        map.put(3, "Element3");

        int result[] = sortedKeys(map);
        System.out.println(map.toString());

        System.out.println(Arrays.toString(result));
    }

}

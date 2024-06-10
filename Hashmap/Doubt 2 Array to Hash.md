You can convert an array to a `HashSet` and `HashMap` in Java as follows:

**Array to HashSet:**
```java
import java.util.Arrays;
import java.util.HashSet;

public class ArrayToHashSet {
    public static void main(String[] args) {
        // Initialize the array
        String[] array = {"Element1", "Element2", "Element3"};

        // Convert the array to a HashSet
        HashSet<String> set = new HashSet<>(Arrays.asList(array));

        // Print the HashSet
        System.out.println("HashSet: " + set);
    }
}
```

**Array to HashMap:**
Converting an array to a `HashMap` requires a key-value pair. If you have an array of objects and you want to store them in a `HashMap` with some key, you can do so as follows:

```java
import java.util.HashMap;

public class ArrayToHashMap {
    public static void main(String[] args) {
        // Initialize the array
        String[] array = {"Element1", "Element2", "Element3"};

        // Convert the array to a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }

        // Print the HashMap
        System.out.println("HashMap: " + map);
    }
}
```

In this code, the index of the array element is used as the key in the `HashMap`. Please adjust the key according to your requirements. Note that `HashMap` does not maintain the insertion order. If you need to preserve the order of elements, consider using `LinkedHashMap` instead. It maintains the insertion order. Also, any duplicate keys in the `HashMap` will overwrite the existing value for that key. If you need to store multiple values for the same key, consider using `ArrayList` as the value in the `HashMap`.
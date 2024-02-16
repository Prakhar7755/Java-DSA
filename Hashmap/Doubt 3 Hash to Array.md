You can convert a `HashSet` and `HashMap` to an array in Java as follows:

**HashSet to Array:**
```java
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        // Initialize the HashSet
        HashSet<String> set = new HashSet<>(Arrays.asList("Element1", "Element2", "Element3"));

        // Convert the HashSet to an array
        String[] array = set.toArray(new String[set.size()]);

        // Print the array
        System.out.println("Array: " + Arrays.toString(array));
    }
}
```

**HashMap to Array:**
Converting a `HashMap` to an array requires you to decide whether you want to store keys, values, or both. Here's how you can convert the keys and values of a `HashMap` to separate arrays:

```java
import java.util.Arrays;
import java.util.HashMap;

public class HashMapToArray {
    public static void main(String[] args) {
        // Initialize the HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Element1");
        map.put(2, "Element2");
        map.put(3, "Element3");

        // Convert the keys of the HashMap to an array
        Integer[] keysArray = map.keySet().toArray(new Integer[map.size()]);
        // Convert the values of the HashMap to an array
        String[] valuesArray = map.values().toArray(new String[map.size()]);

        // Print the arrays
        System.out.println("Keys Array: " + Arrays.toString(keysArray));
        System.out.println("Values Array: " + Arrays.toString(valuesArray));
    }
}
```

In these codes, `set.toArray(new String[set.size()])` and `map.keySet().toArray(new Integer[map.size()])` convert the `HashSet` and the keys of the `HashMap` to arrays, respectively. `map.values().toArray(new String[map.size()])` converts the values of the `HashMap` to an array. Note that the order of elements in the arrays may not be the same as the order in the `HashSet` or `HashMap`, as `HashSet` and `HashMap` do not guarantee any specific order of their elements. If you need to preserve the order of elements, consider using `LinkedHashSet` and `LinkedHashMap` instead. They maintain the insertion order. Also, any duplicate elements in the `HashSet` or `HashMap` will appear only once in the array, as `HashSet` and `HashMap` do not allow duplicate elements or keys, respectively. If you need to store multiple values for the same key, consider using `ArrayList` as the value in the `HashMap`.
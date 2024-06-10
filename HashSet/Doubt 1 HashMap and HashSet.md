`HashMap` and `HashSet` are two data structures in Java that are part of the Java Collections Framework. They both use hashing to store and retrieve objects, which allows for efficient retrieval, but they serve different purposes:

**HashMap:**
- `HashMap` is a Map-based collection class that is used for storing Key & Value pairs. It is denoted as `HashMap<Key, Value>` or `HashMap<K, V>`.
- It is not an ordered collection which means it does not return the keys and values in the same order in which they have been inserted into the `HashMap`.
- It allows one null key and multiple null values.
- Use case: When you want to associate a key with a value and allows you to retrieve the value by its key. For example, storing phone numbers where names are keys and phone numbers are values.

**HashSet:**
- `HashSet` is a Set-based collection class that is used for storing unique elements. It is denoted as `HashSet<E>`.
- Like `HashMap`, it also doesn’t allow duplicates.
- It allows the insertion of a null element.
- Use case: When you want to prevent duplicates in your collection and you don't need to associate keys with values. For example, storing a list of unique student IDs.

In summary, use `HashMap` when you need to map keys to values and use `HashSet` when you want to create a collection that needs to prevent duplicates. Both offer constant time performance for the basic operations (add, remove, contains and size).
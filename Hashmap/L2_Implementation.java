
/*
 * Implment a hashmap in O(1) put,get,containskey,remove,size,keySet
 * using Array of LinkedList(internally as well)
 * {meaning that every index of array has a linkedlist}
 * every index is also called BUCKET(which stores the nodes of LL)
 */
import java.util.*;

public class L2_Implementation {

    static class HashMap<K, V> { // <K,V> are generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no. of nodes
        private int N; // no. of buckets
        private LinkedList<Node>[] buckets; // buckets array of linkedlist datatype
        // N = buckets.length;

        @SuppressWarnings("unchecked")
        public HashMap() {// CONSTRUCTOR
            this.N = 4;
            this.buckets = new LinkedList[4]; // empty linkedlist at all idx
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>(); // storing linkedlist at all the indexes
            }
        }

        private void put(K key, V value) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx); // search if the node exists or not

            if (dataIdx == -1) { // key doesn't exist
                buckets[bucketIdx].add(new Node(key, value));
            }

            else { // key exist
                Node data = buckets[bucketIdx].get(dataIdx);
                data.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }

        }

        @SuppressWarnings({ "unchecked" })
        public void rehash() {

            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int searchInLL(K key, int bucketIdx) {
            LinkedList<Node> ll = buckets[bucketIdx]; // TAKING OUT THE LL ON THE SPECIFIC BUCKET
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;

        }

        private int hashFunction(K key) { // 0 to N-1

            int bucketIdx = key.hashCode();// generate a hash index;

            return Math.abs(bucketIdx) % N;
            // absolute val and %N to limit it
        }

        private V get(K key) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx); // search if the node exists or not

            if (dataIdx == -1) { // key doesn't exist
                return null;
            }

            else { // key exist
                Node data = buckets[bucketIdx].get(dataIdx);
                return data.value;
            }
        }

        @SuppressWarnings("unused")
        private V remove(K key) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx); // search if the node exists or not

            if (dataIdx == -1) { // key doesn't exist
                return null;
            }

            else { // key exist
                Node data = buckets[bucketIdx].remove(dataIdx);
                n--;
                return data.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 200);
        map.put("China", 190);
        map.put("USA", 50);

        System.out.printf("%d\n", map.get("India"));
        System.out.printf("%b\n", map.get("India"));

        ArrayList<String> keys = map.keySet();

        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + "\t" + map.get(keys.get(i)));
        }
    }
}

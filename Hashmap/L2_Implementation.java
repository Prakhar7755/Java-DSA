
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
        private LinkedList<Node> buckets[]; // buckets array of linkedlist datatype
        // N = buckets.length;

        @SuppressWarnings("unchecked")
        public HashMap() {// CONSTRUCTOR
            this.N = 4;
            this.buckets = new LinkedList[4]; // empty linkedlist at all idx
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // storing linkedlist at all the indexes
            }
        }

        public void put(K key, V value) {
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
                // re-hashing
            }

        }

        // private int searchInLL(K key, int bucketIdx) {
        //     //  38:00
        // }

        private int searchInLL(K key, int bucketIdx) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'searchInLL'");
        }

        private int hashFunction(K key) { // 0 to N-1

            int bucketIdx = key.hashCode();// generate a hash index;

            return Math.abs(bucketIdx) % N;
            // absolute val and %N to limit it
        }

    }

    public static void main(String[] args) {

    }
}

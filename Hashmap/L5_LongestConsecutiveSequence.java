/*  
    I/P - 10  5   9   1   11  8   6   15  3   12  2
    O/P - 8     9    10      11      12
    steps -
    1) make a map of int + boolean 
    2) input all keys with true value
    3) second loop if the prev element is present of current then turn it false as it's not the starting
    4) left ones are the real starting elem of a sequence
    5) now another loop to find the length of sequence and count its element
    6) return the sequence with highest length
*/

import java.util.HashMap;

public class L5_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2 };
        longestConsecutiveSeq(arr);
    }

    static void longestConsecutiveSeq(int arr[]) {
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        // first loop
        for (int val : arr) {
            map.put(val, true);
        }
        
        // second loop
        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        
        
        int maxStartPt = 0;
        int maxLen = 0;
        // third loop
        for (int val : arr) {
            if (map.get(val) == true) {
                int tempLen = 1;
                int tempStartPt = val;
                while (map.containsKey(tempStartPt + tempLen)) {
                    tempLen++;
                }
                if (tempLen > maxLen) {
                    maxStartPt = tempStartPt;
                    maxLen = tempLen;
                }
            }
        }
        for (int i = 0; i < maxLen; i++) {
            System.out.printf("%d\t", maxStartPt + i);
        }
    }

}
// TIME = O(n) and space = O(n)

/* The reason why the third loop has time complexity of O(n) instead of O(n^2) is because the 
while loop inside it does not run for every element of the array. The while loop only runs 
for the elements that are the starting points of the consecutive sequences, and it marks the 
other elements as false in the map. Therefore, the total number of iterations of the while 
loop over the entire array is at most n, not n^2. You can think of it as a trade-off between 
time and space: by using extra space to store the boolean values in the map, we can reduce 
the time complexity of the third loop. */
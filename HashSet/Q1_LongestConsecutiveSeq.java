import java.util.HashSet;

public class Q1_LongestConsecutiveSeq {
    public static void main(String[] args) {
        /*
         * Steps [currLen = 1]
         * 1) find starting point -> a1 (where (a1-1) doesn't exist)
         * 2) if (a1+1) exists then currLen++; and a1 +=1
         */
        // TIME + SPACE => O(n)
    }

    public int longestConsecutive(int[] nums) { 
        var st = new HashSet<Integer>();
        for (int num : nums)
            st.add(num);

        int maxStreakLen = 0;

        for (Integer num : st) {

            if (!st.contains(num - 1)) {/* NUM IS STARTING POINT OF SEQUENCE */
                int currNum = num;
                int currStreakLen = 1; // length of current consecutive sequence
                while (st.contains(currNum + 1)) {
                    currStreakLen++;
                    currNum++;
                }
                maxStreakLen = Math.max(currStreakLen, maxStreakLen);

            }
        }
        return maxStreakLen;
    }
}

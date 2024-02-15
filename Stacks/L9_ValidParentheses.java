import java.util.Stack;
//                                       LEETCODE 20 VALID PARENTHESES

public class L9_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (!st.isEmpty() &&
                    (s.charAt(i) == ')' && st.peek() == '(' ||
                            s.charAt(i) == '}' && st.peek() == '{' ||
                            s.charAt(i) == ']' && st.peek() == '[')) {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {

        String str1 = "((({})))";
        System.out.println(str1 + " is balanced: " + isValid(str1));

        String str2 = "(({})))";
        System.out.println(str2 + " is balanced: " + isValid(str2));

        String str3 = "";
        System.out.println(str3 + " is balanced: " + isValid(str3));

        String str4 = ")(";
        System.out.println(str4 + " is balanced: " + isValid(str4));

    }
}

import java.util.Stack;

//                                  LEETCODE 150 Postfix evaluation
public class L11_EvaluatePostfixNotation2 {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String current : tokens) {

            if ("+".equals(current)) {
                st.push(st.pop() + st.pop());
            } else if ("-".equals(current)) {
                st.push(-(st.pop() - st.pop()));
            } else if ("*".equals(current)) {
                st.push(st.pop() * st.pop());
            } else if ("/".equals(current)) {
                int second = st.pop();
                int first = st.pop();
                st.push(first / second);
            } else {
                st.push(Integer.valueOf(current));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {

    }
}

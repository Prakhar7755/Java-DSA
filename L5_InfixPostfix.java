import java.util.Stack;

public class L5_InfixPostfix {
    public static String convertToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char c = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfixExpression.append(c);
            }

            else if (c == '(') {
                st.push(c);
            }

            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfixExpression.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() != '(') {
                    return "Invalid Expression"; // UNBALANCED PARENTHESIS
                } else {
                    st.pop(); // discard the '(' from the stack
                }
            }

            else {
                while (!st.isEmpty() && Prec(st.peek(), c)) {
                    postfixExpression.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            if (st.peek() == '(') {
                return "Invalid Expression"; // unbalanced parenthesis
            }
            postfixExpression.append(st.pop());
        }
        return postfixExpression.toString();
    }

    private static boolean Prec(char operator1, char operator2) {
        int op1Prec = getPrecedence(operator1);
        int op2Prec = getPrecedence(operator2);

        if (op1Prec == op2Prec) {
            if (operator1 == '^') {
                return false;
            } else {
                return true;
            }
        }
        return op1Prec > op2Prec;
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {

        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";

        String postfixExpression = convertToPostfix(infixExpression);

        System.out.println("Infix Expression: " + infixExpression);

        System.out.println("Postfix Expression: " + postfixExpression);

    }
}

/*
 * Infix Expression: a+b*(c^d-e)^(f+g*h)-i
 * Postfix Expression: abcd^e-fgh*+^*+i-
*/

/*
 * - If the current character is an operand (letter or digit), it is appended to
 * the postfix expression.
 * 
 * - If the current character is an opening parenthesis '(', it is pushed onto
 * the stack.
 * 
 * - If the current character is a closing parenthesis ')', we pop operators
 * from the stack and append them to the postfix expression until we encounter
 * an opening parenthesis. The opening parenthesis is then discarded.
 * 
 * - If the current character is an operator, we pop operators from the stack
 * and append them to the postfix expression until we find an operator with
 * lower precedence or an opening parenthesis. Then, we push the current
 * operator onto the stack.
 * 
 * - After processing all characters, we pop any remaining operators from the
 * stack and append them to the postfix expression.
 * 
 * - Finally, the postfix expression is returned as a string.
*/
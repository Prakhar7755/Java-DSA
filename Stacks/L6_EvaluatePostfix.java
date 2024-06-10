import java.util.Stack;

public class L6_EvaluatePostfix {
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    static int operate(int op1, int op2, char operator) {
        switch (operator) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            case '^':
                return (int) Math.pow(op1, op2);

            default:
                return 0;
        }
    }

    static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            }

            else if (isOperator(ch)) {
                int op2 = stack.pop(), op1 = stack.pop();
                int result = operate(op1, op2, ch);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "23+";
        int result = evaluate(expression);
        System.out.printf("\nThe result of %s is %d\n", expression, result);
    }

}
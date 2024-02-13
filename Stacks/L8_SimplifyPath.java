//                                            LEETCODE 71 SIMPLIFY PATH
import java.util.Stack;

public class L8_SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/"); // split the path with just the directory names

        for (int i = 0; i < p.length; i++) {

            if (!stack.isEmpty() && p[i].equals(".."))
                stack.pop();

            else if (!p[i].equals(".") && !p[i].equals("") && !p[i].equals(".."))
                stack.push(p[i]);
        }

        if (stack.isEmpty())
            return "/";
        while (!stack.isEmpty()) {
            // appending in the front of res StringBuilder
            res.insert(0, stack.pop()).insert(0, "/");
        }

        return res.toString();
    }


    public static void main(String[] args) {
        
    }
}
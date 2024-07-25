//https://leetcode.com/problems/simplify-path/description/
package algorithms.medium;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        SimplifyPath simplify = new SimplifyPath();
        System.out.println("Output:\t" + simplify.simplifyPath("/home/"));
        System.out.println("Output:\t" + simplify.simplifyPath("/home//foo/"));
        System.out.println("Output:\t" + simplify.simplifyPath("/home/user/Documents/../Pictures"));
        System.out.println("Output:\t" + simplify.simplifyPath("/../"));
        System.out.println("Output:\t" + simplify.simplifyPath("/.../a/../b/c/../d/./"));
    }

    public String simplifyPath(String path) {
        StringBuilder answer = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] splitString = path.split("/");

        for (String s : splitString) {
            if (!stack.isEmpty() && s.equals(".."))
                stack.pop();
            else if (!s.equals(".") && !s.equals("/") && !s.equals("") && !s.equals(".."))
                stack.push(s);
        }

        if (stack.isEmpty())
            return "/";
        while (!stack.isEmpty()) {
            answer.insert(0, "/" + stack.pop());
        }

        return answer.toString();
    }
}

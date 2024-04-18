package algorithms;//https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();

        String s = "()[]{}";
        System.out.println("Output:\t" + validParentheses.isValid(s));

        s = "(]";
        System.out.println("Output:\t" + validParentheses.isValid(s));

        s = "([}}])";
        System.out.println("Output:\t" + validParentheses.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }
}

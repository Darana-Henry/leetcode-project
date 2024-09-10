//https://leetcode.com/problems/backspace-string-compare/
package algorithms.easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        BackspaceStringCompare backspace = new BackspaceStringCompare();
        System.out.println("Output:\t" + backspace.backspaceCompare("ab#c", "ad#c"));
        System.out.println("Output:\t" + backspace.backspaceCompare("ab##", "c#d#"));
        System.out.println("Output:\t" + backspace.backspaceCompare("a#c", "b"));
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else stack.push(ch);

        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack)
            sb.append(ch);
        return sb.toString();

    }
}

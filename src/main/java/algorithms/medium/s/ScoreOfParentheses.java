//https://leetcode.com/problems/score-of-parentheses/
package algorithms.medium.s;

import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        ScoreOfParentheses obj = new ScoreOfParentheses();
        System.out.println("Output:\t" + obj.scoreOfParentheses("()"));
        System.out.println("Output:\t" + obj.scoreOfParentheses("(())"));
        System.out.println("Output:\t" + obj.scoreOfParentheses("()()"));
    }

    public int scoreOfParentheses(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(answer);
                answer = 0;
            } else answer = stack.pop() + Math.max(1, answer * 2);

        }

        return answer;
    }
}

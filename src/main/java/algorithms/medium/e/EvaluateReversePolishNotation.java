//https://leetcode.com/problems/evaluate-reverse-polish-notation/
package algorithms.medium.e;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        EvaluateReversePolishNotation evaluate = new EvaluateReversePolishNotation();
        System.out.println("Output:\t" + evaluate.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println("Output:\t" + evaluate.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println("Output:\t" + evaluate.evalRPN(
                new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/"))
                stack.push(Integer.valueOf(token));
            else {
                int right = stack.pop();
                int left = stack.pop();
                if (token.equals("+"))
                    answer = left + right;
                if (token.equals("-"))
                    answer = left - right;
                if (token.equals("*"))
                    answer = left * right;
                if (token.equals("/"))
                    answer = left / right;
                stack.push(answer);
            }
        }
        return stack.pop();
    }
}

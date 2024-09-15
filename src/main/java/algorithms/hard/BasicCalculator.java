//https://leetcode.com/problems/basic-calculator/
package algorithms.hard;


import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        BasicCalculator basic = new BasicCalculator();
        System.out.println("Output:\t" + basic.calculate("1 + 1"));
        System.out.println("Output:\t" + basic.calculate(" 2-1 + 2 "));
        System.out.println("Output:\t" + basic.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    public int calculate(String s) {
        int sign = 1;
        int result = 0;
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int start = i;
                int num = 0;
                while (start < n && Character.isDigit(s.charAt(start))) {
                    num = num * 10 + s.charAt(start) - '0';
                    start++;
                }
                result += sign * num;
                i = start - 1;
            } else if (ch == '+') sign = 1;
            else if (ch == '-') sign = -1;
            else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') result = stack.pop() * result + stack.pop();
        }
        return result;
    }
}

//https://leetcode.com/problems/remove-k-digits/
package algorithms.medium.r;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        RemoveKDigits obj = new RemoveKDigits();
        System.out.println("Output:\t" + obj.removeKdigits("1432219", 3));
        System.out.println("Output:\t" + obj.removeKdigits("10200", 1));
        System.out.println("Output:\t" + obj.removeKdigits("10", 2));
    }

    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == 0) return num;
        if (k == len) return "0";

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : num.toCharArray()) {
            int n = ch - '0';
            while (k > 0 && !stack.isEmpty() && stack.peek() > n) {
                stack.pop();
                k--;
            }
            stack.push(n);
        }

        while (k-- > 0) stack.pop();
        while (!stack.isEmpty()) sb.append(stack.pop());
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

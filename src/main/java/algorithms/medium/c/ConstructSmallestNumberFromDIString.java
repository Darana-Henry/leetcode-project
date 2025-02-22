//https://leetcode.com/problems/construct-smallest-number-from-di-string/
package algorithms.medium.c;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
        ConstructSmallestNumberFromDIString obj = new ConstructSmallestNumberFromDIString();
        System.out.println("Output:\t" + obj.smallestNumber("IIIDIDDD"));
        System.out.println("Output:\t" + obj.smallestNumber("DDD"));
    }

    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            stack.push(i + 1);
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        return sb.toString();

    }
}

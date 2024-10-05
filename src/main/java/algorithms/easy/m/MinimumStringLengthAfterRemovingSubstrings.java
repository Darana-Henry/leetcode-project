//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/
package algorithms.easy.m;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
        MinimumStringLengthAfterRemovingSubstrings minLength = new MinimumStringLengthAfterRemovingSubstrings();
        System.out.println("Output:\t" + minLength.minLengthWithStack("ABFCACDB"));
        System.out.println("Output:\t" + minLength.minLengthWithStack("ACBBD"));
        System.out.println("Output:\t" + minLength.minLength("ABFCACDB"));
        System.out.println("Output:\t" + minLength.minLength("ACBBD"));
    }

    public int minLengthWithStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ((stack.peek() == 'A' && ch == 'B') || (stack.peek() == 'C' && ch == 'D')))
                stack.pop();
            else stack.push(ch);
        }
        return stack.size();
    }

    public int minLength(String s) {
        while (true) {
            if (s.contains("AB") || s.contains("CD")) {
                int index = 0;
                if (s.contains("AB")) index = s.indexOf("AB");
                else index = s.indexOf("CD");
                s = s.substring(0, index) + s.substring(index + 2);
            } else return s.length();
        }
    }
}

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
package algorithms.easy.r;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString adjacent = new RemoveAllAdjacentDuplicatesInString();
        System.out.println("Output:\t" + adjacent.removeDuplicates("abbaca"));
        System.out.println("Output:\t" + adjacent.removeDuplicates("azxxzy"));
        System.out.println("Output:\t" + adjacent.removeDuplicatesOptimized("abbaca"));
        System.out.println("Output:\t" + adjacent.removeDuplicatesOptimized("azxxzy"));
    }

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
                continue;
            }
            if (stack.peek() == ch) stack.pop();
            else stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    public String removeDuplicatesOptimized(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) sb.deleteCharAt(sb.length() - 1);
            else sb.append(ch);
        }
        return sb.toString();
    }
}

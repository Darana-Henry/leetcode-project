//https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
package algorithms.medium.c;

import java.util.Stack;

public class CheckIfAParenthesesStringCanBeValid {
    public static void main(String[] args) {
        CheckIfAParenthesesStringCanBeValid obj = new CheckIfAParenthesesStringCanBeValid();
        System.out.println("Output:\t" + obj.canBeValid("))()))", "010100"));
        System.out.println("Output:\t" + obj.canBeValid("()()", "0000"));
        System.out.println("Output:\t" + obj.canBeValid(")", "0"));
    }

    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 == 1) return false;
        Stack<Integer> open = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') unlocked.push(i);
            else if (s.charAt(i) == '(') open.push(i);
            else if (s.charAt(i) == ')') {
                if (!open.isEmpty()) open.pop();
                else if (!unlocked.isEmpty()) unlocked.pop();
                else return false;
            }
        }

        while (!open.isEmpty() && !unlocked.isEmpty() && open.peek() < unlocked.peek()) {
            open.pop();
            unlocked.pop();
        }

        if (open.isEmpty() && !unlocked.isEmpty()) return unlocked.size() % 2 == 0;
        return open.isEmpty();
    }
}

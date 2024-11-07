//https://leetcode.com/problems/longest-valid-parentheses/
package algorithms.hard.l;

public class LongestValidParentheses {
    public static void main(String[] args) {
        LongestValidParentheses valid = new LongestValidParentheses();
        System.out.println("Output:\t" + valid.longestValidParentheses("(()"));
        System.out.println("Output:\t" + valid.longestValidParentheses(")()())"));
        System.out.println("Output:\t" + valid.longestValidParentheses(""));
    }

    public int longestValidParentheses(String s) {
        int n = s.length();
        int answer = 0;
        int[] valid = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) == ')') {
                if (s.charAt(i - 2) == '(') valid[i] = valid[i - 2] + 2;
                else {
                    int prev = i - valid[i - 1] - 1;
                    if (prev > 0 && s.charAt(prev - 1) == '(') valid[i] = valid[i - 1] + 2 + valid[prev - 1];
                }

            }
            answer = Math.max(answer, valid[i]);
        }

        return answer;
    }
}


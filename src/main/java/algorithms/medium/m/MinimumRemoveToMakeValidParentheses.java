//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
package algorithms.medium.m;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        MinimumRemoveToMakeValidParentheses obj = new MinimumRemoveToMakeValidParentheses();
        System.out.println("Output:\t" + obj.minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println("Output:\t" + obj.minRemoveToMakeValid("a)b(c)d"));
        System.out.println("Output:\t" + obj.minRemoveToMakeValid("))(("));
    }

    public String minRemoveToMakeValid(String s) {
        int open = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') open++;
            else if (ch == ')') {
                if (open == 0) continue;
                open--;
            }
            sb.append(ch);
        }

        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && open-- > 0) continue;
            answer.append(sb.charAt(i));
        }

        return answer.reverse().toString();
    }
}

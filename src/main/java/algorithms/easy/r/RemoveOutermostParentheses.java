//https://leetcode.com/problems/remove-outermost-parentheses/
package algorithms.easy.r;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        RemoveOutermostParentheses remove = new RemoveOutermostParentheses();
        System.out.println("Output:\t" + remove.removeOuterParentheses("(()())(())"));
        System.out.println("Output:\t" + remove.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println("Output:\t" + remove.removeOuterParentheses("()()"));
    }

    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) sb.append(s.charAt(i));
                count++;
            } else {
                count--;
                if (count > 0) sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}

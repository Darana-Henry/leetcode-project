//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
package algorithms.easy.m;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses nest = new MaximumNestingDepthOfTheParentheses();
        System.out.println("Output:\t" + nest.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println("Output:\t" + nest.maxDepth("(1)+((2))+(((3)))"));
        System.out.println("Output:\t" + nest.maxDepth("()(())((()()))"));
    }

    public int maxDepth(String s) {
        int curr = 0, max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                curr++;
                max = Math.max(max, curr);
            } else if (ch == ')') curr--;
        }
        return max;
    }
}

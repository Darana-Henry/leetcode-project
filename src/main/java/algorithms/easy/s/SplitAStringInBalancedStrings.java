//https://leetcode.com/problems/split-a-string-in-balanced-strings/
package algorithms.easy.s;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        SplitAStringInBalancedStrings balanced = new SplitAStringInBalancedStrings();
        System.out.println("Output:\t" + balanced.balancedStringSplit("RLRRLLRLRL"));
        System.out.println("Output:\t" + balanced.balancedStringSplit("RLRRRLLRLL"));
        System.out.println("Output:\t" + balanced.balancedStringSplit("LLLLRRRR"));
    }

    public int balancedStringSplit(String s) {
        int balance = 0, count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') balance++;
            else balance--;
            if (balance == 0) count++;
        }
        return count;
    }
}

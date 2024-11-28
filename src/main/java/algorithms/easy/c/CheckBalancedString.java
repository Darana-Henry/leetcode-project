//https://leetcode.com/problems/check-balanced-string/
package algorithms.easy.c;

public class CheckBalancedString {
    public static void main(String[] args) {
        CheckBalancedString balanced = new CheckBalancedString();
        System.out.println("Output:\t" + balanced.isBalanced("1234"));
        System.out.println("Output:\t" + balanced.isBalanced("24123"));
    }

    public boolean isBalanced(String num) {
        int even = 0, odd = 0;
        for (int i = 1; i <= num.length(); i++)
            if (i % 2 == 0) even += num.charAt(i - 1) - '0';
            else odd += num.charAt(i - 1) - '0';
        return odd == even;
    }
}

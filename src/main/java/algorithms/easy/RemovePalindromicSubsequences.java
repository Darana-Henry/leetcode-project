//https://leetcode.com/problems/remove-palindromic-subsequences/
package algorithms.easy;

public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        RemovePalindromicSubsequences remove = new RemovePalindromicSubsequences();
        System.out.println("Output:\t" + remove.removePalindromeSub("ababa"));
        System.out.println("Output:\t" + remove.removePalindromeSub("abb"));
        System.out.println("Output:\t" + remove.removePalindromeSub("baabb"));
    }

    public int removePalindromeSub(String s) {
        for (int start = 0, end = s.length() - 1; start < end; start++, end--)
            if (s.charAt(start) != s.charAt(end)) return 2;
        return 1;
    }
}

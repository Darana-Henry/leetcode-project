//https://leetcode.com/problems/valid-palindrome-ii/
package algorithms.easy.v;

public class ValidPalindromeII {
    public static void main(String[] args) {
        ValidPalindromeII valid = new ValidPalindromeII();
        System.out.println("Output:\t" + valid.validPalindrome("aba"));
        System.out.println("Output:\t" + valid.validPalindrome("abca"));
        System.out.println("Output:\t" + valid.validPalindrome("abc"));
    }

    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) return helper(s, start + 1, end) || helper(s, start, end - 1);
            start++;
            end--;
        }
        return true;
    }

    public boolean helper(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}

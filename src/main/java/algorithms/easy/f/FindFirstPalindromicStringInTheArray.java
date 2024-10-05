//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
package algorithms.easy.f;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        FindFirstPalindromicStringInTheArray palindrome = new FindFirstPalindromicStringInTheArray();
        System.out.println(
                "Output:\t" + palindrome.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
        System.out.println("Output:\t" + palindrome.firstPalindrome(new String[]{"notapalindrome", "racecar"}));
        System.out.println("Output:\t" + palindrome.firstPalindrome(new String[]{"def", "ghi"}));
    }

    public String firstPalindrome(String[] words) {
        for (String word : words)
            if (isPalindrome(word)) return word;
        return "";
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}

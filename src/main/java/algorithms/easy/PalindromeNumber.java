package algorithms.easy;//https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println("Output:\t" + palindromeNumber.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }

        if (rev == temp) return true;
        return false;
    }
}

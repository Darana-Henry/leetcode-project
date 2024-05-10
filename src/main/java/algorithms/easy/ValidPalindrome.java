package algorithms.easy;//https://leetcode.com/problems/valid-palindrome/submissions/1254126085/

public class ValidPalindrome {

    public static void main(String[] args) {

        ValidPalindrome palindrome = new ValidPalindrome();

        System.out.println("Output:\t" + palindrome.isPalindrome2("A man, a plan, a canal: Panama"));
        System.out.println("Output:\t" + palindrome.isPalindrome("race a car"));
        System.out.println("Output:\t" + palindrome.isPalindrome(" "));
    }

    public boolean isPalindrome(String s) {

        String cleanedUpVersion = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c))
                cleanedUpVersion += c;
        }

        cleanedUpVersion = cleanedUpVersion.toLowerCase();
        int left = 0;
        int right = cleanedUpVersion.length() - 1;

        while (left <= right) {
            if (cleanedUpVersion.charAt(left) != cleanedUpVersion.charAt(right))
                return false;

            left += 1;
            right -= 1;
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}

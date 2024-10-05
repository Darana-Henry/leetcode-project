//https://leetcode.com/problems/lexicographically-smallest-palindrome/
package algorithms.easy.l;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        LexicographicallySmallestPalindrome lexi = new LexicographicallySmallestPalindrome();
        System.out.println("Output:\t" + lexi.makeSmallestPalindrome("egcfe"));
        System.out.println("Output:\t" + lexi.makeSmallestPalindrome("abcd"));
        System.out.println("Output:\t" + lexi.makeSmallestPalindrome("seven"));
    }

    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();

        while (left < right) {
            if (ch[left] != ch[right]) {
                if (ch[left] - 'a' > ch[right] - 'a') ch[left] = ch[right];
                else ch[right] = ch[left];
            }
            left++;
            right--;
        }

        return new String(ch);
    }
}

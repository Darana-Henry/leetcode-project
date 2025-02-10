//https://leetcode.com/problems/palindromic-substrings/
package algorithms.medium.p;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        PalindromicSubstrings obj = new PalindromicSubstrings();
        System.out.println("Output:\t" + obj.countSubstrings("abc"));
        System.out.println("Output:\t" + obj.countSubstrings("aaa"));
    }

    public int countSubstrings(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer += palindrome(s, i, i);
            answer += palindrome(s, i, i + 1);
        }
        return answer;
    }

    public int palindrome(String s, int l, int r) {
        int count = 0;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
            count++;
        }

        return count;
    }
}

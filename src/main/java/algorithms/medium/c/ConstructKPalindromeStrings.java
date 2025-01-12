//https://leetcode.com/problems/construct-k-palindrome-strings/
package algorithms.medium.c;

public class ConstructKPalindromeStrings {
    public static void main(String[] args) {
        ConstructKPalindromeStrings obj = new ConstructKPalindromeStrings();
        System.out.println("Output:\t" + obj.canConstruct("annabelle", 2));
        System.out.println("Output:\t" + obj.canConstruct("leetcode", 3));
        System.out.println("Output:\t" + obj.canConstruct("true", 4));
    }

    public boolean canConstruct(String s, int k) {
        int n = s.length(), odd = 0;
        if (n < k) return false;
        int[] counts = new int[26];

        for (char ch : s.toCharArray())
            counts[ch - 'a']++;

        for (int count : counts)
            odd += count % 2;

        return odd <= k;
    }
}

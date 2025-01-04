//https://leetcode.com/problems/unique-length-3-palindromic-subsequences/
package algorithms.medium.u;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3PalindromicSubsequences {
    public static void main(String[] args) {
        UniqueLength3PalindromicSubsequences obj = new UniqueLength3PalindromicSubsequences();
        System.out.println("Output:\t" + obj.countPalindromicSubsequence("aabca"));
        System.out.println("Output:\t" + obj.countPalindromicSubsequence("adc"));
        System.out.println("Output:\t" + obj.countPalindromicSubsequence("bbcbaba"));
    }

    public int countPalindromicSubsequence(String s) {
        int answer = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int l = s.indexOf(ch);
            int r = s.lastIndexOf(ch);
            Set<Character> set = new HashSet<>();

            for (int i = l + 1; i < r; i++)
                set.add(s.charAt(i));

            answer += set.size();
        }
        return answer;
    }
}

//https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/
package algorithms.medium.f;

import java.util.Arrays;

public class FindTheLongestSubstringContainingVowelsInEvenCounts {
    public static void main(String[] args) {
        FindTheLongestSubstringContainingVowelsInEvenCounts obj = new FindTheLongestSubstringContainingVowelsInEvenCounts();
        System.out.println("Output:\t" + obj.findTheLongestSubstring("eleetminicoworoep"));
        System.out.println("Output:\t" + obj.findTheLongestSubstring("leetcodeisgreat"));
        System.out.println("Output:\t" + obj.findTheLongestSubstring("bcbcbc"));
    }

    public int findTheLongestSubstring(String s) {
        int answer = 0, prefix = 0;
        int[] chs = new int[26];
        int[] mp = new int[32];
        chs[0] = 1;
        chs['e' - 'a'] = 2;
        chs['i' - 'a'] = 4;
        chs['o' - 'a'] = 8;
        chs['u' - 'a'] = 16;
        Arrays.fill(mp, -1);

        for (int i = 0; i < s.length(); i++) {
            prefix ^= chs[s.charAt(i) - 'a'];
            if (mp[prefix] == -1 && prefix != 0) mp[prefix] = i;
            answer = Math.max(answer, i - mp[prefix]);
        }

        return answer;
    }
}

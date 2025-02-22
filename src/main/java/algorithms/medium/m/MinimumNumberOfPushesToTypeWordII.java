//https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/
package algorithms.medium.m;

import java.util.Arrays;

public class MinimumNumberOfPushesToTypeWordII {
    public static void main(String[] args) {
        MinimumNumberOfPushesToTypeWordII obj = new MinimumNumberOfPushesToTypeWordII();
        System.out.println("Output:\t" + obj.minimumPushes("abcde"));
        System.out.println("Output:\t" + obj.minimumPushes("xyzxyzxyzxyz"));
        System.out.println("Output:\t" + obj.minimumPushes("aabbccddeeffgghhiiiiii"));
    }

    public int minimumPushes(String word) {
        int answer = 0;
        int[] counts = new int[26];

        for (char ch : word.toCharArray())
            counts[ch - 'a']++;

        Arrays.sort(counts);

        for (int i = 0; i < 26; i++)
            answer += (i / 8 + 1) * counts[26 - i - 1];

        return answer;
    }
}

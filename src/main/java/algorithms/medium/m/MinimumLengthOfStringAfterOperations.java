//https://leetcode.com/problems/minimum-length-of-string-after-operations/
package algorithms.medium.m;

public class MinimumLengthOfStringAfterOperations {
    public static void main(String[] args) {
        MinimumLengthOfStringAfterOperations obj = new MinimumLengthOfStringAfterOperations();
        System.out.println("Output:\t" + obj.minimumLength("abaacbcbb"));
        System.out.println("Output:\t" + obj.minimumLength("aa"));
    }

    public int minimumLength(String s) {
        int answer = 0;
        int[] counts = new int[26];

        for (char ch : s.toCharArray())
            counts[ch - 'a']++;

        for (int count : counts) {
            while (count >= 3) count -= 2;
            answer += count;
        }

        return answer;
    }
}

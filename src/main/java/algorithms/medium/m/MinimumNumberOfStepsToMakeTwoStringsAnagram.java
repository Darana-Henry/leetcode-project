//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
package algorithms.medium.m;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public static void main(String[] args) {
        MinimumNumberOfStepsToMakeTwoStringsAnagram obj = new MinimumNumberOfStepsToMakeTwoStringsAnagram();
        System.out.println("Output:\t" + obj.minSteps("bab", "aba"));
        System.out.println("Output:\t" + obj.minSteps("leetcode", "practice"));
        System.out.println("Output:\t" + obj.minSteps("anagram", "mangaar"));
    }

    public int minSteps(String s, String t) {
        int answer = 0;
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']--;
            count[t.charAt(i) - 'a']++;
        }

        for (int n : count)
            answer += Math.max(0, n);

        return answer;
    }
}

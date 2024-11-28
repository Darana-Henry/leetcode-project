//https://leetcode.com/problems/longest-continuous-increasing-subsequence/
package algorithms.easy.l;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence incdec = new LongestContinuousIncreasingSubsequence();
        System.out.println("Output:\t" + incdec.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println("Output:\t" + incdec.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }

    public int findLengthOfLCIS(int[] nums) {
        int answer = 1, curr = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                curr++;
                answer = Math.max(answer, curr);
            } else curr = 1;
        }

        return answer;
    }
}

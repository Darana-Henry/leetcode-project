//https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
package algorithms.easy.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    public static void main(String[] args) {
        MinimumSubsequenceInNonIncreasingOrder minSub = new MinimumSubsequenceInNonIncreasingOrder();
        System.out.println("Output:\t" + minSub.minSubsequence(new int[]{4, 3, 10, 9, 8}));
        System.out.println("Output:\t" + minSub.minSubsequence(new int[]{4, 4, 7, 6, 7}));
    }

    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total = Arrays.stream(nums).sum();
        List<Integer> answer = new ArrayList<>();
        int subSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            subSum += nums[i];
            answer.add(nums[i]);
            if (subSum > total - subSum) break;
        }
        return answer;
    }
}

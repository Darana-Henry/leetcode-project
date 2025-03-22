//https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/
package algorithms.easy.m;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubArraySumAfterDeletion {
    public static void main(String[] args) {
        MaximumUniqueSubArraySumAfterDeletion obj = new MaximumUniqueSubArraySumAfterDeletion();
        System.out.println("Output:\t" + obj.maxSum(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + obj.maxSum(new int[]{1, 1, 0, 1, 1}));
        System.out.println("Output:\t" + obj.maxSum(new int[]{1, 2, -1, -2, 1, 0, -1}));
    }

    public int maxSum(int[] nums) {
        int answer = 0, min = -1000;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.max(min, num);

            if (num <= 0 || set.contains(num)) continue;

            answer += num;
            set.add(num);
        }

        return (min <= 0) ? min : answer;
    }
}

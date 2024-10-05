//https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/
package algorithms.easy.m;

import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElements {
    public static void main(String[] args) {
        MinimumAverageOfSmallestAndLargestElements minAvg = new MinimumAverageOfSmallestAndLargestElements();
        System.out.println("Output:\t" + minAvg.minimumAverage(new int[]{7, 8, 3, 4, 15, 13, 4, 1}));
        System.out.println("Output:\t" + minAvg.minimumAverage(new int[]{1, 9, 8, 3, 10, 5}));
        System.out.println("Output:\t" + minAvg.minimumAverage(new int[]{1, 2, 3, 7, 8, 9}));
    }

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n / 2; i++)
            ans = Math.min(ans, nums[i] + nums[n - i - 1]);
        return ans / 2.0;
    }
}

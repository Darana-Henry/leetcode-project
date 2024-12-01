//https://leetcode.com/problems/minimum-positive-sum-subarray/
package algorithms.easy.m;

import java.util.Arrays;
import java.util.List;

public class MinimumPositiveSumSubarray {
    public static void main(String[] args) {
        MinimumPositiveSumSubarray minpos = new MinimumPositiveSumSubarray();
        System.out.println("Output:\t" + minpos.minimumSumSubarray(Arrays.asList(3, -2, 1, 4), 2, 3));
        System.out.println("Output:\t" + minpos.minimumSumSubarray(Arrays.asList(-2, 2, -3, 1), 2, 3));
        System.out.println("Output:\t" + minpos.minimumSumSubarray(Arrays.asList(1, 2, 3, 4), 2, 4));
    }

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] pre = new int[n + 1];
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++)
            pre[i] = pre[i - 1] + nums.get(i - 1);

        for (int range = l; range <= r; range++) {
            for (int i = range; i <= n; i++) {
                int sum = pre[i] - pre[i - range];
                if (sum > 0) answer = Math.min(answer, sum);
            }
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}

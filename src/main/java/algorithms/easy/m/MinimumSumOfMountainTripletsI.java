//https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/
package algorithms.easy.m;

public class MinimumSumOfMountainTripletsI {
    public static void main(String[] args) {
        MinimumSumOfMountainTripletsI triplets = new MinimumSumOfMountainTripletsI();
        System.out.println("Output:\t" + triplets.minimumSum(new int[]{8, 6, 1, 5, 3}));
        System.out.println("Output:\t" + triplets.minimumSum(new int[]{5, 4, 8, 7, 10, 2}));
        System.out.println("Output:\t" + triplets.minimumSum(new int[]{6, 5, 4, 3, 4, 5}));
    }

    public int minimumSum(int[] nums) {
        int n = nums.length, answer = Integer.MAX_VALUE, left = Integer.MAX_VALUE;
        int[] right = new int[n + 1];
        right[n] = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--)
            right[i] = Math.min(right[i + 1], nums[i]);

        for (int i = 0; i < n; i++) {
            if (left < nums[i] && right[i + 1] < nums[i]) answer = Math.min(answer, left + nums[i] + right[i + 1]);
            left = Math.min(left, nums[i]);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}


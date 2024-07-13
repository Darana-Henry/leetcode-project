//https://leetcode.com/problems/range-sum-query-immutable/description/
package algorithms.easy;

public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        NumArrayBruteForce NumArrayBruteForce = new NumArrayBruteForce(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println("Output:\t" + NumArrayBruteForce.sumRange(0, 2));
        System.out.println("Output:\t" + NumArrayBruteForce.sumRange(2, 5));
        System.out.println("Output:\t" + NumArrayBruteForce.sumRange(0, 5));

        NumArrayOptimized NumArrayOptimized = new NumArrayOptimized(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println("Output:\t" + NumArrayOptimized.sumRange(0, 2));
        System.out.println("Output:\t" + NumArrayOptimized.sumRange(2, 5));
        System.out.println("Output:\t" + NumArrayOptimized.sumRange(0, 5));
    }
}

class NumArrayBruteForce {
    private int[] nums;

    public NumArrayBruteForce(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++)
            sum += nums[i];

        return sum;
    }
}

class NumArrayOptimized {
    private int[] nums;

    public NumArrayOptimized(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return nums[right];
        return nums[right] - nums[left - 1];
    }
}
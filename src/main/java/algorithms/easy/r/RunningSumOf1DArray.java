//https://leetcode.com/problems/running-sum-of-1d-array/
package algorithms.easy.r;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        RunningSumOf1DArray running = new RunningSumOf1DArray();
        System.out.println("Output:\t" + running.runningSum(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + running.runningSum(new int[]{1, 1, 1, 1, 1}));
        System.out.println("Output:\t" + running.runningSum(new int[]{3, 1, 2, 10, 1}));
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        return nums;
    }
}

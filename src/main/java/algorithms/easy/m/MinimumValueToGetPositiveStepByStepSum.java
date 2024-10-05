//https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
package algorithms.easy.m;

public class MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        MinimumValueToGetPositiveStepByStepSum min = new MinimumValueToGetPositiveStepByStepSum();
        System.out.println("Output:\t" + min.minStartValue(new int[]{-3, 2, -3, 4, 2}));
        System.out.println("Output:\t" + min.minStartValue(new int[]{1, 2}));
        System.out.println("Output:\t" + min.minStartValue(new int[]{1, -2, -3}));
    }

    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }

        return Math.max(1, 1 - min);
    }
}

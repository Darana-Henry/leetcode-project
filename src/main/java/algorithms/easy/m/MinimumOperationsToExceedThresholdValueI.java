//https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/
package algorithms.easy.m;

public class MinimumOperationsToExceedThresholdValueI {
    public static void main(String[] args) {
        MinimumOperationsToExceedThresholdValueI threshold = new MinimumOperationsToExceedThresholdValueI();
        System.out.println("Output:\t" + threshold.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        System.out.println("Output:\t" + threshold.minOperations(new int[]{1, 1, 2, 4, 9}, 1));
        System.out.println("Output:\t" + threshold.minOperations(new int[]{1, 1, 2, 4, 9}, 9));
    }

    public int minOperations(int[] nums, int k) {
        int answer = 0;
        for (int num : nums)
            if (num < k) answer++;
        return answer;
    }
}

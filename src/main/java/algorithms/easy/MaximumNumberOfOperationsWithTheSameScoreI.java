//https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i/
package algorithms.easy;

public class MaximumNumberOfOperationsWithTheSameScoreI {
    public static void main(String[] args) {
        MaximumNumberOfOperationsWithTheSameScoreI maxNum = new MaximumNumberOfOperationsWithTheSameScoreI();
        System.out.println("Output:\t" + maxNum.maxOperations(new int[]{3, 2, 1, 4, 5}));
        System.out.println("Output:\t" + maxNum.maxOperations(new int[]{3, 2, 6, 1, 4}));
    }

    public int maxOperations(int[] nums) {
        int ops = 0;
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (sum == 0) {
                sum = nums[i] + nums[i + 1];
                ops++;
            } else {
                int curr = nums[i] + nums[i + 1];
                if (sum == curr) ops++;
                else return ops;
            }
        }
        return ops;
    }
}

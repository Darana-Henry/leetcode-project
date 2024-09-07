//https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/
package algorithms.easy;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public static void main(String[] args) {
        FinalArrayStateAfterKMultiplicationOperationsI finalState = new FinalArrayStateAfterKMultiplicationOperationsI();
        System.out.println("Output:\t" + finalState.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2));
        System.out.println("Output:\t" + finalState.getFinalState(new int[]{1, 2}, 3, 4));
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 1; i <= k; i++) {
            int index = 0;
            for (int num = 0; num < nums.length; num++)
                if (nums[num] < nums[index]) index = num;
            nums[index] *= multiplier;
        }
        return nums;
    }
}

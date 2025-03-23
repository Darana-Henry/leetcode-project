//https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/
package algorithms.medium.m;

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    public static void main(String[] args) {
        MinimumOperationsToMakeBinaryArrayElementsEqualToOneI obj = new MinimumOperationsToMakeBinaryArrayElementsEqualToOneI();
        System.out.println("Output:\t" + obj.minOperations(new int[]{0, 1, 1, 1, 0, 0}));
        System.out.println("Output:\t" + obj.minOperations(new int[]{0, 1, 1, 1}));
    }

    public int minOperations(int[] nums) {
        int answer = 0, n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
                answer++;
            }
        }

        return (nums[n - 2] == 0 || nums[n - 1] == 0) ? -1 : answer;
    }
}

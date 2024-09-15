//https://leetcode.com/problems/apply-operations-to-an-array/
package algorithms.easy;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        ApplyOperationsToAnArray apply = new ApplyOperationsToAnArray();
        System.out.println("Output:\t" + apply.applyOperations(new int[]{1, 2, 2, 1, 1, 0}));
        System.out.println("Output:\t" + apply.applyOperations(new int[]{0, 1}));
    }

    public int[] applyOperations(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] <<= 1;
                nums[i + 1] = 0;
            }
        }

        int index = 0;
        for (int num : nums) {
            if (num > 0) answer[index++] = num;
        }

        return answer;
    }
}

//https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
package algorithms.easy.r;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        RemoveOneElementToMakeTheArrayStrictlyIncreasing increasing = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
        System.out.println("Output:\t" + increasing.canBeIncreasing(new int[]{1, 2, 10, 5, 7}));
        System.out.println("Output:\t" + increasing.canBeIncreasing(new int[]{2, 3, 1, 2}));
        System.out.println("Output:\t" + increasing.canBeIncreasing(new int[]{1, 1, 1}));
    }

    public boolean canBeIncreasing(int[] nums) {
        int index = 1, n = nums.length;

        while (index < n && nums[index - 1] < nums[index]) index++;

        return valid(nums, index - 1) || valid(nums, index);
    }

    public boolean valid(int[] nums, int index) {
        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (i == index) continue;

            if (prev >= nums[i]) return false;

            prev = nums[i];
        }

        return true;
    }
}

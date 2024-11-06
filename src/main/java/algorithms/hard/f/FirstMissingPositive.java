//https://leetcode.com/problems/first-missing-positive/
package algorithms.hard.f;

public class FirstMissingPositive {
    public static void main(String[] args) {
        FirstMissingPositive missing = new FirstMissingPositive();
        System.out.println("Output:\t" + missing.missing(new int[]{1, 2, 0}));
        System.out.println("Output:\t" + missing.missing(new int[]{3, 4, -1, 1}));
        System.out.println("Output:\t" + missing.missing(new int[]{7, 8, 9, 11, 12}));
    }

    public int missing(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++)
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) swap(nums, i, nums[i] - 1);

        for (int i = 0; i < n; i++)
            if (nums[i] != i + 1) return i + 1;

        return n + 1;
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

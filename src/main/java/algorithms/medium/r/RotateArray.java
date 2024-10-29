//https://leetcode.com/problems/rotate-array/description/
package algorithms.medium.r;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        rotate.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate.rotate(new int[]{-1, -100, 3, 99}, 2);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        for (int i = start; i <= end; i++) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

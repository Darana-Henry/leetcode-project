//https://leetcode.com/problems/move-zeroes/description/
package algorithms.easy.m;

public class MoveZeroes {
    public static void main(String[] args) {

        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroesMethodA(new int[]{0, 1, 0, 3, 12});
        moveZeroes.moveZeroesMethodB(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroesMethodA(int[] nums) {
        if (nums.length < 2)
            return;

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroesMethodB(int[] nums) {
        if (nums.length < 2)
            return;

        int left = 0, right = 1;

        while (right < nums.length) {
            if (nums[left] != 0) {
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;
            } else {
                int helper = nums[left];
                nums[left] = nums[right];
                nums[right] = helper;
            }
        }
    }
}

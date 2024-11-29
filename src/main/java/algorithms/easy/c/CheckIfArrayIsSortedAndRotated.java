//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
package algorithms.easy.c;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        CheckIfArrayIsSortedAndRotated rotated = new CheckIfArrayIsSortedAndRotated();
        System.out.println("Output:\t" + rotated.check(new int[]{3, 4, 5, 1, 2}));
        System.out.println("Output:\t" + rotated.check(new int[]{2, 1, 3, 4}));
        System.out.println("Output:\t" + rotated.check(new int[]{1, 2, 3}));
    }

    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++)
            if (nums[i] > nums[(i + 1) % n]) count++;

        return count <= 1;
    }
}

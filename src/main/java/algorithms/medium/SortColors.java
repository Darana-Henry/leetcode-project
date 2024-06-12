//https://leetcode.com/problems/sort-colors/description/
package algorithms.medium;

public class SortColors {
    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        sortColors.sortColors(new int[]{2, 0, 2, 1, 1, 0});
        sortColors.sortColors(new int[]{2, 0, 1});
    }

    public void sortColors(int[] nums) {
        if (nums.length < 2)
            return;

        int start = 0;
        int end = nums.length - 1;
        int current = 0;

        while (current <= end && start < end) {
            if (nums[current] == 0) {
                nums[current] = nums[start];
                nums[start] = 0;
                start++;
                current++;
            } else if (nums[current] == 2) {
                nums[current] = nums[end];
                nums[end] = 2;
                end--;
            } else
                current++;
        }
    }
}

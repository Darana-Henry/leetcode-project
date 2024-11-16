//https://leetcode.com/problems/largest-number-at-least-twice-of-others/
package algorithms.easy.l;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        LargestNumberAtLeastTwiceOfOthers largest = new LargestNumberAtLeastTwiceOfOthers();
        System.out.println("Output:\t" + largest.dominantIndex(new int[]{3, 6, 1, 0}));
        System.out.println("Output:\t" + largest.dominantIndex(new int[]{1, 2, 3, 4}));
    }

    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, penMax = Integer.MIN_VALUE, index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                penMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > penMax) penMax = nums[i];
        }

        return max >= penMax * 2 ? index : -1;
    }
}

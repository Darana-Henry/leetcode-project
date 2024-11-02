//https://leetcode.com/problems/smallest-range-i/
package algorithms.easy.s;

public class SmallestRangeI {
    public static void main(String[] args) {
        SmallestRangeI range = new SmallestRangeI();
        System.out.println("Output:\t" + range.smallestRangeI(new int[]{1}, 0));
        System.out.println("Output:\t" + range.smallestRangeI(new int[]{0, 10}, 2));
        System.out.println("Output:\t" + range.smallestRangeI(new int[]{1, 3, 6}, 3));
    }

    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return Math.max(0, max - min - k * 2);
    }
}

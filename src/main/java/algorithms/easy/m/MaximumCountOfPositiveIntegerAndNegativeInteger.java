//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
package algorithms.easy.m;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {
        MaximumCountOfPositiveIntegerAndNegativeInteger posNeg = new MaximumCountOfPositiveIntegerAndNegativeInteger();
        System.out.println("Output:\t" + posNeg.maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
        System.out.println("Output:\t" + posNeg.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        System.out.println("Output:\t" + posNeg.maximumCount(new int[]{5, 20, 66, 1314}));
    }

    public int maximumCount(int[] nums) {
        int neg = nums.length - find(nums, 1);
        int pos = find(nums, 0);
        return Math.max(pos, neg);
    }

    public int find(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) r = m;
            else l = m + 1;
        }
        return l;
    }
}

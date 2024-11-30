//https://leetcode.com/problems/find-the-integer-added-to-array-i/
package algorithms.easy.f;

import java.util.Arrays;

public class FindTheIntegerAddedToArrayI {
    public static void main(String[] args) {
        FindTheIntegerAddedToArrayI added = new FindTheIntegerAddedToArrayI();
        System.out.println("Output:\t" + added.addedIntegerOptimized(new int[]{2, 6, 4}, new int[]{9, 7, 5}));
        System.out.println("Output:\t" + added.addedIntegerOptimized(new int[]{10}, new int[]{5}));
        System.out.println("Output:\t" + added.addedIntegerOptimized(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}));
        System.out.println("Output:\t" + added.addedInteger(new int[]{2, 6, 4}, new int[]{9, 7, 5}));
        System.out.println("Output:\t" + added.addedInteger(new int[]{10}, new int[]{5}));
        System.out.println("Output:\t" + added.addedInteger(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}));
    }

    public int addedIntegerOptimized(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0, n = nums1.length;
        for (int num : nums1)
            sum1 += num;
        for (int num : nums2)
            sum2 += num;
        return (sum2 - sum1) / n;
    }

    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
}

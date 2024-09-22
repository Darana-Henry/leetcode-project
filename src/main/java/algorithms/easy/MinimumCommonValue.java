//https://leetcode.com/problems/minimum-common-value/
package algorithms.easy;

public class MinimumCommonValue {
    public static void main(String[] args) {
        MinimumCommonValue min = new MinimumCommonValue();
        System.out.println("Output:\t" + min.getCommon(new int[]{1, 2, 3}, new int[]{2, 4}));
        System.out.println("Output:\t" + min.getCommon(new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}));
    }

    public int getCommon(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) return nums1[left];
            else if (nums1[left] < nums2[right]) left++;
            else right++;
        }
        return -1;
    }
}

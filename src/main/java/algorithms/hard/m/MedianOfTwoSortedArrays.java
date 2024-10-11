//https://leetcode.com/problems/median-of-two-sorted-arrays/
package algorithms.hard.m;

public class MedianOfTwoSortedArrays {
    int[] nums1;
    int[] nums2;
    int size1;
    int size2;

    public static void main(String[] args) {
        MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
        System.out.println("Output:\t" + median.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println("Output:\t" + median.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        this.size1 = nums1.length;
        this.size2 = nums2.length;
        this.nums1 = nums1;
        this.nums2 = nums2;
        int leftMedian = helper(0, 0, (size1 + size2 + 1) / 2);
        int rightMedian = helper(0, 0, (size1 + size2 + 2) / 2);
        return (leftMedian + rightMedian) / 2.0;
    }

    public int helper(int start1, int start2, int k) {
        if (start1 >= size1) return nums2[start2 + k - 1];
        if (start2 >= size2) return nums1[start1 + k - 1];
        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
        int mid = k / 2;
        int mid1 = start1 + mid - 1 < size1 ? nums1[start1 + mid - 1] : Integer.MAX_VALUE;
        int mid2 = start2 + mid - 1 < size2 ? nums2[start2 + mid - 1] : Integer.MAX_VALUE;
        if (mid1 < mid2) return helper(start1 + mid, start2, k - mid);
        else return helper(start1, start2 + mid, k - mid);
    }
}

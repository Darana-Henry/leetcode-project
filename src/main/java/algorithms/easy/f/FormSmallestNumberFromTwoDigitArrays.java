//https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays/
package algorithms.easy.f;

public class FormSmallestNumberFromTwoDigitArrays {
    public static void main(String[] args) {
        FormSmallestNumberFromTwoDigitArrays smallest = new FormSmallestNumberFromTwoDigitArrays();
        System.out.println("Output:\t" + smallest.minNumber(new int[]{4, 1, 3}, new int[]{5, 7}));
        System.out.println("Output:\t" + smallest.minNumber(new int[]{3, 5, 2, 6}, new int[]{3, 1, 7}));
    }

    public int minNumber(int[] nums1, int[] nums2) {
        int m = 0, n = 0, common;

        for (int num : nums1)
            m |= 1 << num;

        for (int num : nums2)
            n |= 1 << num;

        common = m & n;
        if (common != 0) return Integer.numberOfTrailingZeros(common);
        int a = Integer.numberOfTrailingZeros(m);
        int b = Integer.numberOfTrailingZeros(n);
        return Math.min(a * 10 + b, b * 10 + a);
    }
}

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
package algorithms.easy.s;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        SpecialArrayWithXElementsGreaterThanOrEqualX equalX = new SpecialArrayWithXElementsGreaterThanOrEqualX();
        System.out.println("Output:\t" + equalX.specialArray(new int[]{3, 5}));
        System.out.println("Output:\t" + equalX.specialArray(new int[]{0, 0}));
        System.out.println("Output:\t" + equalX.specialArray(new int[]{0, 4, 3, 0, 4}));
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            int l = 0;
            int r = n;

            while (l < r) {
                int m = l + (r - l) / 2;
                if (nums[m] >= i) r = m;
                else l = m + 1;
            }

            int count = n - l;
            if (count == i) return i;
        }
        return -1;
    }
}

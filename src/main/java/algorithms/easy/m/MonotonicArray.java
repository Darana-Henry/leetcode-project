//https://leetcode.com/problems/monotonic-array/
package algorithms.easy.m;

public class MonotonicArray {
    public static void main(String[] args) {
        MonotonicArray monotonic = new MonotonicArray();
        System.out.println("Output:\t" + monotonic.isMonotonic(new int[]{1, 2, 2, 3}));
        System.out.println("Output:\t" + monotonic.isMonotonic(new int[]{6, 5, 4, 4}));
        System.out.println("Output:\t" + monotonic.isMonotonic(new int[]{1, 3, 2}));
    }

    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) inc = false;
            if (nums[i] > nums[i - 1]) dec = false;
            if (!inc && !dec) return false;
        }

        return true;
    }
}

//https://leetcode.com/problems/find-peak-element/description/
package algorithms.medium;

public class FindPeakElement {
    public static void main(String[] args) {
        FindPeakElement peak = new FindPeakElement();
        System.out.println("Output:\t" + peak.findPeakElement(new int[]{1, 2, 3, 1}));
        System.out.println("Output:\t" + peak.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}

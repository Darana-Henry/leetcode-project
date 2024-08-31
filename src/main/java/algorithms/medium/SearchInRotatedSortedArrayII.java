//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package algorithms.medium;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        SearchInRotatedSortedArrayII search = new SearchInRotatedSortedArrayII();
        System.out.println("Output:\t" + search.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        System.out.println("Output:\t" + search.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }

    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;
            else {
                if (nums[mid] > nums[right]) {
                    if (nums[left] <= target && target <= nums[mid]) right = mid;
                    else left = mid + 1;
                } else if (nums[mid] < nums[right]) {
                    if (nums[mid] <= target && target <= nums[right]) left = mid + 1;
                    else right = mid;
                } else {
                    right--;
                }
            }
        }

        return nums[left] == target;
    }
}

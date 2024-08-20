//https://leetcode.com/problems/search-in-rotated-sorted-array/
package algorithms.medium;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        System.out.println("Output:\t" + search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println("Output:\t" + search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println("Output:\t" + search.search(new int[]{1}, 0));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target <= nums[mid]) right = mid;
                else left = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[nums.length - 1]) left = mid + 1;
                else right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }
}

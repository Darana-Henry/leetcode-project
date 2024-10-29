//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
package algorithms.medium.f;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray search = new FindFirstAndLastPositionOfElementInSortedArray();
        System.out.println("Output:\t" + search.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        System.out.println("Output:\t" + search.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
        System.out.println("Output:\t" + search.searchRange(new int[]{}, 0));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target);
        int right = search(nums, target + 1);   
        if (left == right) return new int[]{-1, -1};
        else return new int[]{left, right - 1};
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}

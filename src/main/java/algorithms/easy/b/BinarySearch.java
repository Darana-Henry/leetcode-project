//https://leetcode.com/problems/binary-search/
package algorithms.easy.b;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        System.out.println("Output:\t" + search.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println("Output:\t" + search.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return nums[left] == target ? left : -1;
    }
}

//https://leetcode.com/problems/count-the-number-of-incremovable-subarrays-i/
package algorithms.easy;

public class CountTheNumberOfIncremovableSubarraysI {
    public static void main(String[] args) {
        CountTheNumberOfIncremovableSubarraysI incremovable = new CountTheNumberOfIncremovableSubarraysI();
        System.out.println("Output:\t" + incremovable.incremovableSubarrayCount(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + incremovable.incremovableSubarrayCount(new int[]{6, 5, 7, 8}));
        System.out.println("Output:\t" + incremovable.incremovableSubarrayCount(new int[]{8, 7, 6, 6}));
        System.out.println("Output:\t" + incremovable.incremovableSubarrayCountOptimized(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + incremovable.incremovableSubarrayCountOptimized(new int[]{6, 5, 7, 8}));
        System.out.println("Output:\t" + incremovable.incremovableSubarrayCountOptimized(new int[]{8, 7, 6, 6}));
    }

    public int incremovableSubarrayCount(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isIncreasingSubArray(nums, i, j)) count++;
            }
        }
        return count;
    }

    public boolean isIncreasingSubArray(int[] arr, int start, int end) {
        int prev = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i <= end && i >= start) continue;
            if (prev >= arr[i]) return false;
            prev = arr[i];
        }
        return true;
    }

    public int incremovableSubarrayCountOptimized(int[] nums) {
        int left = 0, answer = 0, n = nums.length;
        while (left + 1 < n && nums[left] < nums[left + 1]) left++;
        if (left == n - 1) return n * (n + 1) / 2;
        answer += left + 2;

        for (int right = n - 1; right > 0; right--) {
            while (left >= 0 && nums[left] >= nums[right]) left--;
            answer += left + 2;
            if (nums[right - 1] >= nums[right]) break;
        }

        return answer;
    }
}

//https://leetcode.com/problems/longest-even-odd-subarray-with-threshold/
package algorithms.easy.l;

public class LongestEvenOddSubarrayWithThreshold {
    public static void main(String[] args) {
        LongestEvenOddSubarrayWithThreshold longest = new LongestEvenOddSubarrayWithThreshold();
        System.out.println("Output:\t" + longest.longestAlternatingSubarray(new int[]{3, 2, 5, 4}, 5));
        System.out.println("Output:\t" + longest.longestAlternatingSubarray(new int[]{1, 2}, 2));
        System.out.println("Output:\t" + longest.longestAlternatingSubarray(new int[]{2, 3, 4, 5}, 4));
    }

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int answer = 0;

        for (int left = 0; left < n; left++) {
            if (nums[left] % 2 == 0 && nums[left] <= threshold) {
                int right = left + 1;
                while (right < n && nums[right] % 2 != nums[right - 1] % 2 && nums[right] <= threshold) right++;
                answer = Math.max(answer, right - left);
            }
        }

        return answer;
    }
}

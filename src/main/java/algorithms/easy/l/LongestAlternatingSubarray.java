//https://leetcode.com/problems/longest-alternating-subarray/
package algorithms.easy.l;

public class LongestAlternatingSubarray {
    public static void main(String[] args) {
        LongestAlternatingSubarray alternating = new LongestAlternatingSubarray();
        System.out.println("Output:\t" + alternating.alternatingSubarray(new int[]{2, 3, 4, 3, 4}));
        System.out.println("Output:\t" + alternating.alternatingSubarray(new int[]{4, 5, 6}));
    }

    public int alternatingSubarray(int[] nums) {
        int answer = -1;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            int factor = 1;
            int curr = start;
            for (; curr + 1 < n && nums[curr + 1] - nums[curr] == factor; curr++)
                factor *= -1;
            if (curr - start + 1 > 1) answer = Math.max(answer, curr - start + 1);
        }
        return answer;
    }
}

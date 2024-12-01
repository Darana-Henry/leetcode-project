//https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/
package algorithms.easy.a;

import java.util.Arrays;
import java.util.List;

public class AdjacentIncreasingSubarraysDetectionI {
    public static void main(String[] args) {
        AdjacentIncreasingSubarraysDetectionI adjacent = new AdjacentIncreasingSubarraysDetectionI();
        System.out.println(
                "Output:\t" + adjacent.hasIncreasingSubarrays(Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3));
        System.out.println(
                "Output:\t" + adjacent.hasIncreasingSubarrays(Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5));
    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (k * 2 > n) return false;

        for (int start = 0, end = (k * 2) - 1; end < n; start++, end++) {
            boolean inc = true;
            for (int i = start + 1; i < start + k; i++) {
                if (nums.get(i) <= nums.get(i - 1)) {
                    inc = false;
                    break;
                }
            }

            if (inc) {
                boolean inc2 = true;
                for (int i = start + k + 1; i <= end; i++) {
                    if (nums.get(i) <= nums.get(i - 1)) {
                        inc2 = false;
                        break;
                    }
                }
                if (inc2) return true;
            }
        }
        return false;
    }
}

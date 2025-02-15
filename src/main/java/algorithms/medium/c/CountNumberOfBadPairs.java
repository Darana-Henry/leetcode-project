//https://leetcode.com/problems/count-number-of-bad-pairs/
package algorithms.medium.c;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfBadPairs {
    public static void main(String[] args) {
        CountNumberOfBadPairs obj = new CountNumberOfBadPairs();
        System.out.println("Output:\t" + obj.countBadPairs(new int[]{4, 1, 3, 3}));
        System.out.println("Output:\t" + obj.countBadPairs(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + obj.countBadPairsOptimized(new int[]{4, 1, 3, 3}));
        System.out.println("Output:\t" + obj.countBadPairsOptimized(new int[]{1, 2, 3, 4, 5}));
    }

    public long countBadPairs(int[] nums) {
        long answer = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if ((j - i) != nums[j] - nums[i]) answer++;

        return answer;
    }

    public long countBadPairsOptimized(int[] nums) {
        long answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = i - nums[i];
            int good = map.getOrDefault(diff, 0);
            answer += i - good;
            map.put(diff, good + 1);
        }

        return answer;
    }
}

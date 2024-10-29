//https://leetcode.com/problems/longest-consecutive-sequence/
package algorithms.medium.l;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence longest = new LongestConsecutiveSequence();
        System.out.println("Output:\t" + longest.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println("Output:\t" + longest.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestStreak = 0;
        for (int num : nums)
            set.add(num);

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                int currentStreak = 1;

                while (set.contains(num + 1)) {
                    currentStreak++;
                    num++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);

            }
        }
        return longestStreak;
    }
}


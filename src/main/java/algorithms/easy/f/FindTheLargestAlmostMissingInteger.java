//https://leetcode.com/problems/find-the-largest-almost-missing-integer/
package algorithms.easy.f;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheLargestAlmostMissingInteger {
    public static void main(String[] args) {
        FindTheLargestAlmostMissingInteger obj = new FindTheLargestAlmostMissingInteger();
        System.out.println("Output:\t" + obj.largestInteger(new int[]{3, 9, 2, 1, 7}, 3));
        System.out.println("Output:\t" + obj.largestInteger(new int[]{3, 9, 7, 2, 1, 7}, 4));
        System.out.println("Output:\t" + obj.largestInteger(new int[]{0, 0}, 1));
    }

    public int largestInteger(int[] nums, int k) {
        int answer = -1, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= n - k; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++)
                set.add(nums[j]);

            for (int num : set)
                map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() == 1) answer = Math.max(answer, entry.getKey());

        return answer;
    }
}

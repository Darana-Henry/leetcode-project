//https://leetcode.com/problems/count-number-of-nice-subarrays/description/
package algorithms.medium.c;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubarrays {
    public static void main(String[] args) {
        CountNumberOfNiceSubarrays nice = new CountNumberOfNiceSubarrays();
        System.out.println("Output:\t" + nice.numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
        System.out.println("Output:\t" + nice.numberOfSubarrays(new int[]{2, 4, 6}, 1));
        System.out.println("Output:\t" + nice.numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
    }

    public int numberOfSubarrays(int[] nums, int k) {
        int result = 0;
        int current = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            current += num % 2;
            result += map.getOrDefault(current - k, 0);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        return result;
    }
}

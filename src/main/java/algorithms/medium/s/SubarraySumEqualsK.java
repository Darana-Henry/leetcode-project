//https://leetcode.com/problems/subarray-sum-equals-k/
package algorithms.medium.s;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        SubarraySumEqualsK equals = new SubarraySumEqualsK();
        System.out.println("Output:\t" + equals.subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println("Output:\t" + equals.subarraySum(new int[]{1, 2, 3}, 3));
    }

    public int subarraySum(int[] nums, int k) {
        int answer = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            answer += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }
}

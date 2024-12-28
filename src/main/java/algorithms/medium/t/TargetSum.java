//https://leetcode.com/problems/target-sum/
package algorithms.medium.t;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public static void main(String[] args) {
        TargetSum obj = new TargetSum();
        System.out.println("Output:\t" + obj.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println("Output:\t" + obj.findTargetSumWays(new int[]{1}, 1));
    }

    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            Map<Integer, Integer> cmap = new HashMap<>();

            for (int sum : map.keySet()) {
                int count = map.get(sum);
                cmap.put(sum + num, cmap.getOrDefault(sum + num, 0) + count);
                cmap.put(sum - num, cmap.getOrDefault(sum - num, 0) + count);
            }
            map = cmap;
        }
        return map.getOrDefault(target, 0);
    }
}

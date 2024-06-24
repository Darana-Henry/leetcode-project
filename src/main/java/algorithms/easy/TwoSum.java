//https://leetcode.com/problems/two-sum/description/
package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println("Output:\t" + twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        System.out.println("Output:\t" + twoSum.twoSum(new int[]{3, 2, 4}, 6));
        System.out.println("Output:\t" + twoSum.twoSum(new int[]{3, 3}, 6));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

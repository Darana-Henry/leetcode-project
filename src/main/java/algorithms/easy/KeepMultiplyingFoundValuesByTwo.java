//https://leetcode.com/problems/keep-multiplying-found-values-by-two/
package algorithms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        KeepMultiplyingFoundValuesByTwo original = new KeepMultiplyingFoundValuesByTwo();
        System.out.println("Output:\t" + original.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3));
        System.out.println("Output:\t" + original.findFinalValue(new int[]{2, 7, 9}, 4));
    }

    public int findFinalValue(int[] nums, int original) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        while (map.containsKey(original) && map.get(original) > 0) {
            map.put(original, map.getOrDefault(original, 0) - 1);
            original *= 2;
        }
        return original;
    }

    public int findFinalValueOptimized(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        while (set.contains(original)) original *= 2;
        return original;
    }
}

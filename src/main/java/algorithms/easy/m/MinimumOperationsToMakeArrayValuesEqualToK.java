//https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/
package algorithms.easy.m;

import java.util.HashSet;
import java.util.Set;

public class MinimumOperationsToMakeArrayValuesEqualToK {
    public static void main(String[] args) {
        MinimumOperationsToMakeArrayValuesEqualToK minimum = new MinimumOperationsToMakeArrayValuesEqualToK();
        System.out.println("Output:\t" + minimum.minOperations(new int[]{5, 2, 5, 4, 5}, 2));
        System.out.println("Output:\t" + minimum.minOperations(new int[]{2, 1, 2}, 2));
        System.out.println("Output:\t" + minimum.minOperations(new int[]{9, 7, 5, 3}, 1));
    }

    public int minOperations(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            set.add(num);
        }

        return (min < k) ? -1 : (min == k) ? set.size() - 1 : set.size();
    }
}

//https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/
package algorithms.easy.m;

import java.util.HashSet;

public class MinimumNumberOfOperationsToMakeElementsInArrayDistinct {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToMakeElementsInArrayDistinct obj = new MinimumNumberOfOperationsToMakeElementsInArrayDistinct();
        System.out.println("Output:\t" + obj.minimumOperations(new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7}));
        System.out.println("Output:\t" + obj.minimumOperations(new int[]{4, 5, 6, 4, 4}));
        System.out.println("Output:\t" + obj.minimumOperations(new int[]{6, 7, 8, 9}));
    }

    public int minimumOperations(int[] nums) {
        int index = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                index = i;
                break;
            }
            set.add(nums[i]);
        }

        if (index == -1) return 0;
        index++;
        int rem = index % 3;
        return (rem == 0) ? (index / 3) : (index / 3) + 1;
    }
}

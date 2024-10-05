//https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
package algorithms.easy.m;

import java.util.HashSet;
import java.util.Set;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public static void main(String[] args) {
        MakeArrayZeroBySubtractingEqualAmounts makeZero = new MakeArrayZeroBySubtractingEqualAmounts();
        System.out.println("Output:\t" + makeZero.minimumOperations(new int[]{1, 5, 0, 3, 5}));
        System.out.println("Output:\t" + makeZero.minimumOperations(new int[]{0}));
    }

    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) set.add(num);
        }
        return set.size();
    }
}

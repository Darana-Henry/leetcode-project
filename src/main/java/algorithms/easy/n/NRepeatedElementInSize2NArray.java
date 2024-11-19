//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
package algorithms.easy.n;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        NRepeatedElementInSize2NArray repeated = new NRepeatedElementInSize2NArray();
        System.out.println("Output:\t" + repeated.repeatedNTimes(new int[]{1, 2, 3, 3}));
        System.out.println("Output:\t" + repeated.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        System.out.println("Output:\t" + repeated.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }

    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length / 2 + 1);

        for (int num : nums)
            if (!set.add(num)) return num;
        return 1;
    }
}

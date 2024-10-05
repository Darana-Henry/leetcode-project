//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
package algorithms.easy.l;

import java.util.Set;

import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        LargestPositiveIntegerThatExistsWithItsNegative positive = new LargestPositiveIntegerThatExistsWithItsNegative();
        System.out.println("Output:\t" + positive.findMaxK(new int[]{-1, 2, -3, 3}));
        System.out.println("Output:\t" + positive.findMaxK(new int[]{-1, 10, 6, 7, -7, 1}));
        System.out.println("Output:\t" + positive.findMaxK(new int[]{-10, 8, 6, 7, -2, -3}));
    }

    public int findMaxK(int[] nums) {
        int answer = -1;
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        for (int num : nums) {
            if (set.contains(-num)) answer = Math.max(answer, num);
        }

        return answer;
    }
}

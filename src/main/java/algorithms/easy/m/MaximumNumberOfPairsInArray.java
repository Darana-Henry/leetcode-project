//https://leetcode.com/problems/maximum-number-of-pairs-in-array/
package algorithms.easy.m;

public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        MaximumNumberOfPairsInArray pairs = new MaximumNumberOfPairsInArray();
        System.out.println("Output:\t" + pairs.numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2}));
        System.out.println("Output:\t" + pairs.numberOfPairs(new int[]{1, 1}));
        System.out.println("Output:\t" + pairs.numberOfPairs(new int[]{0}));
    }

    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        int pairs = 0, leftover = 0;

        for (int num : nums)
            count[num]++;

        for (int c : count)
            pairs += c / 2;
        leftover = nums.length - pairs * 2;

        return new int[]{pairs, leftover};
    }
}

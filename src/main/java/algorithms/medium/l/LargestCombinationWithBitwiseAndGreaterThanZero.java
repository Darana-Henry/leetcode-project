//https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/
package algorithms.medium.l;

public class LargestCombinationWithBitwiseAndGreaterThanZero {
    public static void main(String[] args) {
        LargestCombinationWithBitwiseAndGreaterThanZero obj = new LargestCombinationWithBitwiseAndGreaterThanZero();
        System.out.println("Output:\t" + obj.largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}));
        System.out.println("Output:\t" + obj.largestCombination(new int[]{8, 8}));
    }

    public int largestCombination(int[] candidates) {
        int max = 0;
        for (int i = 0; i < 24; i++) {
            int count = 0;

            for (int num : candidates)
                if ((num & (1 << i)) != 0) count++;

            max = Math.max(max, count);
        }
        return max;
    }
}

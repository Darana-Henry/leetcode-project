//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
package algorithms.easy.m;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        MinimumOperationsToMakeTheArrayIncreasing ops = new MinimumOperationsToMakeTheArrayIncreasing();
        System.out.println("Output:\t" + ops.minOperations(new int[]{1, 1, 1}));
        System.out.println("Output:\t" + ops.minOperations(new int[]{1, 5, 2, 4, 1}));
        System.out.println("Output:\t" + ops.minOperations(new int[]{8}));
    }

    public int minOperations(int[] nums) {
        int answer = 0, max = 0;
        for (int num : nums) {
            answer += Math.max(0, max + 1 - num);
            max = Math.max(max + 1, num);
        }
        return answer;
    }
}

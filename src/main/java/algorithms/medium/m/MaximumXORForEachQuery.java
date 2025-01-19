//https://leetcode.com/problems/maximum-xor-for-each-query/
package algorithms.medium.m;

public class MaximumXORForEachQuery {
    public static void main(String[] args) {
        MaximumXORForEachQuery obj = new MaximumXORForEachQuery();
        System.out.println("Output:\t" + obj.getMaximumXor(new int[]{0, 1, 1, 3}, 2));
        System.out.println("Output:\t" + obj.getMaximumXor(new int[]{2, 3, 4, 7}, 2));
        System.out.println("Output:\t" + obj.getMaximumXor(new int[]{0, 1, 2, 2, 5, 7}, 3));
    }

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor = 0, n = nums.length;
        int mask = (1 << maximumBit) - 1;
        int[] answer = new int[n];

        for (int num : nums)
            xor ^= num;

        for (int i = 0; i < n; i++) {
            answer[i] = xor ^ mask;
            xor ^= nums[n - i - 1];
        }

        return answer;
    }
}

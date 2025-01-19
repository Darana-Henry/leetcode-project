//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
package algorithms.medium.m;

public class MinimumNumberOfOperationsToMakeArrayXorEqualToK {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToMakeArrayXorEqualToK obj = new MinimumNumberOfOperationsToMakeArrayXorEqualToK();
        System.out.println("Output:\t" + obj.minOperations(new int[]{2, 1, 3, 4}, 1));
        System.out.println("Output:\t" + obj.minOperations(new int[]{2, 0, 2, 0}, 0));
        System.out.println("Output:\t" + obj.minOperationsOptimized(new int[]{2, 1, 3, 4}, 1));
        System.out.println("Output:\t" + obj.minOperationsOptimized(new int[]{2, 0, 2, 0}, 0));
    }

    public int minOperations(int[] nums, int k) {
        int answer = 0;

        for (int i = 0; i <= 20; i++) {
            int xor = 0;

            for (int num : nums) {
                int nbit = (1 << i) & num;
                xor ^= nbit;
            }

            int kbit = (1 << i) & k;
            if (xor != kbit) answer++;
        }
        return answer;
    }

    public int minOperationsOptimized(int[] nums, int k) {
        for (int num : nums)
            k ^= num;
        return Integer.bitCount(k);
    }
}

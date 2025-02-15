//https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/
package algorithms.medium.m;

public class MaxSumOfAPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        MaxSumOfAPairWithEqualSumOfDigits obj = new MaxSumOfAPairWithEqualSumOfDigits();
        System.out.println("Output:\t" + obj.maximumSum(new int[]{18, 43, 36, 13, 7}));
        System.out.println("Output:\t" + obj.maximumSum(new int[]{10, 12, 19, 14}));
        System.out.println("Output:\t" + obj.maximumSumOptimized(new int[]{18, 43, 36, 13, 7}));
        System.out.println("Output:\t" + obj.maximumSumOptimized(new int[]{10, 12, 19, 14}));
    }

    public int maximumSum(int[] nums) {
        int answer = -1, n = nums.length;
        int[] max = new int[100];

        for (int nu : nums) {
            int sum = 0;

            for (int num = nu; num > 0; num /= 10)
                sum += num % 10;

            if (max[sum] > 0) answer = Math.max(answer, max[sum] + nu);
            max[sum] = Math.max(max[sum], nu);
        }

        return answer;
    }

    public int maximumSumOptimized(int[] nums) {
        int answer = -1, n = nums.length;
        int[] dup = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int num = nums[i]; num > 0; num /= 10)
                sum += num % 10;
            dup[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dup[i] == dup[j]) answer = Math.max(answer, nums[i] + nums[j]);
            }
        }

        return answer;
    }

}

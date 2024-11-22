//https://leetcode.com/problems/max-pair-sum-in-an-array/
package algorithms.easy.m;

public class MaxPairSumInAnArray {
    public static void main(String[] args) {
        MaxPairSumInAnArray maxPair = new MaxPairSumInAnArray();
        System.out.println("Output:\t" + maxPair.maxSum(new int[]{112, 131, 411}));
        System.out.println("Output:\t" + maxPair.maxSum(new int[]{2536, 1613, 3366, 162}));
        System.out.println("Output:\t" + maxPair.maxSum(new int[]{51, 71, 17, 24, 42}));
    }

    public int maxSum(int[] nums) {
        int n = nums.length;
        int answer = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                if (answer < sum && maxDigit(nums[i]) == maxDigit(nums[j])) answer = sum;
            }
        }

        return answer;
    }

    public int maxDigit(int num) {
        int answer = 0;
        for (int i = num; i > 0; i /= 10)
            answer = Math.max(answer, i % 10);
        return answer;
    }
}

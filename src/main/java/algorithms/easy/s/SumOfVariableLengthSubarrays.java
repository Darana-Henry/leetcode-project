//https://leetcode.com/problems/sum-of-variable-length-subarrays/
package algorithms.easy.s;

public class SumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        SumOfVariableLengthSubarrays obj = new SumOfVariableLengthSubarrays();
        System.out.println("Output:\t" + obj.subarraySum(new int[]{2, 3, 1}));
        System.out.println("Output:\t" + obj.subarraySum(new int[]{3, 1, 1, 2}));
    }

    public int subarraySum(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j <= i; j++)
                answer += nums[j];
        }

        return answer;
    }
}

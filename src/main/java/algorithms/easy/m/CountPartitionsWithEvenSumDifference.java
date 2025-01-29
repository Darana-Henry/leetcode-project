//https://leetcode.com/problems/count-partitions-with-even-sum-difference/
package algorithms.easy.m;

public class CountPartitionsWithEvenSumDifference {
    public static void main(String[] args) {
        CountPartitionsWithEvenSumDifference obj = new CountPartitionsWithEvenSumDifference();
        System.out.println("Output:\t" + obj.countPartitions(new int[]{10, 10, 3, 7, 6}));
        System.out.println("Output:\t" + obj.countPartitions(new int[]{1, 2, 2}));
        System.out.println("Output:\t" + obj.countPartitions(new int[]{2, 4, 6, 8}));
    }

    public int countPartitions(int[] nums) {
        int right = 0, answer = 0;

        for (int num : nums)
            right += num;

        for (int i = 0, left = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];

            if ((left - right) % 2 == 0) answer++;
        }

        return answer;
    }
}

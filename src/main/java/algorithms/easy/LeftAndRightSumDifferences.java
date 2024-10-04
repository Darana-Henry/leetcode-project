//https://leetcode.com/problems/left-and-right-sum-differences/
package algorithms.easy;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        LeftAndRightSumDifferences diff = new LeftAndRightSumDifferences();
        System.out.println("Output:\t" + diff.leftRightDifference(new int[]{10, 4, 8, 3}));
        System.out.println("Output:\t" + diff.leftRightDifference(new int[]{1}));
    }

    public int[] leftRightDifference(int[] nums) {
        int lSum = 0;
        int rSum = 0;
        int[] answer = new int[nums.length];
        for (int num : nums)
            rSum += num;

        for (int i = 0; i < nums.length; i++) {
            rSum -= nums[i];
            answer[i] = Math.abs(lSum - rSum);
            lSum += nums[i];
        }

        return answer;
    }
}

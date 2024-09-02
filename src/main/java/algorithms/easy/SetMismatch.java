//https://leetcode.com/problems/set-mismatch/
package algorithms.easy;

public class SetMismatch {
    public static void main(String[] args) {
        SetMismatch set = new SetMismatch();
        System.out.println("Output:\t" + set.findErrorNums(new int[]{1, 2, 2, 4}));
        System.out.println("Output:\t" + set.findErrorNums(new int[]{1, 1}));
    }

    public int[] findErrorNums(int[] nums) {
        int[] dp = new int[nums.length + 1];
        int[] set = new int[2];
        for (int num : nums)
            dp[num]++;

        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > 1) set[0] = i;
            if (dp[i] == 0) set[1] = i;
        }
        return set;
    }
}

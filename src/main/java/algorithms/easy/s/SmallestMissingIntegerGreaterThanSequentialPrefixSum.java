//https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
package algorithms.easy.s;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public static void main(String[] args) {
        SmallestMissingIntegerGreaterThanSequentialPrefixSum missing = new SmallestMissingIntegerGreaterThanSequentialPrefixSum();
        System.out.println("Output:\t" + missing.missingInteger(new int[]{1, 2, 3, 2, 5}));
        System.out.println("Output:\t" + missing.missingInteger(new int[]{3, 4, 5, 1, 12, 14, 13}));
    }

    public int missingInteger(int[] nums) {
        int sum = nums[0];
        boolean[] visited = new boolean[51];

        for (int i = 1; i < nums.length && nums[i] == nums[i - 1] + 1; i++)
            sum += nums[i];

        for (int num : nums)
            visited[num] = true;

        for (int i = sum; ; i++)
            if (i >= visited.length || (!visited[i])) return i;
    }
}

//https://leetcode.com/problems/minimum-cost-for-tickets/
package algorithms.medium.m;

import java.util.Arrays;

public class MinimumCostForTickets {
    int[] durations = new int[]{1, 7, 30};
    int[] prices;
    int[] travels;
    int[] dp;
    int n;

    public static void main(String[] args) {
        MinimumCostForTickets obj = new MinimumCostForTickets();
        System.out.println("Output:\t" + obj.mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
        System.out.println("Output:\t" + obj.mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31},
                new int[]{2, 7, 15}));
    }

    public int mincostTickets(int[] days, int[] costs) {
        this.prices = costs;
        this.travels = days;
        n = days.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return dfs(0);
    }

    public int dfs(int index) {
        if (index >= n) return 0;
        if (dp[index] != -1) return dp[index];
        int answer = Integer.MAX_VALUE;

        for (int k = 0; k < 3; k++) {
            int next = lowerBound(travels, travels[index] + durations[k]);
            answer = Math.min(answer, prices[k] + dfs(next));
        }

        dp[index] = answer;
        return answer;
    }

    public int lowerBound(int[] days, int target) {
        int left = 0, right = days.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (days[mid] < target) left = mid + 1;
            else right = mid;
        }

        return left;
    }
}

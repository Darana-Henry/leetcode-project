//https://leetcode.com/problems/solving-questions-with-brainpower/
package algorithms.medium.s;

public class SolvingQuestionsWithBrainpower {
    int n;
    Long[] dp;
    int[][] grid;

    public static void main(String[] args) {
        SolvingQuestionsWithBrainpower obj = new SolvingQuestionsWithBrainpower();
        System.out.println("Output:\t" + obj.mostPoints(new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}}));
        System.out.println("Output:\t" + obj.mostPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}));
    }

    public long mostPoints(int[][] questions) {
        this.n = questions.length;
        grid = questions;
        dp = new Long[n];
        return dfs(0);
    }

    public long dfs(int i) {
        if (i >= n) return 0;
        if (dp[i] != null) return dp[i];
        int p = grid[i][0];
        int b = grid[i][1];
        dp[i] = Math.max(p + dfs(i + 1 + b), dfs(i + 1));
        return dp[i];
    }
}

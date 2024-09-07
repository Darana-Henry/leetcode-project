//https://leetcode.com/problems/unique-binary-search-trees/
package algorithms.medium;

public class UniqueBinarySearchTrees {
    int[] dpp = new int[20];

    public static void main(String[] args) {
        UniqueBinarySearchTrees unique = new UniqueBinarySearchTrees();
        System.out.println("Output:\t" + unique.numTrees(3));
        System.out.println("Output:\t" + unique.numTrees(1));
        System.out.println("Output:\t" + unique.numsTrees(3));
        System.out.println("Output:\t" + unique.numsTrees(1));
    }

    public int numsTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int nodes = 1; nodes <= n; nodes++) {
            for (int root = 0; root < nodes; root++) {
                dp[nodes] += dp[root] * dp[nodes - root - 1];
            }
        }

        return dp[n];
    }

    public int numTrees(int n) {
        if (n <= 1) return 1;
        if (dpp[n] > 0) return dpp[n];
        for (int i = 1; i <= n; i++)
            dpp[n] += numTrees(i - 1) * numTrees(n - i);
        return dpp[n];
    }
}

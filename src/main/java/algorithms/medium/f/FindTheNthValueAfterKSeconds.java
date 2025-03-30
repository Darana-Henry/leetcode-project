//https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/
package algorithms.medium.f;

import java.util.Arrays;

public class FindTheNthValueAfterKSeconds {
    public static void main(String[] args) {
        FindTheNthValueAfterKSeconds obj = new FindTheNthValueAfterKSeconds();
        System.out.println("Output:\t" + obj.valueAfterKSeconds(4, 5));
        System.out.println("Output:\t" + obj.valueAfterKSeconds(5, 3));
    }

    public int valueAfterKSeconds(int n, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        while (k-- > 0) for (int i = 1; i < n; i++)
            dp[i] = (dp[i] + dp[i - 1]) % 1000000007;

        return dp[n - 1];
    }
}

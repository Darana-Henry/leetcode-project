//https://leetcode.com/problems/ugly-number-ii/
package algorithms.medium.u;

public class UglyNumberII {
    public static void main(String[] args) {
        UglyNumberII ugly = new UglyNumberII();
        System.out.println("Output:\t" + ugly.nthUglyNumber(10));
        System.out.println("Output:\t" + ugly.nthUglyNumber(1));
    }

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int m2 = 2 * dp[i2];
            int m3 = 3 * dp[i3];
            int m5 = 5 * dp[i5];
            dp[i] = Math.min(m2, Math.min(m3, m5));
            if (dp[i] == m2) i2++;
            if (dp[i] == m3) i3++;
            if (dp[i] == m5) i5++;
        }
        return dp[n - 1];
    }
}

//https://leetcode.com/problems/push-dominoes/
package algorithms.medium.p;

public class PushDominoes {
    public static void main(String[] args) {
        PushDominoes obj = new PushDominoes();
        System.out.println("Output:\t" + obj.pushDominoes("RR.L"));
        System.out.println("Output:\t" + obj.pushDominoes(".L.R...LR..L.."));
    }

    public String pushDominoes(String dominoes) {
        char[] dom = dominoes.toCharArray();
        int n = dom.length, force = 0;
        int[] dp = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (dom[i] == 'R') force = n;
            else if (dom[i] == 'L') force = 0;
            else force = Math.max(force - 1, 0);
            dp[i] += force;
        }

        force = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (dom[i] == 'L') force = n;
            else if (dom[i] == 'R') force = 0;
            else force = Math.max(force - 1, 0);
            dp[i] -= force;
        }

        for (int f : dp) {
            if (f > 0) sb.append("R");
            else if (f < 0) sb.append("L");
            else sb.append(".");
        }

        return sb.toString();
    }
}

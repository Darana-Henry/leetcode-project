//https://leetcode.com/problems/find-the-town-judge/
package algorithms.easy.f;

public class FindTheTownJudge {
    public static void main(String[] args) {
        FindTheTownJudge judge = new FindTheTownJudge();
        System.out.println("Output:\t" + judge.findJudge(2, new int[][]{{1, 2}}));
        System.out.println("Output:\t" + judge.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        System.out.println("Output:\t" + judge.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }

    public int findJudge(int n, int[][] trust) {
        int[] trustC = new int[n + 1];
        int[] trustedC = new int[n + 1];

        for (int[] rel : trust) {
            trustC[rel[0]]++;
            trustedC[rel[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustC[i] == 0 && trustedC[i] == n - 1) return i;
        }
        return -1;
    }
}

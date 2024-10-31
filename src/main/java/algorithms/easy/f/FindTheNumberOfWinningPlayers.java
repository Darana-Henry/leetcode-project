//https://leetcode.com/problems/find-the-number-of-winning-players/
package algorithms.easy.f;

public class FindTheNumberOfWinningPlayers {
    public static void main(String[] args) {
        FindTheNumberOfWinningPlayers win = new FindTheNumberOfWinningPlayers();
        System.out.println(
                "Output:\t" + win.winningPlayerCount(4, new int[][]{{0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0}}));
        System.out.println("Output:\t" + win.winningPlayerCount(5, new int[][]{{1, 1}, {1, 2}, {1, 3}, {1, 4}}));
        System.out.println("Output:\t" + win.winningPlayerCount(5, new int[][]{{1, 1}, {2, 4}, {2, 4}, {2, 4}}));
    }

    public int winningPlayerCount(int n, int[][] pick) {
        int answer = 0;
        int[][] counts = new int[n][11];

        for (int[] p : pick)
            counts[p[0]][p[1]]++;

        for (int i = 0; i < n; i++) {
            for (int c : counts[i]) {
                if (c > i) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}

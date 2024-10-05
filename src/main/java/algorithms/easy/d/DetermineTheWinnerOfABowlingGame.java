//https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/
package algorithms.easy.d;

public class DetermineTheWinnerOfABowlingGame {
    public static void main(String[] args) {
        DetermineTheWinnerOfABowlingGame winner = new DetermineTheWinnerOfABowlingGame();
        System.out.println("Output:\t" + winner.isWinner(new int[]{5, 10, 3, 2}, new int[]{6, 5, 7, 3}));
        System.out.println("Output:\t" + winner.isWinner(new int[]{3, 5, 7, 6}, new int[]{8, 10, 10, 2}));
        System.out.println("Output:\t" + winner.isWinner(new int[]{2, 3}, new int[]{4, 1}));
        System.out.println(
                "Output:\t" + winner.isWinner(new int[]{1, 1, 1, 10, 10, 10, 10}, new int[]{10, 10, 10, 10, 1, 1, 1}));
    }

    public int isWinner(int[] player1, int[] player2) {
        int sum1 = player1[0], sum2 = player2[0];
        for (int i = 1; i < player1.length; i++) {
            sum1 += ((i > 0 && player1[i - 1] == 10) || (i > 1 && player1[i - 2] == 10)) ? player1[i] * 2 : player1[i];
            sum2 += ((i > 0 && player2[i - 1] == 10) || (i > 1 && player2[i - 2] == 10)) ? player2[i] * 2 : player2[i];
        }
        return sum1 == sum2 ? 0 : sum1 > sum2 ? 1 : 2;
    }
}

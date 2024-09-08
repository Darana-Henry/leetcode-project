//https://leetcode.com/problems/find-the-winning-player-in-coin-game/
package algorithms.easy;

public class FindTheWinningPlayerInCoinGame {
    public static void main(String[] args) {
        FindTheWinningPlayerInCoinGame win = new FindTheWinningPlayerInCoinGame();
        System.out.println("Output:\t" + win.losingPlayer(2, 7));
        System.out.println("Output:\t" + win.losingPlayer(4, 11));
    }

    public String losingPlayer(int x, int y) {
        return ((Math.min(x, y / 4)) % 2 == 1) ? "Alice" : "Bob";
    }
}

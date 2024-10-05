//https://leetcode.com/problems/nim-game/
package algorithms.easy.n;

public class NimGame {
    public static void main(String[] args) {
        NimGame nimGame = new NimGame();
        System.out.println("Output:\t" + nimGame.canWinNim(4));
        System.out.println("Output:\t" + nimGame.canWinNim(1));
        System.out.println("Output:\t" + nimGame.canWinNim(2));
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

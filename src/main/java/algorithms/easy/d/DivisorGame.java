//https://leetcode.com/problems/divisor-game/
package algorithms.easy.d;

public class DivisorGame {
    public static void main(String[] args) {
        DivisorGame game = new DivisorGame();
        System.out.println("Output:\t" + game.divisorGame(2));
        System.out.println("Output:\t" + game.divisorGame(3));
    }

    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}

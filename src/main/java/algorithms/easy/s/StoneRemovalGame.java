//https://leetcode.com/problems/stone-removal-game/
package algorithms.easy.s;

public class StoneRemovalGame {
    public static void main(String[] args) {
        StoneRemovalGame removal = new StoneRemovalGame();
        System.out.println("Output:\t" + removal.canAliceWin(12));
        System.out.println("Output:\t" + removal.canAliceWin(1));
    }

    public boolean canAliceWin(int n) {
        int turns = 0;

        for (int i = 10; i > 0; i--) {
            if (n < i) break;
            n -= i;
            turns++;
        }

        return turns % 2 != 0;
    }
}

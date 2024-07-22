//https://leetcode.com/problems/domino-and-tromino-tiling/description
package algorithms.medium;

public class DominoAndTrominoTiling {
    public static void main(String[] args) {
        DominoAndTrominoTiling dom = new DominoAndTrominoTiling();
        System.out.println("Output:\t" + dom.numTilings(3));
        System.out.println("Output:\t" + dom.numTilings(1));
    }

    public int numTilings(int n) {
        return 1;
    }
}

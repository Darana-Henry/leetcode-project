//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
package algorithms.easy.m;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        MinimumCostToMoveChipsToTheSamePosition moves = new MinimumCostToMoveChipsToTheSamePosition();
        System.out.println("Output:\t" + moves.minCostToMoveChips(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + moves.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
        System.out.println("Output:\t" + moves.minCostToMoveChips(new int[]{1, 1000000000}));
    }

    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int pos : position) {
            if (pos % 2 == 0) even++;
            else odd++;
        }
        return Math.min(odd, even);
    }
}

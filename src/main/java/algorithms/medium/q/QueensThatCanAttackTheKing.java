//https://leetcode.com/problems/queens-that-can-attack-the-king/
package algorithms.medium.q;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class QueensThatCanAttackTheKing {
    public static void main(String[] args) {
        QueensThatCanAttackTheKing obj = new QueensThatCanAttackTheKing();
        System.out.println(
                "Output:\t" + obj.queensAttacktheKing(new int[][]{{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}},
                        new int[]{0, 0}));
        System.out.println("Output:\t" + obj.queensAttacktheKing(
                new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 4}, {3, 5}, {4, 4}, {4, 5}}, new int[]{3, 3}));
    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> answer = new ArrayList<>();
        boolean[][] seen = new boolean[8][8];
        int[] dir = new int[]{1, 0, -1};

        for (int[] queen : queens)
            seen[queen[0]][queen[1]] = true;

        for (int dx : dir) {
            for (int dy : dir) {
                if (dx == 0 && dy == 0) continue;
                int x = king[0] + dx;
                int y = king[1] + dy;

                while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                    if (seen[x][y]) {
                        answer.add(Arrays.asList(x, y));
                        break;
                    }
                    x += dx;
                    y += dy;
                }
            }
        }

        return answer;
    }
}

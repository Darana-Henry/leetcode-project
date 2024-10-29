//https://leetcode.com/problems/snakes-and-ladders/
package algorithms.medium.s;

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {
    private int n;

    public static void main(String[] args) {
        SnakesAndLadders and = new SnakesAndLadders();
        System.out.println("Output:\t" + and.snakesAndLadders(
                new int[][]{{-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, 35, -1, -1, 13, -1}, {-1, -1, -1, -1, -1, -1}, {-1, 15, -1, -1, -1, -1}}));
        System.out.println("Output:\t" + and.snakesAndLadders(new int[][]{{-1, -1}, {-1, 3}}));
    }


    public int snakesAndLadders(int[][] board) {
        this.n = board.length;
        boolean[] visited = new boolean[n * n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = true;
        int moves = 0;

        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; i--) {
                int cur = q.poll();
                if (cur == n * n) return moves;
                for (int k = cur + 1; k <= Math.min(cur + 6, n * n); k++) {
                    int[] pos = findLocation(k);
                    int next = k;
                    if (board[pos[0]][pos[1]] != -1) next = board[pos[0]][pos[1]];

                    if (!visited[next]) {
                        visited[next] = true;
                        q.offer(next);
                    }
                }
            }
            moves++;
        }
        return -1;
    }

    public int[] findLocation(int value) {
        int row = (value - 1) / n;
        int col = (value - 1) % n;
        if (row % 2 == 1) col = n - 1 - col;
        return new int[]{n - 1 - row, col};
    }
}

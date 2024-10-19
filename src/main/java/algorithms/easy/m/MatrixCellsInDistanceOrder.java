//https://leetcode.com/problems/matrix-cells-in-distance-order/
package algorithms.easy.m;

import java.util.LinkedList;
import java.util.Queue;

public class MatrixCellsInDistanceOrder {
    public static void main(String[] args) {
        MatrixCellsInDistanceOrder distanceOrder = new MatrixCellsInDistanceOrder();
        System.out.println("Output:\t" + distanceOrder.allCellsDistOrder(1, 2, 0, 0));
        System.out.println("Output:\t" + distanceOrder.allCellsDistOrder(2, 2, 0, 1));
        System.out.println("Output:\t" + distanceOrder.allCellsDistOrder(2, 3, 1, 2));
    }

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{rCenter, cCenter});
        boolean[][] visited = new boolean[rows][cols];
        visited[rCenter][cCenter] = true;
        int[][] answer = new int[rows * cols][2];
        int[] dirs = new int[]{-1, 0, 1, 0, -1};
        int index = 0;
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; size--) {
                int[] point = q.poll();
                answer[index++] = point;

                for (int k = 0; k < 4; k++) {
                    int x = point[0] + dirs[k];
                    int y = point[1] + dirs[k + 1];

                    if (x >= 0 && y >= 0 && x < rows && y < cols && !visited[x][y]) {
                        visited[x][y] = true;
                        q.offer(new int[]{x, y});
                    }
                }
            }
        }
        return answer;
    }
}

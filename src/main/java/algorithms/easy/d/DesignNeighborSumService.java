//https://leetcode.com/problems/design-neighbor-sum-service/
package algorithms.easy.d;

import java.util.HashMap;
import java.util.Map;

public class DesignNeighborSumService {
    public static void main(String[] args) {
        NeighborSum ex1 = new NeighborSum(new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}});
        System.out.println("Output:\t" + ex1.adjacentSum(1));
        System.out.println("Output:\t" + ex1.adjacentSum(4));
        System.out.println("Output:\t" + ex1.diagonalSum(4));
        System.out.println("Output:\t" + ex1.diagonalSum(8));
        NeighborSum ex2 = new NeighborSum(new int[][]{{1, 2, 0, 3}, {4, 7, 15, 6}, {8, 9, 10, 11}, {12, 13, 14, 5}});
        System.out.println("Output:\t" + ex2.adjacentSum(15));
        System.out.println("Output:\t" + ex2.diagonalSum(9));
    }
}

class NeighborSum {
    int[][] grid;
    Map<Integer, int[]> map = new HashMap<>();

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                map.putIfAbsent(grid[i][j], new int[]{i, j});
            }
        }
    }

    public int adjacentSum(int value) {
        int[] index = map.get(value);
        int row = index[0];
        int col = index[1];
        int sum = 0;
        if (row - 1 >= 0) sum += grid[row - 1][col];
        if (row + 1 <= grid.length - 1) sum += grid[row + 1][col];
        if (col - 1 >= 0) sum += grid[row][col - 1];
        if (col + 1 <= grid.length - 1) sum += grid[row][col + 1];
        return sum;
    }

    public int diagonalSum(int value) {
        int[] index = map.get(value);
        int row = index[0];
        int col = index[1];
        int sum = 0;
        if (row - 1 >= 0 && col - 1 >= 0) sum += grid[row - 1][col - 1];
        if (row + 1 <= grid.length - 1 && col + 1 <= grid.length - 1) sum += grid[row + 1][col + 1];
        if (row + 1 <= grid.length - 1 && col - 1 >= 0) sum += grid[row + 1][col - 1];
        if (row - 1 >= 0 && col + 1 <= grid.length - 1) sum += grid[row - 1][col + 1];
        return sum;
    }

}
//https://leetcode.com/problems/shift-2d-grid/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {
        Shift2DGrid shift = new Shift2DGrid();
        System.out.println("Output:\t" + shift.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
        System.out.println(
                "Output:\t" + shift.shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}},
                        4));
        System.out.println("Output:\t" + shift.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9));
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> shifted = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows * cols;
        k = k % total;

        for (int row = 0; row < rows; row++) {
            List<Integer> curr = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                int flatIndex = (row * cols + col - k + total) % total;
                int num = grid[flatIndex / cols][flatIndex % cols];
                curr.add(num);
            }
            shifted.add(curr);
        }

        return shifted;
    }
}

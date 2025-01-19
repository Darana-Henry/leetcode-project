//https://leetcode.com/problems/zigzag-grid-traversal-with-skip/
package algorithms.easy.z;

import java.util.ArrayList;
import java.util.List;

public class ZigzagGridTraversalWithSkip {
    public static void main(String[] args) {
        ZigzagGridTraversalWithSkip obj = new ZigzagGridTraversalWithSkip();
        System.out.println("Output:\t" + obj.zigzagTraversal(new int[][]{{1, 2}, {3, 4}}));
        System.out.println("Output:\t" + obj.zigzagTraversal(new int[][]{{2, 1}, {2, 1}, {2, 1}}));
        System.out.println("Output:\t" + obj.zigzagTraversal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> answer = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;

        for (int row = 0; row < rows; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < cols; col++)
                    if ((row + col) % 2 == 0) answer.add(grid[row][col]);

            } else {
                for (int col = cols - 1; col >= 0; col--)
                    if ((row + col) % 2 == 0) answer.add(grid[row][col]);

            }
        }

        return answer;
    }
}

package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix spiral = new SpiralMatrix();
        System.out.println("Output:\t" + spiral.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println("Output:\t" + spiral.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        if (matrix == null)
            return answer;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowDirection = new int[]{0, 1, 0, -1};
        int[] colDirection = new int[]{1, 0, -1, 0};

        int row = 0;
        int col = 0;
        int direction = 0;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = rows * cols; i > 0; --i) {
            answer.add(matrix[row][col]);
            visited[row][col] = true;
            int rowNext = row + rowDirection[direction];
            int colNext = col + colDirection[direction];
            if (rowNext < 0 || rowNext >= rows || colNext < 0 || colNext >= cols || visited[rowNext][colNext]) {
                direction = (direction + 1) % 4;
                rowNext = row + rowDirection[direction];
                colNext = col + colDirection[direction];
            }

            row = rowNext;
            col = colNext;
        }

        return answer;
    }
}

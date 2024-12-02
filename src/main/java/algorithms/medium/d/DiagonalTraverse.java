//https://leetcode.com/problems/diagonal-traverse/description/
package algorithms.medium.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DiagonalTraverse {
    public static void main(String[] args) {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        System.out.println(
                "Output:\t" + diagonalTraverse.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println("Output:\t" + diagonalTraverse.findDiagonalOrder(new int[][]{{1, 2}, {3, 4}}));
    }

    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length, cols = mat[0].length, index = 0;
        int[] answer = new int[rows * cols];

        for (int i = 0; i < rows + cols - 1; i++) {
            List<Integer> list = new ArrayList<>();
            int row = i < cols ? 0 : i - cols + 1;
            int col = i < cols ? i : cols - 1;

            while (row < rows && col >= 0) {
                list.add(mat[row][col]);
                row++;
                col--;
            }

            if (i % 2 == 0) Collections.reverse(list);

            for (int val : list)
                answer[index++] = val;
        }

        return answer;
    }
}

//https://leetcode.com/problems/row-with-maximum-ones/
package algorithms.easy.r;

public class RowWithMaximumOnes {
    public static void main(String[] args) {
        RowWithMaximumOnes maximum = new RowWithMaximumOnes();
        System.out.println("Output:\t" + maximum.rowAndMaximumOnes(new int[][]{{0, 1}, {1, 0}}));
        System.out.println("Output:\t" + maximum.rowAndMaximumOnes(new int[][]{{0, 0, 0}, {0, 1, 1}}));
        System.out.println("Output:\t" + maximum.rowAndMaximumOnes(new int[][]{{0, 0}, {1, 1}, {0, 0}}));
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int answer = 0, max = 0;
        int rows = mat.length;
        int cols = mat[0].length;

        for (int row = 0; row < rows; row++) {
            int current = 0;

            for (int col = 0; col < cols; col++)
                current += mat[row][col];

            if (max < current) {
                max = current;
                answer = row;
            }
        }
        return new int[]{answer, max};
    }
}

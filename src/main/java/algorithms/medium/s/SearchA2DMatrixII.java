//https://leetcode.com/problems/search-a-2d-matrix-ii/
package algorithms.medium.s;

public class SearchA2DMatrixII {
    public static void main(String[] args) {
        SearchA2DMatrixII search = new SearchA2DMatrixII();
        System.out.println("Output:\t" + search.searchMatrix(
                new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}},
                5));
        System.out.println("Output:\t" + search.searchMatrix(
                new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}},
                20));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (matrix[row][col] == target) return true;
            if (matrix[row][col] > target) row--;
            else col++;
        }

        return false;
    }
}

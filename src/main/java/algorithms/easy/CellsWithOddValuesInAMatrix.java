//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
package algorithms.easy;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        CellsWithOddValuesInAMatrix odds = new CellsWithOddValuesInAMatrix();
        System.out.println("Output:\t" + odds.oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
        System.out.println("Output:\t" + odds.oddCells(2, 2, new int[][]{{1, 1}, {0, 0}}));
        System.out.println("Output:\t" + odds.oddCellsOptimized(2, 3, new int[][]{{0, 1}, {1, 1}}));
        System.out.println("Output:\t" + odds.oddCellsOptimized(2, 2, new int[][]{{1, 1}, {0, 0}}));
    }

    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            for (int i = 0; i < n; i++)
                matrix[row][i]++;

            for (int i = 0; i < m; i++)
                matrix[i][col]++;

        }

        int odds = 0;
        for (int[] row : matrix)
            for (int num : row)
                if (num % 2 == 1) odds++;

        return odds;
    }
    public int oddCellsOptimized(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            rows[row]++;
            cols[col]++;
        }

        int odds = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if ((rows[i] + cols[j]) % 2 != 0)
                    odds++;

        return odds;
    }
}

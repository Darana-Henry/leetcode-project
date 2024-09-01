//https://leetcode.com/problems/convert-1d-array-into-2d-array/
package algorithms.easy;

public class Convert1DArrayInto2DArray {
    public static void main(String[] args) {
        Convert1DArrayInto2DArray convert = new Convert1DArrayInto2DArray();
        System.out.println("Output:\t" + convert.construct2DArrayOptimized(new int[]{1, 2, 3, 4}, 2, 2));
        System.out.println("Output:\t" + convert.construct2DArray(new int[]{1, 2, 3}, 1, 3));
        System.out.println("Output:\t" + convert.construct2DArray(new int[]{1, 2}, 1, 1));
    }

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[][]{};
        int[][] twoDArray = new int[m][n];
        int index = 0;
        while (index < m * n) {
            int row = index / n;
            int col = index % n;
            twoDArray[row][col] = original[index];
            index++;
        }
        return twoDArray;
    }

    public int[][] construct2DArrayOptimized(int[] original, int m, int n) {
        if (m * n != original.length) return new int[][]{};
        int[][] twoDArray = new int[m][n];
        for (int row = 0; row < m; ++row) {
            for (int column = 0; column < n; ++column)
                twoDArray[row][column] = original[row * n + column];
        }
        return twoDArray;
    }
}

//https://leetcode.com/problems/first-completely-painted-row-or-column/
package algorithms.medium.f;

import java.util.HashMap;

public class FirstCompletelyPaintedRowOrColumn {
    public static void main(String[] args) {
        FirstCompletelyPaintedRowOrColumn obj = new FirstCompletelyPaintedRowOrColumn();
        System.out.println("Output:\t" + obj.firstCompleteIndex(new int[]{1, 3, 4, 2}, new int[][]{{1, 4}, {2, 3}}));
        System.out.println("Output:\t" + obj.firstCompleteIndex(new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9},
                new int[][]{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}}));
    }

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] rCount = new int[rows];
        int[] cCount = new int[cols];
        HashMap<Integer, int[]> map = new HashMap<>();

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                map.put(mat[row][col], new int[]{row, col});

        for (int i = 0; ; ++i) {
            int[] position = map.get(arr[i]);
            int r = position[0];
            int c = position[1];
            rCount[r]++;
            cCount[c]++;

            if (rCount[r] == cols || cCount[c] == rows) return i;
        }
    }
}

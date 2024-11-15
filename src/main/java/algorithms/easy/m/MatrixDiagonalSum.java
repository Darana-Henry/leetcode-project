//https://leetcode.com/problems/matrix-diagonal-sum/
package algorithms.easy.m;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        MatrixDiagonalSum diagonal = new MatrixDiagonalSum();
        System.out.println("Output:\t" + diagonal.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println("Output:\t" + diagonal.diagonalSum(
                new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
        System.out.println("Output:\t" + diagonal.diagonalSum(new int[][]{{5}}));
    }

    public int diagonalSum(int[][] mat) {
        int answer = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int mirror = n - i - 1;
            answer += mat[i][i];
            if (i != mirror) answer += mat[i][mirror];
        }
        return answer;
    }
}

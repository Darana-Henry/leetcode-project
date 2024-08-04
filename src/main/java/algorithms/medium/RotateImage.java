//https://leetcode.com/problems/rotate-image/
package algorithms.medium;

public class RotateImage {
    public static void main(String[] args) {
        RotateImage rotate = new RotateImage();
        rotate.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        rotate.rotate(new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}});
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for (int[] arr : matrix) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}

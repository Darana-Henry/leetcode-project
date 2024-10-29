//https://leetcode.com/problems/search-a-2d-matrix/
package algorithms.medium.s;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        SearchA2DMatrix search = new SearchA2DMatrix();
        System.out.println(
                "Output:\t" + search.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        System.out.println(
                "Output:\t" + search.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            if (matrix[row][col] >= target) right = mid;
            else left = mid + 1;
        }
        return matrix[left / cols][left % cols] == target;
    }
}

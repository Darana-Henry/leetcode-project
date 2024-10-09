//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
package algorithms.easy.c;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        CountNegativeNumbersInASortedMatrix negative = new CountNegativeNumbersInASortedMatrix();
        System.out.println("Output:\t" + negative.countNegatives(
                new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        System.out.println("Output:\t" + negative.countNegatives(new int[][]{{3, 2}, {1, 0}}));
        System.out.println("Output:\t" + negative.countNegativesOptimized(
                new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        System.out.println("Output:\t" + negative.countNegativesOptimized(new int[][]{{3, 2}, {1, 0}}));
    }

    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int answer = 0;
        int currNegative = cols - 1;

        for (int row = 0; row < rows; row++) {
            if (grid[row][0] < 0) {
                answer += cols;
                continue;
            }

            if (grid[row][cols - 1] > 0) continue;

            int l = 0;
            int r = currNegative;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (grid[row][m] < 0) r = m - 1;
                else l = m + 1;
            }

            answer += (cols - l);
            currNegative = l;

        }
        return answer;
    }

    public int countNegativesOptimized(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int answer = 0;

        for (int row = rows - 1, col = 0; row >= 0 && col < cols; ) {
            if (grid[row][col] < 0) {
                answer += cols - col;
                row--;
            } else col++;
        }

        return answer;
    }
}

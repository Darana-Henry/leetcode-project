//https://leetcode.com/problems/count-servers-that-communicate/
package algorithms.medium.c;

public class CountNumberOfMaximumBitwiseORSubsets {
    public static void main(String[] args) {
        CountNumberOfMaximumBitwiseORSubsets obj = new CountNumberOfMaximumBitwiseORSubsets();
        System.out.println("Output:\t" + obj.countServers(new int[][]{{1, 0}, {0, 1}}));
        System.out.println("Output:\t" + obj.countServers(new int[][]{{1, 0}, {1, 1}}));
        System.out.println(
                "Output:\t" + obj.countServers(new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
    }

    public int countServers(int[][] grid) {
        int answer = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[] rc = new int[rows];
        int[] cc = new int[cols];

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                if (grid[row][col] == 1) {
                    rc[row]++;
                    cc[col]++;
                }

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                if (grid[row][col] == 1 && (rc[row] > 1 || cc[col] > 1)) answer++;

        return answer;

    }
}

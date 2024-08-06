//https://leetcode.com/problems/edit-distance/
package algorithms.medium;

public class EditDistance {
    public static void main(String[] args) {
        EditDistance distance = new EditDistance();
        System.out.println("Output:\t" + distance.minDistance("horse", "ros"));
        System.out.println("Output:\t" + distance.minDistance("intention", "execution"));
    }

    public int minDistance(String word1, String word2) {
        int rows = word1.length();
        int cols = word2.length();
        int[][] answer = new int[rows + 1][cols + 1];

        for (int col = 0; col <= cols; col++)
            answer[0][col] = col;
        for (int row = 0; row <= rows; row++)
            answer[row][0] = row;

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (word1.charAt(row - 1) == word2.charAt(col - 1)) answer[row][col] = answer[row - 1][col - 1];
                else {
                    int topLeft = answer[row - 1][col - 1];
                    int left = answer[row][col - 1];
                    int top = answer[row - 1][col];
                    answer[row][col] = Math.min(Math.min(topLeft, left), top) + 1;
                }
            }
        }

        return answer[rows][cols];
    }
}

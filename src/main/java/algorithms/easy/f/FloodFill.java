//https://leetcode.com/problems/flood-fill/
package algorithms.easy.f;

public class FloodFill {
    int[][] image;
    int color;
    int original;
    int[] dir = new int[]{-1, 0, 1, 0, -1};

    public static void main(String[] args) {
        FloodFill floodFill = new FloodFill();
        System.out.println("Output:\t" + floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
        System.out.println("Output:\t" + floodFill.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        this.color = color;
        this.original = image[sr][sc];
        dfs(sr, sc);
        return image;
    }

    public void dfs(int row, int col) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length || image[row][col] != original || image[row][col] == color)
            return;

        image[row][col] = color;

        for (int i = 0; i < 4; i++)
            dfs(row + dir[i], col + dir[i + 1]);

    }
}

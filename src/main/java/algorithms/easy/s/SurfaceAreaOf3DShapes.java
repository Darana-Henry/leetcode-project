//https://leetcode.com/problems/surface-area-of-3d-shapes/
package algorithms.easy.s;

public class SurfaceAreaOf3DShapes {
    public static void main(String[] args) {
        SurfaceAreaOf3DShapes surface = new SurfaceAreaOf3DShapes();
        System.out.println("Output:\t" + surface.surfaceArea(new int[][]{{1, 2}, {3, 4}}));
        System.out.println("Output:\t" + surface.surfaceArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}));
        System.out.println("Output:\t" + surface.surfaceArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}));
    }

    public int surfaceArea(int[][] grid) {
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 0) answer += 2 + grid[i][j] * 4;
                if (i > 0) answer -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                if (j > 0) answer -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
            }
        }
        return answer;
    }
}

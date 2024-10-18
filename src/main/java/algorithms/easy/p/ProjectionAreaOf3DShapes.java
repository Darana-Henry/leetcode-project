//https://leetcode.com/problems/projection-area-of-3d-shapes/
package algorithms.easy.p;

public class ProjectionAreaOf3DShapes {
    public static void main(String[] args) {
        ProjectionAreaOf3DShapes projection = new ProjectionAreaOf3DShapes();
        System.out.println("Output:\t" + projection.projectionArea(new int[][]{{1, 2}, {3, 4}}));
        System.out.println("Output:\t" + projection.projectionArea(new int[][]{{2}}));
        System.out.println("Output:\t" + projection.projectionArea(new int[][]{{1, 0}, {0, 2}}));
    }

    public int projectionArea(int[][] grid) {
        int areaXY = 0, areaYZ = 0, areaZX = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxYZ = 0, maxZX = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 0) areaXY++;
                maxYZ = Math.max(maxYZ, grid[i][j]);
                maxZX = Math.max(maxZX, grid[j][i]);
            }
            areaYZ += maxYZ;
            areaZX += maxZX;
        }
        return areaXY + areaYZ + areaZX;
    }
}

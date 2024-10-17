//https://leetcode.com/problems/largest-triangle-area/
package algorithms.easy.l;

public class LargestTriangleArea {
    public static void main(String[] args) {
        LargestTriangleArea tri = new LargestTriangleArea();
        System.out.println("Output:\t" + tri.largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}));
        System.out.println("Output:\t" + tri.largestTriangleArea(new int[][]{{1, 0}, {0, 0}, {0, 1}}));
    }

    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int[] p1 : points) {
            int x1 = p1[0], y1 = p1[1];
            for (int[] p2 : points) {
                int x2 = p2[0], y2 = p2[1];
                for (int[] p3 : points) {
                    int x3 = p3[0], y3 = p3[1];
                    int v1x = x2 - x1, v1y = y2 - y1;
                    int v2x = x3 - x1, v2y = y3 - y1;
                    double area = Math.abs(v1x * v2y - v2x * v1y) / 2.0;
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }
}

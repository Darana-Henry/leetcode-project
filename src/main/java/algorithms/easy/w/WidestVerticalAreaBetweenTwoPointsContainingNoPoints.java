//https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
package algorithms.easy.w;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public static void main(String[] args) {
        WidestVerticalAreaBetweenTwoPointsContainingNoPoints widest = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();
        System.out.println("Output:\t" + widest.maxWidthOfVerticalArea(new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}}));
        System.out.println("Output:\t" + widest.maxWidthOfVerticalArea(
                new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}}));
    }

    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int max = 0;

        for (int i = 1; i < points.length; i++) {
            int width = points[i][0] - points[i - 1][0];
            max = Math.max(max, width);
        }

        return max;
    }
}

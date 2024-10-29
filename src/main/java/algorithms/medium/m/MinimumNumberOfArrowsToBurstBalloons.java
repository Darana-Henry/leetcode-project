//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
package algorithms.medium.m;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons burst = new MinimumNumberOfArrowsToBurstBalloons();
        System.out.println("Output:\t" + burst.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
        System.out.println("Output:\t" + burst.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
        System.out.println("Output:\t" + burst.findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));
    }

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int reach = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > reach) {
                arrows++;
                reach = points[i][1];
            }
        }
        return arrows;
    }
}

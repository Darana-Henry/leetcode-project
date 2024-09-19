//https://leetcode.com/problems/max-points-on-a-line/
package algorithms.hard;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {
    public static void main(String[] args) {
        MaxPointsOnALine maxPoints = new MaxPointsOnALine();
        System.out.println("Output:\t" + maxPoints.maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
        System.out.println(
                "Output:\t" + maxPoints.maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }

    public int maxPoints(int[][] points) {
        int sizeOfPoints = points.length;
        int maxPoints = 1;
        for (int i = 0; i < sizeOfPoints; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            Map<String, Integer> map = new HashMap<>();
            for (int j = i + 1; j < sizeOfPoints; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                int deltaX = x2 - x1;
                int deltaY = y2 - y1;
                int gcd = greatestCommonDivisor(deltaX, deltaY);
                String slope = (deltaX / gcd) + "." + (deltaY / gcd);
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                maxPoints = Math.max(maxPoints, map.get(slope) + 1);
            }
        }
        return maxPoints;
    }

    public int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }
}

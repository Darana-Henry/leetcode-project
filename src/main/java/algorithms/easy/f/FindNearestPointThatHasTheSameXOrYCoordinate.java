//https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
package algorithms.easy.f;

public class FindNearestPointThatHasTheSameXOrYCoordinate {
    public static void main(String[] args) {
        FindNearestPointThatHasTheSameXOrYCoordinate nearest = new FindNearestPointThatHasTheSameXOrYCoordinate();
        System.out.println(
                "Output:\t" + nearest.nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}));
        System.out.println("Output:\t" + nearest.nearestValidPoint(3, 4, new int[][]{{3, 4}}));
        System.out.println("Output:\t" + nearest.nearestValidPoint(3, 4, new int[][]{{2, 3}}));
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int answer = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int curr = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (min > curr) {
                    min = curr;
                    answer = i;
                }
            }
        }

        return answer;
    }
}

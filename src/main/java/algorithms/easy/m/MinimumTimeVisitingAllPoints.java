//https://leetcode.com/problems/minimum-time-visiting-all-points/
package algorithms.easy.m;

public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        MinimumTimeVisitingAllPoints visiting = new MinimumTimeVisitingAllPoints();
        System.out.println("Output:\t" + visiting.minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
        System.out.println("Output:\t" + visiting.minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}}));
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int answer = 0;
        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]);
            int dy = Math.abs(points[i][1] - points[i - 1][1]);
            answer += Math.max(dx, dy);
        }
        return answer;
    }
}

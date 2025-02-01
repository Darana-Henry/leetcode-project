//https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
package algorithms.medium.q;

public class QueriesOnNumberOfPointsInsideACircle {
    public static void main(String[] args) {
        QueriesOnNumberOfPointsInsideACircle obj = new QueriesOnNumberOfPointsInsideACircle();
        System.out.println("Output:\t" + obj.countPoints(new int[][]{{1, 3}, {3, 3}, {5, 3}, {2, 2}},
                new int[][]{{2, 3, 1}, {4, 3, 1}, {1, 1, 2}}));
        System.out.println("Output:\t" + obj.countPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}},
                new int[][]{{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}}));
    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int qrows = queries.length, index = 0;
        int[] answer = new int[qrows];

        for (int[] q : queries) {
            for (int[] p : points) {
                int dx = q[0] - p[0];
                int dy = q[1] - p[1];
                int r = q[2];
                if ((dx * dx + dy * dy) <= (r * r)) answer[index]++;
            }
            index++;
        }

        return answer;

    }
}

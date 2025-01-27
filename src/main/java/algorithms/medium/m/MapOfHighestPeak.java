//https://leetcode.com/problems/map-of-highest-peak/
package algorithms.medium.m;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MapOfHighestPeak {
    public static void main(String[] args) {
        MapOfHighestPeak obj = new MapOfHighestPeak();
        System.out.println("Output:\t" + obj.highestPeak(new int[][]{{0, 1}, {0, 0}}));
        System.out.println("Output:\t" + obj.highestPeak(new int[][]{{0, 0, 1}, {1, 0, 0}, {0, 0, 0}}));
    }

    public int[][] highestPeak(int[][] isWater) {
        int rows = isWater.length;
        int cols = isWater[0].length;
        int[][] answer = new int[rows][cols];
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();

        for (int[] ans : answer)
            Arrays.fill(ans, -1);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (isWater[row][col] == 1) {
                    answer[row][col] = 0;
                    q.add(new int[]{row, col});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] data = q.poll();

            for (int[] dir : dirs) {
                int nr = data[0] + dir[0];
                int nc = data[1] + dir[1];

                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && answer[nr][nc] == -1) {
                    answer[nr][nc] = answer[data[0]][data[1]] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        return answer;
    }
}

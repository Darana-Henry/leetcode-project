//https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/
package algorithms.medium;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    public static void main(String[] args) {
        NearestExitFromEntranceInMaze nearestExit = new NearestExitFromEntranceInMaze();
        System.out.println("Output:\t" + nearestExit.nearestExit(
                new char[][]{{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}}, new int[]{1, 2}));
        System.out.println(
                "Output:\t" + nearestExit.nearestExit(new char[][]{{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}},
                        new int[]{1, 0}));
        System.out.println("Output:\t" + nearestExit.nearestExit(new char[][]{{'.', '+'}}, new int[]{0, 0}));
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(entrance);

        int level = 0;
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;

        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        while (!q.isEmpty()) {
            level++;
            int size = q.size();

            while (size-- > 0) {
                int[] coordinates = q.poll();

                for (int j = 0; j < 4; j++) {
                    int[] dir = dirs[j];
                    int nextR = coordinates[0] + dir[0];
                    int nextC = coordinates[1] + dir[1];

                    if (nextR >= 0 && nextC >= 0 && nextR < maze.length && nextC < maze[0].length
                            && maze[nextR][nextC] == '.' && !visited[nextR][nextC]) {
                        if (nextR == 0 || nextC == 0 || nextR == maze.length - 1 || nextC == maze[0].length - 1) {
                            return level;
                        }
                        visited[nextR][nextC] = true;
                        q.offer(new int[]{nextR, nextC});
                    }
                }
            }
        }
        return -1;
    }
}

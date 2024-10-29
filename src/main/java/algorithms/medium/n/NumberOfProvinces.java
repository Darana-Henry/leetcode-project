//https://leetcode.com/problems/number-of-provinces/
package algorithms.medium.n;

import java.util.Arrays;

public class NumberOfProvinces {
    public static void main(String[] args) {
        NumberOfProvinces provinces = new NumberOfProvinces();
        System.out.println("Output:\t" + provinces.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println("Output:\t" + provinces.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        Arrays.fill(visited, false);
        int provinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                depthFirstSearch(isConnected, visited, i);
                provinces++;
            }
        }
        return provinces;
    }

    public void depthFirstSearch(int[][] isConnected, boolean[] visited, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                depthFirstSearch(isConnected, visited, j);
            }
        }
    }
}

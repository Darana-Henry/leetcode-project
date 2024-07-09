//https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public static void main(String[] args) {
        ReorderRoutesToMakeAllPathsLeadToTheCityZero reorderRoutes = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        System.out.println(
                "Output:\t" + reorderRoutes.minReorder(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}));
        System.out.println("Output:\t" + reorderRoutes.minReorder(5, new int[][]{{1, 0}, {1, 2}, {3, 2}, {3, 4}}));
        System.out.println("Output:\t" + reorderRoutes.minReorder(3, new int[][]{{1, 0}, {2, 0}}));
    }

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> pathways = new ArrayList<>();
        for (int i = 0; i < n; i++)
            pathways.add(new ArrayList<Integer>());


        for (int[] connection : connections) {
            pathways.get(connection[0]).add(connection[1]);
            pathways.get(connection[1]).add(-connection[0]);
        }

        return dfs(pathways, new boolean[n], 0);
    }

    public int dfs(List<List<Integer>> pathways, boolean[] visited, int root) {
        int count = 0;
        visited[root] = true;
        for (int to : pathways.get(root)) {
            if (!visited[Math.abs(to)])
                count += dfs(pathways, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
        }
        return count;
    }
}

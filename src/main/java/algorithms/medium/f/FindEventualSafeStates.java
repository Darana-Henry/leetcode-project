//https://leetcode.com/problems/find-eventual-safe-states/
package algorithms.medium.f;

import java.util.ArrayList;
import java.util.List;

public class FindEventualSafeStates {
    public static void main(String[] args) {
        FindEventualSafeStates obj = new FindEventualSafeStates();
        System.out.println("Output:\t" + obj.eventualSafeNodes(new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}}));
        System.out.println("Output:\t" + obj.eventualSafeNodes(new int[][]{{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}}));
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> answer = new ArrayList<>();
        int[] status = new int[n];

        if (graph == null || graph.length == 0) return answer;

        for (int i = 0; i < n; i++)
            if (dfs(graph, i, status)) answer.add(i);

        return answer;
    }

    public boolean dfs(int[][] graph, int start, int[] status) {
        if (status[start] != 0) return status[start] == 1;
        status[start] = 2;

        for (int num : graph[start])
            if (!dfs(graph, num, status)) return false;

        status[start] = 1;
        return true;
    }
}

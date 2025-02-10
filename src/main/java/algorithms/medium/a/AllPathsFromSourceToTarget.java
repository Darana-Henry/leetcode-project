//https://leetcode.com/problems/all-paths-from-source-to-target/
package algorithms.medium.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        AllPathsFromSourceToTarget obj = new AllPathsFromSourceToTarget();
        System.out.println("Output:\t" + obj.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}}));
        System.out.println("Output:\t" + obj.allPathsSourceTarget(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}}));
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int target = graph.length - 1;
        List<List<Integer>> answer = new ArrayList<>();
        Queue<List<Integer>> q = new LinkedList<>();
        q.offer(List.of(0));

        while (!q.isEmpty()) {
            List<Integer> curr = q.poll();
            int prev = curr.get(curr.size() - 1);

            if (prev == target) answer.add(curr);
            else {
                for (int g : graph[prev]) {
                    List<Integer> list = new ArrayList(curr);
                    list.add(g);
                    q.offer(list);
                }
            }
        }
        return answer;
    }
}

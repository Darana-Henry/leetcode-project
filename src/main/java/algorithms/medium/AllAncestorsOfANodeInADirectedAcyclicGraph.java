//https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/description/
package algorithms.medium;

import java.util.*;

public class AllAncestorsOfANodeInADirectedAcyclicGraph {
    public static void main(String[] args) {
        AllAncestorsOfANodeInADirectedAcyclicGraph ancestors = new AllAncestorsOfANodeInADirectedAcyclicGraph();
        System.out.println("Output:\t" + ancestors.getAncestors(8,
                new int[][]{{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}}));
        System.out.println(
                "Output:\t" + ancestors.getAncestors(5,
                        new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}));
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        HashMap<Integer, HashSet<Integer>> parentsToChildren = new HashMap<>();
        int[] noOfParents = new int[n];

        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];

            if (!parentsToChildren.containsKey(parent))
                parentsToChildren.put(parent, new HashSet<>());

            parentsToChildren.get(parent).add(child);
            noOfParents[child]++;
        }

        List<TreeSet<Integer>> childrenToParents = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            childrenToParents.add(new TreeSet<>());

            if (noOfParents[i] == 0)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int currentParent = queue.remove();

            for (int currentChild : parentsToChildren.getOrDefault(currentParent, new HashSet<>())) {
                childrenToParents.get(currentChild).add(currentParent);
                childrenToParents.get(currentChild).addAll(childrenToParents.get(currentParent));
                noOfParents[currentChild]--;

                if (noOfParents[currentChild] == 0)
                    queue.offer(currentChild);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            result.add(new ArrayList<>(childrenToParents.get(i)));

        return result;
    }
}

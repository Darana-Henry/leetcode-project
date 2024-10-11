//https://leetcode.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/description/
package algorithms.hard.r;

import context.DisjointSetUnion;

import java.util.Arrays;

public class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {
    public static void main(String[] args) {
        RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable removeEdges = new RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable();
        System.out.println("Output:\t" + removeEdges.maxNumEdgesToRemove(4,
                new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}}));
        System.out.println("Output:\t" + removeEdges.maxNumEdgesToRemove(4,
                new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}}));
        System.out.println("Output:\t" + removeEdges.maxNumEdgesToRemove(4,
                new int[][]{{3, 2, 3}, {1, 1, 2}, {2, 3, 4}}));
    }

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (v1, v2) -> v2[0] - v1[0]);
        DisjointSetUnion Alice = new DisjointSetUnion(n);
        DisjointSetUnion Bob = new DisjointSetUnion(n);

        int addedEdge = 0;

        for (int[] edge : edges) {
            int type = edge[0];
            int u = edge[1];
            int v = edge[2];

            if (type == 3) {
                boolean add = false;

                if (Alice.find(u) != Alice.find(v)) {
                    Alice.union(u, v);
                    add = true;
                }

                if (Bob.find(u) != Bob.find(v)) {
                    Bob.union(u, v);
                    add = true;
                }

                if (add)
                    addedEdge++;

            } else if (type == 2) {
                if (Bob.find(u) != Bob.find(v)) {
                    Bob.union(u, v);
                    addedEdge++;
                }
            } else {
                if (Alice.find(u) != Alice.find(v)) {
                    Alice.union(u, v);
                    addedEdge++;
                }
            }
        }

        if (Alice.isSingle() && Bob.isSingle()) {
            return edges.length - addedEdge;
        }

        return -1;
    }
}

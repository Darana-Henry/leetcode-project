//https://leetcode.com/problems/redundant-connection/
package algorithms.medium.r;

public class RedundantConnection {
    int[] parent;

    public static void main(String[] args) {
        RedundantConnection obj = new RedundantConnection();
        System.out.println("Output:\t" + obj.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}}));
        System.out.println(
                "Output:\t" + obj.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}));

    }


    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[1010];

        for (int i = 0; i < parent.length; i++)
            parent[i] = i;

        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];

            if (find(node1) == find(node2)) return edge;

            parent[find(node1)] = find(node2);
        }

        return null;
    }

    public int find(int node) {
        if (parent[node] != node) parent[node] = find(parent[node]);
        return parent[node];
    }
}

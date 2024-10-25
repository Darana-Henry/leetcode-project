//https://leetcode.com/problems/find-if-path-exists-in-graph/
package algorithms.easy.f;

public class FindIfPathExistsInGraph {
    int[] parent;

    public static void main(String[] args) {
        FindIfPathExistsInGraph path = new FindIfPathExistsInGraph();
        System.out.println("Output:\t" + path.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
        System.out.println("Output:\t" + path.validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5));
    }


    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];

        for (int i = 0; i < n; i++)
            parent[i] = i;

        for (int[] edge : edges)
            parent[find(edge[0])] = find(edge[1]);

        return find(source) == find(destination);
    }

    public int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);

        return parent[x];
    }
}

//https://leetcode.com/problems/find-center-of-star-graph/description/
package algorithms.easy;

public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        FindCenterOfStarGraph findCenter = new FindCenterOfStarGraph();
        System.out.println("Output:\t" + findCenter.findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}}));
        System.out.println("Output:\t" + findCenter.findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}}));
    }

    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}

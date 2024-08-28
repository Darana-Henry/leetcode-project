//https://leetcode.com/problems/construct-quad-tree/
package algorithms.medium;

import context.Node;

public class ConstructQuadTree {
    public static void main(String[] args) {
        ConstructQuadTree construct = new ConstructQuadTree();
        System.out.println("Output:\t" + construct.construct(new int[][]{{0, 1}, {1, 0}}));
        System.out.println("Output:\t" + construct.construct(
                new int[][]{{1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}}));
    }

    public Node construct(int[][] grid) {
        return new Node();
    }
}

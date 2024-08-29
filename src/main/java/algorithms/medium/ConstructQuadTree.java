//https://leetcode.com/problems/construct-quad-tree/
package algorithms.medium;

import context.QuadTree;

public class ConstructQuadTree {
    public static void main(String[] args) {
        ConstructQuadTree construct = new ConstructQuadTree();
        System.out.println("Output:\t" + construct.construct(new int[][]{{0, 1}, {1, 0}}));
        System.out.println("Output:\t" + construct.construct(
                new int[][]{{1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}}));
    }

    public QuadTree construct(int[][] grid) {
        return build(0, 0, grid.length - 1, grid[0].length - 1, grid);
    }

    public QuadTree build(int rTopLeft, int cTopLeft, int rBottomRight, int cBottomRight, int[][] grid) {
        int countZ = 0;
        int countO = 0;
        for (int row = rTopLeft; row <= rBottomRight; row++) {
            for (int col = cTopLeft; col <= cBottomRight; col++) {
                if (grid[row][col] == 0) countZ = 1;
                else countO = 1;
                if (countZ + countO == 2) break;
            }
        }
        boolean isLeaf = (countZ + countO) == 1;
        boolean val = isLeaf && (countO == 1);
        QuadTree node = new QuadTree(val, isLeaf);

        if (!isLeaf) {
            int midRow = (rTopLeft + rBottomRight) / 2;
            int midCol = (cTopLeft + cBottomRight) / 2;
            node.topLeft = build(rTopLeft, cTopLeft, midRow, midCol, grid);
            node.topRight = build(rTopLeft, midCol + 1, midRow, cBottomRight, grid);
            node.bottomLeft = build(midRow + 1, cTopLeft, rBottomRight, midCol, grid);
            node.bottomRight = build(midRow + 1, midCol + 1, rBottomRight, cBottomRight, grid);
        }

        return node;
    }
}

//https://leetcode.com/problems/leaf-similar-trees/description/
package algorithms.easy;

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        LeafSimilarTrees similarTrees = new LeafSimilarTrees();

        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        System.out.println("Output:\t" + similarTrees.leafSimilar(root1, root2));

        TreeNode root3 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));
        TreeNode root4 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));
        System.out.println("Output:\t" + similarTrees.leafSimilar(root3, root4));

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leavesOfOne = new ArrayList<>();
        List<Integer> leavesOfTwo = new ArrayList<>();

        depthFirstSearch(root1, leavesOfOne);
        depthFirstSearch(root2, leavesOfTwo);

        return leavesOfOne.equals(leavesOfTwo);
    }

    private static void depthFirstSearch(TreeNode root, List<Integer> leaves) {
        if (root != null) {
            if (root.left == null && root.right == null) leaves.add(root.val);
            depthFirstSearch(root.left, leaves);
            depthFirstSearch(root.right, leaves);
        }
    }
}

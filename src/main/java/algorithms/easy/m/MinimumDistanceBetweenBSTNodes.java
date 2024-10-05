//https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/
package algorithms.easy.m;

import context.TreeNode;

public class MinimumDistanceBetweenBSTNodes {
    public static void main(String[] args) {
        MinimumDistanceBetweenBSTNodes minDist = new MinimumDistanceBetweenBSTNodes();
        System.out.println("Output:\t" + minDist.minDiffInBST(
                new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6))));
        System.out.println("Output:\t" + minDist.minDiffInBST(
                new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12), new TreeNode(49)))));
    }

    int output = Integer.MAX_VALUE;
    TreeNode previous = null;

    public int minDiffInBST(TreeNode root) {
        if (root == null) return output;

        minDiffInBST(root.left);

        if (previous != null) output = Math.min(output, root.val - previous.val);

        if (root != null) previous = root;

        minDiffInBST(root.right);
        return output;
    }

}

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
package algorithms.easy;

import context.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInBST minDiff = new MinimumAbsoluteDifferenceInBST();
        System.out.println("Output:\t" + minDiff.getMinimumDifference(
                new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6))));
        System.out.println("Output:\t" + minDiff.getMinimumDifference(
                new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12), new TreeNode(49)))));
    }

    int output = Integer.MAX_VALUE;
    TreeNode previous = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return output;

        getMinimumDifference(root.left);

        if (previous != null) output = Math.min(output, root.val - previous.val);

        if (root != null) previous = root;

        getMinimumDifference(root.right);
        return output;
    }
}

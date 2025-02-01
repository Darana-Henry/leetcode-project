//https://leetcode.com/problems/binary-tree-pruning/
package algorithms.medium.b;

import context.TreeNode;

public class BinaryTreePruning {
    public static void main(String[] args) {
        BinaryTreePruning obj = new BinaryTreePruning();
        System.out.println("Output:\t" + obj.pruneTree(
                new TreeNode(1, new TreeNode(), new TreeNode(0, new TreeNode(0), new TreeNode(1)))));
        System.out.println("Output:\t" + obj.pruneTree(
                new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(0)),
                        new TreeNode(1, new TreeNode(0), new TreeNode(1)))));
        System.out.println("Output:\t" + obj.pruneTree(
                new TreeNode(1, new TreeNode(1, new TreeNode(1, new TreeNode(0), new TreeNode()), new TreeNode(1)),
                        new TreeNode(0, new TreeNode(0), new TreeNode(1)))));

    }

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return root;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.val == 0 && root.left == null && root.right == null) return null;

        return root;
    }
}

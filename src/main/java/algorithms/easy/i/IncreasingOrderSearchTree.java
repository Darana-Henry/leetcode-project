//https://leetcode.com/problems/increasing-order-search-tree/
package algorithms.easy.i;

import context.TreeNode;

public class IncreasingOrderSearchTree {
    TreeNode prev;

    public static void main(String[] args) {
        IncreasingOrderSearchTree tree = new IncreasingOrderSearchTree();
        System.out.println("Output:\t" + tree.increasingBST(
                new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                        new TreeNode(6, null, new TreeNode(8, new TreeNode(7), new TreeNode(9))))));
        System.out.println("Output:\t" + tree.increasingBST(new TreeNode(5, new TreeNode(1), new TreeNode(7))));
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        prev = dummy;
        inOrderTraversal(root);
        return dummy.right;
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        inOrderTraversal(node.left);
        prev.right = node;
        node.left = null;
        prev = node;

        inOrderTraversal(node.right);
    }
}

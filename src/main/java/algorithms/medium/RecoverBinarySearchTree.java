//https://leetcode.com/problems/recover-binary-search-tree/
package algorithms.medium;

import context.TreeNode;

public class RecoverBinarySearchTree {
    TreeNode prev = null;
    TreeNode one = null;
    TreeNode two = null;

    public static void main(String[] args) {
        RecoverBinarySearchTree recover = new RecoverBinarySearchTree();
        recover.recoverTree(new TreeNode(1, new TreeNode(3, null, new TreeNode(2)), null));
        recover.recoverTree(new TreeNode(3, new TreeNode(1), new TreeNode(4, null, new TreeNode(2))));
    }


    public void recoverTree(TreeNode root) {
        inOrderTraversal(root);
        int temp = one.val;
        one.val = two.val;
        two.val = temp;
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);

        if (prev != null && prev.val > node.val) {
            if (one == null) one = prev;
            two = node;
        }
        prev = node;
        inOrderTraversal(node.right);
    }
}

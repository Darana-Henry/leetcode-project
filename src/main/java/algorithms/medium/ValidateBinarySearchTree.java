//https://leetcode.com/problems/validate-binary-search-tree/
package algorithms.medium;

import context.TreeNode;

public class ValidateBinarySearchTree {
    private Integer previous;

    public static void main(String[] args) {
        ValidateBinarySearchTree validate = new ValidateBinarySearchTree();
        System.out.println(
                "Output:\t" + validate.isValidBSTOptimized(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        System.out.println("Output:\t" + validate.isValidBSTOptimized(
                new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
        System.out.println("Output:\t" + validate.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        System.out.println("Output:\t" + validate.isValidBST(
                new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
    }

    public boolean isValidBSTOptimized(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return isValidBSTHelper(node.left, min, node.val) && isValidBSTHelper(node.right, node.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        previous = null;
        return inOrderTraversal(root);
    }

    public boolean inOrderTraversal(TreeNode node) {
        if (node == null) return true;
        if (!inOrderTraversal(node.left)) return false;
        if (previous != null && previous >= node.val) return false;
        previous = node.val;
        if (!inOrderTraversal(node.right)) return false;
        return true;
    }
}

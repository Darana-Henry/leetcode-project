package algorithms.easy;//https://leetcode.com/problems/balanced-binary-tree/submissions/1249668427/

import context.TreeNode;

public class BalancedBinaryTree {

    public static void main(String[] args) {

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        TreeNode root = new TreeNode(1, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println("Output:\t" + balancedBinaryTree.isBalanced(root));

        TreeNode rooter = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        System.out.println("Output:\t" + balancedBinaryTree.isBalanced(rooter));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else {
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}

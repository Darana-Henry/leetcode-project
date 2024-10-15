//https://leetcode.com/problems/univalued-binary-tree/
package algorithms.easy.u;

import context.TreeNode;

public class UnivaluedBinaryTree {
    public static void main(String[] args) {
        UnivaluedBinaryTree tree = new UnivaluedBinaryTree();
        System.out.println("Output:\t" + tree.isUnivalTree(
                new TreeNode(1, new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                        new TreeNode(1, null, new TreeNode()))));
        System.out.println("Output:\t" + tree.isUnivalTree(
                new TreeNode(2, new TreeNode(2, new TreeNode(5), new TreeNode(2)), new TreeNode(2))));
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return dfs(root, root.val);
    }

    public boolean dfs(TreeNode node, int val) {
        if (node == null) return true;
        return node.val == val && dfs(node.left, val) && dfs(node.right, val);
    }
}

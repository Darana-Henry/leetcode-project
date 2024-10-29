//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
package algorithms.medium.l;

import context.TreeNode;

public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        LowestCommonAncestorOfABinaryTree lca = new LowestCommonAncestorOfABinaryTree();
        System.out.println("Output:\t" + lca.lowestCommonAncestor(
                new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                        new TreeNode(1, new TreeNode(0), new TreeNode(8))), new TreeNode(5), new TreeNode(1)));
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;

        if (left != null) return left;

        return right;
    }
}

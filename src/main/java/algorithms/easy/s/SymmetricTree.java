package algorithms.easy.s;//https://leetcode.com/problems/symmetric-tree/

import context.TreeNode;

public class SymmetricTree {

    public static void main(String[] args) {

        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode exampleOne = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println("Output:\t" + symmetricTree.isSymmetric(exampleOne));

        TreeNode exampleTwo = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        System.out.println("Output:\t" + symmetricTree.isSymmetric(exampleTwo));
    }

    public boolean isSymmetric(TreeNode root) {
        return isSame(root, root);
    }

    public boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return (left.val == right.val)
                && isSame(left.left, right.right)
                && isSame(left.right, right.left);
    }
}

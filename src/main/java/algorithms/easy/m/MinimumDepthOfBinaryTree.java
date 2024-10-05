package algorithms.easy.m;

import context.TreeNode;

public class MinimumDepthOfBinaryTree {

    public static void main(String[] args) {

        MinimumDepthOfBinaryTree minDepth = new MinimumDepthOfBinaryTree();

        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println("Output:\t" + minDepth.minDepth(root));

        TreeNode rooter = new TreeNode(2, null,
                new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        System.out.println("Output:\t" + minDepth.minDepth(root));
    }

    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        if (root.left == null) {
            return 1 + minDepth(root.right);
        } else if (root.right == null)
            return 1 + minDepth(root.left);

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

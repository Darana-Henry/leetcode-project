package algorithms.easy.m;//https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/

import context.TreeNode;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

        MaximumDepthOfBinaryTree maxDepth = new MaximumDepthOfBinaryTree();

        TreeNode exampleOne = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println("Output:\t" + maxDepth.maxDepth(exampleOne));

        TreeNode exampleTwo = new TreeNode(1, null, new TreeNode(2));
        System.out.println("Output:\t" + maxDepth.maxDepth(exampleTwo));
    }

    public int maxDepth(TreeNode root) {
        return depth(root, 1);
    }

    public int depth(TreeNode root, int depth) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return depth;

        int leftDepth = depth(root.left, depth + 1);
        int rightDepth = depth(root.right, depth + 1);

        return Math.max(leftDepth, rightDepth);
    }
}

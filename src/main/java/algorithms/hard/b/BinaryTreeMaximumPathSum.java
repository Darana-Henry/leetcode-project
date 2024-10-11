//https://leetcode.com/problems/binary-tree-maximum-path-sum/
package algorithms.hard.b;

import context.TreeNode;

public class BinaryTreeMaximumPathSum {
    int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        BinaryTreeMaximumPathSum maxSum = new BinaryTreeMaximumPathSum();
        System.out.println("Output:\t" + maxSum.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        System.out.println("Output:\t" + maxSum.maxPathSum(
                new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    public int maxPathSum(TreeNode root) {
        calcSum(root);
        return maxSum;
    }

    public int calcSum(TreeNode node) {
        if (node == null) return 0;
        int leftMax = Math.max(0, calcSum(node.left));
        int rightMax = Math.max(0, calcSum(node.right));
        maxSum = Math.max(maxSum, node.val + leftMax + rightMax);
        return node.val + Math.max(leftMax, rightMax);
    }
}

//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/
package algorithms.medium.l;

import context.TreeNode;

public class LongestZigZagPathInABinaryTree {
    public static void main(String[] args) {
        LongestZigZagPathInABinaryTree zigzag = new LongestZigZagPathInABinaryTree();
        System.out.println("Output:\t" + zigzag.longestZigZag(
                new TreeNode(1, new TreeNode(),
                        new TreeNode(1, new TreeNode(1), new TreeNode(1,
                                new TreeNode(1, new TreeNode(), new TreeNode(1, new TreeNode(), new TreeNode(1))),
                                new TreeNode(1))))));
    }

    public int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;

        int left = helper(root.left, 1, true);
        int right = helper(root.right, 1, false);

        return Math.max(left, right);
    }

    public int helper(TreeNode node, int count, boolean isLeft) {
        if (node == null)
            return count - 1;

        int leftPath;
        int rightPath;

        if (isLeft) {
            leftPath = helper(node.left, 1, true);
            rightPath = helper(node.right, count + 1, false);
        } else {
            leftPath = helper(node.left, count + 1, true);
            rightPath = helper(node.right, 1, false);
        }

        return Math.max(leftPath, rightPath);
    }
}

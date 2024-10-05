package algorithms.easy.p;//https://leetcode.com/problems/path-sum/description/

import context.TreeNode;

public class PathSum {

    public static void main(String[] args) {

        PathSum pathSum = new PathSum();

        TreeNode root = new TreeNode(1, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        System.out.println("Output:\t" + pathSum.hasPathSum(root, 22));

        TreeNode rooter = new TreeNode(1, new TreeNode(3), new TreeNode(3));
        System.out.println("Output:\t" + pathSum.hasPathSum(rooter, 5));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        targetSum = targetSum - root.val;

        if (root.left == null && root.right == null)
            return targetSum == 0;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}

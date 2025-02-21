//https://leetcode.com/problems/delete-leaves-with-a-given-value/
package algorithms.medium.d;

import context.TreeNode;

public class DeleteLeavesWithAGivenValue {
    public static void main(String[] args) {
        DeleteLeavesWithAGivenValue obj = new DeleteLeavesWithAGivenValue();
        System.out.println("Output:\t" + obj.removeLeafNodes(
                new TreeNode(1, new TreeNode(2, new TreeNode(2), new TreeNode()),
                        new TreeNode(3, new TreeNode(2), new TreeNode(4))), 2));
        System.out.println("Output:\t" + obj.removeLeafNodes(
                new TreeNode(1, new TreeNode(3, new TreeNode(3), new TreeNode(2)), new TreeNode(3)), 3));
        System.out.println("Output:\t" + obj.removeLeafNodes(
                new TreeNode(1, new TreeNode(2, new TreeNode(2, new TreeNode(2), new TreeNode()), new TreeNode()),
                        new TreeNode()), 2));
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && root.val == target) return null;
        return root;
    }
}

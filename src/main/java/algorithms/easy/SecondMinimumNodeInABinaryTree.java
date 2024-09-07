//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
package algorithms.easy;

import context.TreeNode;

public class SecondMinimumNodeInABinaryTree {
    private int firstMin;
    private int secondMin;

    public static void main(String[] args) {
        SecondMinimumNodeInABinaryTree min2 = new SecondMinimumNodeInABinaryTree();
        System.out.println("Output:\t" + min2.findSecondMinimumValue(
                new TreeNode(2, new TreeNode(2), new TreeNode(5, new TreeNode(5), new TreeNode(7)))));
        System.out.println(
                "Output:\t" + min2.findSecondMinimumValue(new TreeNode(2, new TreeNode(2), new TreeNode(2))));
    }

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        firstMin = root.val;
        secondMin = -1;
        dfs(root);
        return secondMin;
    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        if (node.val > firstMin && (secondMin == -1 || node.val < secondMin)) secondMin = node.val;
        dfs(node.left);
        dfs(node.right);
    }
}

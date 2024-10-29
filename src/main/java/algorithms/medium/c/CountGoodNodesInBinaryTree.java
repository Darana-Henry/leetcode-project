//https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/
package algorithms.medium.c;

import context.TreeNode;

public class CountGoodNodesInBinaryTree {
    private int goodNodes = 0;

    public static void main(String[] args) {
        CountGoodNodesInBinaryTree goodNodes = new CountGoodNodesInBinaryTree();
        System.out.println("Output:\t" + goodNodes.goodNodes(
                new TreeNode(3, new TreeNode(1, new TreeNode(3), new TreeNode()),
                        new TreeNode(4, new TreeNode(1), new TreeNode(5)))));
        System.out.println("Output:\t" + goodNodes.goodNodes(
                new TreeNode(3, new TreeNode(3, new TreeNode(4), new TreeNode(2)), new TreeNode())));
    }

    public int goodNodes(TreeNode root) {
        depthFirstSearch(root, Integer.MIN_VALUE);
        return goodNodes;
    }

    public void depthFirstSearch(TreeNode node, int currentMax) {
        if (node.val >= currentMax)
            goodNodes++;

        if (node.left != null)
            depthFirstSearch(node.left, Math.max(currentMax, node.val));

        if (node.right != null)
            depthFirstSearch(node.right, Math.max(currentMax, node.val));
    }
}

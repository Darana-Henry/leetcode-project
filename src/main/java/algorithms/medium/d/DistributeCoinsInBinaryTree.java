//https://leetcode.com/problems/distribute-coins-in-binary-tree/
package algorithms.medium.d;

import context.TreeNode;

public class DistributeCoinsInBinaryTree {
    int answer;

    public static void main(String[] args) {
        DistributeCoinsInBinaryTree obj = new DistributeCoinsInBinaryTree();
        System.out.println("Output:\t" + obj.distributeCoins(new TreeNode(3, new TreeNode(0), new TreeNode(0))));
        System.out.println("Output:\t" + obj.distributeCoins(new TreeNode(0, new TreeNode(3), new TreeNode(0))));
    }

    public int distributeCoins(TreeNode root) {
        answer = 0;
        postOrder(root);
        return answer;
    }

    public int postOrder(TreeNode node) {
        if (node == null) return 0;
        int left = postOrder(node.left);
        int right = postOrder(node.right);
        answer += Math.abs(left) + Math.abs(right);
        return node.val + left + right - 1;
    }
}

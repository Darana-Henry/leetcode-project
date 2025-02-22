//https://leetcode.com/problems/house-robber-iii/
package algorithms.medium.h;

import context.TreeNode;

public class HouseRobberIII {
    public static void main(String[] args) {
        HouseRobberIII obj = new HouseRobberIII();
        System.out.println("Output:\t" + obj.rob(new TreeNode(3, new TreeNode(2, new TreeNode(), new TreeNode(3)),
                new TreeNode(3, new TreeNode(), new TreeNode(1)))));
        System.out.println("Output:\t" + obj.rob(new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(3)),
                new TreeNode(5, new TreeNode(), new TreeNode(1)))));
    }

    public int rob(TreeNode root) {
        int[] answer = loot(root);
        return Math.max(answer[0], answer[1]);
    }

    public int[] loot(TreeNode node) {
        if (node == null) return new int[2];
        int[] left = loot(node.left);
        int[] right = loot(node.right);
        int rob = node.val + left[1] + right[1];
        int notr = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{rob, notr};
    }
}

//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
package algorithms.medium.m;

import context.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestor {
    int answer = 0;

    public static void main(String[] args) {
        MaximumDifferenceBetweenNodeAndAncestor obj = new MaximumDifferenceBetweenNodeAndAncestor();
        System.out.println("Output:\t" + obj.maxAncestorDiff(
                new TreeNode(8, new TreeNode(3, new TreeNode(1), new TreeNode(6, new TreeNode(4), new TreeNode(7))),
                        new TreeNode(10, new TreeNode(), new TreeNode(14, new TreeNode(13), new TreeNode())))));
        System.out.println("Output:\t" + obj.maxAncestorDiff(new TreeNode(1, new TreeNode(),
                new TreeNode(2, new TreeNode(), new TreeNode(0, new TreeNode(3), new TreeNode())))));
    }


    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        dfs(root, root.val, root.val);
        return answer;
    }

    public void dfs(TreeNode node, int max, int min) {
        if (node == null) return;

        int curr = Math.max(Math.abs(max - node.val), Math.abs(min - node.val));
        answer = Math.max(answer, curr);
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        dfs(node.left, max, min);
        dfs(node.right, max, min);
    }
}

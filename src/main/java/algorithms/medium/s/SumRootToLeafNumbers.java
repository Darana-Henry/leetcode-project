//https://leetcode.com/problems/sum-root-to-leaf-numbers/
package algorithms.medium.s;

import context.TreeNode;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();
        System.out.println("Output:\t" + sum.sumNumbers(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        System.out.println("Output:\t" + sum.sumNumbers(
                new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0))));
    }

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    public int dfs(TreeNode node, int sum) {
        if (node == null) return 0;
        sum = sum * 10 + node.val;
        if (node.left == null && node.right == null) return sum;
        return dfs(node.left, sum) + dfs(node.right, sum);
    }
}

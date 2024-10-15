//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
package algorithms.easy.s;

import context.TreeNode;


public class SumOfRootToLeafBinaryNumbers {

    public static void main(String[] args) {
        SumOfRootToLeafBinaryNumbers tree = new SumOfRootToLeafBinaryNumbers();
        System.out.println("Output:\t" + tree.sumRootToLeaf(
                new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(1)),
                        new TreeNode(1, new TreeNode(0), new TreeNode(1)))));
        System.out.println("Output:\t" + tree.sumRootToLeaf(new TreeNode(0)));
    }

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode node, int sum) {
        if (node == null) return 0;

        sum = (sum << 1) | node.val;
        if (node.left == null && node.right == null) return sum;

        return dfs(node.left, sum) + dfs(node.right, sum);
    }
}

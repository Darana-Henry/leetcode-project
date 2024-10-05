//https://leetcode.com/problems/sum-of-left-leaves/description/
package algorithms.easy.s;

import context.TreeNode;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        SumOfLeftLeaves sum = new SumOfLeftLeaves();
        System.out.println("Output:\t" + sum.sumOfLeftLeaves(
                new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println("Output:\t" + sum.sumOfLeftLeaves(new TreeNode(1)));

    }

    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) return sum;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null)
                sum += root.left.val;
            else
                sum += sumOfLeftLeaves(root.left);
        }
        if (root.right != null) {
            if (root.right.left != null || root.right.right != null)
                sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }
}

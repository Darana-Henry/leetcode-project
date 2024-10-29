//https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/
package algorithms.medium.b;

import context.TreeNode;

import java.util.Stack;

public class BinarySearchTreeToGreaterSumTree {
    int sum = 0;

    public static void main(String[] args) {
        BinarySearchTreeToGreaterSumTree bstTogst = new BinarySearchTreeToGreaterSumTree();
        System.out.println("Output:\t" + bstTogst.bstToGst(new TreeNode(0, null, new TreeNode(1))));
        System.out.println("Output:\t" + bstTogst.bstToGst(
                new TreeNode(4, new TreeNode(1, new TreeNode(0), new TreeNode(2, new TreeNode(), new TreeNode(3))),
                        new TreeNode(6, new TreeNode(5), new TreeNode(7, new TreeNode(), new TreeNode(8))))));
    }

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;

        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.add(node);
                node = node.right;
            }

            node = stack.pop();
            sum += node.val;
            node.val = sum;
            node = node.left;
        }
        return root;
    }
}

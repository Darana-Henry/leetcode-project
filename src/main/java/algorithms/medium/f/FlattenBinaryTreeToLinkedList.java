//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
package algorithms.medium.f;

import context.TreeNode;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        FlattenBinaryTreeToLinkedList flatten = new FlattenBinaryTreeToLinkedList();
        flatten.flattenOptimized(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6))));
        flatten.flattenOptimized(new TreeNode());
        flatten.flattenOptimized(new TreeNode(0));

        flatten.flattenWithStack(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6))));
        flatten.flattenWithStack(new TreeNode());
        flatten.flattenWithStack(new TreeNode(0));
    }

    public void flattenOptimized(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                TreeNode rightmost = root.left;
                while (rightmost.right != null) rightmost = rightmost.right;
                rightmost.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }

    public void flattenWithStack(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr.right != null) stack.add(curr.right);
            if (curr.left != null) stack.add(curr.left);
            if (!stack.isEmpty()) curr.right = stack.peek();
            curr.left = null;
        }
    }
}

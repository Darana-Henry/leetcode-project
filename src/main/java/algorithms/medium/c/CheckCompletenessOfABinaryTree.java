//https://leetcode.com/problems/check-completeness-of-a-binary-tree/
package algorithms.medium.c;

import context.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfABinaryTree {
    public static void main(String[] args) {
        CheckCompletenessOfABinaryTree obj = new CheckCompletenessOfABinaryTree();
        System.out.println("Output:\t" + obj.isCompleteTree(
                new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                        new TreeNode(3, new TreeNode(6), new TreeNode()))));
        System.out.println("Output:\t" + obj.isCompleteTree(
                new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                        new TreeNode(3, new TreeNode(), new TreeNode(7)))));
    }

    public boolean isCompleteTree(TreeNode root) {
        boolean end = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) end = true;
            else {
                if (end) return false;
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }

        return true;
    }
}

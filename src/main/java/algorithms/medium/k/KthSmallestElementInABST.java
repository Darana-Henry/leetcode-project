//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package algorithms.medium.k;

import context.TreeNode;

import java.util.PriorityQueue;
import java.util.Stack;

public class KthSmallestElementInABST {
    PriorityQueue<Integer> pq;

    public static void main(String[] args) {
        KthSmallestElementInABST smallest = new KthSmallestElementInABST();
        System.out.println("Output:\t" + smallest.kthSmallestOptimized(
                new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4)), 1));
        System.out.println("Output:\t" + smallest.kthSmallestOptimized(
                new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                        new TreeNode(6)), 3));
    }

    public int kthSmallestOptimized(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
        return 0;
    }

    public int kthSmallest(TreeNode root, int k) {
        pq = new PriorityQueue<>();
        dfs(root);
        for (int i = 1; i < k; i++)
            pq.poll();
        return pq.poll();
    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        pq.offer(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}

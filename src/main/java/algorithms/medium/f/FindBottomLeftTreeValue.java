//https://leetcode.com/problems/find-bottom-left-tree-value/
package algorithms.medium.f;

import context.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {
    int answer, maxLevel = 0;

    public static void main(String[] args) {
        FindBottomLeftTreeValue obj = new FindBottomLeftTreeValue();
        System.out.println("Output:\t" + obj.findBottomLeftValueDFS(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        System.out.println("Output:\t" + obj.findBottomLeftValueDFS(
                new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode()),
                        new TreeNode(3, new TreeNode(5, new TreeNode(7), new TreeNode()), new TreeNode(6)))));

        System.out.println("Output:\t" + obj.findBottomLeftValueBFS(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        System.out.println("Output:\t" + obj.findBottomLeftValueBFS(
                new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode()),
                        new TreeNode(3, new TreeNode(5, new TreeNode(7), new TreeNode()), new TreeNode(6)))));
    }

    public int findBottomLeftValueDFS(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;

        dfs(root, 0);
        return answer;
    }

    public void dfs(TreeNode node, int level) {
        if (node.left == null && node.right == null) {
            if (maxLevel < level) {
                maxLevel = level;
                answer = node.val;
            }
            return;
        }
        if (node.left != null) dfs(node.left, level + 1);

        if (node.right != null) dfs(node.right, level + 1);
    }

    public int findBottomLeftValueBFS(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            root = q.poll();

            if (root.right != null) q.offer(root.right);

            if (root.left != null) q.offer(root.left);
        }
        return root.val;
    }
}

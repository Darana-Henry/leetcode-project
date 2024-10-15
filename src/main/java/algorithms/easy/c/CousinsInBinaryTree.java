//https://leetcode.com/problems/cousins-in-binary-tree/
package algorithms.easy.c;

import context.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class CousinsInBinaryTree {
    int x, y;
    int xD, yD;
    TreeNode xP, yP;

    public static void main(String[] args) {
        CousinsInBinaryTree tree = new CousinsInBinaryTree();
        System.out.println("Output:\t" + tree.isCousinsBreadthFirstSearch(
                new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3)), 4, 3));
        System.out.println("Output:\t" + tree.isCousinsBreadthFirstSearch(
                new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5))), 5, 4));
        System.out.println("Output:\t" + tree.isCousinsBreadthFirstSearch(
                new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3)), 2, 3));
        System.out.println("Output:\t" + tree.isCousinsDepthFirstSearch(
                new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3)), 4, 3));
        System.out.println("Output:\t" + tree.isCousinsDepthFirstSearch(
                new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5))), 5, 4));
        System.out.println("Output:\t" + tree.isCousinsDepthFirstSearch(
                new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3)), 2, 3));
    }

    public boolean isCousinsBreadthFirstSearch(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 0;
        int xDepth = -1;
        int yDepth = -2;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null && curr.right != null) {
                    if (curr.left.val == x && curr.right.val == y) return false;
                    if (curr.left.val == y && curr.right.val == x) return false;
                }
                if (curr.val == x) xDepth = depth;
                if (curr.val == y) yDepth = depth;
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            depth++;
        }

        return xDepth == yDepth;
    }

    public boolean isCousinsDepthFirstSearch(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        dfs(root, null, 0);
        return xD == yD && xP != yP;
    }

    public void dfs(TreeNode node, TreeNode parent, int depth) {
        if (node == null) return;

        if (node.val == x) {
            xD = depth;
            xP = parent;
        }

        if (node.val == y) {
            yD = depth;
            yP = parent;
        }

        dfs(node.left, node, depth + 1);
        dfs(node.right, node, depth + 1);
    }

}

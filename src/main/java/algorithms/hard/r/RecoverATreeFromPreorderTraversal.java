//https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
package algorithms.hard.r;

import context.TreeNode;

public class RecoverATreeFromPreorderTraversal {
    int index;

    public static void main(String[] args) {
        RecoverATreeFromPreorderTraversal obj = new RecoverATreeFromPreorderTraversal();
        System.out.println("Output:\t" + obj.recoverFromPreorder("1-2--3--4-5--6--7"));
        System.out.println("Output:\t" + obj.recoverFromPreorder("1-2--3---4-5--6---7"));
        System.out.println("Output:\t" + obj.recoverFromPreorder("1-401--349---90--88"));
    }

    public TreeNode recoverFromPreorder(String traversal) {
        index = 0;
        return dfs(traversal, 0);
    }

    public TreeNode dfs(String traversal, int depth) {
        int len = traversal.length(), count = 0, value = 0;
        if (index >= len) return null;
        while ((index + count) < len && traversal.charAt(index + count) == '-') count++;
        if (count != depth) return null;
        index += count;

        while (index < len && Character.isDigit(traversal.charAt(index)))
            value = value * 10 + (traversal.charAt(index++) - '0');

        TreeNode node = new TreeNode(value);
        node.left = dfs(traversal, depth + 1);
        node.right = dfs(traversal, depth + 1);
        return node;
    }
}

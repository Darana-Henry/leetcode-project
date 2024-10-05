//https://leetcode.com/problems/count-complete-tree-nodes/description/
package algorithms.easy.c;

import context.TreeNode;

public class CountCompleteTreeNodes {

    public static void main(String[] args) {

        CountCompleteTreeNodes countNodes = new CountCompleteTreeNodes();

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));
        System.out.println("Output:\t" + countNodes.countNodes(root));

        TreeNode root1 = new TreeNode(1);
        System.out.println("Output:\t" + countNodes.countNodes(root1));
    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int count = 1;
        return count + countNodes(root.left) + countNodes(root.right);
    }
}

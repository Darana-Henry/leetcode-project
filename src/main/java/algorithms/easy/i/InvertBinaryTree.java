//https://leetcode.com/problems/invert-binary-tree/description/
package algorithms.easy.i;

import context.TreeNode;

public class InvertBinaryTree {

    public static void main(String[] args) {

        InvertBinaryTree invertTree = new InvertBinaryTree();

        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        System.out.println("Output:\t" + invertTree.invertTree(root));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode ephemeralNode = root.left;
        root.left = root.right;
        root.right = ephemeralNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

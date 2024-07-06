//https://leetcode.com/problems/delete-node-in-a-bst/description/
package algorithms.medium;

import context.TreeNode;

public class DeleteNodeInABST {
    public static void main(String[] args) {
        DeleteNodeInABST deleteNode = new DeleteNodeInABST();
        System.out.println("Output:\t" + deleteNode.deleteNode(
                new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                        new TreeNode(6, new TreeNode(), new TreeNode(7))), 3));
        System.out.println("Output:\t" + deleteNode.deleteNode(
                new TreeNode(5, new TreeNode(2, new TreeNode(), new TreeNode(4)),
                        new TreeNode(6, new TreeNode(), new TreeNode(7))), 0));
        System.out.println("Output:\t" + deleteNode.deleteNode(new TreeNode(), 0));
    }


    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.val == key) {
            if (root.right == null && root.left == null)
                return null;
            if (root.right == null && root.left != null)
                return root.left;
            if (root.right != null && root.left == null)
                return root.right;

            TreeNode node = helper(root.right, root);
            root.val = node.val;
        } else if (root.val < key)
            root.right = deleteNode(root.right, key);
        else
            root.left = deleteNode(root.left, key);
        return root;
    }

    public TreeNode helper(TreeNode root, TreeNode parent) {
        TreeNode pre = parent;
        TreeNode current = root;
        while (current.left != null) {
            pre = current;
            current = current.left;
        }
        deleteNode(pre, current.val);
        return current;
    }
}

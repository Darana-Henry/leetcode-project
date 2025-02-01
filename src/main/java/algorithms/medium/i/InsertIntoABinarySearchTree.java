//https://leetcode.com/problems/insert-into-a-binary-search-tree/
package algorithms.medium.i;

import context.TreeNode;

public class InsertIntoABinarySearchTree {
    public static void main(String[] args) {
        InsertIntoABinarySearchTree obj = new InsertIntoABinarySearchTree();
        System.out.println("Output:\t" + obj.insertIntoBST(
                new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7)), 5));
        System.out.println("Output:\t" + obj.insertIntoBST(
                new TreeNode(40, new TreeNode(20, new TreeNode(10), new TreeNode(30)),
                        new TreeNode(60, new TreeNode(50), new TreeNode(70))), 25));
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val > val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);
        return root;
    }
}

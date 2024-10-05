//https://leetcode.com/problems/search-in-a-binary-search-tree/description/
package algorithms.easy.s;

import context.TreeNode;

public class SearchInABinarySearchTree {
    public static void main(String[] args) {
        SearchInABinarySearchTree searchTree = new SearchInABinarySearchTree();
        System.out.println("Output:\t" + searchTree.searchBST(
                new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7)), 2));
        System.out.println("Output:\t" + searchTree.searchBST(
                new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7)), 5));
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        TreeNode node = root;
        if (node.val == val)
            return root;
        else if (node.val > val)
            return searchBST(node.left, val);
        else
            return searchBST(node.right, val);
    }
}

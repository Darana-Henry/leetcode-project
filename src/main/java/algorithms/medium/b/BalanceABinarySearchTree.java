//https://leetcode.com/problems/balance-a-binary-search-tree/description/
package algorithms.medium.b;

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {
    List<TreeNode> list;

    public static void main(String[] args) {
        BalanceABinarySearchTree bst = new BalanceABinarySearchTree();
        System.out.println("Output:\t" + bst.balanceBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        System.out.println("Output:\t" + bst.balanceBST(new TreeNode(1, new TreeNode(),
                new TreeNode(2, new TreeNode(), new TreeNode(3, new TreeNode(), new TreeNode(4))))));
    }

    public TreeNode balanceBST(TreeNode root) {
        if (root == null)
            return null;

        list = new ArrayList<>();
        inOrder(root);
        return buildBST(0, list.size() - 1);
    }

    public void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);
        list.add(root);
        inOrder(root.right);
    }

    public TreeNode buildBST(int low, int high) {
        if (low > high)
            return null;

        int mid = low + (high - low) / 2;

        TreeNode root = list.get(mid);
        root.left = buildBST(low, mid - 1);
        root.right = buildBST(mid + 1, high);

        return root;
    }
}

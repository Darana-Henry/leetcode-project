//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
package algorithms.medium.l;

import context.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
        LowestCommonAncestorOfABinarySearchTree obj = new LowestCommonAncestorOfABinarySearchTree();
        System.out.println("Output:\t" + obj.lowestCommonAncestor(
                new TreeNode(6, new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                        new TreeNode(8, new TreeNode(7), new TreeNode(9))), new TreeNode(2), new TreeNode(8)));
        System.out.println("Output:\t" + obj.lowestCommonAncestor(
                new TreeNode(6, new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                        new TreeNode(8, new TreeNode(7), new TreeNode(9))), new TreeNode(2), new TreeNode(4)));
        System.out.println("Output:\t" + obj.lowestCommonAncestor(new TreeNode(2, new TreeNode(1), new TreeNode()),
                new TreeNode(2), new TreeNode(1)));
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < Math.min(p.val, q.val)) root = root.right;
            else if (root.val > Math.max(p.val, q.val)) root = root.left;
            else return root;
        }
        return root;
    }
}

//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
package algorithms.medium.c;

import context.TreeNode;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public static void main(String[] args) {
        ConstructBinarySearchTreeFromPreorderTraversal obj = new ConstructBinarySearchTreeFromPreorderTraversal();
        System.out.println("Output:\t" + obj.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12}));
        System.out.println("Output:\t" + obj.bstFromPreorder(new int[]{1, 3}));
    }


    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, 0, preorder.length - 1);
    }

    public TreeNode construct(int[] preorder, int start, int end) {
        if (start > end || start >= preorder.length) return null;

        TreeNode node = new TreeNode(preorder[start]);
        int mid = split(preorder, start, end, preorder[start]);
        node.left = construct(preorder, start + 1, mid - 1);
        node.right = construct(preorder, mid, end);
        return node;
    }

    public int split(int[] preorder, int start, int end, int val) {
        int left = start + 1;
        int right = end + 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (preorder[mid] > val) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}

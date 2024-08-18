//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
package algorithms.medium;

import context.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    Map<Integer, Integer> map = new HashMap<>();
    int[] indices;

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal construct = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        System.out.println("Output:\t" + construct.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
        System.out.println("Output:\t" + construct.buildTree(new int[]{-1}, new int[]{-1}));
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int size = inorder.length;
        indices = preorder;

        for (int i = 0; i < size; i++)
            map.put(inorder[i], i);

        return build(0, 0, size - 1);
    }

    public TreeNode build(int rootIndex, int left, int right) {
        TreeNode root = new TreeNode(indices[rootIndex]);
        int mid = map.get(indices[rootIndex]);
        if (mid > left) root.left = build(rootIndex + 1, left, mid - 1);
        if (mid < right) root.right = build(rootIndex + mid - left + 1, mid + 1, right);
        return root;
    }
}

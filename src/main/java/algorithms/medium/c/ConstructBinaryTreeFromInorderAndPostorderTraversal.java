//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
package algorithms.medium.c;

import context.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    Map<Integer, Integer> map = new HashMap<>();
    int[] indices;
    int index = 0;

    public static void main(String[] args) {
        ConstructBinaryTreeFromInorderAndPostorderTraversal construct = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        System.out.println("Output:\t" + construct.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}));
        System.out.println("Output:\t" + construct.buildTree(new int[]{-1}, new int[]{-1}));
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int size = inorder.length;
        indices = postorder;
        index = size - 1;

        for (int i = 0; i < size; i++)
            map.put(inorder[i], i);

        return build(0, size - 1);
    }

    public TreeNode build(int left, int right) {
        if (left > right) return null;

        TreeNode root = new TreeNode(indices[index]);
        int mid = map.get(indices[index]);
        index--;
        root.right = build(mid + 1, right);
        root.left = build(left, mid - 1);
        return root;
    }
}

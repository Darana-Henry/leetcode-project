//https://leetcode.com/problems/evaluate-boolean-binary-tree/
package algorithms.easy.e;

import context.TreeNode;

public class EvaluateBooleanBinaryTree {
    public static void main(String[] args) {
        EvaluateBooleanBinaryTree evaluate = new EvaluateBooleanBinaryTree();
        System.out.println("Output:\t" + evaluate.evaluateTree(
                new TreeNode(2, new TreeNode(1), new TreeNode(3, new TreeNode(0), new TreeNode(1)))));
        System.out.println("Output:\t" + evaluate.evaluateTree(new TreeNode(0)));
    }

    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) return root.val == 1;
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        return root.val == 2 ? left || right : left && right;
    }
}
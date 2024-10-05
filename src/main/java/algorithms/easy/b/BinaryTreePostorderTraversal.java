package algorithms.easy.b; //https://leetcode.com/problems/binary-tree-postorder-traversal/description/

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    public static void main(String[] args) {

        BinaryTreePostorderTraversal binTrav = new BinaryTreePostorderTraversal();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println("Output:\t" + binTrav.postorderTraversal(root));

        System.out.println("Output:\t" + binTrav.postorderTraversalIterative(root));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }

    public void postOrderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postOrderTraversal(node.left, result);
        postOrderTraversal(node.right, result);
        result.add(node.val);
    }

    public List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(0, current.val);

            if (current.left != null)
                stack.push(current.left);

            if (current.right != null)
                stack.push(current.right);
        }
        return result;
    }
}

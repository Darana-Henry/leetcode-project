package algorithms.easy; //https://leetcode.com/problems/binary-tree-inorder-traversal/

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {

        BinaryTreeInorderTraversal binTrav = new BinaryTreeInorderTraversal();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println("Output:\t" + binTrav.inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        if (root == null)
            return output;

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            output.add(current.val);
            current = current.right;
        }
        return output;
    }
}

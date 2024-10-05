package algorithms.easy.b;//https://leetcode.com/problems/binary-tree-preorder-traversal/description/

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {

        BinaryTreePreorderTraversal tree = new BinaryTreePreorderTraversal();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println("Output:\t" + tree.preorderTraversal(root));

        TreeNode rooter = new TreeNode(1);
        System.out.println("Output:\t" + tree.preorderTraversal(rooter));
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }

    public void preOrderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preOrderTraversal(node.left, result);
        preOrderTraversal(node.right, result);
    }
}

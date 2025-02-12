//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
package algorithms.medium.b;

import context.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversalII obj = new BinaryTreeLevelOrderTraversalII();
        System.out.println("Output:\t" + obj.levelOrderBottom(
                new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println("Output:\t" + obj.levelOrderBottom(new TreeNode(1)));
        System.out.println("Output:\t" + obj.levelOrderBottom(new TreeNode()));
    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) return answer;
        Deque<TreeNode> q = new LinkedList<>();
        q.offerLast(root);

        while (!q.isEmpty()) {
            List<Integer> clist = new ArrayList<>();
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.pollFirst();
                clist.add(curr.val);
                if (curr.left != null) q.offerLast(curr.left);
                if (curr.right != null) q.offerLast(curr.right);
            }

            answer.add(clist);
        }

        return answer;
    }
}

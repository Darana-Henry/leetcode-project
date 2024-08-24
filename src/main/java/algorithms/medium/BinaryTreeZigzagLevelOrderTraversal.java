//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
package algorithms.medium;

import context.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Collections;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeZigzagLevelOrderTraversal zigzagLevelOrderTraversallevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();
        System.out.println("Output:\t" + zigzagLevelOrderTraversallevelOrderTraversal.zigzagLevelOrder(
                new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println(
                "Output:\t" + zigzagLevelOrderTraversallevelOrderTraversal.zigzagLevelOrder(new TreeNode(1)));
        System.out.println("Output:\t" + zigzagLevelOrderTraversallevelOrderTraversal.zigzagLevelOrder(new TreeNode()));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        boolean l2r = true;
        if (root == null) return answer;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll();
                list.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            if (!l2r) Collections.reverse(list);
            answer.add(list);
            l2r = !l2r;
        }
        return answer;

    }
}

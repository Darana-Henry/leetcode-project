//https://leetcode.com/problems/deepest-leaves-sum/
package algorithms.medium.d;

import context.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeepestLeavesSum {
    public static void main(String[] args) {
        DeepestLeavesSum obj = new DeepestLeavesSum();
        System.out.println("Output:\t" + obj.deepestLeavesSum(
                new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), new TreeNode()), new TreeNode(5)),
                        new TreeNode(3, new TreeNode(), new TreeNode(6, new TreeNode(), new TreeNode(8))))));
    }

    public int deepestLeavesSum(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        int answer = 0;
        while (!q.isEmpty()) {
            answer = 0;
            for (int i = q.size(); i > 0; i--) {
                TreeNode curr = q.pollFirst();
                answer += curr.val;
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }

        return answer;
    }
}

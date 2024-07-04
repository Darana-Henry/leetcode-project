//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/
package algorithms.medium;

import context.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    public static void main(String[] args) {
        MaximumLevelSumOfABinaryTree maxLevel = new MaximumLevelSumOfABinaryTree();
        System.out.println("Output:\t" + maxLevel.maxLevelSum(
                new TreeNode(1, new TreeNode(7, new TreeNode(7), new TreeNode(-8)), new TreeNode(0))));
        System.out.println(
                "Output:\t" + maxLevel.maxLevelSum(new TreeNode(989, new TreeNode(),
                        new TreeNode(10250, new TreeNode(98693),
                                new TreeNode(-89388, new TreeNode(), new TreeNode(-32127))))));
    }

    public int maxLevelSum(TreeNode root) {
        int maxLevel = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentLevel = 1;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                sum += current.val;

                if (current.left != null)
                    q.add(current.left);

                if (current.right != null)
                    q.add(current.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = currentLevel;
            }
            currentLevel++;
        }
        return maxLevel;
    }
}

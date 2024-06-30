//https://leetcode.com/problems/path-sum-iii/description/
package algorithms.medium;

import context.TreeNode;

import java.util.HashMap;

public class PathSumIII {
    int k = 0;
    int count = 0;
    HashMap<Long, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        PathSumIII pathSum = new PathSumIII();
        System.out.println("Output:\t" + pathSum.pathSum(
                new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(3), new TreeNode(2)),
                        new TreeNode(2, new TreeNode(), new TreeNode(1))),
                        new TreeNode(-3, new TreeNode(), new TreeNode(11))), 8));

        System.out.println("Output:\t" + pathSum.pathSum(
                new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), new TreeNode()),
                        new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))), 22));
    }


    public int pathSum(TreeNode root, int targetSum) {
        k = targetSum;
        preOrder(root, 0L);
        return count;
    }

    public void preOrder(TreeNode node, long currentSum) {
        if (node == null)
            return;

        currentSum += node.val;
        if (currentSum == k)
            count++;

        count += map.getOrDefault(currentSum - k, 0);
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        preOrder(node.left, currentSum);
        preOrder(node.right, currentSum);
        map.put(currentSum, map.get(currentSum) - 1);
    }
}

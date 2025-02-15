//https://leetcode.com/problems/path-sum-ii/
package algorithms.medium.p;

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    int target;
    List<List<Integer>> answer;
    List<Integer> curr;

    public static void main(String[] args) {
        PathSumII obj = new PathSumII();
        System.out.println("Output:\t" + obj.pathSum(
                new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), new TreeNode()),
                        new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))), 22));
        System.out.println("Output:\t" + obj.pathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
        System.out.println("Output:\t" + obj.pathSum(new TreeNode(1, new TreeNode(2), new TreeNode()), 0));
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        answer = new ArrayList<>();
        curr = new ArrayList<>();
        dfs(root, 0);
        return answer;
    }

    public void dfs(TreeNode node, int sum) {
        if (node == null) return;
        curr.add(node.val);
        sum += node.val;
        if (node.left == null && node.right == null && sum == target) answer.add(new ArrayList<>(curr));
        dfs(node.left, sum);
        dfs(node.right, sum);
        curr.remove(curr.size() - 1);
    }
}

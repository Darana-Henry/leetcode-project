//https://leetcode.com/problems/maximum-width-of-binary-tree/
package algorithms.medium.m;

import context.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        MaximumWidthOfBinaryTree obj = new MaximumWidthOfBinaryTree();
        System.out.println("Output:\t" + obj.widthOfBinaryTree(
                new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                        new TreeNode(2, new TreeNode(), new TreeNode(9)))));
        System.out.println("Output:\t" + obj.widthOfBinaryTree(
                new TreeNode(1, new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode()), new TreeNode()),
                        new TreeNode(2, new TreeNode(), new TreeNode(9, new TreeNode(7), new TreeNode())))));
        System.out.println("Output:\t" + obj.widthOfBinaryTree(
                new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode()), new TreeNode(2))));

    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int answer = 0;
        Queue<Map<TreeNode, Integer>> q = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        map.put(root, 0);
        q.add(map);

        while (!q.isEmpty()) {
            int index = 0;
            int start = q.peek().entrySet().iterator().next().getValue();
            int n = q.size();

            for (int i = 0; i < n; i++) {
                Map<TreeNode, Integer> pair = q.poll();
                TreeNode curr = pair.entrySet().iterator().next().getKey();
                index = pair.get(curr);

                if (curr.left != null) {
                    Map<TreeNode, Integer> amap = new HashMap<>();
                    amap.put(curr.left, 2 * index);
                    q.add(amap);
                }

                if (curr.right != null) {
                    Map<TreeNode, Integer> amap = new HashMap<>();
                    amap.put(curr.right, 2 * index);
                    q.add(amap);
                }
            }
            answer = Math.max(answer, index - start + 1);
        }

        return answer;
    }
}
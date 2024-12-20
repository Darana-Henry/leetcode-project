//https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/
package algorithms.medium.r;

import context.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ReverseOddLevelsOfBinaryTree {
    public static void main(String[] args) {
        ReverseOddLevelsOfBinaryTree obj = new ReverseOddLevelsOfBinaryTree();
        System.out.println("Output:\t" + obj.reverseOddLevels(new TreeNode(7, new TreeNode(13), new TreeNode(11))));
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        int level = 0;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();

            for (int i = q.size(); i > 0; i--) {
                TreeNode curr = q.pollFirst();
                if (level % 2 == 1) list.add(curr);
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            if (!list.isEmpty()) {
                int left = 0, right = list.size() - 1;

                while (left < right) {
                    int temp = list.get(left).val;
                    list.get(left).val = list.get(right).val;
                    list.get(right).val = temp;
                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }
}

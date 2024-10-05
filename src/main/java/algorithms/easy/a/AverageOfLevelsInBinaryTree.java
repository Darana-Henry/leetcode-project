//https://leetcode.com/problems/average-of-levels-in-binary-tree/description
package algorithms.easy.a;

import context.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        AverageOfLevelsInBinaryTree avg = new AverageOfLevelsInBinaryTree();
        System.out.println("Output:\t" + avg.averageOfLevels(
                new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println("Output:\t" + avg.averageOfLevels(
                new TreeNode(3, new TreeNode(9, new TreeNode(15), new TreeNode(7)), new TreeNode(20))));
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> output = new ArrayList<>();
        if (root == null)
            return output;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        double sumAtLevel = 0;
        while (!q.isEmpty()) {
            sumAtLevel = 0;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                sumAtLevel += current.val;

                if (current.left != null)
                    q.offer(current.left);

                if (current.right != null)
                    q.offer(current.right);
            }

            output.add(sumAtLevel / size);
        }
        return output;
    }
}

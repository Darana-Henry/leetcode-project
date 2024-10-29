//https://leetcode.com/problems/binary-tree-right-side-view/description/
package algorithms.medium.b;

import context.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        BinaryTreeRightSideView rightSide = new BinaryTreeRightSideView();
        System.out.println("Output:\t" + rightSide.rightSideView(
                new TreeNode(1, new TreeNode(2, new TreeNode(), new TreeNode(5)),
                        new TreeNode(3, new TreeNode(), new TreeNode(4)))));
        System.out.println("Output:\t" + rightSide.rightSideView(new TreeNode()));
        System.out.println("Output:\t" + rightSide.rightSideView(new TreeNode(1, new TreeNode(), new TreeNode(3))));
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return result;

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();

                if (i == 0)
                    result.add(currentNode.val);

                if (currentNode.right != null)
                    queue.add(currentNode.right);

                if (currentNode.left != null)
                    queue.add(currentNode.left);

            }
        }
        return result;
    }
}

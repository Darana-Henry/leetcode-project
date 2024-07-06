//https://leetcode.com/problems/binary-tree-paths/
package algorithms.easy;

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<String> result;

    public static void main(String[] args) {
        BinaryTreePaths btPaths = new BinaryTreePaths();
        System.out.println("Output:\t" + btPaths.binaryTreePathsBruteForce(
                new TreeNode(1, new TreeNode(2, new TreeNode(), new TreeNode(5)), new TreeNode(3))));
        System.out.println("Output:\t" + btPaths.binaryTreePathsOptimized(
                new TreeNode(1, new TreeNode(2, new TreeNode(), new TreeNode(5)), new TreeNode(3))));
        System.out.println("Output:\t" + btPaths.binaryTreePathsOptimized(new TreeNode(1)));
    }

    public List<String> binaryTreePathsBruteForce(TreeNode root) {
        if (root == null)
            return result;

        result = new ArrayList<>();
        String currentPath = Integer.toString(root.val);

        if (root.left == null && root.right == null)
            result.add(currentPath);

        if (root.left != null)
            depthFirstSearch(root.left, currentPath);

        if (root.right != null)
            depthFirstSearch(root.right, currentPath);

        return result;
    }

    public void depthFirstSearch(TreeNode node, String currentPath) {
        currentPath = currentPath + "->" + Integer.toString(node.val);

        if (node.left == null && node.right == null)
            result.add(currentPath);

        if (node.left != null)
            depthFirstSearch(node.left, currentPath);

        if (node.right != null)
            depthFirstSearch(node.right, currentPath);

    }

    public List<String> binaryTreePathsOptimized(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null) searchBT(root, "", answer);
        return answer;
    }

    private void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) answer.add(path + root.val);
        if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
        if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
    }
}

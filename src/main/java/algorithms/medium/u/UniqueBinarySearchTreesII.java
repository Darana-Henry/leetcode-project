//https://leetcode.com/problems/unique-binary-search-trees-ii/
package algorithms.medium.u;

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {
    public static void main(String[] args) {
        UniqueBinarySearchTreesII generate = new UniqueBinarySearchTreesII();
        System.out.println("Output:\t" + generate.generateTrees(3));
        System.out.println("Output:\t" + generate.generateTrees(1));
    }

    public List<TreeNode> generateTrees(int n) {
        return build(1, n);
    }

    public List<TreeNode> build(int start, int end) {
        List<TreeNode> trees = new ArrayList<>();
        if (start > end) trees.add(null);
        else {
            for (int root = start; root <= end; root++) {
                List<TreeNode> left = build(start, root - 1);
                List<TreeNode> right = build(root + 1, end);
                for (TreeNode lnode : left) {
                    for (TreeNode rNode : right) {
                        TreeNode rootNode = new TreeNode(root, lnode, rNode);
                        trees.add(rootNode);
                    }
                }
            }
        }
        return trees;
    }
}

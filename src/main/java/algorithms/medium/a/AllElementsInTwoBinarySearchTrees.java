//https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
package algorithms.medium.a;

import context.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {
    List<Integer> answer;

    public static void main(String[] args) {
        AllElementsInTwoBinarySearchTrees obj = new AllElementsInTwoBinarySearchTrees();
        System.out.println("Output:\t" + obj.getAllElements(new TreeNode(2, new TreeNode(1), new TreeNode(4)),
                new TreeNode(1, new TreeNode(0), new TreeNode(3))));
        System.out.println("Output:\t" + obj.getAllElements(new TreeNode(1, new TreeNode(), new TreeNode(8)),
                new TreeNode(8, new TreeNode(1), new TreeNode())));
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        answer = new ArrayList<>();
        dfs(root1);
        dfs(root2);
        Collections.sort(answer);
        return answer;
    }

    public void dfs(TreeNode node) {
        if (node == null) return;

        answer.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}

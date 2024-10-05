package algorithms.easy.t;

import context.TreeNode;

import java.util.*;

public class TwoSumIVInputIsABST {

    Set<Integer> set = new HashSet<>();
    int target;

    public static void main(String[] args) {
        TwoSumIVInputIsABST sum2 = new TwoSumIVInputIsABST();
        System.out.println("Output:\t" + sum2.findTargetWithBFS(
                new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                        new TreeNode(6, null, new TreeNode(7))), 7));
        System.out.println("Output:\t" + sum2.findTargetWithDFS(
                new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                        new TreeNode(6, null, new TreeNode(7))), 7));
    }

    public boolean findTargetWithBFS(TreeNode root, int k) {
        if (root == null) return false;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (list.contains(k - curr.val)) return true;
            list.add(curr.val);
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        return false;
    }

    public boolean findTargetWithDFS(TreeNode root, int k) {
        if (root == null) return false;
        this.target = k;
        return dfs(root);
    }

    public boolean dfs(TreeNode node) {
        if (node == null) return false;

        if (set.contains(target - node.val)) return true;

        set.add(node.val);
        return dfs(node.left) || dfs(node.right);
    }
}

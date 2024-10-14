//https://leetcode.com/problems/range-sum-of-bst/
package algorithms.easy.r;

import context.TreeNode;

public class RangeSumOfBST {
    int sum = 0, lower = 0, higher = 0;

    public static void main(String[] args) {
        RangeSumOfBST tree = new RangeSumOfBST();
        System.out.println("Output:\t" + tree.rangeSumBST(
                new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, null, new TreeNode(18))), 7, 15));
        System.out.println("Output:\t" + tree.rangeSumBST(new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
                new TreeNode(15, new TreeNode(13), new TreeNode(18))), 6, 10));
        System.out.println("Output:\t" + tree.rangeSumBSTOptimized(
                new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, null, new TreeNode(18))), 7, 15));
        System.out.println("Output:\t" + tree.rangeSumBSTOptimized(new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
                new TreeNode(15, new TreeNode(13), new TreeNode(18))), 6, 10));
    }


    public int rangeSumBST(TreeNode root, int low, int high) {
        this.lower = low;
        this.higher = high;
        dfs(root);
        return sum;
    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        if (node.val <= higher && node.val >= lower) sum += node.val;
        dfs(node.left);
        dfs(node.right);
    }

    public int rangeSumBSTOptimized(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (low <= root.val && high >= root.val)
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        else if (low > root.val) return rangeSumBST(root.right, low, high);
        else return rangeSumBST(root.left, low, high);
    }
}

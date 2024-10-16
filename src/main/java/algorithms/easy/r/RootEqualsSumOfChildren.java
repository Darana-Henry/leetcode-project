//https://leetcode.com/problems/root-equals-sum-of-children/
package algorithms.easy.r;

import context.TreeNode;

public class RootEqualsSumOfChildren {
    public static void main(String[] args) {
        RootEqualsSumOfChildren equalsSum = new RootEqualsSumOfChildren();
        System.out.println("Output:\t" + equalsSum.checkTree(new TreeNode(10, new TreeNode(4), new TreeNode(6))));
        System.out.println("Output:\t" + equalsSum.checkTree(new TreeNode(5, new TreeNode(3), new TreeNode(1))));
    }

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}

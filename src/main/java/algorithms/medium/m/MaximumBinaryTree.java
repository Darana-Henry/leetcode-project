//https://leetcode.com/problems/maximum-binary-tree/
package algorithms.medium.m;

import context.TreeNode;

public class MaximumBinaryTree {
    int[] nums;

    public static void main(String[] args) {
        MaximumBinaryTree obj = new MaximumBinaryTree();
        System.out.println("Output:\t" + obj.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
        System.out.println("Output:\t" + obj.constructMaximumBinaryTree(new int[]{3, 2, 1}));
    }


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;
        return build(0, nums.length);
    }

    public TreeNode build(int left, int right) {
        if (left == right) return null;

        int max = maxi(left, right);
        TreeNode root = new TreeNode(nums[max]);
        root.left = build(left, max);
        root.right = build(max + 1, right);
        return root;
    }

    public int maxi(int left, int right) {
        int index = left;

        for (int i = left; i < right; i++)
            if (nums[index] < nums[i]) index = i;

        return index;
    }
}

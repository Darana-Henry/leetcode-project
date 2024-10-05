package algorithms.easy.c;

import context.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {

        ConvertSortedArrayToBinarySearchTree arrayToBinary = new ConvertSortedArrayToBinarySearchTree();

        int nums[] = new int[]{-10, -3, 0, 5, 9};
        System.out.println("Output:\t" + arrayToBinary.sortedArrayToBST(nums));

        int numss[] = new int[]{1, 3};
        System.out.println("Output:\t" + arrayToBinary.sortedArrayToBST(numss));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        return constructTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructTree(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = constructTree(nums, left, mid - 1);
        node.right = constructTree(nums, mid + 1, right);
        return node;
    }
}

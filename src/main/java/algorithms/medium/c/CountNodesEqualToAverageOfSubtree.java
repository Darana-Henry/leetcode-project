//https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
package algorithms.medium.c;


import context.TreeNode;

public class CountNodesEqualToAverageOfSubtree {
    int answer = 0;

    public static void main(String[] args) {
        CountNodesEqualToAverageOfSubtree obj = new CountNodesEqualToAverageOfSubtree();
        System.out.println("Output:\t" + obj.averageOfSubtree(
                new TreeNode(4, new TreeNode(8, new TreeNode(0), new TreeNode(1)),
                        new TreeNode(5, new TreeNode(), new TreeNode(6)))));
        System.out.println("Output:\t" + obj.averageOfSubtree(new TreeNode(1)));
    }

    public int averageOfSubtree(TreeNode root) {
        int[] val = postOrder(root);
        return answer;

    }

    public int[] postOrder(TreeNode node) {
        if (node == null) return new int[]{0, 0};

        int[] left = postOrder(node.left);
        int[] right = postOrder(node.right);

        int sum = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;

        if (node.val == sum / count) answer++;

        return new int[]{sum, count};
    }
}

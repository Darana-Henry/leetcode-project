//https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
package algorithms.medium.s;

import context.TreeNode;

public class SumOfNodesWithEvenValuedGrandparent {
    int answer;

    public static void main(String[] args) {
        SumOfNodesWithEvenValuedGrandparent obj = new SumOfNodesWithEvenValuedGrandparent();
        System.out.println("Output:\t" + obj.sumEvenGrandparent(new TreeNode(6,
                new TreeNode(7, new TreeNode(2, new TreeNode(9), new TreeNode()),
                        new TreeNode(7, new TreeNode(1), new TreeNode(4))),
                new TreeNode(8, new TreeNode(1), new TreeNode(3, new TreeNode(), new TreeNode(5))))));
        System.out.println("Output:\t" + obj.sumEvenGrandparent(new TreeNode(1)));
    }

    public int sumEvenGrandparent(TreeNode root) {
        answer = 0;
        dfs(null, root, root.left);
        dfs(null, root, root.right);
        return answer;
    }

    public void dfs(TreeNode g, TreeNode p, TreeNode curr) {
        if (curr == null) return;

        if (g != null && g.val % 2 == 0) answer += curr.val;

        dfs(p, curr, curr.left);
        dfs(p, curr, curr.right);
    }
}

//https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
package algorithms.easy.f;

import context.TreeNode;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    TreeNode target;

    public static void main(String[] args) {
        FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree tree = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();
        System.out.println("Output:\t" + tree.getTargetCopy(
                new TreeNode(7, new TreeNode(4), new TreeNode(3, new TreeNode(6), new TreeNode(19))),
                new TreeNode(7, new TreeNode(4), new TreeNode(3, new TreeNode(6), new TreeNode(19))), new TreeNode(3)));
        System.out.println("Output:\t" + tree.getTargetCopy(new TreeNode(8, null, new TreeNode(6, null,
                        new TreeNode(5, null,
                                new TreeNode(4, null, new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))))))),
                new TreeNode(8, null, new TreeNode(6, null, new TreeNode(5, null,
                        new TreeNode(4, null, new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))))))),
                new TreeNode(4)));
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        return dfs(original, cloned);
    }

    public TreeNode dfs(TreeNode org, TreeNode clo) {
        if (org == null) return null;

        if (org == target) return clo;

        TreeNode res = dfs(org.left, clo.left);
        return res == null ? dfs(org.right, clo.right) : res;
    }
}

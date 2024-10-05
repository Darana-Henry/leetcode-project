package algorithms.easy.s;

import context.TreeNode;

public class SameTree {

    public static void main(String[] args) {

        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("Output:\t" + sameTree.isSameTree(p, q));

        p = new TreeNode(1, new TreeNode(2), null);
        q = new TreeNode(1, null, new TreeNode(2));
        System.out.println("Output:\t" + sameTree.isSameTree(p, q));

        p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println("Output:\t" + sameTree.isSameTree(p, q));

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

//https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
package algorithms.medium.f;

import context.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class FindElementsInAContaminatedBinaryTree {
    public static void main(String[] args) {
        FindElements findElementsA = new FindElements(new TreeNode(-1, new TreeNode(), new TreeNode(-1)));
        System.out.println("Output:\t" + findElementsA.find(1)); // return False
        System.out.println("Output:\t" + findElementsA.find(2)); // return True

        FindElements findElementsB = new FindElements(
                new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), new TreeNode(-1)), new TreeNode(-1)));
        System.out.println("Output:\t" + findElementsB.find(1)); // return True
        System.out.println("Output:\t" + findElementsB.find(3)); // return True
        System.out.println("Output:\t" + findElementsB.find(5)); // return False

        FindElements findElementsC = new FindElements(new TreeNode(-1, new TreeNode(),
                new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), new TreeNode()), new TreeNode())));
        System.out.println("Output:\t" + findElementsC.find(2)); // return True
        System.out.println("Output:\t" + findElementsC.find(3)); // return False
        System.out.println("Output:\t" + findElementsC.find(4)); // return False
        System.out.println("Output:\t" + findElementsC.find(5)); // return True
    }

}

class FindElements {
    TreeNode root;
    Set<Integer> set = new HashSet<>();

    public FindElements(TreeNode root) {
        this.root = root;
        this.root.val = 0;
        set.add(this.root.val);
        dfs(root);
    }

    public boolean find(int target) {
        return set.contains(target);

    }

    public void dfs(TreeNode node) {
        if (node == null) return;

        if (node.left != null) {
            node.left.val = 2 * node.val + 1;
            set.add(node.left.val);
            dfs(node.left);
        }

        if (node.right != null) {
            node.right.val = 2 * node.val + 2;
            set.add(node.right.val);
            dfs(node.right);
        }

    }
}
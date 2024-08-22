//https://leetcode.com/problems/binary-search-tree-iterator/
package algorithms.medium;

import context.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTreeIterator {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(7, new TreeNode(3), new TreeNode(15, new TreeNode(9), new TreeNode(20)));
        BSTIteratorWithStack bSTIterator = new BSTIteratorWithStack(node);
        System.out.println("Output:\t" + bSTIterator.next());    // return 3
        System.out.println("Output:\t" + bSTIterator.next());    // return 7
        System.out.println("Output:\t" + bSTIterator.hasNext()); // return True
        System.out.println("Output:\t" + bSTIterator.next());    // return 9
        System.out.println("Output:\t" + bSTIterator.hasNext()); // return True
        System.out.println("Output:\t" + bSTIterator.next());    // return 15
        System.out.println("Output:\t" + bSTIterator.hasNext()); // return True
        System.out.println("Output:\t" + bSTIterator.next());    // return 20
        System.out.println("Output:\t" + bSTIterator.hasNext()); // return False

        BSTIteratorWithList bstIteratorWithList = new BSTIteratorWithList(node);
        System.out.println("Output:\t" + bstIteratorWithList.next());    // return 3
        System.out.println("Output:\t" + bstIteratorWithList.next());    // return 7
        System.out.println("Output:\t" + bstIteratorWithList.hasNext()); // return True
        System.out.println("Output:\t" + bstIteratorWithList.next());    // return 9
        System.out.println("Output:\t" + bstIteratorWithList.hasNext()); // return True
        System.out.println("Output:\t" + bstIteratorWithList.next());    // return 15
        System.out.println("Output:\t" + bstIteratorWithList.hasNext()); // return True
        System.out.println("Output:\t" + bstIteratorWithList.next());    // return 20
        System.out.println("Output:\t" + bstIteratorWithList.hasNext()); // return False
    }
}

class BSTIteratorWithStack {
    Stack<TreeNode> stack = new Stack<>();

    public BSTIteratorWithStack(TreeNode root) {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode node = stack.pop();
        inOrderTraversal(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

class BSTIteratorWithList {
    List<Integer> list = new ArrayList<>();
    int index = 0;

    public BSTIteratorWithList(TreeNode root) {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        list.add(node.val);
        inOrderTraversal(node.right);
    }

    public int next() {
        return list.get(index++);

    }

    public boolean hasNext() {
        return index < list.size();
    }
}
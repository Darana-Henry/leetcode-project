//https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
package algorithms.medium.c;

import context.ListNode;
import context.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] args) {
        ConvertSortedListToBinarySearchTree obj = new ConvertSortedListToBinarySearchTree();
        System.out.println("Output:\t" + obj.sortedListToBST(
                new ListNode(-10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9)))))));
        System.out.println("Output:\t" + obj.sortedListToBST(new ListNode()));
    }

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList();

        for (ListNode current = head; current != null; current = current.next)
            list.add(current.val);

        return build(list, 0, list.size() - 1);
    }

    public TreeNode build(List<Integer> list, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.right = build(list, mid + 1, end);
        node.left = build(list, start, mid - 1);
        return node;
    }
}

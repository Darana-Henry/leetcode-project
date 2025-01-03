//https://leetcode.com/problems/delete-node-in-a-linked-list/
package algorithms.medium.d;

import context.ListNode;

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
        obj.deleteNode(new ListNode(5));
        obj.deleteNode(new ListNode(1));
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

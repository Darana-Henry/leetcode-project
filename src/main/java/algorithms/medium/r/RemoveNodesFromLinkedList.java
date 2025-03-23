//https://leetcode.com/problems/remove-nodes-from-linked-list/
package algorithms.medium.r;

import context.ListNode;

public class RemoveNodesFromLinkedList {
    public static void main(String[] args) {
        RemoveNodesFromLinkedList obj = new RemoveNodesFromLinkedList();
        System.out.println("Output:\t" + obj.removeNodes(
                new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))))));
        System.out.println(
                "Output:\t" + obj.removeNodes(new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))))));
    }

    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = removeNodes(head.next);
        if (head.val < next.val) return next;
        head.next = next;
        return head;
    }
}

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
package algorithms.medium;

import context.ListNode;

public class DeleteTheMiddleNodeOfALinkedList {
    public static void main(String[] args) {
        DeleteTheMiddleNodeOfALinkedList deleteMiddle = new DeleteTheMiddleNodeOfALinkedList();
        System.out.println("Output:\t" + deleteMiddle.deleteMiddle(new ListNode(1,
                new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))))));
        System.out.println("Output:\t" + deleteMiddle.deleteMiddle(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
        System.out.println("Output:\t" + deleteMiddle.deleteMiddle(new ListNode(2, new ListNode(1))));
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        int count = 0;
        ListNode counter = head;
        ListNode deletion = head;

        while (counter != null) {
            count++;
            counter = counter.next;
        }

        int mid = count / 2;

        for (int i = 0; i < mid - 1; i++)
            deletion = deletion.next;

        deletion.next = deletion.next.next;

        return head;

    }
}

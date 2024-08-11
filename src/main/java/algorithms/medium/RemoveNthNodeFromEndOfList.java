//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package algorithms.medium;

import context.ListNode;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList nth = new RemoveNthNodeFromEndOfList();
        System.out.println("Output:\t" + nth.removeNthFromEnd(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));
        System.out.println("Output:\t" + nth.removeNthFromEnd(new ListNode(1), 1));
        System.out.println("Output:\t" + nth.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (n-- > 0) fast = fast.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}

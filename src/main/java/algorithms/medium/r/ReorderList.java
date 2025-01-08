//https://leetcode.com/problems/reorder-list/
package algorithms.medium.r;

import context.ListNode;

public class ReorderList {
    public static void main(String[] args) {
        ReorderList obj = new ReorderList();
        obj.reorderList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        obj.reorderList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }

    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        curr = head;

        while (prev != null) {
            ListNode temp = prev.next;
            prev.next = curr.next;
            curr.next = prev;
            curr = prev.next;
            prev = temp;
        }
    }
}

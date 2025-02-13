//https://leetcode.com/problems/insertion-sort-list/description/
package algorithms.medium.i;

import context.ListNode;

public class InsertionSortList {
    public static void main(String[] args) {
        InsertionSortList obj = new InsertionSortList();
        System.out.println("Output:\t" + obj.insertionSortList(
                new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))))));
        System.out.println("Output:\t" + obj.insertionSortList(
                new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))))));
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode curr = head;

        while (curr != null) {
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val <= curr.val) prev = prev.next;
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return dummy.next;
    }
}

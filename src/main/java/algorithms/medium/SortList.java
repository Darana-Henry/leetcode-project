//https://leetcode.com/problems/sort-list/description/
package algorithms.medium;

import context.ListNode;

public class SortList {
    public static void main(String[] args) {
        SortList sortList = new SortList();
        System.out.println(
                "Output:\t" + sortList.sortList(new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))))));
        System.out.println("Output:\t" + sortList.sortList(
                new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))))));
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while (left != null & right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        current.next = (left == null) ? right : left;
        return dummy.next;
    }
}

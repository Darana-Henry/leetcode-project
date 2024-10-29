package algorithms.medium.r;

import context.ListNode;

public class RotateList {
    public static void main(String[] args) {
        RotateList rotate = new RotateList();
        System.out.println("Output:\t" + rotate.rotateRight(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));
        System.out.println("Output:\t" + rotate.rotateRight(new ListNode(0, new ListNode(1, new ListNode(2))), 4));
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        int n = 0;
        ListNode current = head;
        while (current != null) {
            n++;
            current = current.next;
        }
        k %= n;
        if (k == 0) return head;

        ListNode fast = head;
        ListNode slow = head;

        while (k-- > 0) fast = fast.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        fast.next = head;
        slow.next = null;

        return newHead;
    }
}

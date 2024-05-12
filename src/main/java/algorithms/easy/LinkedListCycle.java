package algorithms.easy;

import context.ListNode;

public class LinkedListCycle {

    public static void main(String[] args) {

        LinkedListCycle cycle = new LinkedListCycle();

        ListNode root = new ListNode();
        System.out.println("Output:\t" + cycle.hasCycle(root));

        ListNode rooter = new ListNode();
        System.out.println("Output:\t" + cycle.hasCycle(rooter));
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null)
                return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

//https://leetcode.com/problems/linked-list-cycle-ii/
package algorithms.medium.l;

import context.ListNode;

public class LinkedListCycleII {
    public static void main(String[] args) {
        LinkedListCycleII cycle = new LinkedListCycleII();
        System.out.println(
                "Output:\t" + cycle.detectCycle(new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))))));
        System.out.println("Output:\t" + cycle.detectCycle(new ListNode(1, new ListNode(2))));
        System.out.println("Output:\t" + cycle.detectCycle(new ListNode(1)));
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode start = head;
                while (slow != start) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }
}

//https://leetcode.com/problems/reverse-nodes-in-k-group/
package algorithms.hard;

import context.ListNode;

public class ReverseNodesInKGroup {
    public static void main(String[] args) {
        ReverseNodesInKGroup reverse = new ReverseNodesInKGroup();
        System.out.println("Output:\t" + reverse.reverseKGroup(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));
        System.out.println("Output:\t" + reverse.reverseKGroup(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3));
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        ListNode curr = dummy;
        while (curr != null) {
            for (int i = 0; i < k && curr != null; i++)
                curr = curr.next;

            if (curr == null) return dummy.next;
            ListNode temp = curr.next;
            curr.next = null;
            ListNode start = pre.next;
            pre.next = reverse(start);
            start.next = temp;
            pre = start;
            curr = pre;
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }
}

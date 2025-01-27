//https://leetcode.com/problems/merge-nodes-in-between-zeros/
package algorithms.medium.m;

import context.ListNode;

public class MergeNodesInBetweenZeros {
    public static void main(String[] args) {
        MergeNodesInBetweenZeros obj = new MergeNodesInBetweenZeros();
        System.out.println("Output:\t" + obj.mergeNodes(new ListNode(0, new ListNode(3, new ListNode(1,
                new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))))));
        System.out.println("Output:\t" + obj.mergeNodes(new ListNode(0, new ListNode(1, new ListNode(0,
                new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(2, new ListNode(0))))))))));
    }

    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = head;
        ListNode curr = head;

        while (curr != null) {
            int sum = 0;
            ListNode first = curr;
            ListNode second = curr.next;

            while (second != null && second.val != 0) {
                sum += second.val;
                second = second.next;
            }

            first.val = sum;
            first.next = second;

            if (second.next == null && second.val == 0) {
                first.next = null;
                break;
            }

            curr = first.next;
        }

        return dummy;
    }

    public ListNode mergeNodesSimpler(ListNode head) {
        int sum = 0;
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        for (ListNode curr = head.next; curr != null; curr = curr.next) {
            if (curr.val != 0) sum += curr.val;
            else {
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
        }

        return dummy.next;
    }
}

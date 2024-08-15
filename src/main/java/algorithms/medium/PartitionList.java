//https://leetcode.com/problems/partition-list/
package algorithms.medium;

import context.ListNode;

public class PartitionList {
    public static void main(String[] args) {
        PartitionList partition = new PartitionList();
        System.out.println("Output:\t" + partition.partition(
                new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2)))))),
                3));
        System.out.println("Output:\t" + partition.partition(new ListNode(2, new ListNode(1)), 2));
    }

    public ListNode partition(ListNode head, int x) {
        ListNode greaterThanHead = new ListNode(0);
        ListNode lesserThanHead = new ListNode(0);
        ListNode greaterThanTail = greaterThanHead;
        ListNode lesserThanTail = lesserThanHead;

        while (head != null) {
            if (head.val < x) {
                lesserThanTail.next = head;
                lesserThanTail = lesserThanTail.next;
            } else {
                greaterThanTail.next = head;
                greaterThanTail = greaterThanTail.next;
            }
            head = head.next;
        }

        lesserThanTail.next = greaterThanHead.next;
        greaterThanTail.next = null;
        return lesserThanHead.next;
    }
}

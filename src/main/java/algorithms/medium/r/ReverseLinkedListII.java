//https://leetcode.com/problems/reverse-linked-list-ii/
package algorithms.medium.r;

import context.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ReverseLinkedListII reverse = new ReverseLinkedListII();
        System.out.println("Output:\t" + reverse.reverseBetween(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2, 4));
        System.out.println("Output:\t" + reverse.reverseBetween(new ListNode(5), 1, 1));
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null)
            return null;
        if (head.next == null || left == right)
            return head;

        ListNode dummy = new ListNode(0, head);

        ListNode leftPrevNode = dummy;
        for (int i = 0; i < left - 1; i++)
            leftPrevNode = leftPrevNode.next;

        ListNode leftNode = leftPrevNode.next;
        ListNode currentNode = leftNode;
        ListNode prevNode = null;

        for (int i = 0; i < right - left + 1; i++) {
            ListNode tempNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = tempNode;
        }

        leftPrevNode.next = prevNode;
        leftNode.next = currentNode;

        return dummy.next;
    }
}

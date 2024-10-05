//https://leetcode.com/problems/reverse-linked-list/description/
package algorithms.easy.r;

import context.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {

        ReverseLinkedList reverse = new ReverseLinkedList();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println("Output:\t" + reverse.reverseList(head));
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;

    }
}

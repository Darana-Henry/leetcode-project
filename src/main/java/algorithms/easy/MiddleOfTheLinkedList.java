//https://leetcode.com/problems/middle-of-the-linked-list/
package algorithms.easy;

import context.ListNode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        MiddleOfTheLinkedList middle = new MiddleOfTheLinkedList();
        System.out.println("Output:\t" + middle.middleNode(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
        System.out.println("Output:\t" + middle.middleNode(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))));
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

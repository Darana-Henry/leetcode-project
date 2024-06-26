//https://leetcode.com/problems/odd-even-linked-list/description/
package algorithms.medium;

import context.ListNode;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        OddEvenLinkedList oddEven = new OddEvenLinkedList();
        System.out.println("Output:\t" + oddEven.oddEvenList(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
        System.out.println("Output:\t" + oddEven.oddEvenList(
                new ListNode(2, new ListNode(1,
                        new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7)))))))));
    }

    public ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;

            }
            odd.next = evenHead;
        }
        return head;
    }
}

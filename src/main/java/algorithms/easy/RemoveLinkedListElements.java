//https://leetcode.com/problems/remove-linked-list-elements/description/
package algorithms.easy;

import context.ListNode;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        RemoveLinkedListElements e = new RemoveLinkedListElements();

        ListNode input = new ListNode(1,
                new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        System.out.println("Output:\t" + e.removeElements(input, 6));
    }

    public ListNode removeElementsOld(ListNode head, int val) {
        if (head != null && head.val != val)
            head = head.next;

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return current;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(-1);
        result.next = head;

        ListNode current = result;
        while (current.next != null) {
            if (current.next.val == val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return result.next;
    }
}

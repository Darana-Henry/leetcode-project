package algorithms.easy.r;//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

import context.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.println("Output:\t" + removeDuplicatesFromSortedList.deleteDuplicates(head));

        ListNode headNext = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        System.out.println("Output:\t" + removeDuplicatesFromSortedList.deleteDuplicates(headNext));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}

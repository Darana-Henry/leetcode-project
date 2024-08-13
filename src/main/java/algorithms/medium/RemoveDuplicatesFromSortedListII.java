//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
package algorithms.medium;

import context.ListNode;

public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListII sortedList = new RemoveDuplicatesFromSortedListII();
        System.out.println("Output:\t" + sortedList.deleteDuplicates(new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))))));
        System.out.println("Output:\t" + sortedList.deleteDuplicates(
                new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))))));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = head;
        ListNode preceding = dummy;

        while (current != null) {
            while (current.next != null && current.val == current.next.val) current = current.next;

            if (preceding.next == current) preceding = current;
            else preceding.next = current.next;
            current = current.next;
        }
        return dummy.next;
    }
}

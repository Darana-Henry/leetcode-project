//https://leetcode.com/problems/merge-in-between-linked-lists/
package algorithms.medium.m;

import context.ListNode;

public class MergeInBetweenLinkedLists {
    public static void main(String[] args) {
        MergeInBetweenLinkedLists obj = new MergeInBetweenLinkedLists();
        System.out.println("Output:\t" + obj.mergeInBetween(
                new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9, new ListNode(5)))))),
                3, 4, new ListNode(1, new ListNode(2, new ListNode(3)))));
        System.out.println("Output:\t" + obj.mergeInBetween(new ListNode(0,
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))),
                2, 5, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode left = null, right = list1;
        ListNode end = list2;

        for (int i = 0; i < b; i++) {
            if (i == a - 1) left = right;
            right = right.next;
        }

        while (end.next != null) end = end.next;

        left.next = list2;
        end.next = right.next;

        return list1;
    }
}

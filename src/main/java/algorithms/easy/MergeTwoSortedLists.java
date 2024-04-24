package algorithms.easy;

import context.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println("Output:\t" + mergeTwoSortedLists.mergeTwoLists(list1, list2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode(0);
        ListNode current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        return temp.next;
    }
}



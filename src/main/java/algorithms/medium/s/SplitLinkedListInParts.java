//https://leetcode.com/problems/split-linked-list-in-parts/
package algorithms.medium.s;

import context.ListNode;

public class SplitLinkedListInParts {
    public static void main(String[] args) {
        SplitLinkedListInParts obj = new SplitLinkedListInParts();
        System.out.println("Output:\t" + obj.splitListToParts(new ListNode(1, new ListNode(2, new ListNode(3))), 5));
        System.out.println("Output:\t" + obj.splitListToParts(new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5,
                        new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10)))))))))), 3));
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode[] answer = new ListNode[k];

        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int split = size / k;
        int rem = size % k;

        curr = head;
        ListNode prev = curr;
        for (int i = 0; i < k; i++) {
            int len = split;
            ListNode part = curr;
            if (rem > 0) {
                rem--;
                len++;
            }
            int j = 0;
            while (j < len) {
                prev = curr;
                curr = curr.next;
                j++;
            }

            if (prev != null) prev.next = null;

            answer[i] = part;
        }

        return answer;
    }
}

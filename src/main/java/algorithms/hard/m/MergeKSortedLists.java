//https://leetcode.com/problems/merge-k-sorted-lists/
package algorithms.hard.m;

import context.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        MergeKSortedLists merge = new MergeKSortedLists();
        System.out.println("Output:\t" + merge.mergeKLists(
                new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5))), new ListNode(1,
                        new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6))}));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        for (ListNode list : lists)
            if (list != null) pq.offer(list);

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            if (node.next != null) pq.offer(node.next);
            curr.next = node;
            curr = curr.next;
        }

        return dummy.next;
    }
}

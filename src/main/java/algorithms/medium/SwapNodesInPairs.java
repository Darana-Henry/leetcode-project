//https://leetcode.com/problems/swap-nodes-in-pairs/description/
package algorithms.medium;


import context.ListNode;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        SwapNodesInPairs swap = new SwapNodesInPairs();
        System.out.println(
                "Output:\t" + swap.swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
        System.out.println("Output:\t" + swap.swapPairs(new ListNode()));
        System.out.println("Output:\t" + swap.swapPairs(new ListNode(1)));
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode precede = dummy;
        ListNode current = head;

        while (current != null && current.next != null) {
            ListNode future = current.next;
            current.next = future.next;
            future.next = current;
            precede.next = future;
            precede = current;
            current = current.next;
        }
        return dummy.next;
    }
}

//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
package algorithms.medium.i;

import context.ListNode;

public class InsertGreatestCommonDivisorsInLinkedList {
    public static void main(String[] args) {
        InsertGreatestCommonDivisorsInLinkedList obj = new InsertGreatestCommonDivisorsInLinkedList();
        System.out.println("Output:\t" + obj.insertGreatestCommonDivisors(
                new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))))));
        System.out.println("Output:\t" + obj.insertGreatestCommonDivisors(new ListNode(7)));
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr.next != null) {
            int val = gcd(curr.val, curr.next.val);
            ListNode mid = new ListNode(val);
            mid.next = curr.next;
            curr.next = mid;
            curr = curr.next.next;
        }

        return head;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

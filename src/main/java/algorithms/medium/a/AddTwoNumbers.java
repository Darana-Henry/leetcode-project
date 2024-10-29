//https://leetcode.com/problems/add-two-numbers/description/
package algorithms.medium.a;

import context.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers add2 = new AddTwoNumbers();
        ListNode ex1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode ex2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        System.out.println("Output:\t" + add2.addTwoNumbers(ex1, ex2));

        ListNode ex3 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode ex4 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println("Output:\t" + add2.addTwoNumbers(ex3, ex4));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (l1 != null | l2 != null || carry > 0) {
            int digit1 = l1 == null ? 0 : l1.val;
            int digit2 = l2 == null ? 0 : l2.val;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            current.next = new ListNode(digit);
            current = current.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return dummy.next;
    }
}

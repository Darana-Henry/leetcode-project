//https://leetcode.com/problems/palindrome-linked-list/description/
package algorithms.easy;

import context.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList palindrome = new PalindromeLinkedList();
        System.out.println("Output:\t" + palindrome.isPalindrome(
                new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
        System.out.println("Output:\t" + palindrome.isPalindrome(new ListNode(1, new ListNode(2))));
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reversed(slow);
        fast = head;

        while (slow != null) {
            if (slow.val != fast.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reversed(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
package algorithms.easy.c;

import context.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        ConvertBinaryNumberInALinkedListToInteger convert = new ConvertBinaryNumberInALinkedListToInteger();
        System.out.println("Output:\t" + convert.getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1)))));
        System.out.println("Output:\t" + convert.getDecimalValue(new ListNode(0)));
    }

    public int getDecimalValue(ListNode head) {
        int answer = 0;
        while (head != null) {
            answer = (answer << 1) | head.val;
            head = head.next;
        }
        return answer;
    }
}

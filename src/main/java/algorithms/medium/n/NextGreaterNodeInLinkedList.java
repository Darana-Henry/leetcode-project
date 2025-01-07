//https://leetcode.com/problems/next-greater-node-in-linked-list/
package algorithms.medium.n;

import context.ListNode;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterNodeInLinkedList {

    public static void main(String[] args) {
        NextGreaterNodeInLinkedList obj = new NextGreaterNodeInLinkedList();
        System.out.println("Output:\t" + obj.nextLargerNodes(new ListNode(2, new ListNode(1, new ListNode(5)))));
        System.out.println("Output:\t" + obj.nextLargerNodes(
                new ListNode(2, new ListNode(7, new ListNode(4, new ListNode(3, new ListNode(5)))))));
    }

    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int[] answer = new int[list.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                answer[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }

        return answer;
    }
}

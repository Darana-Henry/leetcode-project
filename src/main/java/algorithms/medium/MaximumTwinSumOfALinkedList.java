package algorithms.medium;

import context.ListNode;

import java.util.*;

public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {
        MaximumTwinSumOfALinkedList maxTwin = new MaximumTwinSumOfALinkedList();
        System.out.println("Output:\t" + maxTwin.pairSumWithStackAndQueue(
                new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))))));
//        System.out.println("Output:\t" + maxTwin.pairSumWithHashMap(
//                new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))))));
        System.out.println("Output:\t" + maxTwin.pairSumWithDeque(
                new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))))));
    }

    public int pairSumWithStackAndQueue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        ListNode load = head;

        while (load != null) {
            stack.add(load.val);
            queue.add(load.val);
            load = load.next;
        }

        int max = 0;
        int i = 0;
        while (i < (stack.size() / 2)) {
            int sum = stack.pop() + queue.poll();
            max = Math.max(sum, max);
            i++;
        }

        return max;
    }

    public int pairSumWithHashMap(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode current = head;

        int index = 0;
        while (current != null) {
            map.put(index, current.val);
            current = current.next;
            index++;
        }

        index = map.size();
        int maxSum = 0;
        while (index > (map.size() / 2)) {
            int sum = map.get(index) + map.get(map.size() - index);
            maxSum = Math.max(sum, maxSum);
            index--;
        }

        return maxSum;
    }

    public int pairSumWithDeque(ListNode head) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ListNode current = head;

        while (current != null) {
            deque.add(current.val);
            current = current.next;
        }

        int maxSum = 0;
        while (!deque.isEmpty()) {
            int sum = deque.peek() + deque.peekLast();
            if (sum > maxSum)
                maxSum = sum;

            deque.poll();
            deque.pollLast();
        }
        return maxSum;
    }
}

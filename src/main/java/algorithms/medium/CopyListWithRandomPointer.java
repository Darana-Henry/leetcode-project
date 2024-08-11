//https://leetcode.com/problems/copy-list-with-random-pointer/
package algorithms.medium;

import context.Node;

public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        CopyListWithRandomPointer copy = new CopyListWithRandomPointer();
        //Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
        //System.out.println("Output:\t" + copy.copyRandomList());

        //Input: head = [[1,1],[2,1]]
        //System.out.println("Output:\t" + copy.copyRandomList());

        //Input: head = [[3,null],[3,0],[3,null]]
        //System.out.println("Output:\t" + copy.copyRandomList());
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node node = new Node(curr.val);
            node.next = curr.next;
            curr.next = node;
            curr = node.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;
        while (curr != null) {
            curr.next = curr.next.next;
            curr = curr.next;
            if (curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }
        return newHead;
    }
}

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
package algorithms.medium;

import context.Node;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {
    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNodeII populate = new PopulatingNextRightPointersInEachNodeII();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n7;
        System.out.println("Output:\t" + populate.connectUnOptimized(n1));
        System.out.println("Output:\t" + populate.connectUnOptimized(new Node()));
        System.out.println("Output:\t" + populate.connectConstantSpace(n1));
        System.out.println("Output:\t" + populate.connectConstantSpace(new Node()));
    }

    public Node connectUnOptimized(Node root) {
        if (root == null) return root;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Node dummy = new Node(0);
            while (size-- > 0) {
                Node current = q.remove();
                dummy.next = current;
                dummy = dummy.next;
                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
            }
        }
        return root;
    }

    public Node connectConstantSpace(Node root) {
        if (root == null) return root;
        Node head = root;
        while (head != null) {
            Node dummy = new Node(0);
            Node temp = dummy;
            while (head != null) {
                if (head.left != null) {
                    temp.next = head.left;
                    temp = temp.next;
                }
                if (head.right != null) {
                    temp.next = head.right;
                    temp = temp.next;
                }
                head = head.next;
            }
            head = dummy.next;
        }
        return root;
    }
}

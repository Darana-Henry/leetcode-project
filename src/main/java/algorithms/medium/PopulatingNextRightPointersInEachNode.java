//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
package algorithms.medium;

import context.Node;

public class PopulatingNextRightPointersInEachNode {
    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode populate = new PopulatingNextRightPointersInEachNode();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        System.out.println("Output:\t" + populate.connect(n1));
        System.out.println("Output:\t" + populate.connect(new Node()));
    }

    public Node connect(Node root) {
        if (root == null || root.left == null || root.right == null) return root;
        root.left.next = root.right;
        if (root.next != null) root.right.next = root.next.left;
        connect(root.left);
        connect(root.right);
        return root;
    }
}

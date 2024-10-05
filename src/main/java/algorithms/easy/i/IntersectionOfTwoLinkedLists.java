package algorithms.easy.i;

import context.ListNode;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

        IntersectionOfTwoLinkedLists intersect = new IntersectionOfTwoLinkedLists();

        ListNode intersectC = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, intersectC));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, intersectC)));

        System.out.println("Output:\t" + intersect.getIntersectionNode(headA, headB).val);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pointerForA = headA;
        ListNode pointerForB = headB;

        while (pointerForA != pointerForB) {
            if (pointerForA == null)
                pointerForA = headB;
            else
                pointerForA = pointerForA.next;

            if (pointerForB == null)
                pointerForB = headA;
            else
                pointerForB = pointerForB.next;
        }
        return pointerForA;
    }
}

package context;

public class DoubleLinkedList {
    public int key;
    public int val;
    public DoubleLinkedList prev;
    public DoubleLinkedList next;

    public DoubleLinkedList(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
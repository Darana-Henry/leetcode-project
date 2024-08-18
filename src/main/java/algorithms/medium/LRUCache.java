//https://leetcode.com/problems/lru-cache/
package algorithms.medium;

import context.DoubleLinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final DoubleLinkedList head;
    private final DoubleLinkedList tail;
    private final Map<Integer, DoubleLinkedList> map;
    private final int capacity;
    private int size;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new DoubleLinkedList(0, 0);
        tail = new DoubleLinkedList(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println("Output:\t" + lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println("Output:\t" + lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println("Output:\t" + lRUCache.get(1));    // return -1 (not found)
        System.out.println("Output:\t" + lRUCache.get(3));    // return 3
        System.out.println("Output:\t" + lRUCache.get(4));    // return 4
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        DoubleLinkedList node = map.get(key);
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            DoubleLinkedList node = map.get(key);
            node.val = value;
            moveToHead(node);
        } else {
            DoubleLinkedList node = new DoubleLinkedList(key, value);
            map.put(key, node);
            addToHead(node);
            size++;
            if (size > capacity) {
                DoubleLinkedList tail = removeTail();
                map.remove(tail.key);
                size--;
            }
        }
    }

    private void moveToHead(DoubleLinkedList node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DoubleLinkedList node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DoubleLinkedList node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private DoubleLinkedList removeTail() {
        DoubleLinkedList res = tail.prev;
        removeNode(res);
        return res;
    }
}

//https://leetcode.com/problems/design-a-number-container-system/
package algorithms.medium.d;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DesignANumberContainerSystem {
    public static void main(String[] args) {
        NumberContainers nc = new NumberContainers();
        System.out.println("Output:\t" + nc.find(10));
        nc.change(2, 10);
        nc.change(1, 10);
        nc.change(3, 10);
        nc.change(5, 10);
        System.out.println("Output:\t" + nc.find(10));
        nc.change(1, 20);
        System.out.println("Output:\t" + nc.find(10));
    }
}

class NumberContainers {
    Map<Integer, Integer> i2n;
    Map<Integer, PriorityQueue<Integer>> n2i;

    public NumberContainers() {
        i2n = new HashMap<>();
        n2i = new HashMap<>();
    }

    public void change(int index, int number) {
        i2n.put(index, number);
        n2i.computeIfAbsent(number, k -> new PriorityQueue<>()).add(index);
    }

    public int find(int number) {
        if (!n2i.containsKey(number)) return -1;

        PriorityQueue heap = n2i.get(number);
        while (!heap.isEmpty()) {
            int index = (int) heap.peek();
            if (i2n.get(index) == number) return index;
            heap.poll();
        }
        return -1;
    }
}

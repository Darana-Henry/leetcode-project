//https://leetcode.com/problems/find-median-from-data-stream/
package algorithms.hard.f;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        System.out.println("Output:\t" + medianFinder.findMedian()); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        System.out.println("Output:\t" + medianFinder.findMedian()); // return 2.0
        medianFinder.addNum(4);
        System.out.println("Output:\t" + medianFinder.findMedian());
        medianFinder.addNum(5);
        System.out.println("Output:\t" + medianFinder.findMedian());
    }

}

class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());
        if (maxHeap.size() > minHeap.size() + 1) minHeap.offer(maxHeap.poll());
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) return maxHeap.peek();
        return (minHeap.peek() + maxHeap.peek()) / 2.0;
    }
}
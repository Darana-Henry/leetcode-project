//https://leetcode.com/problems/kth-largest-element-in-a-stream
package algorithms.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    public static void main(String[] args) {
        KthLargestNonOptimized nonOptimized = new KthLargestNonOptimized(3, new int[]{4, 5, 8, 2});
        System.out.println("Output:\t" + nonOptimized.add(3));   // return 4
        System.out.println("Output:\t" + nonOptimized.add(5));   // return 5
        System.out.println("Output:\t" + nonOptimized.add(10));  // return 5
        System.out.println("Output:\t" + nonOptimized.add(9));   // return 8
        System.out.println("Output:\t" + nonOptimized.add(4));   // return 8

        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println("Output:\t" + kthLargest.add(3));   // return 4
        System.out.println("Output:\t" + kthLargest.add(5));   // return 5
        System.out.println("Output:\t" + kthLargest.add(10));  // return 5
        System.out.println("Output:\t" + kthLargest.add(9));   // return 8
        System.out.println("Output:\t" + kthLargest.add(4));   // return 8
    }
}

class KthLargestNonOptimized {
    PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
    int n;

    public KthLargestNonOptimized(int k, int[] nums) {
        this.n = k;
        for (int num : nums)
            q.offer(num);
    }

    public int add(int val) {
        int m = n;
        q.offer(val);
        List<Integer> list = new ArrayList<>();
        while (m-- > 1) list.add(q.poll());
        int answer = q.poll();
        list.add(answer);
        for (int i = 0; i < list.size(); i++)
            q.offer(list.get(i));
        return answer;
    }
}

class KthLargest {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int n;

    public KthLargest(int k, int[] nums) {
        this.n = k;
        for (int num : nums)
            add(num);
    }

    public int add(int val) {
        q.add(val);
        if (q.size() > n) q.poll();
        return q.peek();
    }
}
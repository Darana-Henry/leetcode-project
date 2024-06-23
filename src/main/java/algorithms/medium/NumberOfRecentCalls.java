//https://leetcode.com/problems/number-of-recent-calls/description/
package algorithms.medium;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int param = obj.ping(200);
        System.out.println("Output:\t" + param);
    }
}

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
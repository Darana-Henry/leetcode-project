//https://leetcode.com/problems/last-stone-weight/
package algorithms.easy;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        LastStoneWeight stone = new LastStoneWeight();
        System.out.println("Output:\t" + stone.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        System.out.println("Output:\t" + stone.lastStoneWeight(new int[]{1}));
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones)
            pq.offer(stone);

        while (pq.size() > 1) {
            int one = pq.poll();
            int two = pq.poll();
            if (one != two) pq.offer(one - two);

        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}

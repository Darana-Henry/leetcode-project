//https://leetcode.com/problems/take-gifts-from-the-richest-pile/
package algorithms.easy;

import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        TakeGiftsFromTheRichestPile gifts = new TakeGiftsFromTheRichestPile();
        System.out.println("Output:\t" + gifts.pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
        System.out.println("Output:\t" + gifts.pickGifts(new int[]{1, 1, 1, 1}, 4));
    }

    public long pickGifts(int[] gifts, int k) {
        long remain = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int gift : gifts)
            pq.offer(gift);
        while (k-- > 0) pq.add((int) Math.sqrt(pq.remove()));
        while (!pq.isEmpty()) remain += pq.poll();
        return remain;
    }
}

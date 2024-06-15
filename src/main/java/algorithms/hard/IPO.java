//https://leetcode.com/problems/ipo/description/
package algorithms.hard;

import java.util.PriorityQueue;

public class IPO {
    public static void main(String[] args) {
        IPO ipo = new IPO();
        System.out.println("Output:\t" + ipo.findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
        System.out.println("Output:\t" + ipo.findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}));
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minC = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> maxP = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < profits.length; i++)
            minC.offer(new int[]{capital[i], profits[i]});

        while (k-- > 0) {
            while (!minC.isEmpty() && minC.peek()[0] <= w)
                maxP.add(minC.poll()[1]);

            if (maxP.isEmpty())
                break;

            w += maxP.poll();
        }
        return w;
    }
}

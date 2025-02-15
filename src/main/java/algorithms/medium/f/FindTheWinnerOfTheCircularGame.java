//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
package algorithms.medium.f;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheWinnerOfTheCircularGame {
    public static void main(String[] args) {
        FindTheWinnerOfTheCircularGame obj = new FindTheWinnerOfTheCircularGame();
        System.out.println("Output:\t" + obj.findTheWinner(5, 2));
        System.out.println("Output:\t" + obj.findTheWinner(6, 5));
    }

    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++)
            q.offer(i);

        while (q.size() > 1) {
            for (int i = 1; i < k; i++)
                q.offer(q.poll());
            q.poll();
        }

        return q.peek();
    }
}

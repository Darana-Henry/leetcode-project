//https://leetcode.com/problems/jump-game-iii/
package algorithms.medium.j;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {
    public static void main(String[] args) {
        JumpGameIII obj = new JumpGameIII();
        System.out.println("Output:\t" + obj.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5));
        System.out.println("Output:\t" + obj.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 0));
        System.out.println("Output:\t" + obj.canReach(new int[]{3, 0, 2, 1, 2}, 2));
    }

    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (arr[curr] == 0) return true;
            if (arr[curr] < 0) continue;
            if (curr + arr[curr] < arr.length) q.offer(curr + arr[curr]);
            if (curr - arr[curr] >= 0) q.offer(curr - arr[curr]);
            arr[curr] = -arr[curr];
        }
        return false;
    }
}

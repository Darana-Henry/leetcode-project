//https://leetcode.com/problems/task-scheduler/
package algorithms.medium.t;

import java.util.Arrays;

public class TaskScheduler {
    public static void main(String[] args) {
        TaskScheduler obj = new TaskScheduler();
        System.out.println("Output:\t" + obj.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        System.out.println("Output:\t" + obj.leastInterval(new char[]{'A', 'C', 'A', 'B', 'D', 'B'}, 1));
        System.out.println("Output:\t" + obj.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 3));
    }

    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for (char ch : tasks)
            count[ch - 'A']++;

        Arrays.sort(count);
        int max = count[25] - 1;
        int slots = max * n;

        for (int i = 24; i >= 0; i--)
            slots -= Math.min(max, count[i]);

        slots = Math.max(0, slots);
        return slots + tasks.length;
    }
}

//https://leetcode.com/problems/relative-ranks/
package algorithms.easy.r;

import java.util.PriorityQueue;

public class RelativeRanks {
    public static void main(String[] args) {
        RelativeRanks ranks = new RelativeRanks();
        System.out.println("Output:\t" + ranks.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
        System.out.println("Output:\t" + ranks.findRelativeRanks(new int[]{10, 3, 8, 9, 4}));
    }

    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int i = 0; i < n; i++)
            pq.add(new int[]{i, score[i]});

        for (int i = 0; i < n; i++) {
            int[] current = pq.poll();

            if (i == 0) answer[current[0]] = "Gold Medal";
            else if (i == 1) answer[current[0]] = "Silver Medal";
            else if (i == 2) answer[current[0]] = "Bronze Medal";
            else answer[current[0]] = i + 1 + "";
        }
        return answer;
    }
}

//https://leetcode.com/problems/top-k-frequent-elements/
package algorithms.medium.t;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements top = new TopKFrequentElements();
        System.out.println("Output:\t" + top.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        System.out.println("Output:\t" + top.topKFrequent(new int[]{1}, 1));
    }

    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;

        int[] answer = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(b) - map.get(a)));

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : map.keySet())
            pq.offer(num);

        for (int i = 0; i < k; i++)
            answer[i] = pq.poll();

        return answer;
    }
}

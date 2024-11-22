//https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/
package algorithms.easy.f;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindXSumOfAllKLongSubarraysI {
    public static void main(String[] args) {
        FindXSumOfAllKLongSubarraysI xSum = new FindXSumOfAllKLongSubarraysI();
        System.out.println("Output:\t" + xSum.findXSum(new int[]{1, 1, 2, 2, 3, 4, 2, 3}, 6, 2));
        System.out.println("Output:\t" + xSum.findXSum(new int[]{3, 8, 7, 8, 7, 5}, 2, 2));
    }

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for (int i = 0; i < answer.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int j = i; j < i + k; j++)
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
                if (map.get(a) == map.get(b)) return b - a;
                return map.get(b) - map.get(a);
            });

            for (int val : map.keySet())
                maxHeap.add(val);

            int count = x;

            while (count-- > 0 && !maxHeap.isEmpty()) {
                int top = maxHeap.remove();
                answer[i] += (top * map.get(top));
            }

        }

        return answer;
    }
}

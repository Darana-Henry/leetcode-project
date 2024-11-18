//https://leetcode.com/problems/degree-of-an-array/
package algorithms.easy.d;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    public static void main(String[] args) {
        DegreeOfAnArray degree = new DegreeOfAnArray();
        System.out.println("Output:\t" + degree.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        System.out.println("Output:\t" + degree.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    public int findShortestSubArray(int[] nums) {
        int degree = 0, answer = Integer.MAX_VALUE;
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            degree = Math.max(degree, count.get(nums[i]));

            if (!first.containsKey(nums[i])) first.put(nums[i], i);

            last.put(nums[i], i);
        }

        for (int num : nums)
            if (count.get(num) == degree) answer = Math.min(answer, last.get(num) - first.get(num) + 1);

        return answer;
    }
}

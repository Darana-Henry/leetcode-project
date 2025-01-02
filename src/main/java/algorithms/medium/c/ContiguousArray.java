//https://leetcode.com/problems/contiguous-array/
package algorithms.medium.c;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        ContiguousArray obj = new ContiguousArray();
        System.out.println("Output:\t" + obj.findMaxLength(new int[]{0, 1}));
        System.out.println("Output:\t" + obj.findMaxLength(new int[]{0, 1, 0}));
    }

    public int findMaxLength(int[] nums) {
        int answer = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(count)) answer = Math.max(answer, i - map.get(count));
            else map.put(count, i);
        }
        return answer;
    }
}

//https://leetcode.com/problems/majority-element-ii/
package algorithms.medium.m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        MajorityElementII obj = new MajorityElementII();
        System.out.println("Output:\t" + obj.majorityElement(new int[]{3, 2, 3}));
        System.out.println("Output:\t" + obj.majorityElement(new int[]{1}));
        System.out.println("Output:\t" + obj.majorityElement(new int[]{1, 2}));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : map.keySet())
            if (map.get(num) > (nums.length / 3)) answer.add(num);

        return answer;
    }
}

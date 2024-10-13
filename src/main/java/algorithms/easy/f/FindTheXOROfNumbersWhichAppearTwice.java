//https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/
package algorithms.easy.f;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class FindTheXOROfNumbersWhichAppearTwice {
    public static void main(String[] args) {
        FindTheXOROfNumbersWhichAppearTwice twice = new FindTheXOROfNumbersWhichAppearTwice();
        System.out.println("Output:\t" + twice.duplicateNumbersXORWithHashMap(new int[]{1, 2, 1, 3}));
        System.out.println("Output:\t" + twice.duplicateNumbersXORWithHashMap(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + twice.duplicateNumbersXORWithHashMap(new int[]{1, 2, 2, 1}));
        System.out.println("Output:\t" + twice.duplicateNumbersXOR(new int[]{1, 2, 1, 3}));
        System.out.println("Output:\t" + twice.duplicateNumbersXOR(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + twice.duplicateNumbersXOR(new int[]{1, 2, 2, 1}));
    }

    public int duplicateNumbersXORWithHashMap(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() == 2) answer ^= entry.getKey();

        return answer;
    }

    public int duplicateNumbersXOR(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1]) answer ^= nums[i];

        return answer;
    }
}

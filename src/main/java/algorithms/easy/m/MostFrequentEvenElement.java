//https://leetcode.com/problems/most-frequent-even-element/
package algorithms.easy.m;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        MostFrequentEvenElement freq = new MostFrequentEvenElement();
        System.out.println("Output:\t" + freq.mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1}));
        System.out.println("Output:\t" + freq.mostFrequentEven(new int[]{4, 4, 4, 9, 2, 4}));
        System.out.println("Output:\t" + freq.mostFrequentEven(new int[]{29, 47, 21, 41, 13, 37, 25, 7}));
    }

    public int mostFrequentEven(int[] nums) {
        int answer = -1, max = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            if (num % 2 == 0) map.put(num, map.getOrDefault(num, 0) + 1);

        for (var entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (max < count || (max == count && answer > num)) {
                max = count;
                answer = num;
            }
        }

        return answer;
    }
}

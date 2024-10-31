//https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
package algorithms.easy.c;

import java.util.Map;
import java.util.HashMap;

public class CountPairsThatFormACompleteDayI {
    public static void main(String[] args) {
        CountPairsThatFormACompleteDayI complete = new CountPairsThatFormACompleteDayI();
        System.out.println("Output:\t" + complete.countCompleteDayPairsHashMap(new int[]{12, 12, 30, 24, 24}));
        System.out.println("Output:\t" + complete.countCompleteDayPairsHashMap(new int[]{72, 48, 24, 3}));
        System.out.println("Output:\t" + complete.countCompleteDayPairs(new int[]{12, 12, 30, 24, 24}));
        System.out.println("Output:\t" + complete.countCompleteDayPairs(new int[]{72, 48, 24, 3}));
    }


    public int countCompleteDayPairsHashMap(int[] hours) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int hour : hours) {
            int remainder = hour % 24;
            if (remainder == 0) answer += map.getOrDefault(0, 0);
            else answer += map.getOrDefault(24 - remainder, 0);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return answer;
    }

    public int countCompleteDayPairs(int[] hours) {
        int result = 0;

        for (int i = 0; i < hours.length - 1; i++)
            for (int j = i + 1; j < hours.length; j++)
                if ((hours[i] + hours[j]) % 24 == 0) result++;

        return result;
    }
}

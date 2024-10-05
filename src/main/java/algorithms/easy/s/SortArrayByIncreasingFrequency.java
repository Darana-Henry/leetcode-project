//https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        SortArrayByIncreasingFrequency sortByFreq = new SortArrayByIncreasingFrequency();
        System.out.println("Output:\t" + sortByFreq.frequencySort(new int[]{1, 1, 2, 2, 2, 3}));
        System.out.println("Output:\t" + sortByFreq.frequencySort(new int[]{2, 3, 1, 3, 2}));
        System.out.println("Output:\t" + sortByFreq.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}));
    }

    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b));

        int index = 0;
        for (int num : list) {
            for (int i = 0; i < map.get(num); i++) {
                nums[index++] = num;
            }
        }
        return nums;
    }
}

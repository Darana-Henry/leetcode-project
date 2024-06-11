//https://leetcode.com/problems/relative-sort-array/description/
package algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RelativeSortArray {

    public static void main(String[] args) {

        RelativeSortArray relativeSort = new RelativeSortArray();
        System.out.println("Output:\t" + relativeSort.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2, 1, 4, 3, 9, 6}));
        System.out.println(
                "Output:\t" + relativeSort.relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6}));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr1)
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);

        int pointer = 0;
        for (int num : arr2) {
            if (frequency.containsKey(num)) {
                int currentFrequency = frequency.get(num);
                while (currentFrequency-- > 0)
                    arr1[pointer++] = num;
                frequency.remove(num);
            }
        }

        ArrayList<Integer> sortedKeys = new ArrayList<Integer>(frequency.keySet());
        Collections.sort(sortedKeys);

        for (int key : sortedKeys) {
            int currentFrequency = frequency.get(key);
            while (currentFrequency-- > 0)
                arr1[pointer++] = key;
        }
        return arr1;
    }
}

//https://leetcode.com/problems/unique-number-of-occurrences/
package algorithms.easy.u;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        UniqueNumberOfOccurrences uniqueOcc = new UniqueNumberOfOccurrences();
        System.out.println("Output:\t" + uniqueOcc.uniqueOccurrences(new int[]{1, 1, 1}));
        System.out.println("Output:\t" + uniqueOcc.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println("Output:\t" + uniqueOcc.uniqueOccurrencesFaster(new int[]{1, 2}));
        System.out.println("Output:\t" + uniqueOcc.uniqueOccurrencesFaster(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (list.contains(entry.getValue()))
                return false;
            else
                list.add(entry.getValue());
        }
        return true;
    }

    public boolean uniqueOccurrencesFaster(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        HashSet<Integer> set = new HashSet<>(map.values());

        return map.size() == set.size();
    }
}


//https://leetcode.com/problems/sort-the-people/description/
package algorithms.easy.s;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static void main(String[] args) {
        SortThePeople people = new SortThePeople();
        System.out.println(
                "Output:\t" + people.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}));
        System.out.println(
                "Output:\t" + people.sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150}));
    }

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] sorted = new String[names.length];

        for (int i = 0; i < names.length; i++)
            map.put(heights[i], names[i]);

        Arrays.sort(heights);
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--)
            sorted[index++] = map.get(heights[i]);

        return sorted;
    }
}


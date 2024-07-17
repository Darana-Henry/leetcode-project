//https://leetcode.com/problems/intersection-of-two-arrays/description/
package algorithms.easy;

import algorithms.medium.FindMinimumInRotatedSortedArray;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();
        System.out.println("Output:\t" + intersection.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        System.out.println("Output:\t" + intersection.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums1)
            if (!map.containsKey(num))
                map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : nums2) {
            if (map.containsKey(num)) {
                map.remove(num);
                list.add(num);
            }
        }

        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            output[i] = list.get(i);
        return output;
    }
}

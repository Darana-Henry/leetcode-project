//https://leetcode.com/problems/find-the-difference-of-two-arrays/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {

        FindTheDifferenceOfTwoArrays theDifference = new FindTheDifferenceOfTwoArrays();
        System.out.println("Output:\t" + theDifference.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        System.out.println("Output:\t" + theDifference.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> one = new HashSet<>();
        Set<Integer> two = new HashSet<>();
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for (int num : nums1)
            one.add(num);

        for (int num : nums2)
            two.add(num);

        for (int num : one)
            if (!two.contains(num))
                result.get(0).add(num);

        for (int num : two)
            if (!one.contains(num))
                result.get(1).add(num);

        return result;
    }
}


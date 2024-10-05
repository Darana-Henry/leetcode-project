//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
package algorithms.easy.i;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        IntersectionOfTwoArraysII intersection = new IntersectionOfTwoArraysII();
        System.out.println("Output:\t" + intersection.intersectViaPointers(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        System.out.println(
                "Output:\t" + intersection.intersectViaHashMap(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

    public int[] intersectViaPointers(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int returnArrayPointer = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (nums1Pointer < length1 && nums2Pointer < length2) {
            if (nums1[nums1Pointer] < nums2[nums2Pointer])
                nums1Pointer++;
            else if (nums1[nums1Pointer] > nums2[nums2Pointer])
                nums2Pointer++;
            else if (nums1[nums1Pointer] == nums2[nums2Pointer]) {
                nums1[returnArrayPointer] = nums1[nums1Pointer];
                returnArrayPointer++;
                nums1Pointer++;
                nums2Pointer++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, returnArrayPointer);
    }

    public int[] intersectViaHashMap(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pointer = 0;

        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                nums1[pointer++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, pointer);
    }
}

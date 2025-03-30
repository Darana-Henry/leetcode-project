//https://leetcode.com/problems/replace-elements-in-an-array/
package algorithms.medium.r;

import java.util.HashMap;
import java.util.Map;

public class ReplaceElementsInAnArray {
    public static void main(String[] args) {
        ReplaceElementsInAnArray obj = new ReplaceElementsInAnArray();
        System.out.println("Output:\t" + obj.arrayChange(new int[]{1, 2, 4, 6}, new int[][]{{1, 3}, {4, 7}, {6, 1}}));
        System.out.println("Output:\t" + obj.arrayChange(new int[]{1, 2}, new int[][]{{1, 3}, {2, 1}, {3, 2}}));
    }

    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int[] op : operations) {
            nums[map.get(op[0])] = op[1];
            map.put(op[1], map.get(op[0]));
        }

        return nums;
    }
}

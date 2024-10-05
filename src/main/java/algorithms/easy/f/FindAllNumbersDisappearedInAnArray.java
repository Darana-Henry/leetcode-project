//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray disappeared = new FindAllNumbersDisappearedInAnArray();
        System.out.println(
                "Output:\t" + disappeared.findDisappearedNumbersWithHashMap(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println("Output:\t" + disappeared.findDisappearedNumbers(new int[]{1, 1}));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }

        return list;
    }

    public List<Integer> findDisappearedNumbersWithHashMap(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i))
                list.add(i);
        }
        return list;
    }
}

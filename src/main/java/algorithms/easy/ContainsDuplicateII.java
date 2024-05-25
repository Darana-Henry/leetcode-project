//https://leetcode.com/problems/contains-duplicate-ii/description/
package algorithms.easy;

import java.util.HashMap;

public class ContainsDuplicateII {

    public static void main(String[] args) {

        ContainsDuplicateII contains = new ContainsDuplicateII();

        System.out.println("Output:\t" + contains.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println("Output:\t" + contains.containsNearbyDuplicateII(new int[]{1, 0, 1, 1}, 1));
        System.out.println("Output:\t" + contains.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> container = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (container.containsKey(nums[i])) {
                if (i - container.get(nums[i]) <= k)
                    return true;
                else
                    container.replace(nums[i], i);
            } else
                container.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicateII(int[] nums, int k) {
        HashMap<Integer, Integer> container = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (container.containsKey(current) && i - container.get(current) <= k) {
                return true;
            } else
                container.put(nums[i], i);
        }
        return false;
    }
}
//https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/
package algorithms.medium;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumIncrementToMakeArrayUnique {
    public static void main(String[] args) {
        MinimumIncrementToMakeArrayUnique minIncrement = new MinimumIncrementToMakeArrayUnique();
        System.out.println("Output:\t" + minIncrement.minIncrementForUniqueOOfNSquare(new int[]{1, 2, 2}));
        System.out.println("Output:\t" + minIncrement.minIncrementForUnique(new int[]{3, 2, 1, 2, 1, 7}));
    }

    public int minIncrementForUniqueOOfNSquare(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int moves = 0;

        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        for (int num : nums) {
            if (freq.get(num) > 1) {
                int counter = 1;
                while (freq.get(num) > 1) {
                    if (freq.containsKey(num + counter)) counter++;
                    else {
                        freq.put(num + counter, freq.getOrDefault(num, 0) + 1);
                        freq.put(num, freq.getOrDefault(num, 0) - 1);
                        moves += counter;
                    }
                }
            }
        }
        return moves;
    }

    public int minIncrementForUnique(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int newValue = nums[i - 1] + 1;
                moves += newValue - nums[i];
                nums[i] = newValue;
            }
        }
        return moves;
    }
}

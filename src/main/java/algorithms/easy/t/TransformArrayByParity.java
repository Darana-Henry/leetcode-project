//https://leetcode.com/problems/transform-array-by-parity/
package algorithms.easy.t;

import java.util.Arrays;

public class TransformArrayByParity {
    public static void main(String[] args) {
        TransformArrayByParity obj = new TransformArrayByParity();
        System.out.println("Output:\t" + obj.transformArray(new int[]{4, 3, 2, 1}));
        System.out.println("Output:\t" + obj.transformArray(new int[]{1, 5, 1, 4, 2}));
    }

    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0) nums[i] = 0;
            else nums[i] = 1;

        Arrays.sort(nums);
        return nums;
    }
}

//https://leetcode.com/problems/house-robber-iv/
package algorithms.medium.h;

import java.util.Arrays;

public class HouseRobberIV {
    public static void main(String[] args) {
        HouseRobberIV obj = new HouseRobberIV();
        System.out.println("Output:\t" + obj.minCapability(new int[]{2, 3, 5, 9}, 2));
        System.out.println("Output:\t" + obj.minCapability(new int[]{2, 7, 9, 3, 1}, 2));
    }

    public int minCapability(int[] nums, int k) {
        int min = 1, max = Arrays.stream(nums).max().getAsInt(), n = nums.length;

        while (min < max) {
            int curr = 0, mid = (max + min) / 2;

            for (int i = 0; i < n; i++) {
                if (nums[i] <= mid) {
                    curr++;
                    i++;
                }
            }

            if (curr >= k) max = mid;
            else min = mid + 1;
        }
        return min;
    }
}

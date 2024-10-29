//https://leetcode.com/problems/continuous-subarray-sum/description/
package algorithms.medium.c;

import java.util.HashMap;

public class ContinuousSubarraySum {
    public static void main(String[] args) {

        ContinuousSubarraySum continuous = new ContinuousSubarraySum();
        System.out.println("Output:\t" + continuous.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        System.out.println("Output:\t" + continuous.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        System.out.println("Output:\t" + continuous.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13));
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum = sum % k;

            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    return true;
            } else
                map.put(sum, i);
        }
        return false;
    }
}

package algorithms.medium.s;

import java.util.HashMap;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        SubarraySumsDivisibleByK divisibleByK = new SubarraySumsDivisibleByK();

        System.out.println("Output:\t" + divisibleByK.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
        System.out.println("Output:\t" + divisibleByK.subarraysDivByK(new int[]{5}, 9));
    }

    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int runningSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int remainder = runningSum % k;

            if (remainder < 0)
                remainder += k;

            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
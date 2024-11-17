//https://leetcode.com/problems/number-of-unequal-triplets-in-array/
package algorithms.easy.n;

import java.util.HashMap;
import java.util.Map;

public class NumberOfUnequalTripletsInArray {
    public static void main(String[] args) {
        NumberOfUnequalTripletsInArray triplets = new NumberOfUnequalTripletsInArray();
        System.out.println("Output:\t" + triplets.unequalTriplets(new int[]{4, 4, 2, 4, 3}));
        System.out.println("Output:\t" + triplets.unequalTriplets(new int[]{1, 1, 1, 1, 1}));
    }

    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int answer = n * (n - 1) * (n - 2) / 6;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : map.values()) {
            if (num < 2) continue;

            int same3 = num * (num - 1) * (num - 2) / 6;
            int same2 = (n - num) * num * (num - 1) / 2;
            answer -= same3 + same2;
        }

        return answer;
    }
}

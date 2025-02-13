//https://leetcode.com/problems/tuple-with-same-product/
package algorithms.medium.t;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public static void main(String[] args) {
        TupleWithSameProduct obj = new TupleWithSameProduct();
        System.out.println("Output:\t" + obj.tupleSameProduct(new int[]{2, 3, 4, 6}));
        System.out.println("Output:\t" + obj.tupleSameProduct(new int[]{1, 2, 4, 5, 10}));
    }

    public int tupleSameProduct(int[] nums) {
        int answer = 0, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }

        for (int count : map.values())
            answer += count * (count - 1) / 2;

        return answer << 3;
    }
}

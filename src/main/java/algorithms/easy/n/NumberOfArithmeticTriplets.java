//https://leetcode.com/problems/number-of-arithmetic-triplets/
package algorithms.easy.n;

import java.util.Set;
import java.util.HashSet;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        NumberOfArithmeticTriplets trips = new NumberOfArithmeticTriplets();
        System.out.println("Output:\t" + trips.arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        System.out.println("Output:\t" + trips.arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        for (int num : nums)
            if (set.contains(num + diff) && set.contains(num + 2 * diff)) answer++;

        return answer;
    }
}


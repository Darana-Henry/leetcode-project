//https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/
package algorithms.medium.c;

import java.util.Set;
import java.util.HashSet;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public static void main(String[] args) {
        CountNumberOfDistinctIntegersAfterReverseOperations obj = new CountNumberOfDistinctIntegersAfterReverseOperations();
        System.out.println("Output:\t" + obj.countDistinctIntegers(new int[]{1, 13, 10, 12, 31}));
        System.out.println("Output:\t" + obj.countDistinctIntegers(new int[]{2, 2, 2}));
    }

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        for (int num : nums) {
            int answer = 0;
            while (num > 0) {
                answer = answer * 10 + num % 10;
                num /= 10;
            }

            set.add(answer);
        }

        return set.size();
    }
}

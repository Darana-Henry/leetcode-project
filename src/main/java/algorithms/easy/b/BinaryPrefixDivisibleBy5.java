//https://leetcode.com/problems/binary-prefix-divisible-by-5/
package algorithms.easy.b;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public static void main(String[] args) {
        BinaryPrefixDivisibleBy5 by5 = new BinaryPrefixDivisibleBy5();
        System.out.println("Output:\t" + by5.prefixesDivBy5(new int[]{0, 1, 1}));
        System.out.println("Output:\t" + by5.prefixesDivBy5(new int[]{1, 1, 1}));
    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        int curr = 0;
        List<Boolean> answer = new ArrayList<>();
        for (int num : nums) {
            curr = ((curr << 1) | num) % 5;
            answer.add(curr == 0);
        }
        return answer;
    }
}

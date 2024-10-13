//https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    public static void main(String[] args) {
        SumOfValuesAtIndicesWithKSetBits kbits = new SumOfValuesAtIndicesWithKSetBits();
        List<Integer> ex1 = new ArrayList<>();
        ex1.add(5);
        ex1.add(10);
        ex1.add(1);
        ex1.add(5);
        ex1.add(2);
        List<Integer> ex2 = new ArrayList<>();
        ex2.add(4);
        ex2.add(3);
        ex2.add(2);
        ex2.add(1);
        System.out.println("Output:\t" + kbits.sumIndicesWithKSetBits(ex1, 1));
        System.out.println("Output:\t" + kbits.sumIndicesWithKSetBits(ex2, 2));
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int answer = 0;

        for (int i = 0; i < nums.size(); i++)
            if (Integer.bitCount(i) == k) answer += nums.get(i);

        return answer;
    }
}

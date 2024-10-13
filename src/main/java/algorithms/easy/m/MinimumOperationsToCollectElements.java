//https://leetcode.com/problems/minimum-operations-to-collect-elements/
package algorithms.easy.m;

import java.util.ArrayList;
import java.util.List;

public class MinimumOperationsToCollectElements {
    public static void main(String[] args) {
        MinimumOperationsToCollectElements minOps = new MinimumOperationsToCollectElements();
        List<Integer> ex1 = new ArrayList<>();
        ex1.add(3);
        ex1.add(1);
        ex1.add(5);
        ex1.add(4);
        ex1.add(2);
        List<Integer> ex2 = new ArrayList<>();
        ex2.add(3);
        ex2.add(1);
        ex2.add(5);
        ex2.add(4);
        ex2.add(2);
        List<Integer> ex3 = new ArrayList<>();
        ex3.add(3);
        ex3.add(2);
        ex3.add(5);
        ex3.add(3);
        ex3.add(1);
        System.out.println("Output:\t" + minOps.minOperations(ex1, 2));
        System.out.println("Output:\t" + minOps.minOperations(ex2, 5));
        System.out.println("Output:\t" + minOps.minOperations(ex3, 3));
    }

    public int minOperations(List<Integer> nums, int k) {
        int count = 0;
        int n = nums.size();
        boolean[] seen = new boolean[k];

        for (int i = n - 1; i >= 0; i--) {
            int curr = nums.get(i);

            if (curr > k || seen[curr - 1]) continue;
            seen[curr - 1] = true;
            count++;
            if (count == k) return n - i;
        }
        return -1;
    }
}
